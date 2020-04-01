package com.wp.study.pattern.singleton;
/**
 * 单例
 * @author swiftwen
 * @date 2019年12月4日 下午3:54:54
 */
public class Singleton {
	private static volatile Singleton singleton;
	private Singleton(){
	}
	public static Singleton getInstance(){
		if(null == singleton){
			synchronized (Singleton.class) {
				if(null == singleton){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
