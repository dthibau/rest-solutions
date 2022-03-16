package org.mediatheque.controller;

import java.util.Date;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;

import org.mediatheque.service.BusinessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class BusinessExceptionHandler extends ResponseEntityExceptionHandler {

	
	@ExceptionHandler(value = {BusinessException.class})
	public ResponseEntity<ErrorDto> handleBusinessException(HttpServletRequest request, Throwable ex) {
		ErrorDto  error = new ErrorDto(ex.getMessage(),"BusinessException", new Date());
		return new ResponseEntity<ErrorDto>(
				error, new HttpHeaders(), HttpStatus.PRECONDITION_FAILED);
	}
	
	
	@ExceptionHandler(value = {EntityNotFoundException.class})
	public ResponseEntity<ErrorDto> handleNotFoundException(HttpServletRequest request, Throwable ex) {
		ErrorDto  error = new ErrorDto(ex.getMessage(),"DataException", new Date());
		return new ResponseEntity<ErrorDto>(
				error, new HttpHeaders(), HttpStatus.NOT_FOUND);
	}
}
