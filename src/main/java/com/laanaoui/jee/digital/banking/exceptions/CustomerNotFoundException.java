package com.laanaoui.jee.digital.banking.exceptions;

public class CustomerNotFoundException extends  Exception{

    public CustomerNotFoundException(String message) {
        super(message);
    }
}
