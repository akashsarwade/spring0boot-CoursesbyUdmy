
public class z {

	void test(byte x)
	{
	   switch(x)
	   {
	      case 'a':   // 1
	      case 's':   // 2
	      case 0:     // 3
	      default :   // 4
	      case 80:    // 5
	   }
	}
	
	public static void main(String args[]) {

		int index=1;
		String[] strArr=new String[5];
		String str=strArr[index];
		System.out.println(str);
	}
}
