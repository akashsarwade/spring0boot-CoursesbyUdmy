package DoLoop;

public class DoLoop {

	public static void main(String[] args) {

//		int a = 0;
//		do {
//			a++;
//		}
//
//		while (a == 1);
//
//		System.out.println("a" + a);
//
		int x = 20;

		while (x > 10)
			x--;
		System.out.println("x :" + x);

		int x2 = 20;
		do
			x2--;
		while (x2 > 10);
		System.out.println("x2: " + x2);

		int y = 10;
		int z = 5;
		while (y < 20)
			y++; // 11
		z += 2; // z=z+2 ---//7
		y += 10;// y=y+10 ---//20+10=30
		System.out.println("x:" + x + "y:" + y + "z:" + z);

		int num = 10;
		while (num > 10) {//false
			num--;
		}
		do {
			num--;//9
		} while (num < 5);//true
		{
			num += 1;
		}
		while (num < 10)
			;
		System.out.println(num);
	}
}
