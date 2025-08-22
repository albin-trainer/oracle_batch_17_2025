package com.oracle.iostreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteDemo1 {
public static void main(String[] args) {
	try {
		FileOutputStream fileoutput= new FileOutputStream("D:\\Albin\\2025\\Oracle\\Batch17\\hello.txt");
		fileoutput.write('A');//writes in the file
		fileoutput.write('B');//writes in the file
		fileoutput.write('C');//writes in the file
		fileoutput.write('D');//writes in the file
		System.out.println("Done .....");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
