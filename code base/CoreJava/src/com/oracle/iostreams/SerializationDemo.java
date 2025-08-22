package com.oracle.iostreams;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class SerializationDemo {
public static void main(String[] args) throws IOException {
	Employee e1=new Employee();
	e1.setId(101); e1.setName("Rajesh");
	FileOutputStream fo=new FileOutputStream("D:\\Albin\\2025\\Oracle\\Batch17\\emp.ser");
	ObjectOutputStream objoutPut=new ObjectOutputStream(fo);
	objoutPut.writeObject(e1);
	
	System.out.println("done.....");
}
}
//Marker interface --> interface which has no methods .....
class Employee implements Serializable{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}