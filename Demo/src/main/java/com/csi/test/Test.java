package com.csi.test;

import org.springframework.stereotype.Component;

@Component
public class Test implements Modem {

	int a,b,c;
	@Override
	public int add() {
		// TODO Auto-generated method stub
		a=10;
		b=20;
		return c=a+b;
	}
	

	@Override
	public int sub() {
		// TODO Auto-generated method stub
		a=20;
		b=30;
		return c=a-b;
	}

	@Override
	public int mul() {
		// TODO Auto-generated method stub
		a=10;
		b=20;
		return c=a*b;
	}

	@Override
	public int div() {
		// TODO Auto-generated method stub
		a=20;
		b=10;
		return c=a/b;
	}



}
