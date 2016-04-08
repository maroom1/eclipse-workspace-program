package wekk3;

import java.util.Scanner;

public class Cs480rSpring2016kyilawrence4797Assignment3 {
	
	public static int b[]=new int[10];
	
	public static void main(String args[]){
		
		System.out.println(" CS 480J – Java Programming ");
		System.out.println(" NPU ");
		System.out.println(" Kyi, Lawrence ");
		System.out.println(" Last 2 Digit of Student ID: dd : 97 ");
		System.out.println("**************************************");
		System.out.println(" Assignment Number: 03, ");
		System.out.println(" Coding Assignment ");
		System.out.println(" Written by: Kyi, Lawrence");
		System.out.println(" Submitted Date: 3/7/2016");
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("**********************************************");
			System.out.println("* 		   MENU 	         ");
			System.out.println("* (1) Calling getMostOccurredDigitYourName() ");
			System.out.println("* (2) Quit 							 ");
			System.out
					.println("**********************************************");
			System.out.println("Enter your option (1 or 2): ");
			int z = sc.nextInt();
			switch (z) {
			case 1:

		System.out.println("Enter the size of the array :");
		int x=sc.nextInt();
		System.out.println("Enter the array :");
		int a[]=new int[x];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		System.out.println("Entered the array :");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();


		for(int i=0;i<a.length;i++)
		{
			getLargestUncommonDigit(a[i]);
		
		}

		
 int min=Integer.MAX_VALUE,target=0;
		for(int j=0;j<b.length;j++)
		{
			if(b[j]!=0)
			{
				if(b[j]<=min){
					
					min=b[j];target=j;
				}
				
			}
		}
  
		System.out.println( " The most uncommon digit :"+target+" occured :"+min+" times");
		break;
			case 2:
				System.out.println("System Existed");
				System.exit(0);

			default:
				System.out.println("Wrong option");
				

			}
		}

		
	}
 public static void getLargestUncommonDigit(int s){
	 
	 
	 int k;
	 while(s>0){

		 k=s%10;
		 b[k]++;
		 s=s/10;
			 
		 
	 }
 }
}
