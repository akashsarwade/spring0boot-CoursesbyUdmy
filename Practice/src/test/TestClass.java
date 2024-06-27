package test;

public class TestClass {

//	public static void main(String[] args) {

//		 System.out.println("Hello");
//	     return 10L;

//		int i;
//		int j;
//		for (i = 0, j = 0; j < 1; ++j, i++) {
//			System.out.println(i + "" + j);
//
//		}
//		System.out.println(i + "" + j);

//		 int i = 0;
//	      for (i=1 ;  i<5  ; i++)
//	    	  continue; //1
//	      for (i=0 ;       ; i++)
//	    	  break; //2
//	      for (    ; i<5?false:true ;    ); //3

//		outer: for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 2; j++) {
//				if (i == j) {
//					continue outer;
//				}
//				System.out.println("i=" + i + " , j=" + j);
//			}
//		}
	public static int switchTest(int k)
	  {
	    
		int j = 1;
		switch (k) {
		case 1:
			j++;
		case 2:
			j++;
		case 3:
			j++;
		case 4:
			j++;
		case 5:
			j++;
		default:
			j++;
		}
		return j + k;
	}

	public static void main(String[] args) {
		System.out.println(switchTest(4));
	}
}