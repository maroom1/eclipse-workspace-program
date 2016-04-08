package Mid;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" CS 480J – Java Programming ");
		System.out.println(" NPU ");
		System.out.println(" Kyi, Lawrence ");
		System.out.println(" Last 2 Digit of Student ID: dd : 97 ");
		System.out.println("**************************************");
		System.out.println(" Assignment Number: mid, ");
		System.out.println(" Coding Assignment ");
		System.out.println(" Written by: Kyi, Lawrence");
		System.out.println(" Submitted Date: 3/11/2016");
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
		
		System.out.println("Enter the size of the array 1:");
		int x=sc.nextInt();
		System.out.println("Enter the array :");
		int a[]=new int[x];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter the size of the array 2 :");
		int y=sc.nextInt();
		System.out.println("Enter the array :");
		int b[]=new int[y];
		for(int j=0;j<b.length;j++)
			b[j]=sc.nextInt();
		extractLargestVersionB(a, b);
		break;
			case 2:
				System.out.println("System Existed");
				System.exit(0);

			default:
				System.out.println("Wrong option");
				

			}
		}

	}
public static void extractLargestVersionB(int[] a,int[] b){
	
	 largestvalue(a,b);
	
}
public static void largestvalue(int[] a,int[] b){
	
	int counta[]=new int[a.length];
	int countb[]=new int[b.length];
	int array=0;
	int maxa=a[0],maxb=b[0],max,lodd=a[0];
	for (int i=0;i<a.length;i++){
		if(maxa<a[i])
			maxa=a[i];
	 if(a[i]%2!=0)
		 if(lodd<a[i])
			 lodd=a[i];}
    for (int j=0;j<b.length;j++){
			if(maxb<b[j])
				maxb=b[j];
	 if(b[j]%2!=0)
		 if(lodd<b[j])
			 lodd=b[j];
	 
    }
    int lcount=0;
    if(maxa>maxb)
    	max=maxa;
    else max=maxb;
		
			for (int k=0;k<a.length;k++){
				if(max==a[k])
					array++;
			if(lodd==a[k])
				lcount++;
			
			}
		    for (int l=0;l<b.length;l++){
					if(max==b[l])
						array++;	
					if(lodd==b[l])
						lcount++;		
		    }
	System.out.println(max+" is the largest value present "+array+" arrays");	    
	System.out.println(lodd+" is the largest odd value "+lcount+" arrays ");
	int [] res=new int[4];
	res[0]=max;res[1]=array;res[2]=lodd;res[3]=lcount;
	System.out.println("Printing resulting array :");
	for(int m=0;m<res.length;m++){
		System.out.println(res[m]+" ");
		
	}
				
	}
    
	
	
    
	
	

}
