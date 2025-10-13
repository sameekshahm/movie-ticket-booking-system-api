package com.example.mtb.exception;

public class MovieNotFounfByIdException extends RuntimeException {
  public MovieNotFounfByIdException(String message) {
    super(message);
  }
}
