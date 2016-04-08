package wekk3;


import java.util.Scanner;

/**
 * Program Name: Cs480RYourNameIDProgram03A_0206.java
 * Discussion:   Assignment #1
 * Written By:   Your Name
 * Due Date:     2016/02/06
 */
public class Cs480RYourNameIDProgram03A_0206 {
    public static void main(String[] args) {
        
        //displayDigitInfo2();
        menu02();
        
    }
    
    public static int getSmallestInt(int ary[]) {
        int smallestInt;
        int aryLength = ary.length;
        
        smallestInt = ary[0];
        for (int i = 1; i < ary.length; i++) {
            if (smallestInt > ary[i]) {
                smallestInt = ary[i];
            }
        }
        
        return smallestInt;
    }
    
    public static void menu02() {
        int option;
        Scanner scanner = new Scanner(System.in);
        
        do {
  
            System.out.print("\nMenu -- 02" +
                    "\n1. Calling displayDigitInfo2()" +
                    "\n2. Quit" +
                    "\nEnter the option (1 or 2): ");
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    //System.out.print("\nCalling getMostOccurredDigit()" +
                    //        "\nto process and display the required info!");
                    
                    // TODO:
                    //    Replace this with the actual call to the
                    //    method getMostOccurredDigit()
                    
                    displayDigitInfo2();
                    break;
                case 2:
                    System.out.println("Have Fun!\n");
                    break;
                default:
                    System.out.println("\nWRONG OPTOION!\n");
            }
            
        } while (option != 2);
    }
    
    public static void menu01() {
        int option;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print("\nMenu -- 01" +
                    "\n1. Calling getMostOccurredDigit()" +
                    "\n2. Quit" +
                    "\nEnter the option (1 or 2): ");
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println("\nCalling getMostOccurredDigit()" +
                            "\nto process and display the required info!");
                    
                    // TODO:
                    //    Replace this with the actual call to the
                    //    method getMostOccurredDigit()
                    break;
                case 2:
                    System.out.println("Have Fun!\n");
                    break;
                default:
                    System.out.println("\nWRONG OPTOION!\n");
            }
            
        } while (option != 2);
    }
    
    public static void displayDigitInfo2() {
        int[] digitAry;
        int digit;
        int number;
        Scanner scanner;
        
        digitAry = new int[10];
        System.out.println(digitAry);
        
        scanner = new Scanner(System.in);
        
        //number = -1661674;
        System.out.print("\nEnter an int: ");
        number = scanner.nextInt();
        if (number < 0) 
            number = -number;
        
        do {
            digit = number % 10;
            digitAry[digit]++;
            number /= 10;
        } while (number != 0);
        
        for (int i = 0; i < 10; i++) {
            if (digitAry[i] != 0)
                System.out.println("Digit " + i +
                        " occurs " + digitAry[i] + " time(s)!");
        }
    }
    
    public static void displayDigitInfo() {
        int countDigit0 = 0;
        int countDigit1 = 0;
        int countDigit2 = 0;
        int countDigit3 = 0;
        int countDigit4 = 0;
        int countDigit5 = 0;
        int countDigit6 = 0;
        int countDigit7 = 0;
        int countDigit8 = 0;
        int countDigit9 = 0;
        int digit;
        int number;
        
        number = -1661674;    
        
        if (number < 0) 
            //number = -1 * number;
            number = -number;
              
        do {
            digit = number % 10;
            
            if (digit == 0) 
                countDigit0++;
            else if (digit == 1) 
                countDigit1++;
            else if (digit == 2) 
                countDigit2++;
            else if (digit == 3) 
                countDigit3++;
            else if (digit == 4) 
                countDigit4++;
            else if (digit == 5)
                countDigit5++;
            else if (digit == 6) 
                countDigit6++;
            else if (digit == 7) 
                countDigit7++;
            else if (digit == 8) 
                countDigit8++;
            else
                countDigit9++;
            
            number /= 10;
        } while (number != 0);
        
        if (countDigit0 != 0) 
            System.out.println("Digit 0 occurs " +
                    countDigit0 + " time(s)!\n");
        
        if (countDigit1 != 0) 
            System.out.println("Digit 1 occurs " +
                    countDigit1 + " time(s)!\n");
        
        if (countDigit2 != 0) 
            System.out.println("Digit 2 occurs " +
                    countDigit2 + " time(s)!\n");
        
        if (countDigit3 != 0) 
            System.out.println("Digit 3 occurs " +
                    countDigit3 + " time(s)!\n");
        
        if (countDigit4 != 0) 
            System.out.println("Digit 4 occurs " +
                    countDigit4 + " time(s)!\n");
        
        if (countDigit5 != 0) 
            System.out.println("Digit 5 occurs " +
                    countDigit5 + " time(s)!\n");
        
        if (countDigit6 != 0) 
            System.out.println("Digit 6 occurs " +
                    countDigit6 + " time(s)!\n");
        
        if (countDigit7 != 0) 
            System.out.println("Digit 7 occurs " +
                    countDigit7 + " time(s)!\n");
        
        if (countDigit8 != 0) 
            System.out.println("Digit 8 occurs " +
                    countDigit8 + " time(s)!\n");
        
        if (countDigit9 != 0) 
            System.out.println("Digit 9 occurs " +
                    countDigit9 + " time(s)!\n");
    }
    
}

/*PROGRAM OUTPUT
Menu -- 02
1. Calling displayDigitInfo2()
2. Quit
Enter the option (1 or 2): 3

WRONG OPTOION!


Menu -- 02
1. Calling displayDigitInfo2()
2. Quit
Enter the option (1 or 2): 1
[I@5c647e05

Enter an int: 34345340
Digit 0 occurs 1 time(s)!
Digit 3 occurs 3 time(s)!
Digit 4 occurs 3 time(s)!
Digit 5 occurs 1 time(s)!

Menu -- 02
1. Calling displayDigitInfo2()
2. Quit
Enter the option (1 or 2): 2
Have Fun!
*/

/* COMMENT -- Logic & Code
No Comments!
*/