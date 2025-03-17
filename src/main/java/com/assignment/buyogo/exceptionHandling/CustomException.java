package com.assignment.buyogo.exceptionHandling;

public class CustomException {

    public static class DatabaseAccessException extends RuntimeException {

        public DatabaseAccessException(final String message) {
            super(message);
        }
    }
}
