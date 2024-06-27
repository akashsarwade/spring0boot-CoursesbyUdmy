package whileLoop;

public class WhileLoop {

	public static void main(String[] args) {

		int spaceonHdd = 5;
		while (spaceonHdd > 0) {
			spaceonHdd--;
			System.out.println("SpaceonHDD : " + spaceonHdd);
		}

		int x = 2;
		int y = 5;
		while (x < 10) {
			y++;
			x++;

			// its Iteration y=6, x=3
			// its Iteration y=7,x=4
			// its Iteration y=8,x=5
			// its Iteration y=9,x=6;
			// its Iteration y=10,x=7
			// its Iteration y=11,x=8
			// its Iteration y=12,x=9;
			// its Iteration y=13,x=10
			// its Iteration y=14,x=11 false/terminate
		}
		System.out.println("X= :" + x + " Y=: " + y);

		int a = 5;
		int b = 7;
		// first iteration while loop not execute not go inside block
		// a>6 condition false
		while (a > 6) {
			b += 2; // b=b+2
			a++;
		}
		// it will come here
		a = a > 6 ? a++ : b--;
		// so b-- means b=6 and its also = a so a is now 6
		//
		// is a>6 not so its false condition thats why it will not execute A= condition
		// also
		// 5>6 false
		// 5>6 false
		// it will execute b-- expression

		// it will 6+7 =13 uuit will print 13
		System.out.println(a + "," + b + ":" + (a + b));

	}
}
