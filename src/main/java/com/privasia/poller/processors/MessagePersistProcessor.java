package com.privasia.poller.processors;

import com.privasia.poller.core.entity.MessageTransaction;
import com.privasia.poller.core.repositories.MessageTransactionRepository;
import com.privasia.poller.core.utils.Constants;
import com.privasia.poller.core.utils.Utils;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MessagePersistProcessor {

    Logger log = LoggerFactory.getLogger(MessagePersistProcessor.class);

    @Autowired
    private MessageTransactionRepository messageTransactionRepository;

    public void saveMessageTransaction(Exchange exchange) {

        try {

            if (exchange != null) {

                MessageTransaction messageTransaction = new MessageTransaction();

                String fileContent;
                String fileName;
                String sourceId;

                Message message = exchange.getIn();

                if (message != null) {

                    fileContent = message.getBody(String.class);
                    fileName = message.getHeader(Exchange.FILE_NAME_ONLY, String.class);
                    sourceId = message.getHeader(Constants.SOURCE_ID, String.class);
                    Long fileLastModified = message.getHeader(Exchange.FILE_LAST_MODIFIED, Long.class);

                    if (StringUtils.isNotBlank(fileName)) {

                        messageTransaction.setInbound(Boolean.TRUE);
                        messageTransaction.setId(Utils.generateUUID32());
                        messageTransaction.setFileName(StringUtils.defaultString(fileName));
                        messageTransaction.setReceivedMessage(fileContent);

                        if (fileLastModified != null) {
                            messageTransaction.setFileModifiedDate(new Date(fileLastModified));
                        }
                        else {
                            messageTransaction.setFileModifiedDate(new Date());
                        }

                        messageTransaction.setReceivedDate(new Date());
                        messageTransaction.setSourceId(StringUtils.defaultString(sourceId));

                        messageTransactionRepository.save(messageTransaction);

                        log.info("File: {} saved. SOURCE ID: {} File Length: {}", fileName, sourceId, StringUtils.defaultString(fileContent).length());

                        exchange.getIn().setBody(fileContent);
                        exchange.getIn().setHeader(Constants.MESSAGE_TX_ID, messageTransaction.getId());
                        exchange.getIn().setHeader(Constants.SOURCE_ID, sourceId);
                        exchange.getIn().setHeader(Constants.FILE_NAME, fileName);

                    } else {
                        log.warn("File Name is Null or empty");
                    }

                } else {
                    log.warn("Message is Null or empty");
                }

            } else {
                log.warn("INBOUND : Exchange is Null or empty");
            }

        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }

}
