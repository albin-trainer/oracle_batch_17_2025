package com.oracle.oop.polymorphism;

import java.time.LocalDate;

public class PolymorphismExample {
public static void main(String[] args) {
	Mobile m=new Mobile();
	m.setProdId(101);
	m.setProdName("IPhone 21");
	m.setPrice(10);
	m.setManufactureDate(LocalDate.of(2025, 5, 30));
	m.setBattery("6000MH");
	m.setRamMemory("16 GB");
	
	Book book=new Book();
	book.setProdId(102);
	book.setProdName("Harry Porter");
	book.setPrice(500);
	book.setManufactureDate(LocalDate.of(2024, 12, 29));
	book.setAuthour("JK Rowling");
	book.setGenre("Fantacy");
	
	Product myCart[]= {m,book};
	for(Product p:myCart) {
		p.print();
		System.out.println("--------------");
	}
	
}
}
