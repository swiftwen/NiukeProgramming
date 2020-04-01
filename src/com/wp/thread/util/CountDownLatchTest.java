package com.wp.thread.util;

import java.util.concurrent.CountDownLatch;

/**
 * 
 * @author swiftwen
 * @date 2019年12月23日 下午5:26:53
 */
public class CountDownLatchTest {

	final static int N = 1000;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		System.out.println(1000*(1+1000)/2);
		CountDownLatch latch = new CountDownLatch(10);
		int[] arr = new int[1000];
		for(int i=0;i<1000;i++){
			arr[i] = i+1;
		}
		MyTask[] runnable = new MyTask[10];
		for(int i=0;i<10;i++){
			runnable[i] = new MyTask(latch,arr,i*100,i*100+100);
			Thread t = new Thread(runnable[i]);
			t.start();
		}
		latch.await();
		System.out.println("***************");
		int ans = 0;
		for(int i=0;i<10;i++){
			ans += runnable[i].getAns();
		}
		System.out.println("结果："+ans);
	}

}
class MyTask implements Runnable{

	private int ans = 0;
	private int[] arr;
	private int lt;
	private int rt;
	private CountDownLatch latch = null;
	public MyTask(CountDownLatch latch,int[] arr,int lt,int rt){
		this.arr = arr;
		this.lt = lt;
		this.rt = rt;
		this.latch = latch;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			System.out.println("线程"+Thread.currentThread().getName()+"开始执行");
			for(int i=lt;i<rt;i++){
				ans += arr[i];
			}
			System.out.println("线程"+Thread.currentThread().getName()+"结束执行,ans="+ans);
		}finally{
			latch.countDown();
		}
		
	}
	public int getAns(){
		return ans;
	}
}