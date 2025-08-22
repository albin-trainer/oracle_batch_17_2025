package com.oracle.model;

public class Review {
private int reviewId;
private String reviewerName;
private String review;
private float rating;

public Review() {
	// TODO Auto-generated constructor stub
}

public Review(int reviewId, String reviewerName, String review, float rating) {
	super();
	this.reviewId = reviewId;
	this.reviewerName = reviewerName;
	this.review = review;
	this.rating = rating;
}

public int getReviewId() {
	return reviewId;
}

public void setReviewId(int reviewId) {
	this.reviewId = reviewId;
}

public String getReviewerName() {
	return reviewerName;
}

public void setReviewerName(String reviewerName) {
	this.reviewerName = reviewerName;
}

public String getReview() {
	return review;
}

public void setReview(String review) {
	this.review = review;
}

public float getRating() {
	return rating;
}

public void setRating(float rating) {
	this.rating = rating;
}


}
