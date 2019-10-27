package com.nature.life.exceptions;

public class NaturLifeException extends RuntimeException{

    public NaturLifeException() {
    }

    public NaturLifeException(String message) {
        super(message);
    }

    public NaturLifeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NaturLifeException(Throwable cause) {
        super(cause);
    }

    public NaturLifeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
