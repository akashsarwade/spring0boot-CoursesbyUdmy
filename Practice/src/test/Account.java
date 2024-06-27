package test;

public class Account {
	double balance;

	public void update(int[] balances2) {
		balances2[0] = 100;
		balances2[1] = 200;
	}

	public static void main(String[] args) {
		int[] balances1 = new int[2];
		balances1[0] = 10;
		balances1[1] = 20;
		for (int bal : balances1) {
			System.out.print(bal + " ");
		}
		Account a = new Account();
		a.update(balances1);
		for (int bal : balances1) {
			System.out.print(bal + " ");
		}
	}
}