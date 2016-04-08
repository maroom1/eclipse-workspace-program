package classassignments;

/* CS480R – Java Programming
NPU
Your Name: Nune yamuna venkata sri lakshmi
Last 2 Digit of Student ID: 65
Assignment Information --  To find largest and smallest value 
                          using methods.
Assignment Number: 02,
Coding Assignment
Written by: Nune Yamuna Venkata Sri Lakshmi
Submitted Date: 2/22/2016
*/
import java.util.Scanner;
import java.util.Arrays;  
public class CS480RSPRING2016NUNEYAMUNA65Assignment2 {
 public static void main(String[] args) {  
 System.out.println("CS480R - Java Programing");
System.out.println("NPU");
System.out.println("Nune YamunaVenkata Sri Lakshmi");
System.out.println("Last two digits of Student ID : 65");
System.out.println();
System.out.println("Assignment Information");
System.out.println(" Assigmentnumber  : 02,Coding Assignment");
System.out.println(" Written by       : Nune YamunaVenkata Sri Lakshmi");
System.out.println(" Submitted date   : 2016-02-22");
     
     display_menu();
 }
 public static void display_menu(){
		int option;
		Scanner input = new Scanner(System.in); 
	    	System.out.println(" \n MENU ------ 01 " +
	    			           " \n 1.Calling extractLargestAndSmallest() " +
	    			           " \n 2. Quit " +
	    			           " \n Enter option (1 or 2) ");
	    	option = input.nextInt();
	    	switch(option){
	    	case 1: int[] ary1;
                     int[] ary2;
                     ary1 = new int[5];
                     ary2 = new int[5];
                     Scanner input_ary1 = new Scanner(System.in);
                     System.out.println("Enter the values for Array1");
                     for(int i = 0; i < 5; ++i){  
                         ary1[i] = input_ary1.nextInt();
                     }

                     Scanner input_ary2 = new Scanner(System.in);
                     System.out.println("Enter the values for Array2");
                     for(int i = 0; i < 5; ++i){
                         ary2[i] = input_ary2.nextInt();
                     }
                     System.out.println("Largest and Smallest value in the given Arrays is: "
                             +(Arrays.toString(extaractLargest_Smallest(ary1,ary2))));
			 
	    	case 2:
	    		System.out.println("Exiting Program");
	    		break;
	    	
	    	default:System.out.println("Wrong Choice");
	    	}
	}

public static int[] extaractLargest_Smallest(int[]ary1, int[]ary2){
   int  largest1, largest2, largestValue, size, countl = 0;
   int[] largestInfoAry;
   int smallest1, smallest2, smallestValue, count = 0;
   int[] smallestInfoAry;
   
   largest1 = ary1[0];
   for(int i=1; i < ary1.length; i++){
      if(largest1 < ary1[i]){
       largest1 = ary1[i];
      }
   }
   
   largest2 = ary2[0];
   for(int i = 1; i < ary2.length; i++){
      if(largest2 < ary2[i]){
       largest2 = ary2[i];
      }
   }
   if(largest1 > largest2){
       largestValue = largest1;
   }
   else{
       largestValue = largest2;
   }
   
   smallest1 = ary1[0];
   for(int i = 1; i < ary1.length; i++){
      if(smallest1 > ary1[i]){
       smallest1 = ary1[i];
      }
   }
   
   smallest2 = ary2[0];
   for(int i = 1; i < ary2.length; i++){
      if(smallest2 > ary2[i]){
       smallest2 = ary2[i];
      }
   }
   if(smallest1 < smallest2){
       smallestValue = smallest1;
   }
   else{
       smallestValue = smallest2;
   }
   
   for (int i = 0; i < ary1.length; i++){
       if (largestValue == ary1[i]){
           countl++;
           i = ary1.length;
       }
   }
   
   for (int i = 0; i < ary2.length; i++){
       if (largestValue == ary2[i]){
           countl++;
           i = ary2.length;
       }
   }
   
   for (int i=0; i < ary1.length; i++)         {
       if (smallestValue == ary1[i])            {
           count++;
           i = ary1.length;
       }
   }
   
   for (int i = 0; i < ary2.length; i++)      {
       if (smallestValue == ary2[i])        {
           count++;
           i = ary2.length;
       }
   }
   
   if(countl == 2){
       largestInfoAry = new int [8];
       largestInfoAry[0] = largestValue;
       largestInfoAry[1] = countl;
       largestInfoAry[2] = 1;
       largestInfoAry[3] = 2;
       largestInfoAry[4] = smallestValue;
       largestInfoAry[5] = count;
       largestInfoAry[6] = 1;
       largestInfoAry[7] = 2;
   }
   else{
       largestInfoAry = new int[6];
       largestInfoAry[0] = largestValue;
       largestInfoAry[1] = countl;
       if(largestValue == largest1)     {
       largestInfoAry[2] = 1;    
       }
       else
       {
           largestInfoAry[2] = 2;
       }
       largestInfoAry[3] = smallestValue;
       largestInfoAry[4] = count;
       if(smallestValue == smallest1)       {
       largestInfoAry[5] = 1;    
       }
       else
       {
           largestInfoAry[5] = 2;
       }
   }
   
   System.out.println("Largest Number: " + largestValue);
   System.out.println("Smallest Number: " + smallestValue);
  
   return largestInfoAry;
 }
 
}


