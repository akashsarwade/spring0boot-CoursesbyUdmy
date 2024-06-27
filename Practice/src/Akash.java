import java.util.ArrayList;
import java.util.List;

public class Akash {

	Akash() {
		System.out.println("Hello COnstructor");
	}

	public static void main(String[] args) {
		Akash a = new Akash();
		List<Akash> ls = new ArrayList<>();
		ls.add(a);

	}
}
