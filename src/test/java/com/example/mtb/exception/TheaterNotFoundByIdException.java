package com.example.mtb.exception;

import lombok.Getter;

@Getter
public class TheaterNotFoundByIdException extends RuntimeException {

    private String message;

    public TheaterNotFoundByIdException(String message) {
        this.message = message;
    }
}
