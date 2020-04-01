package com.wp.study.pattern.decorator;
/**
 * 
 * @author swiftwen
 * @date 2019年12月4日 下午3:34:58
 */
public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component){
		super(component);
	}
	public void print(){
		System.out.println("hahahah");
		super.print();
	}
	
	
	
}
