package com.wp.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	private BlockingQueue<String> queue;
	
	public Consumer(BlockingQueue<String> queue){
		this.queue = queue;
	}
	@Override
	public void run() {

		try{
			Thread.sleep(16000);
			while(true){
				System.out.println(queue.take());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}


}
