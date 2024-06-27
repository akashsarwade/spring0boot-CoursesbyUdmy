package test;

public class Message {

	String msg = "hello Java";

	public void sayMsg() {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		Message ob = new Message();
		ob.sayMsg();
		System.out.println(ob.msg);
		
	}

}
