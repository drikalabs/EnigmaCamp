package com.enigma.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(HttpStatus.FORBIDDEN)

public class InsufficientQuantityException extends RuntimeException{
    public InsufficientQuantityException(String s) {
        super(s);
    }

    public InsufficientQuantityException() {
        super("This Is Default Message");
    }
}
