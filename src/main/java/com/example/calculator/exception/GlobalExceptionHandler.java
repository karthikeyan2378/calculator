package com.example.calculator.exception;

import com.example.calculator.dto.ErrorDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CalculatorException.class)
    public ResponseEntity<ErrorDTO> handleCalculatorException(CalculatorException ex){

        String message  = ex.getMessage();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Version", "1.0");
        return new ResponseEntity<>(
                new ErrorDTO(message),
                headers,
                HttpStatus.BAD_REQUEST
                );


    }
}
