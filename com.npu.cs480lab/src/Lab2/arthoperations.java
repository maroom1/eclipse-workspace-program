package Lab2;

import java.util.Scanner;

public class arthoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter number 1 ");
		int a = sc.nextInt();
		System.out.println(" Enter  number 2 ( < number 1) ");
		int b = sc.nextInt();
		System.out.println(" Adding a and b :" + (a + b));
		System.out.println("Subtracting a and b :" + (a - b));
		System.out.println("Multiplication of a and b :" + (a * b));
		System.out.println("Divding a and b :" + (a / b));
		System.out.println("Module of a and b :" + (a % b));

	}

}
