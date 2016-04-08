package mid;

import java.util.Scanner;

public class Harmonic {
	public static void main(String args[]){
		Scanner  sc=new Scanner(System.in);
				
			float sum=0;
		System.out.println("Harmonic Series of ");
		
		int a=sc.nextInt();
		
		System.out.print("is ");
		
		while(0<a){
			
			sum+=(float)1/a;
			System.out.print("1/"+a);
			a--;
			if(a>0)
				System.out.print("+");
				
			
		}
		
		System.out.println("="+sum);
			
		
		
	}
}
