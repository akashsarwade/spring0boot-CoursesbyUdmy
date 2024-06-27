package switchs;

import java.util.Random;

public class switchStatements {

	public static void main(String[] args) {

		int dayofweek = 0;
		switch (dayofweek) {
		case 0:
			System.out.println("Monday");
			break;
		case 1:
			System.out.println("Tuesday");
			break;

		case 2:
			System.out.println("wednesday");
			break;
		case 3:
			System.out.println("thursday");
			break;
		case 4:
			System.out.println("friday");
//			break;
		default:
			System.out.println("Weekend");
			break;
		}

		Random rand = new Random();
		int c = rand.nextInt(26) + 'a'; // adding offset to produce lower case letter
		System.out.println((char) c + "" + c + ":");
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vovels");

		case 'y':
		case 'w':
			System.out.println("Sometimes Vowels");
			break;
		default:
			System.out.println("Consonents");

			int x = 4;
			switch (x) {
			case 3:
//			case x:
//			case y:

			case 'K':
//			case "Test": not compile its excepting string
			}

		}

	}
}
