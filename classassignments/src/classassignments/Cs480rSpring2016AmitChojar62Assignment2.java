package classassignments;


/*
    * Program name: Cs480rSpring2016ChojarAmit19162Assignment2
    * Discussion:   Assigmment#2
    * Written by:   Amit K Chojar
    * Due date:     2016/02/22
*/
import java.util.Scanner;

public class Cs480rSpring2016AmitChojar62Assignment2 {
    
    public static void main(String[] args)  {
       infoDisplay();
       menu();
       
  }
    
    public static void infoDisplay() {
        System.out.print("CS 480R – Java Programming" + "\nNPU" + "\nChojar," +
                         " Amit" + "\nLast 2 Digit of Student ID: 62" +
                         "\n\nAssignment Information --" + 
                         "\nAssignmentNumber : 02," + "\n                   " + 
                         "Coding Assignment" + 
                         "\nWritten by:Chojar, Amit" + 
                         "\nSubmitted Date: 02/07/2016\n\n");
    }
    
    public static void menu(){
        int option;
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.print("***********************************************"+
                             "\n*\t\t\t Menu\t\t      *" + 
                             "\n* (1) Calling extractLargestandSmallest()    "+  
                             " *" +
                             "\n* (2) Quit\t\t\t\t      *" +
                             "\n********************************************" +
                             "***"+
                             "\n\nEnter your option (1 or 2): ");
            option = scanner.nextInt();
            switch(option){
                case 1: 
                    System.out.println("\nCalling extractLargestandSmallest()" +
                                       "--");
                    callExtract();
                    break;
                case 2: 
                    System.out.println("Bye and have fun!\n");
                    break;
                default:
                    System.out.println("WRONG OPTION!\n");   
            }    
        }while (option!=2);
    }
    
    public static int[] buildInitialArray(){
       
        System.out.println("enter array size: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int ary[] = new int[size];
        System.out.println("Enter the array element value -  ");
        for(int i = 0; i<size; i++) 
            ary[i] = input.nextInt();
        return ary;    
        
    }
    
    public static void callExtract(){
        int[] array1;
       int[] array2;
       int[] resultAry;
       
       System.out.println("Building the first array");
       array1 = buildInitialArray();
       System.out.println("Building the second array");
       array2 = buildInitialArray();
       
       resultAry = extractLargestandSmallest(array1, array2);
         for(int i = 0; i < resultAry.length; i++)
            System.out.print(resultAry[i] + " ");
         System.out.println();
    }
    public static int[] extractLargestandSmallest(int[] ary1, int[] ary2){
        int largestValue;
        int smallestValue;
        int[] largestInfoAry = null;
        int[] smallestInfoAry = null;
        int[] FinalInfoAry = null;
        
        int countLargest = 0;
        int countSmallest = 0;
        
        largestValue = ary1[0];
        smallestValue = ary1[0];
        
        for(int i = 1; i < ary1.length; i++) {
            if(largestValue <  ary1[i]) {
                largestValue = ary1[i];
            }
            if(smallestValue >  ary1[i]) {
                smallestValue = ary1[i];
            }
        }
        
        for(int i = 0; i < ary2.length; i++) {
            if(largestValue <  ary2[i]) {
                largestValue = ary2[i];
            }    
            if(smallestValue >  ary2[i]) {
                smallestValue = ary2[i];
            }
        }
        
         for(int i = 0; i < ary1.length; i++) {
            if(largestValue == ary1[i]) {
                countLargest++;
                i = ary1.length;
            }
        }
         
         for(int i = 0; i < ary1.length; i++) {
            if(smallestValue == ary1[i]) {
                countSmallest++;
                 i = ary1.length;
            }
        }
        
        for(int i = 0; i < ary2.length; i++) {
            if(largestValue == ary2[i]) {
                countLargest++;
                i = ary2.length;
            }
        }
         
        for(int i = 0; i < ary2.length; i++) {
            if(smallestValue == ary2[i]) {
                countSmallest++;
                i = ary2.length;
            }
        }
         
        largestInfoAry = returnSmallestorLargestArray(countLargest, 
                                                        largestValue, ary2);
        smallestInfoAry = returnSmallestorLargestArray(countSmallest, 
                                                        smallestValue, ary2);
        
        FinalInfoAry = new int[largestInfoAry.length + smallestInfoAry.length];
        
        for(int i = 0; i < largestInfoAry.length; i++) {
           FinalInfoAry[i] =  largestInfoAry[i];
        }
        
        for(int i = largestInfoAry.length , j =0; 
           j < smallestInfoAry.length; 
           i++,j++) {
           FinalInfoAry[i] =  smallestInfoAry[j];
        }
        
        return FinalInfoAry ; 
    }  
    
    public static int[] returnSmallestorLargestArray(int count, int value, 
                                                     int[] array2) {
        int size = (count == 2) ? 4 : 3;
        int[] ary = new int[size];
        ary[0] = value;
        ary[1] = count;
        
        if(count == 2) {
            ary[2] = 1;
            ary[3] = 2;
        } else {
            ary[2] = 1;
            for (int i = 0; i < array2.length; i++) {
                if(array2[i] == value){
                ary[2] = 2;
                i = array2.length;
                }
            }
        }
            return ary;
    }
    
    
}  

/* Output
CS 480R – Java Programming
NPU
Chojar, Amit
Last 2 Digit of Student ID: 62

Assignment Information --
AssignmentNumber : 02,
                   Coding Assignment
Written by:Chojar, Amit
Submitted Date: 02/07/2016

***********************************************
*			 Menu		      *
* (1) Calling extractLargestandSmallest()     *
* (2) Quit				      *
***********************************************

Enter your option (1 or 2): 1

Calling extractLargestandSmallest()--
Building the first array
enter array size: 
3
Enter the array element value -  
100
-2
5
Building the second array
enter array size: 
4
Enter the array element value -  
100
2
6
-10
100 2 1 2 -10 1 2 
***********************************************
*			 Menu		      *
* (1) Calling extractLargestandSmallest()     *
* (2) Quit				      *
***********************************************

Enter your option (1 or 2): 3
WRONG OPTION!

***********************************************
*			 Menu		      *
* (1) Calling extractLargestandSmallest()     *
* (2) Quit				      *
***********************************************

Enter your option (1 or 2): 2
Bye and have fun!

*/

/* COMMENT -- logic and code
 The main program calls two methods. info() and menu()
 info() prints course number, name of student, assignemnt information etc
 menu() has two options. Option 1 calls callExtract(). Option 2 quits the prog.
 callExtract() calls buildInitialArray() and extractLargestandSmallest().
 It then prints the array returned by extractLargestandSmallest().
 
 buildInitialArray() also us to determine size of initial array and enter
 array values according. It makes use of Scanner class to accept input from the
 user.

 extractLargestandSmallest() builds two arrays - largest and smallest. It then 
 combines them into one to return a combined array to its calling method. In 
 thiscase when callExtract() calls extractLargestandSmallest(), a combined array 
 is returned.
 Further, extractLargestandSmallest() outsources the task of building largest 
 and smallest arrays  to returnSmallestorLargestArray(). 

 The program code makes use of many methods to simplify the coding process. This
 also helps maintain the code better.

*/