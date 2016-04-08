package Lab1;

import java.util.Scanner;

public class compareint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter number 1 ");
		int a = sc.nextInt();
		System.out.println(" Enter number 2 ");
		int b = sc.nextInt();
		if (a > b) {
			System.out.println(a + " is greater");
		} else {
			System.out.println(b + " is greater");
		}

	}

}
