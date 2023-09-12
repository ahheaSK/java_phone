package com.java.makara.gmail.java.phone.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponse {
	private HttpStatus status;
	private String message;
}
