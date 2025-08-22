package com.oracle.threads;

public class MultipleThreadsDemo1 {
public static void main(String[] args) {
	System.out.println("Main thread started ....");
	FileDownloader downloader=new FileDownloader();
	Thread t=new Thread(downloader); //new state
	t.start(); //Runnable state 
	for(int i=1;i<=1000;i++) {
		System.out.println("Main "+i);
	}
	//V cant predict ...
	System.out.println("Main Ends !!!!!");
}
}


class FileDownloader implements Runnable{
  
	 //invoked automatically when the thread started running ......
	public void run() {
		System.out.println("*****File downloader Starts running ******");
		for(int i=1;i<=1000;i++) {
			System.out.println("Child "+i);
		}
	}
}