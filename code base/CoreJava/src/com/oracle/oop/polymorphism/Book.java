package com.oracle.oop.polymorphism;

public class Book extends Product {
private String authour;
private String genre;

public String getAuthour() {
	return authour;
}
public void setAuthour(String authour) {
	this.authour = authour;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}

void print() {
	super.print();
	System.out.println("Authour : "+authour);
	System.out.println("Genre "+genre);
}

}
