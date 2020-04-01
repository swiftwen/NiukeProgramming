package com.wp.study.pattern.strategy;

public class HandGun implements Gun {

	@Override
	public void shoot() {
		System.out.println("使用手枪射击。。。");
	}

}
