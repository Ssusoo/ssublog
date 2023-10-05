package me.ssu.api.controller;

import lombok.extern.slf4j.Slf4j;
import me.ssu.api.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @ControllerAdvice
 *  일반적인 Controller를 찾아간다.
 */
@Slf4j
@ControllerAdvice
public class ExceptionController {

	@ResponseBody
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ErrorResponse invalidRequestHandler(MethodArgumentNotValidException e) {
		// org.springframework.web.bind.MethodArgumentNotValidException
		// var fieldError = e.getFieldError();
		// String field = fieldError.getField();
		// String message = fieldError.getDefaultMessage();
		// Map<String, String> response = new HashMap<>();
		// response.put(field, message);
		var response = new ErrorResponse("400", "잘못된 요청입니다.");

		for (FieldError fieldError : e.getFieldErrors()) {
			response.addValidation(fieldError.getField(), fieldError.getDefaultMessage());
		}
		return response;
	}
}
