package com.wp.study.pattern.decorator;
/**
 * 装饰器
 * @author swiftwen
 * @date 2019年12月4日 下午3:22:47
 */
public class Decorator implements Component{

	private Component component;
	public Decorator(Component component){
		this.component = component;
	}
	@Override
	public void print() {
		component.print();
	}

	
}
