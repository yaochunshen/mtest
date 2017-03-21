package com.test.mtest;

public class Test {
	
	public static void main(String [] args){
//		int t =10;
//		System.out.println(0x1 << 1);
//		System.out.println(t & (0x1 << 1 ));
//		System.out.println((t & (0x1 << 1 )) >> 1);
		
		System.out.println(0x1 << 1);
		new B("f");
	}

}


class A{
	public A(){
		System.out.println("AAAAAA");
	}
	public A(String f){
		System.out.println("fsdfs");
	}
}

class B extends A{
	public B(){
		System.out.println("BBBBB");
	}
	
	public B(String f){
//		super(f);
		System.out.println("BBBBB");
	}
}