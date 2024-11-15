package com.privasia.poller.core.enums;

public enum StatusType {

    INPROGRESS("IN PROGRESS"), SUCCESS("SUCCESS"), ERROR("ERROR");

    private String value;

    StatusType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static StatusType fromString(String value) {
        if (INPROGRESS.toString().equals(value)) {
            return INPROGRESS;
        } else if (SUCCESS.toString().equals(value)) {
            return SUCCESS;
        } else if (ERROR.toString().equals(value)) {
            return ERROR;
        } else {
            throw new IllegalArgumentException("Unknown Status : " + value);
        }
    }
}
