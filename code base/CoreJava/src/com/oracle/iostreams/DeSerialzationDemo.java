package com.oracle.iostreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialzationDemo {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream fi=new FileInputStream("D:\\Albin\\2025\\Oracle\\Batch17\\emp.ser");
	ObjectInputStream objInput=new ObjectInputStream(fi);
	Employee e=(Employee) objInput.readObject();
	System.out.println("obj restored .....");
	System.out.println(e.getId()+" "+e.getName());
	

}
}
