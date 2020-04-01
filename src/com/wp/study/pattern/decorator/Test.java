package com.wp.study.pattern.decorator;
/**
 * 装饰器模式
 * @author swiftwen
 * @date 2019年12月4日 下午3:35:09
 */
public class Test {

	public static void main(String[] args) {

		Component component = new ConcreteDecoratorA(new ConcreteComponent("swiftwen"));
		component.print();
	}

}
