package Strings;

public class StringMethods {

	public static void main(String[] args) {

		String str = "java is Fun";
		// length()
		System.out.println("Length:" + str.length());

		// chatAt();// index start from 0
		// 0 1 2 3 4 5 6 7 8 9 10
		// j a v a i s f u n
		System.out.println("Position of character:" + str.charAt(9));
		System.out.println("Position of character:" + str.charAt(10));
		System.out.println("Position of character:" + str.charAt(5));

		// indexOf()//it will return index position of character position

		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("fun"));// match not found
		System.out.println(str.indexOf("fun", 10));// -1 not found

		// subString()// it will start count from 1

		System.out.println(str.substring(8));// it will print after index 8 exclude
		System.out.println(str.substring(0, 7));// include 6 index char
		System.out.println(str.substring(4, 4));// empty string
//		System.out.println(str.substring(4,2));//out of  Range
//		System.out.println(str.substring(8,14));//out of range

		System.out.println(str.substring(8, 10));// out of range

		// toUpperCase()

		System.out.println("Akash Sarwade".toUpperCase());
		System.out.println(str.toUpperCase());
		System.out.println(str);

		String dog = "Monty";// string n=is immu
		dog.toUpperCase();
		System.out.println(dog);

		// toLowerCase()
		System.out.println("PUNE CITY".toLowerCase());

		// equals(), equalsIgnoreCase()
		String str1 = "Java";
		String str2 = "java";
		String str3 = "ja";
		System.out.println("is it euals:" + str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println("abc".equalsIgnoreCase("ABC"));// true

		// startsWith
		System.out.println("String Starts with:" + str1.startsWith("J"));
		// endsWith
		System.out.println("String ends with:" + str1.endsWith("a"));

		// contains();

		System.out.println(str1.contains("a"));
		System.out.println("String contains a" + str1.contains("a"));
		System.out.println("String Contains z" + str1.contains("z"));
		System.out.println("Java".contains(str3));

		// replace
		String myStr = "java is" + " " + " the cool " + " " + "Language";
		System.out.println(myStr.replace("a", "A"));
		System.out.println(myStr.replace("a", "_ "));
		System.out.println(myStr);

		// trim();

		System.out.println("Java".trim());
		System.out.println("Java is have space     ".trim());
		System.out.println("Java-      . o ".trim());
		System.out.println("     Java is      Lang     ".trim());

		// method Chaining

		String start = "   Java++  ";
		String trimmed = start.trim();
		System.out.println("Triimed" + trimmed);
		String lowerCase = trimmed.toLowerCase();
		System.out.println("lowerCase" + lowerCase);
		String result = lowerCase.replace("j", "J");
		System.out.println(result);

		String a = "aBC";
		String b = a.toLowerCase();
		String c = b.toLowerCase();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		if (a.equalsIgnoreCase(b)) {
			System.out.println("value of a and c same");
		} else {
			System.out.println("not same");
		}
		
		
		
	}
}
