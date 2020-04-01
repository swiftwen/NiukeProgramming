package com.wp.study.pattern.decorator;

public class ConcreteComponent implements Component {

	private String msg;
	public ConcreteComponent(String msg){
		this.msg = msg;
	}
	@Override
	public void print() {

		System.out.println("this is in concrete compoent->"+msg);
	}

}
