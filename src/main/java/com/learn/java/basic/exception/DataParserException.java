package com.learn.java.basic.exception;

public class DataParserException extends Exception {

    public DataParserException(String message) {
        super(message);
    }

    public DataParserException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataParserException(Throwable cause) {
        super(cause);
    }

    public DataParserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
