package com.wp.study.pattern.strategy;
/**
 * 
 * @author swiftwen
 * @date 2019年12月4日 下午3:45:27
 */
public class Person {

	private Gun gun;
	public Person(Gun gun){
		this.gun = gun;
	}
	public Person(){
		
	}
	
	public void setGun(Gun gun){
		this.gun = gun;
	}
	public void shoot(){
		if(null != gun){
			this.gun.shoot();
		}else{
			System.out.println("没有枪。。。");
		}
		
	}
}
