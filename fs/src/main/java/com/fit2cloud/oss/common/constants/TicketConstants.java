package com.fit2cloud.oss.common.constants;

public class TicketConstants {
    
    public final static String TICKET_ID_PREFIX = "oss";

    public enum Status {
        RUNNING, COMPLETE, TERMINATED, CANCELED, REJECTED, APPROVED, UNCHECKED, ERROR
    }
}
