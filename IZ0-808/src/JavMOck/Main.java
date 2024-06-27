package JavMOck;

public class Main {
	public static void main(String[] args) {
		doSomething();
	}

	private static void doSomething() {
		doSomethingElse();
	}

	private static void doSomethingElse() {
		throw new Exception();
	}
}