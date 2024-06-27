package Test;

class A {

	void disp() {
		System.out.println("Class A");
	}
}

interface B {
	public void display();
//	{
//		System.out.println("From B");
//	}
//	
}

interface C {

	void display();
}

public class Test extends A implements B ,C {
	
	@Override
	public void display() {
		System.out.println("From B and C");
	}

	public static void main(String[] args) {

//		Test t=new Test();
//		A a=new Test();
//		Test a = new A();
		A aa=new Test();
		
		aa.disp();
//		t.display();
		
		
		
	}

	
}
