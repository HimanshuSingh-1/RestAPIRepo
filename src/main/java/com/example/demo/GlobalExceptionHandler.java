package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeIdNotFoundException.class)
    public ResponseEntity<String> handlerForIdNotFoundException(EmployeeIdNotFoundException ee) {
        return new ResponseEntity<>(ee.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handlerForInvalidBeanException(MethodArgumentNotValidException ee) {

        Map<String, String> maps = new HashMap<>();

        for (FieldError fe : ee.getFieldErrors()) {
            maps.put(fe.getField(), fe.getDefaultMessage());
        }

        return new ResponseEntity<>(maps, HttpStatus.BAD_REQUEST);
    }
}

