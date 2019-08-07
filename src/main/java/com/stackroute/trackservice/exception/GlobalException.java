package com.stackroute.trackservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException
{
    @ExceptionHandler(TrackNotFoundException.class)
    public ResponseEntity<?> notFoundException(final TrackNotFoundException e){
        return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(TrackAlreadyExistsException.class)
    public ResponseEntity<?> alreadyExists(final TrackAlreadyExistsException e){
        return new ResponseEntity(e.getMessage(), HttpStatus.CONFLICT);
    }

}
