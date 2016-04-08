package classassignments;
/*
 
package cs480rjitendra18600week5.java;
 * Program Name : Largesmall.java
 * Discussion   :   Class Largesmall
 * Written by   :   jitendra kotapati
 * Date : 2016/02/22
 */

 
 //* @author jitendra26
 import java.util.Scanner; 
public class Largesmall {
	void extractLargestandsmallest(int ary1[],int ary2[])
	{
	int l1=ary1.length;
	int l2=ary2.length;
	int i,max1,max2,min1,min2,ind_max1=0,ind_min1=0,ind_max2=0,ind_min2=0;
	max1=min1=ary1[0];
	max2=min2=ary2[0];
	for(i=0;i<l1;i++)
	{
	if(ary1[i]>=max1)
	{
	max1=ary1[i];
	ind_max1=i;
	}
	if(ary1[i]<=min1)
	{
	min1=ary1[i];
	ind_min1=i;
	}
	}

	for(i=0;i<l2;i++)
	{
	if(ary2[i]>=max2)
	{
	max2=ary2[i];
	ind_max2=i;
	}
	if(ary2[i]<=min2)
	{
	min2=ary2[i];
	ind_min2=i;
	}
	}

	if(max1>max2)
	{
	System.out.println(max1+" ");
	System.out.println((ind_max1+1)+" ");
	System.out.print("1"+" ");
	}
	else
	{
	System.out.print(max2+" ");
	System.out.print((ind_max2+1)+" ");
	System.out.print("2"+" ");
	}

	if(min1<min2)
	{
	System.out.print(min1+" ");
	System.out.print((ind_min1+1)+" ");
	System.out.print("1"+" ");
	}
	else
	{
	System.out.print(min2+" ");
	System.out.print((ind_min2+1)+" ");
	System.out.print("2"+" ");
	}

	}
	public static void main(String args[])
	{
	int op,size1,size2;
	Scanner S=new Scanner(System.in);
	Largesmall LS=new Largesmall();
	do
	{
	System.out.println();
	System.out.println("*******************************************");
	System.out.println("*               MENU                      *");
	System.out.println("*  (1)Calling extractLargestAndSmallest() *");
	System.out.println("*  (2)Quit                                *");
	System.out.println("*******************************************");
	System.out.print("Enter your option(1 or 2):");
	op=S.nextInt();
	switch(op)
	{
	case 1: System.out.print("Building the First array - "); 
	           System.out.print("Enter array size: "); 
	           size1=S.nextInt();
	            int[] x=new int[size1];
	            System.out.println("Enter array elements");
	            for(int i=0;i<size1;i++)
	            	x[i]=S.nextInt();
	            System.out.print("Building the Second array - "); 
	           System.out.print("Enter array size: "); 
	           size2=S.nextInt();
	           int[] y=new int[size2];
	           System.out.println("Enter array elements");
	           for(int i=0;i<size2;i++)
	            	y[i]=S.nextInt();
	           System.out.println("Calling extractLargestAndSmallest() -- ");
	           LS.extractLargestandsmallest(x,y);
	           break;
	case 2:System.exit(1);
	       
	default:System.out.print("Wrong Option");
	            break;
	}
	}while(op<=2);
}
}
