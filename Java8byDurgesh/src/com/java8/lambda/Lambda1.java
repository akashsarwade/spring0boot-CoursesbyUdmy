package com.java8.lambda;

public class Lambda1 implements Functional_InterfaceEg{

	public void m1() {
		System.out.println("HEllow M1");
	}

	@Override
	public void Hey() {
		System.out.println("Hello I am from Function Interface");
	}
	
	public static void main(String[] args) {
	
		Functional_InterfaceEg f=()->
			System.out.println("This is first time I am using Lambda.");
		
		f.Hey();
		
		
//		Lambda1 ob=new Lambda1();
//		ob.Hey();
}

}
