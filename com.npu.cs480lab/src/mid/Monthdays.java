package mid;

import java.util.Scanner;

public class Monthdays {

	public static void main(String args[]){
		Scanner  sc=new Scanner(System.in);
				
			int a;
		System.out.println("Enter the number of days :");
		
		a=sc.nextInt();
		
		System.out.println(a+" Days = "+a/30+" Months and "+a%10+" Days");
			
		
		
	}
	
}
