package classassignments;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/****
 * Program Name: Cs480_Spring2016JamesSalu14942Assignment3Java
 * discussion: Assignment #3
 * Written By:James Salu
 * Student ID :***42
 * Due Date: 2016/03/07
 *

 *
 * @author Salu
 */
public class CS480RJamesSalu_42_HW3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] uncommonDigitAry = null;
        
       int option = 1;
Scanner input = new Scanner (System.in);
System.out.println("CS 480R - Java programming");
System.out.println("NPU");
System.out.println("James Salu");
System.out.println("Last 2 Digit of Student ID : ***42");
System.out.println();
System.out.println("Assingment Information--");
System.out.println("  Assingment number  :3,coding Assigment");
System.out.println("Written by: James Salu");
System.out.println("Submitted Date: 03/7/2016");
   while(option!=2)
        {
        System.out.print("\n\n*****************************************");
        System.out.print("\n*\t\t MENU \t\t\t*\n* "
                    + "(1) Calling uncommonDigitArray()"
                    + " *\n* (2) Quit\t\t\t\t*");
        System.out.print( "\n*****************************************\n" );
        System.out.println("Enter Your Option (1 or 2) :");
        option=input.nextInt();
        int number; 
       switch(option)
        {
            case 1:  
                
                uncommonDigitAry = getDigitCountInfo();;
                break;
            case 2:
                System.out.println("Fun but....");
                break;
            default:
                System.out.println("WRONG OPTION");
                break;
        }
        // One quick test
       // uncommonDigitAry = getDigitCountInfo();

        // Display the uncommonDigitAry to confirm the result

        // Your Homework #3 should have the menu to run and test
        // your work/data
    }
    }

    public static int[] getDigitCountInfo() {
        int numberOfInt;
        int[] dataAry;
        int[][] digitCountAry;
        int[] uncommonDigitAry;
        int[] returnAry = null;
        int i;
        Scanner scanner = new Scanner(System.in);
        int index;
        int j;
        int tmp;

        // Step 1:
        System.out.println("\nHow many int's? ");
        numberOfInt = scanner.nextInt();

        // Step 2:
        dataAry = new int[numberOfInt];

        // Step 3:
        for(i = 0; i < dataAry.length; i++) {
            System.out.println("\nEnter int[" + i + "] : ");
            dataAry[i] = scanner.nextInt();
        }

        // Step 4:
        digitCountAry = new int[numberOfInt][10];

        // Step 6:
        /*   This step will work through all integers to
             acquire the digit count table as discussed
             in class
        */
        index = 0;
        for (index = 0; index < numberOfInt; index ++) {
        
        
        tmp = (dataAry[index] < 0) ?
            -dataAry[index] :
            dataAry[index];
        do {
            (digitCountAry[index][tmp % 10])++;
            tmp /= 10;
        } while(tmp != 0);
}
        // TODO's
        //   - Study the above code block and
        //   - Generate a loop as follows
        //       for (index = 0; index < numberOfInt; index ++) {
        //           // code
        //       }

        // Step 7:
        //   Determining the uncommon sigits
        uncommonDigitAry = new int[10];
        for(j = 0; j < 10; j++) {
            for(i = 0; i < dataAry.length; i++) {
                if(digitCountAry[i][j] != 0)
                    uncommonDigitAry[j]++;
                    }
        }
        returnAry = new int[2];
        // Print the idex
        //for(j = 0; j < 10; j++) 
           // System.out.println(+uncommonDigitAry[j]);
        
        
         
        for(j = 9; j>0; j--){
            
            {
               if(uncommonDigitAry[j]==1)
               {
                   returnAry[1]=j;
                   returnAry[0]=uncommonDigitAry[j];
                   break;
               }
              
            }
            
        }
            System.out.println("Output");
            System.out.println(+returnAry[0]);
            System.out.println(+returnAry[1]);
            
            
                    
        
        
        
        // Step 8:
        // TODO's
        //   - Start from the digit 9 (index 9) of the 
        //     uncommonDigitAry[] going back to digit 0
        //     (index 0) to see if there is an uncommon
        //     digit.
        //   - If there is an uncommon digit then
        //       1. Save the index (the largest uncommon
        //          digit); and
        //       2. Allocate/create the return array of 
        //          size 2; i.e.,
        //              returnArray = new int[2];
        //       3. Store the digit (index) to the array
        //          element of index 1; and
        //       4. Use the digit to confirm the number of 
        //          time(s) the digit is seen; and
        //       5. Store this digit count to the return
        //          array element of index 0.
        //  - If there is no uncommon digit then
        //       1. Allocate/create the return array of
        //          size 1; i.e.;
        //              returnAry = new int[1];
        //       2. Store 0 to element of index 0
        
        return returnAry;
    

    
    }

        }
    
/**
run:
CS 480R - Java programming
NPU
James Salu
Last 2 Digit of Student ID : ***42

Assingment Information--
  Assingment number  :3,coding Assigment
Written by: James Salu
Submitted Date: 03/7/2016


*****************************************
*		 MENU 			*
* (1) Calling uncommonDigitArray() *
* (2) Quit				*
*****************************************
Enter Your Option (1 or 2) :
1

How many int's? 
3

Enter int[0] : 
32965

Enter int[1] : 
-275721

Enter int[2] : 
3028063
Output
1
9
*/
    /**
     * comment
     * This source code is only partially complete. I tried my level best, I could have done a little more better if I had some more time.
     */
