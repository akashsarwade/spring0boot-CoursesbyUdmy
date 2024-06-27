package Codes;

public class w {

	public static void main(String[] args) {

		double avgScore = 75.25;
		if (avgScore > 50 && avgScore < 70) {
			System.out.println("c");
		} else if (avgScore >= 70 && avgScore < 90) {

			System.out.println("B");
		} else if (avgScore <= 60) {

			System.out.println("A");
		}

		else {
			System.out.println("No Grade");
		}
	}

}