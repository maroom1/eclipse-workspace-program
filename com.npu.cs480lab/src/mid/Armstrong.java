package mid;

import java.util.Scanner;

public class Armstrong {

	public static void main(String args[]){
		Scanner  sc=new Scanner(System.in);
		
		
		int sum = 0, i,j;
		int a;
		System.out.println("Enter integer :");
		
		a=j=sc.nextInt();
		while(a>0){
			i=(a%10)*(a%10)*(a%10);
			sum+=i;
			a=a/10;
		}
		if(sum==j)
			System.out.println("Armstrong number");
		else System.out.println("Not Armstrong number");
		
	
	}
}
