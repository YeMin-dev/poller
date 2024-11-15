package com.privasia.poller.ftp.service;

import org.apache.camel.component.file.GenericFile;
import org.apache.camel.component.file.GenericFileFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component("fileReadyFilter")
public class FileReadyFilter<T> implements GenericFileFilter<T> {

    private static final Logger log = LoggerFactory.getLogger(FileReadyFilter.class);

    @Override
    public boolean accept(GenericFile<T> file) {

        Calendar lastModifiedTime = Calendar.getInstance();
        lastModifiedTime.setTimeInMillis(file.getLastModified());

        Calendar now = Calendar.getInstance();
        now.add(Calendar.MINUTE, -1);

        lastModifiedTime.add(Calendar.MINUTE, 2);

        if (lastModifiedTime.getTime().after(now.getTime())) {
            log.warn("Skipping File: {}. The last modified time is less than 1 min.", file.getFileName());
            return false;
        }

        if (file.getFileLength() == 0) {
            log.warn("Skipping File: {}. The length is zero.", file.getFileName());
            return false;
        }
        return true;
    }
}
