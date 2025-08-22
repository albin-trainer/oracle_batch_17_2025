package com.oracle.exception.handler;

import com.oracle.dto.ApiError;
import com.oracle.exception.ProductNotFoundException;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
//its like a catch block.....
//this also a resource in case of any productnotfoundexception
public class ExceptionHandler implements ExceptionMapper<ProductNotFoundException> {
	@Override
	public Response toResponse(ProductNotFoundException exception) {
		 //response to the client ....
		System.out.println("Exception handled .....");
		ApiError error= new ApiError(exception.getMessage(), 404);
		return Response.status(404).entity(error).build();
	}
}
