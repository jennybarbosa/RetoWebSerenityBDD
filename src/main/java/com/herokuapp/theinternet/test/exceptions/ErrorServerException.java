package com.herokuapp.theinternet.test.exceptions;

public class ErrorServerException extends RuntimeException {

    // Excepción con el mensaje "Error to upload file due Server Internal error" que se aplicará en el step validateMessage
    public static final String ERROR_SERVER = "Error to upload file due Server Internal error";

    public ErrorServerException(String message){
        super(message);
    }
}
