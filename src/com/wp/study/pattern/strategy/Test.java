package com.wp.study.pattern.strategy;
/**
 * 策略模式
 * @author swiftwen
 * @date 2019年12月4日 下午3:46:44
 */
public class Test {

	public static void main(String[] args) {

		Person person = new Person();
		person.shoot();
		Gun rifleGun = new RifleGun();
		Gun handGun = new HandGun();
		Gun machineGun = new MachineGun();
		person.setGun(handGun);
		person.shoot();
		person.setGun(rifleGun);
		person.shoot();
		person.setGun(machineGun);
		person.shoot();
	}

}
