package org.example;

public class InvalidOrderDataException extends RuntimeException {
    public InvalidOrderDataException(String message) {
        super(message);
    }
    public InvalidOrderDataException(String message,RuntimeException e){
        super (message,e);
    }
}
