class Course {

	public int Sum(int a, int b) {
		System.out.println("Data Type");
		return a + b;
	}

	public int Sum(Integer a, Integer b) {
		System.out.println("wrappwe class Type");

		return a + b;
	}

}

public class Test11 {

	public static void main(String[] args) {
		Course t = new Course();
		t.Sum(34, 11);

	}
}