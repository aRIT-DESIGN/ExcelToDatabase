package com.ImportExcel.Model;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Thread11 extends Thread {

	@Override
	public  void run() {
	
		Thread.currentThread().setName("Task_1");
		for (int i = 100; i <= 200; i++) {
			System.out.print(Thread.currentThread().getName() + " : " + i);
		}
		System.out.println("Task 1 done");

	}
}

class Thread12 implements Runnable {

	@Override
	public  void run() {
		    Thread.currentThread().setName("Task_2");
			for(int i=300;i<=500;i++) {
				System.out.print(Thread.currentThread().getName()+" : "+i);
		}
			System.out.println("Task 2 done");

	}
}


class Thread1 {
	public static void main(String[] args) {

//		Thread11 t1 = new Thread11();
//		t1.start();
//		Thread11 t2 = new Thread11();
//		t2.start();
		
		ExecutorService service= Executors.newSingleThreadExecutor();
		service.execute(new Thread11());
		service.execute(new Thread(new Thread12()));
		
		service.shutdown();
		
	}
} 
	


