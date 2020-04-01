package com.wp.thread.bloking;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author swiftwen
 * @date 2019年11月25日 上午11:16:44
 */
public class ArrayBlockingQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BlockingQueue queue = new ArrayBlockingQueue<>(1);
		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.submit(new Producer(queue));
		executor.submit(new Consumer(queue));
	}

}
class Producer implements Runnable{

	private BlockingQueue<String> queue;
	public Producer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("producer start");
		while(true){
			try {
				
				queue.put("生产一个对象");
				System.out.println("生产了一个对象");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
}

class Consumer implements Runnable{

	private BlockingQueue<String> queue;
	public Consumer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("consumer start");
		while(true){
			try {
				
				String s = queue.take();
				System.out.println("消费了一个对象");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
}
