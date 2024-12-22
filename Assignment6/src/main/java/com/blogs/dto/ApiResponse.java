package com.blogs.dto;

import java.time.LocalDateTime;

public class ApiResponse {
	private String msg;
	private LocalDateTime timeStamp;
	
	public ApiResponse(String msg) {
		super();
		this.msg=msg;
		this.timeStamp=LocalDateTime.now();
	}
}
