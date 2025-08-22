package com.oracle.threads;
public class MultipleThreadsDemo2 {
public static void main(String[] args) throws InterruptedException {
	SharedData sharedData=new SharedData();
	Thread t1=new Thread(sharedData);
	t1.start();
	Thread t2= new Thread(sharedData);
	t2.start();
	Thread t3=new Thread(sharedData);
	t3.start();
	t1.join(); //waits for the thread to DIE
	t2.join();
	t3.join();
	//i need the final value of the coubt.....
	System.out.println("In Main :"+sharedData.getCount());
}
}
class SharedData implements Runnable{
	int count=0;
	@Override
	public void run() {
		for(int i=1;i<=10000;i++) {
			//synchronized block and synchronized method
			synchronized(this) {
				count++;
			}
		}
	}
	int getCount() {
		return count;
	}
}
