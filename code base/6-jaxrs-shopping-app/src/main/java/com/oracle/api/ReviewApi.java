package com.oracle.api;

import java.util.List;

import com.oracle.model.Review;

import jakarta.websocket.server.PathParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/products{prodId}/reviews")
public class ReviewApi {

	@GET
	public List<Review> getAllReviews(@PathParam("prodId")int prodId){
		return null;
	}
}
