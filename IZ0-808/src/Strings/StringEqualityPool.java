package Strings;

public class StringEqualityPool {

	public static void main(String[] args) {
		// == method compare object of equality
		// this will creat in string pool area and all object refer to single world
		// because iyts same
		String name = "John";
		String anotherName = "John";
		String john = "Jo" + "hn";

		String newName = new String("John");
		// using create new operator it will store in heap area
		System.out.println(name.equals(anotherName));
		System.out.println("name == anotherName:" + (name == anotherName));
		System.out.println("name == john:" + (name == john));
		System.out.println("name == newName:" + (name == newName));

		System.out.println("name  equals anotherName:" + name.equals(anotherName));
		System.out.println("name equls Jonh:" + name.equals(john));
		System.out.println(name.equals(anotherName));
		System.out.println("name equals newName:" + name.equals(newName));
		System.out.println(System.identityHashCode(name));
		System.out.println(System.identityHashCode(anotherName));
		System.out.println(System.identityHashCode(newName));

		String s1 = "abc";
		String s2 = "ab";
		String s3 = "ab" + "c";
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

	}
}
