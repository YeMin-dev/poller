package com.privasia.poller.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "MESSAGE_TRANSACTION")
public class MessageTransaction implements Serializable {

    private static final long serialVersionUID = 2613898526658337729L;

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "MESSAGE_IDENTIFIER")
    private String messageIdentifier;

    @Column(name = "FILE_NAME")
    private String fileName;

    @Column(name = "SOURCE_ID")
    private String sourceId;

    @Column(name = "TARGET_ID")
    private String targetId;

    @Lob
    @Column(name = "RECEIVED_MESSAGE")
    private String receivedMessage;

    @Column(name = "MESSAGE_TYPE")
    private String messageType;

    @Column(name = "SENDER_ID")
    private String senderId;

    @Column(name = "RECEIVER_ID")
    private String receiverId;

    @Column(name = "IS_INBOUND")
    private Boolean inbound;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RECEIVED_DATE")
    private Date receivedDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FILE_MODIFIED_DATE")
    private Date fileModifiedDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "PROCESS_DATE")
    private Date processDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DELIVERED_DATE")
    private Date deliveredDate;

    @Column(name = "ERROR_MESSAGE")
    private String errorMessage;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RESPONSE_DATE")
    private Date responseDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RESPONSE_DELIVERED_DATE")
    private Date responseDeliveredDate;

    @Column(name = "RESPONSE_FILE_NAME")
    private String responseFileName;

    @Lob
    @Column(name = "RESPONSE_MESSAGE")
    private String responseMessage;

    @Column(name = "RESPONSE_ERROR_MESSAGE")
    private String responseErrorMessage;

    @Column(name = "MESSAGE_VERSION")
    private String messageVersion;

    @Column(name = "MESSAGE_SUB_TYPE")
    private String messageSubType;

    @Column(name = "CORRELATION_ID")
    private String correlationId;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "OUTBOUND_RECEIVED_DATA")
    private byte[] outboundReceivedMessage;

    @Column(name = "EMAIL_FROM")
    private String emailFrom;

    @Column(name = "SCN")
    private String scn;

    @Column(name = "CONTAINER_IDS")
    private String containers;

    @Column(name = "TIME_TAKEN")
    private String timeTaken;

    @Column(name = "TOS_FLAG")
    private String tosFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessageIdentifier() {
        return messageIdentifier;
    }

    public void setMessageIdentifier(String messageIdentifier) {
        this.messageIdentifier = messageIdentifier;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getReceivedMessage() {
        return receivedMessage;
    }

    public void setReceivedMessage(String receivedMessage) {
        this.receivedMessage = receivedMessage;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public Boolean getInbound() {
        return inbound;
    }

    public void setInbound(Boolean inbound) {
        this.inbound = inbound;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public Date getFileModifiedDate() {
        return fileModifiedDate;
    }

    public void setFileModifiedDate(Date fileModifiedDate) {
        this.fileModifiedDate = fileModifiedDate;
    }

    public Date getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    public Date getDeliveredDate() {
        return deliveredDate;
    }

    public void setDeliveredDate(Date deliveredDate) {
        this.deliveredDate = deliveredDate;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    public Date getResponseDeliveredDate() {
        return responseDeliveredDate;
    }

    public void setResponseDeliveredDate(Date responseDeliveredDate) {
        this.responseDeliveredDate = responseDeliveredDate;
    }

    public String getResponseFileName() {
        return responseFileName;
    }

    public void setResponseFileName(String responseFileName) {
        this.responseFileName = responseFileName;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseErrorMessage() {
        return responseErrorMessage;
    }

    public void setResponseErrorMessage(String responseErrorMessage) {
        this.responseErrorMessage = responseErrorMessage;
    }

    public String getMessageVersion() {
        return messageVersion;
    }

    public void setMessageVersion(String messageVersion) {
        this.messageVersion = messageVersion;
    }

    public String getMessageSubType() {
        return messageSubType;
    }

    public void setMessageSubType(String messageSubType) {
        this.messageSubType = messageSubType;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public byte[] getOutboundReceivedMessage() {
        return outboundReceivedMessage;
    }

    public void setOutboundReceivedMessage(byte[] outboundReceivedMessage) {
        this.outboundReceivedMessage = outboundReceivedMessage;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getScn() {
        return scn;
    }

    public void setScn(String scn) {
        this.scn = scn;
    }

    public String getContainers() {
        return containers;
    }

    public void setContainers(String containers) {
        this.containers = containers;
    }

    public String getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(String timeTaken) {
        this.timeTaken = timeTaken;
    }

    public String getTosFlag() {
        return tosFlag;
    }

    public void setTosFlag(String tosFlag) {
        this.tosFlag = tosFlag;
    }
}
