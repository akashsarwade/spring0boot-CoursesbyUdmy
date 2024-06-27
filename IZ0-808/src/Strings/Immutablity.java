package Strings;

public class Immutablity {

	public static void main(String[] args) {
		String hello = "hello";
		String hi = hello + "world";
		hi = hello;
		System.out.println(hi + hello);
		hello = hello.toUpperCase();
		System.out.println(hello);

		// concat

		String s1 = "1";
		String s2 = s1.concat("2");// s2=12
		s2 = s2.concat("3");// s2=123
		System.out.println(s1);// 1
		System.out.println(s2);// 12

	}
}
