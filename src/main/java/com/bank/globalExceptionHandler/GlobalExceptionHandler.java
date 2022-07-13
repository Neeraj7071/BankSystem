package com.bank.globalExceptionHandler;

import java.io.IOException;
import java.time.LocalDateTime;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {


	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorException> myExceptionHandler(Exception e, WebRequest wq) throws IOException {
	
		return new ResponseEntity<>(new ErrorException(LocalDateTime.now(),e.getMessage(),
				wq.getDescription(false)), HttpStatus.BAD_REQUEST);
	}
}
