package com.codewithramadan.qeematask.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT)
public class DuplicateResourceException extends RuntimeException {
    public DuplicateResourceException(String emailAlreadyTaken) {
        super(emailAlreadyTaken);
    }
}
