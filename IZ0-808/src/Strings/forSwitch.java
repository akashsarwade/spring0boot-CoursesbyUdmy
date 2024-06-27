package Strings;

public class forSwitch {

	public static void main(String[] args) {

		char i;
		LOOP: for (i = 0; i < 5; i++) {
			switch (i++) {

			case '0':
				System.out.println("A");
			case 1:
				System.out.println("B");
				break LOOP;
			case 2:
				System.out.println("C");
				break;
			case 3:
				System.out.println("D");
				break;
			case 4:
				System.out.println("E");
			case 'E':
				System.out.println("F");
			}
		}

		int count = 0, sum = 0;
		do {
			if (count % 3 == 0)
				continue;
			sum += count;
		} while (count++ < 11);
		System.out.println(sum);

		int[] balances1 = new int[2];
		balances1[0] = 10;
		balances1[1] = 20;

		int[] balances2 = balances1;
		balances2[0] = 0;

		System.out.print(balances1 == balances2);

//		int x = Integer.parseInt(args[0]);
//	      switch(x)
//	      {
//	         case x < 5 : System.out.println("BIG"); break;
//	         case x > 5 : System.out.println("SMALL");
//	         default : System.out.println("CORRECT"); break;
//	      }

		String str1 = "str1";
		String str2 = "str2";
		System.out.println(str1.concat(str2));
		System.out.println(str1);

		int a = 1;
		int[] ia = new int[10];
		int b = ia[a];
		int c = b + a;
		System.out.println(b = c);

		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		System.out.println(s1 == s2); // 1true
		System.out.println(s1 == s3); // 2
		System.out.println(s1.equals(s2));// 3
		System.out.println(s2.equals(s3)); // 4

		float f1 = 1.0;
		float f = 4;
		float f7 = 43e1;
		float f4 = -1;
		float ff = 0x0123;

	}
}
