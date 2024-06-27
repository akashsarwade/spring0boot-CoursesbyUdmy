package Codes;

public class b {

	public static void main(String[] args) {
		String name1 = "car";
		String name2 = "cat";
		if (name1.equals(name2)) {
			if (name1 == name2) {
				System.out.println("car and cat are same");
			}
		} else {
			if (name1.compareTo(name2) < 0) {
				System.out.println("car is faster");
			} else if (name1.compareTo(name2) > 0) {
				System.err.println("cat is faster");
			} else {
				System.out.println("car and cat are faster");
			}
		}
		
		
		
		float fval=120;
		int ival=fval;
		double dval=fval;
		long lval=fval;
		
				
	}
}
