
public class s {

	public static void main(String[] args) {

		String abc = "";
		abc.concat("abc");
		abc.concat("def");
		System.out.println(abc);
		System.out.println(abc.concat(abc));

		String xyz = new String("");
		xyz.concat("xyz");
		xyz.concat("pqr");
		System.out.println(xyz);
System.out.println("================");
		String blank = " "; // one space
		System.out.println(blank);
		String line = blank + "hello" + blank + blank;
		line.concat("world");
		System.out.println(line);
		String newLine = line.trim();
		System.out.println((int) (line.length() + newLine.length()));
	}
}
