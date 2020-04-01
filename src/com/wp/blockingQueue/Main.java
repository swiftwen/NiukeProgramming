package com.wp.blockingQueue;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		Date d = new Date();
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		//BlockingQueue<String> queue = new ArrayBlockingQueue<String>(5);
		BlockingQueue<String> queue1 = new LinkedBlockingDeque<>(3);
		
		//Consumer c = new Consumer(queue);
		//new Thread(c).start();
		
		//Producer p = new Producer(queue);
		//new Thread(p).start();
		BlockingQueue<DelayQueueItem> queue = new DelayQueue<>();
		
		
	}

}
