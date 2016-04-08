
import java.util.Scanner;

public class MidTermReview {
	public static void main(String[] args) {
		System.out.println("/** REQUIRED PROGRAM OUTPUT");
		System.out.println("CS 480R � Java Programming");
		System.out.println("NPU");
		System.out.println("Kyi, Lawrence");
		System.out.println("Last 2 Digit of Student ID: 97");
		System.out.println("Assignment Information --");
		System.out.println(" Assignment Number: 02, ");
		System.out.println(" Coding Assignment ");
		System.out.println(" Written by: Kyi, Lawrence");
		System.out.println("Submitted Date: 4/1/2016");

		Scanner sc = new Scanner(System.in);

		System.out.println("*******************************************");
		System.out.println("* MENU *");
		System.out.println("* (1) Calling getUncommonOddDigitInfo() *");
		System.out.println("* (2) Quit *");
		System.out.println("*******************************************");
		int z=sc.nextInt();
		switch (z) {
		case 2:
			System.out.println(" Program quitted !");
			 System.exit(1);
			break;
		default:
			System.out.println("Wrong Option !");
			break;
		case 1:
		System.out.println("Enter array1 size :");
		int a = sc.nextInt();
		int a1[] = new int[a];
		for (int i = 0; i < a1.length; i++) {
			System.out.println("@Index" + i + " :");
			a1[i] = sc.nextInt();
			if ((a1.length - 1) == i)
				System.out.println("Done...!");
		}
		System.out.println("Entered elements...");
		for (int r = 0; r < a1.length; r++) {
			System.out.println("@Index"+r+" :"+a1[r]);
		
		}
		
		System.out.println("Finding the uncommon odd digits info....");
		int[] ab = greatestUncommonOddDigitInfo(a1);
		System.out.println("Printing the output array of lenght :" + ab.length);
		for (int j = 0; j < ab.length; j++) {
			System.out.print(" " + ab[j]);
			}
		System.out.println();
		
		System.out.println("To be interpreted as");
		System.out.println("The number of Uncommon Odd digit(s) :"+ab[0]);
		int w=1;
		for(int k=1;k<ab.length;k++){
			System.out.println("   The information pair #"+w);
			System.out.println("        Uncommon odd digit :"+ab[k]);
			System.out.println("        Number of time(s) occured :"+ab[++k]);
		}
		
		
		
		
		break;
		}
		
		System.out.println("Working Good! */");
	}

	public static int[] greatestUncommonOddDigitInfo(int[] a1)
		{
		
		int[] resultArry;
		
		
	       int countDigit1 = 0;
	       int countDigit3 = 0;
	       int countDigit5 = 0;
	       int countDigit7 = 0;
	       int countDigit9 = 0;
	       int digit;
	       int number;
		
		for(int i=0;i<a1.length;i++){
			number=a1[i];
			 if (number < 0 ) 
		            number = -number;
		              
		        do {
		            digit = number % 10;
		            if (digit == 1) 
		                countDigit1++;
		            else if (digit == 3) 
		                countDigit3++;
		            else if (digit == 5)
		                countDigit5++;
		             else if (digit == 7) 
		                countDigit7++;
		            else if (digit == 9)
		                countDigit9++;
		            
		            number /= 10;
		        } while (number != 0);
		}
		
	
	int[] cd = new int [5];
	cd[0]=countDigit1;
	cd[1]=countDigit3;
	cd[2]=countDigit5;
	cd[3]=countDigit7;
	cd[4]=countDigit9;
	int count=0;
	for(int j=0;j<cd.length;j++){
/*System.out.println("iteration "+j);
System.out.println("first ="+first+ " second="+second);
		if(cd[j]<first && cd[j]!=0){
			second=first;
			first=cd[j];
			index1=j;
			index2=index1;
			System.out.println("first changed to "+ first+" @"+index1);
			System.out.println("Second changed to "+second+" @"+index2);			
		}
		else if(cd[j]<second && cd[j]!=first && cd[j]!=0){
				second=cd[j];
		   index2=j;
		   System.out.println("secnd changed to "+second+" @"+index2);	
			
		}*/
		
		if(cd[j]<3 && cd[j]!=0)
			count++;
	}
	int p=(count*2)+1;
	resultArry=new int[p];
	resultArry[0]=count;
	int x=1;
	for(int k=0;k<cd.length;k++)
	{
		if(cd[k]<3 && cd[k]!=0)
		{ 
			if(k==0){
				resultArry[x]=1;
			    resultArry[x+1]=cd[k];
			    } else if(k==1){
				resultArry[x]=3;
			    resultArry[x+1]=cd[k];
					} else if(k==2){
				resultArry[x]=5;
			    resultArry[x+1]=cd[k];
				} else if(k==3){
				resultArry[x]=7;
			    resultArry[x+1]=cd[k];
				} else if (k==4){
				resultArry[x]=9;
			    resultArry[x+1]=cd[k];
				}
			
		x=x+2;
		if(x>=p)
			break;
		}
		
	}
 
		return resultArry;
	}

}
