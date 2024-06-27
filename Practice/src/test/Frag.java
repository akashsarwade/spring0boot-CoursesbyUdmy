package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Frag {

	public static void main(String[] args) {

//		boolean flag = false;
//		int count = 0;
//		do {
//			++count;
//			if (count > 3) {
//				flag = true;
//				System.out.println(count);
//			}
//		} while (flag == false);
//	

		double var1 = 5.0;
		double var2 = var1 / 2;
		double var3 = var1 % 2;
		System.out.println(var2 + " " + var3);

		List colors = new ArrayList<>();
		colors.add("red");
		if (colors.contains("red"))
			System.out.println("Happy Coloring");

		List list = new ArrayList<>();
		list.add("Satisfactory");
		list.add("good");
		list.add("Satisfactory");
		list.add("excellence");
		list.remove(2);
		Iterator i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("======================");
		
		String[] flowers= {"lotous","Lily","rose","Jasmine"};
		for(String c:flowers) {
			if(c.length()<4)
			{
				continue;
			}
			System.out.println(c+" ");
			if(c.length()==4) {
				break;
			}
		}
		
		
		int a;
		int b=21;
//		System.out.println(a+" "+b);

	}
}