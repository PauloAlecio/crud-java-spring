package com.pauloalecio.crudjavaspring.exception.handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.pauloalecio.crudjavaspring.exception.GeneroException;
import com.pauloalecio.crudjavaspring.exception.error.ErrorMessage;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class ApiExceptionHandler {
  
    @ExceptionHandler(GeneroException.class)
    public ResponseEntity<ErrorMessage> handleGeneroException(RuntimeException ex, HttpServletRequest request) {
        log.error("Api Error - ", ex);
        return ResponseEntity
            .status(HttpStatus.NOT_FOUND)
            .contentType(MediaType.APPLICATION_JSON)
            .body(new ErrorMessage(request, HttpStatus.NOT_FOUND, ex.getMessage(), LocalDateTime.now()));
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorMessage> handleIllegalArgumentException(MethodArgumentNotValidException ex,
        HttpServletRequest request,
        BindingResult result) {
        log.error("Api Error - ", ex);
        return ResponseEntity
            .status(HttpStatus.UNPROCESSABLE_ENTITY)
            .contentType(MediaType.APPLICATION_JSON)
            .body(new ErrorMessage(request, HttpStatus.UNPROCESSABLE_ENTITY, message(result),LocalDateTime.now(), result));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorMessage> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex,
        HttpServletRequest request,
        BindingResult result) {
        log.error("Api Error - ", ex);
        return ResponseEntity
            .status(HttpStatus.UNPROCESSABLE_ENTITY)
            .contentType(MediaType.APPLICATION_JSON)
            .body(new ErrorMessage(request, HttpStatus.UNPROCESSABLE_ENTITY, message(result),LocalDateTime.now(), result));
    }

    private String message(BindingResult result){
      var message  = String.valueOf(result.getFieldErrorCount() > 2 ? "Campo(s) invalido(s)" : "Campo invalido" );
      return message;
  }


}
