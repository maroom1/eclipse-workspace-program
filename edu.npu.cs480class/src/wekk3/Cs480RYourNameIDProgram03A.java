package wekk3;

/**
*
* @author T
*/
public class Cs480RYourNameIDProgram03A {
   public static void main(String[] args) {
       
       displayDigitInfo2();
       
   }
   
   public static void displayDigitInfo2() {
       int[] digitAry;
       int digit;
       int number;
       
       digitAry = new int[10];
       number = -1661674;
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
                       " occurs " + digitAry[i] + " times!");
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