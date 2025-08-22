package com.oracle.iostreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteWithBuffer {
public static void main(String[] args) throws IOException {
	FileOutputStream fileoutput= new FileOutputStream("D:\\Albin\\2025\\Oracle\\Batch17\\hello2.txt");
	
	BufferedOutputStream bufferOutput=new BufferedOutputStream(fileoutput);
	
	bufferOutput.write('A');
	bufferOutput.write('B');
	bufferOutput.write('C');
	bufferOutput.write('D');
	
	bufferOutput.close();//flush and close otherwise data may lose
	System.out.println("done ....");
	
}
}
