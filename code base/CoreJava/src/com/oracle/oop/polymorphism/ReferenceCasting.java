package com.oracle.oop.polymorphism;
public class ReferenceCasting {
public static void main(String[] args) {
	notification(new SMS());
	System.out.println("-------");
	notification(new WhatsApp());
}
static void notification(Message m) {
	m.info(); //invokes twice ....
	if(m instanceof WhatsApp) { //instanceof is operator
		WhatsApp w=(WhatsApp)m; 
		w.getDp();
	}
}
}
class Message{
	void info() {
		System.out.println("U hv a msg");
	}
}
class SMS extends Message{
	void info() {
		System.out.println("u hv a SMS");
	}
}
class WhatsApp extends Message{
	void info() {
		System.out.println("u hv a WhatsApp");
	}
	void getDp() {
		System.out.println("Reading DP in whatsApp");
	}
}