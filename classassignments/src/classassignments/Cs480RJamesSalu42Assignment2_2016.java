package classassignments;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 * Program Name: Cs480RJamesSalu42Program20160220.java
 * Discussion:   Assignment #2
 * Written By:   Salu James
 * Due Date:     2016/02/22
 */

public class Cs480RJamesSalu42Assignment2_2016 {

   
    public static void main(String[] args) {
        int option=1,i;
     System.out.println("CS 480R – Java Programming");
     System.out.println("NPU");
     System.out.println("James Salu");
     System.out.println("Last 2 Digit of Student ID: 42");
     System.out.println();
     System.out.println("Assignment Information -- ");
     System.out.println("Assignment Number: 02, ");
     System.out.println("           Coding Assignment");
     System.out.println("Written by:        James Salu");
     System.out.println("Submitted Date:    Feb-22-2016");
 
     int n,n2;
    Scanner s = new Scanner(System.in);
    
     while(option!=2)
        {
        System.out.print("\n\n*****************************************");
        System.out.print("\n*\t\t MENU \t\t\t *\n* "
                    + "(1)Calling extractLargestAndSmallest()"
                    + " *\n* (2) Quit\t\t\t\t *");
        System.out.print( "\n*****************************************\n" );
        System.out.println("Enter Your Option (1 or 2) :");
        option=s.nextInt();
        
    switch(option)
        {
        case 1:  
            System.out.print("Enter the size of array A:");
            n = s.nextInt();
            int ary1[] = new int[n];
            System.out.println("Enter elements of array A:");
            
            for( i = 0; i < n; i++){
            System.out.print("Index "+i+":");
            ary1[i] = s.nextInt();
             }
            
            System.out.print("Enter size of array B:");
            n2 = s.nextInt();    
            int ary2[]= new int [n2];
            System.out.println("Enter elements of array B:");
            for( i = 0; i < n2; i++){
                System.out.print("Index "+i+":");
            ary2[i] = s.nextInt();
             }
            int[] largestsmallest_item;
            largestsmallest_item = extractLargestAndSmallest(ary1,ary2);
            System.out.println("\t OutPut");
            for( i= 0;i < largestsmallest_item.length;i++){
            System.out.println(largestsmallest_item[i]);
               }
              break;
            case 2:
                    System.out.println("Working good....");
                    break;
            default:
                    System.out.println("WRONG OPTION");
                    break;
        }
       } 
     }
 
 public static int[] extractLargestAndSmallest(int[] ary1,int[] ary2){
    int  largestValue,smallestValue;
    int[] largestsmallestInfoAry = null;
    int[] smallestInfoAry = null;
    int size1 =0,size2=0;
    int count1 = 0,count2=0;
    largestValue=ary1[0];
    smallestValue=ary1[0];
    //Find the largest element
    
    for(int i=1; i<ary1.length; i++){
        if( largestValue < ary1[i]){
             largestValue = ary1[i];
        }
    }
    for(int i=0; i<ary2.length; i++){
        if( largestValue < ary2[i]){
             largestValue = ary2[i];
        }
    }
        //Find the smallest element
        
    for(int i=1; i<ary1.length; i++){
        if( smallestValue >ary1[i]){
             smallestValue = ary1[i];
        }
    }
    for(int i=0; i<ary2.length; i++){
        if( smallestValue >ary2[i]){
            smallestValue = ary2[i];
        }
    }
    
    //Count the largest
     for(int i=1; i<ary1.length; i++)
         if(largestValue == ary1[i]){
            count1++;
            i = ary1.length;
            
         }
    for(int i=0; i<ary2.length; i++)
         if(largestValue == ary2[i]){
            count1++;
            i = ary2.length;
           }
    
      //Count the Smallest
     for(int i=0; i<ary1.length; i++)
         if(smallestValue == ary1[i]){
            count2++;
            i = ary1.length;
            
         }
    for(int i=1; i<ary2.length; i++)
         if(smallestValue == ary2[i]){
            count2++;
            i = ary2.length;
           }
    
    
    size1 = (count1== 2)?4:3;
    size2 = (count2== 2)?4:3;
    int size_d=size1+size2;
    //Info Array
     largestsmallestInfoAry = new int[size_d];
       largestsmallestInfoAry [0] = largestValue;
       largestsmallestInfoAry [1] = count1;
       largestsmallestInfoAry [2] = 1;
    if(count1 ==2){
       largestsmallestInfoAry [2] = 1;
       largestsmallestInfoAry [3] = 2;
    }else{
       for(int i=0;i<ary2.length;i++){
         if(ary2[i] == largestValue){
          largestsmallestInfoAry[2]=2;
          i=ary2.length;
         }  
       }
    }
    
    if(size1==4){
       largestsmallestInfoAry [4] = smallestValue;
       largestsmallestInfoAry [5] = count2;
       largestsmallestInfoAry [6] = 1;
    if(count2 ==2){
      
       largestsmallestInfoAry [6] = 1;
       largestsmallestInfoAry [7] = 2;
    }else{
       for(int i=0;i<ary2.length;i++){
         if(ary2[i] == smallestValue){
          largestsmallestInfoAry[6]=2;
          i=ary2.length;
         }  
       }
    }
    }
    else{
        largestsmallestInfoAry [3] = smallestValue;
       largestsmallestInfoAry [4] = count2;
       largestsmallestInfoAry [5] = 1;
    if(count2 ==2){
      
       largestsmallestInfoAry [5] = 1;
       largestsmallestInfoAry [6] = 2;
    }else{
       for(int i=0;i<ary2.length;i++){
         if(ary2[i] == smallestValue){
          largestsmallestInfoAry[5]=2;
          i=ary2.length;
         }  
       }
    }
        
    } 
  return largestsmallestInfoAry;
  
 }
 }


/** OUTPUT
 * 
 *  CS 480R – Java Programming
NPU
James Salu
Last 2 Digit of Student ID: 42

Assignment Information -- 
Assignment Number: 02, 
           Coding Assignment
Written by:        James Salu
Submitted Date:    Feb-22-2016


*****************************************
*		 MENU 			 *
* (1)Calling extractLargestAndSmallest() *
* (2) Quit				 *
*****************************************
Enter Your Option (1 or 2) :
1
Enter the size of array A:5
Enter elements of array A:
Index 0:-15
Index 1:450
Index 2:63
Index 3:-9
Index 4:90
Enter size of array B:6
Enter elements of array B:
Index 0:100
Index 1:-151
Index 2:450
Index 3:6
Index 4:-91
Index 5:9
	 OutPut
450
2
1
2
-151
1
2

* 
* 
*****************************************
*		 MENU 			 *
* (1)Calling extractLargestAndSmallest() *
* (2) Quit				 *
*****************************************
Enter Your Option (1 or 2) :
3
WRONG OPTION


*****************************************
*		 MENU 			 *
* (1)Calling extractLargestAndSmallest() *
* (2) Quit				 *
*****************************************
Enter Your Option (1 or 2) :
1
Enter the size of array A:7
Enter elements of array A:
Index 0:15
Index 1:450
Index 2:63
Index 3:-900
Index 4:90
Index 5:-900
Index 6:90
Enter size of array B:6
Enter elements of array B:
Index 0:100
Index 1:-151
Index 2:4500
Index 3:6
Index 4:-91
Index 5:9
	 OutPut
4500
1
2
-900
1
1

* 
* 
* 
*****************************************
*		 MENU 			 *
* (1)Calling extractLargestAndSmallest() *
* (2) Quit				 *
*****************************************
Enter Your Option (1 or 2) :
2
Working good....
 * 
 * 
 * 
 * 
 */



