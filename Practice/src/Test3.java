import java.util.ArrayList;

public class Test3 {

	public static void ifTest(boolean flag) {
		if (flag) // 1
			if (flag) // 2
				if (flag) // 3
					System.out.println("False True");
				else // 4
					System.out.println("True False");
			else // 5
				System.out.println("True True");
		else // 6
			System.out.println("False False");
	}

	public static void main(String[] args) throws Exception {

		int k = 0;
		try {
			int i = 5 / k;
		} catch (ArithmeticException e) {
			System.out.println("1");
		} catch (RuntimeException e) {
			System.out.println("2");
			return;
		} catch (Exception e) {
			System.out.println("3");
		} finally {
			System.out.println("4");
		}
		System.out.println("5");

		System.out.println(1 + 2 + "3");
		System.out.println("1" + 2 + 3);
		System.out.println(4 + 1.0f);
		System.out.println('a' + 1);
		System.out.println("++++++++++++++++++++++++++++++++");

		ArrayList<String> al = new ArrayList<String>();
		al.add("111");
		al.add("222");
		System.out.println(al.get(1));
		System.out.println(al.size());
		
		

	}
}
