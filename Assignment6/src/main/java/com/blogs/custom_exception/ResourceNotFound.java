package com.blogs.custom_exception;

public class ResourceNotFound extends RuntimeException{
	public ResourceNotFound(String errMsg) {
		super(errMsg);
	}
}
