package week1;

import java.util.Scanner;

public class Cs480rSpring2016kyilawrence4797Assignment12 {

	public static void getMostOccurredDigitYourName(String s) {
		int digits[] = new int[10];
		for (int i = 0; i < s.length(); i++) {
			int j = s.charAt(i) - 48;
			digits[j]++;
		}

		int digit = 0;
		int count = digits[0];
		for (int i = 1; i < 10; i++) {
			if (digits[i] > count) {
				count = digits[i];
				digit = i;
			}
		}

		System.out.println("digit = " + digit + "  count= " + count + "\n\n");
  
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("**********************************************");
			System.out.println("* 		   MENU 	         ");
			System.out.println("* (1) Calling getMostOccurredDigitYourName() ");
			System.out.println("* (2) Quit 							 ");
			System.out
					.println("**********************************************");
			System.out.println("Enter your option (1 or 2): ");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("Enter an integer: ");
				String b = sc.next();
				getMostOccurredDigitYourName(b);
				
				break;
			case 2:
				System.out.println("System Existed");
				System.exit(0);

			default:
				System.out.println("Wrong option");
				

			}

		}
	}

}
