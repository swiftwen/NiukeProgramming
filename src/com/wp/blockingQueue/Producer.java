package com.wp.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private BlockingQueue<String> queue;
	
	public Producer(BlockingQueue<String> queue){
		this.queue = queue;
	}
	@Override
	public void run() {

		try{
			queue.add("test1");
			Thread.sleep(2000);
			queue.add("test2");
			Thread.sleep(2000);
			queue.add("test3");
			Thread.sleep(2000);
			queue.add("test4");
			Thread.sleep(2000);
			queue.add("test5");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}


}
