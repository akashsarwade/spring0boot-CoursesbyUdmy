package test;

public class App {

	public void doCals(int[]arr) {
		arr[0]=100;
		arr[1]=150;
		System.out.println("");
	}
	public static void main(String[] args) {
		
		int [] num=new int[2];
		num[0]=5;
		num[1]=10;
		for(int x:num) {
			System.out.println(x+" ");
		}
		
		App op=new App();
		op.doCals(num);
				
		for(int x:num) {
			System.out.println(x+" ");
		}
		
	}
}
