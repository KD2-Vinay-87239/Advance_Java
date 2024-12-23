package com.app.dto;

import java.time.LocalDateTime;

public class ApiResponse {
	private String message;
	private LocalDateTime timeStamp;
	public ApiResponse(String message, LocalDateTime timeStamp) {
		super();
		this.message = message;
		this.timeStamp = LocalDateTime.now();
	}
	
	
}
