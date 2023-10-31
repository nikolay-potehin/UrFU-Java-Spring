package org.example.error;

import org.example.entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<EmployeeExceptionHandler> handleException(NoSuchEmployeeException e) {
        EmployeeExceptionHandler handler = new EmployeeExceptionHandler();
        handler.setInfo(e.getMessage());

        return new ResponseEntity<>(handler, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeExceptionHandler> handleException(Exception e) {
        EmployeeExceptionHandler handler = new EmployeeExceptionHandler();
        handler.setInfo(e.getMessage());

        return new ResponseEntity<>(handler, HttpStatus.BAD_REQUEST);
    }
}
