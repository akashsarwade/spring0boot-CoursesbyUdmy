package test;

class myClass {
	private int var1 = 100;
	private int var2 = 200;

	public void doCalc() {
		var1 = 100 * 2;
		var2 = 200 * 2;

	}
}
	public class myClassB {

	public static void main(String[] args) {
		myClass o = new myClass();
		o.doCalc();
//		System.out.println(o.var1 + " : " + o.var2);
	}
}
