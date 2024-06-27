package test;

public class AA {

	

	void perform_work(int time) {
	}

	int perform_work(int time, int speed) {
		return time * speed;
	}

	int[] ia = new int[1];
	Object oA[] = new Object[1];
	boolean bool;

	public static void main(String args[]) {
		AA test = new AA();
		System.out.println(test.ia[0] + "  " + test.oA[0] + "  " + test.bool);

	}
}
