package com.test.mtest;

public class Test {
	
	public static void main(String [] args){
<<<<<<< HEAD
//		int t =10;
//		System.out.println(0x1 << 1);
//		System.out.println(t & (0x1 << 1 ));
//		System.out.println((t & (0x1 << 1 )) >> 1);
=======
		int t =10;
		System.out.println(0x1 << 1);
		System.out.println(t & (0x1 << 1 ));
		System.out.println((t & (0x1 << 1 )) >> 1);
		System.out.println((t & (0x1 << 1 )) >> 1);
		
>>>>>>> 319788a1d92a986ce900e9f80a371c8ecac22b57
		
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