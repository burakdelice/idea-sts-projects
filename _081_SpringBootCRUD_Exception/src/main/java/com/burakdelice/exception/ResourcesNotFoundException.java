package com.burakdelice.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourcesNotFoundException extends Exception{

    public ResourcesNotFoundException(String message){
        super(message);
    }
}
