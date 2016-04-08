package classassignments;

import java.util.Scanner;

public class LargestSmallest 
{
	
    public static void main(String[] args) {
        
        System.out.print("CS 480T Java Programming"+"\nNPU"+"\nUser1"+"\nLast 2 Digit of Student ID: XX");
        System.out.println("\n\nAssignment Information --"+"\nAssignment Number:\t02,"+"\n\t\t\tCodingAssignment"+"\nWritten by:\t\tUser1"+"\nSubmitted Date:\t\t21-Feb-2016");
        menu();
   }
   
   public static String menu() {
		System.out.println("**********************************************");
		System.out.println("*                  MENU                      *");
		System.out.println("* (1) Calling extractLargestAndSmallest()    *");
		System.out.println("* (2) Quit                                   *");
		System.out.println("**********************************************");
		System.out.println("Enter your option (1 or 2):");
		Scanner in = new Scanner(System.in);
		String option = in.nextLine();
		if (option.equals("1") || option.equals("2")) {

			if (option.equals("1")) {
				extractLargestAndSmallest();
			}
			if (option.equals("2")) {
				System.out.println("Working good ...!");
			}
		} else {
			System.out.println("WRONG OPTION! ");
			menu();
		}
		return option;
	}
   public static int readInput(){
   	int input = 0;
       // create Scanner object
   	Scanner scanner = new Scanner(System.in);
   	String option = scanner.nextLine();
   	if (isNumber(option)) {
   		input =  Integer.parseInt(option);
		} else {
			System.out.println("Oops Something went wrong!!");
			extractLargestAndSmallest();
		}
   	return  input;
   }
	public static  void extractLargestAndSmallest(){
		try{
			int[] a = new int[9];
	        int smallest , largest ;
	        int smallestOccurence = 0 ; 
	        int largestOccurence = 0;
	        System.out.println("Building the First array --  ");
	        System.out.println("Enter the Array size : ");
	        
	        int number1 = readInput();  
	        int numbers1[] = new int[number1];
	               
	        // prompt user 
	        System.out.print("Enter the array element values: \n");
	        // use for loop to obtain user input
	        for (int counter = 0; counter < number1; counter++) {
	            numbers1[counter] = readInput();
	        }
	        
	        //Finds the largest and smallest of first array
	        int smallest1 = numbers1[0], largest1 = numbers1[0]; 
	        for (int i : numbers1) {   
	            	if (i < smallest1) {
	                    smallest1 = i;
	                } 
	                else if (i > largest1) {
	                    largest1 = i;
	                } 
	        } 
	        System.out.println("Building the Second array --");
	        System.out.println("Enter the  Array size :");
	        int number2 = readInput(); 
	        int numbers2[] = new int[number2];
	        
	        
	        System.out.print("Enter the array element values: \n");
	        for (int counter = 0; counter < number2; counter++) {
	            numbers2[counter] = readInput();
	        }
	        
	      //Finds the largest and smallest of second array
	        int smallest2 = numbers2[0], largest2 = numbers2[0];
	        for (int i : numbers2) { 
	        	if (i < smallest2) {
	                smallest2 = i;
	            } // end finding smallest
	            else if (i > largest2) {
	                largest2 = i;
	            }  // end finding largest number 
	        }       
	       
	      //Finds the smallest of two array 
	        if(smallest1 == smallest2){        	
	        	smallest=smallest1;
	        	a[6]=1;
	        	a[7]=2;
	        } else if (smallest2 > smallest1){
	        	smallest=smallest1;
	        	a[6]=1;
	        } else {
	        	smallest=smallest2;
	        	a[7]=2;
	        }
	        
	        //Finds the largest of two array 
	        if(largest1 == largest2 ){
	        	largest=largest1;
	        	a[2]=1;
	        	a[3]=2;
	        } else if (largest1 > largest2){
	        	largest=largest1;
	        	a[2]=1;
	        } else {
	        	largest=largest2;
	        	a[3]=2;
	        }        
	      
	        //Finds count of occurrence
	        for(int item : numbers1) {
	            if(item == smallest) smallestOccurence++;
	            if(item == largest) largestOccurence++;
	        }
	        for(int item : numbers2) {
	            if(item == smallest) smallestOccurence++;
	            if(item == largest) largestOccurence++;
	        }
	        a[0] = largest;
	        a[1] = largestOccurence;
	        a[4] = smallest;
	        a[5] = smallestOccurence;
	        System.out.println("The returning array :" );
	        for(int i = 0; i< a.length;i++){
	        	if(a[i]!=0){
	        		System.out.println(a[i]);
	        	}
	        }
	        menu();
		} catch(Exception e){
		}
	}
	public static boolean isNumber(String string) {
		if (string == null || string.isEmpty()) {
			return false;
		}
		int i = 0;
		if (string.charAt(0) == '-') {
			if (string.length() > 1) {
				i++;
			} else {
				return false;
			}
		}
		for (; i < string.length(); i++) {
			if (!Character.isDigit(string.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	

}
