package test;

import java.util.ArrayList;
import java.util.List;

public class test1 {
	public static void main(String[] args) {

//		String flovor[]= {"vanila","chokolate"};
//		int choise=2;
//		switch(choise) {
//		case 1:
//			System.out.println("Selected Flour "+flovor[0]+" flovor");
//			break;
//		
//		case 2:
//			System.out.println("Selected Flour "+flovor[1]+" flovor");
//			break;
//			
//			default:
//				System.out.println("Thank You");
//		}
//	

//	int count=0;
//	while(count<=10) {
//	
//		System.out.println(count+ " ");
//		count=count+2;
//	}
//	
//	
		List fly = new ArrayList<>();
		fly.add("Jasmin");
		fly.add("rose");
		fly.add("lotous");
		fly.remove(2);
		fly.set(2, "lilys");
		System.out.println(fly);

		
		
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(arr.length);
		
		for (int i = 0	; i < arr.length ; i += 2) 
		
		
		{
			System.out.println(arr[i]);
		}
		
		
		
		
		

	}
}
