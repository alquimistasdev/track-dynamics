package com.trackdynamics.controller;

import com.trackdynamics.exception.DeleteRegistryException;
import com.trackdynamics.exception.RegistryNotFoundException;
import org.springframework.dao.DeadlockLoserDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestControllerAdvice
public class ControllerAdvice extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(),new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(RegistryNotFoundException.class)
    public ResponseEntity<Object> handleRegistryNotFoundException(RegistryNotFoundException exception, WebRequest webRequest) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }
    @ExceptionHandler(DeleteRegistryException.class)
    public ResponseEntity<Object> handleDeleteRegistryException(DeleteRegistryException exception, WebRequest webRequest) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(exception.getMessage());
    }

}
