package com.oracle.dto;

import jakarta.xml.bind.annotation.XmlRootElement;

//DTO --> Data Transfer Object
@XmlRootElement
public class ApiError {
private String error;
private int errorCode;
public ApiError() {
	// TODO Auto-generated constructor stub
}
public ApiError(String error, int errorCode) {
	super();
	this.error = error;
	this.errorCode = errorCode;
}

public String getError() {
	return error;
}

public void setError(String error) {
	this.error = error;
}

public int getErrorCode() {
	return errorCode;
}

public void setErrorCode(int errorCode) {
	this.errorCode = errorCode;
}


}
