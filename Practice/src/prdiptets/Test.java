package prdiptets;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
//		int a = 3;
//		a = ++a + a++;
//		a = --a - a--;
//		System.out.println(a);
		
		
		Random r1=new Random(10);
		Random r2=new Random(10);
		
		if(r1.nextInt()== r2.nextInt()) {
			System.out.println("jack");
		}
		else {
			System.out.println("quuesn");
		}
	}
}
