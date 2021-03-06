package week2;

import java.util.Scanner;

public class Cs480rSpring2016kyilawrence4797Assignment2 {
	public static void main(String[] args) {
		System.out.println("/** REQUIRED PROGRAM OUTPUT");
		System.out.println("CS 480R � Java Programming");
		System.out.println("NPU");
		System.out.println("Kyi, Lawrence");
		System.out.println("Last 2 Digit of Student ID: 97");
		System.out.println("Assignment Information --");
		System.out.println(" Assignment Number: 02, ");
		System.out.println(" Coding Assignment ");
		System.out.println(" Written by: Kyi, Lawrence");
		System.out.println("Submitted Date: 2/21/2016");

		Scanner sc = new Scanner(System.in);

		System.out.println("*******************************************");
		System.out.println("* MENU *");
		System.out.println("* (1) Calling extractLargestAndSmallest() *");
		System.out.println("* (2) Quit *");
		System.out.println("*******************************************");
		int z=sc.nextInt();
		switch (z) {
		case 2:
			System.out.println(" Program quitted !");
			 System.exit(1);
			break;
		default:
			System.out.println("Wrong Option !");
			break;
		case 1:
		System.out.println("Enter array1 size :");
		int a = sc.nextInt();
		int a1[] = new int[a];
		for (int i = 0; i < a1.length; i++) {
			System.out.println("@Index" + i + " :");
			a1[i] = sc.nextInt();
			if ((a1.length - 1) == i)
				System.out.println("Thanks for entering all elements");
		}
		System.out.println("Enter array2 size :");
		int b = sc.nextInt();
		int b1[] = new int[b];

		for (int k = 0; k < b1.length; k++) {
			System.out.println(" @Index" + k + " :");
			b1[k] = sc.nextInt();
			if ((b1.length - 1) == k)
				System.out.println("Thanks for entering all elements");
		}
		System.out.println("Finding the smallest and largest....");
		int[] ab = larsmal(a1, b1);
		System.out.println("Printing the output array of lenght :" + ab.length);
		for (int j = 0; j < ab.length; j++) {
			System.out.print(" " + ab[j]);
			if (j == 2)
				System.out.println();
		}
		System.out.println();
		break;
		}
		
		System.out.println("Working Good! */");
	}

	public static int[] larsmal(int[] a1, int[] b1) {
		int[] ab = new int[6];

		int s1, l1;
		int s2, l2;
		System.out.println("printing a1 lenghth :" + a1.length);

		System.out.println("printing b1 length :" + b1.length);
		// for (int i : a1) {
		s1 = l1 = a1[0];
		s2 = l2 = b1[0];
		System.out.println("Initial values : s1 " + s1 + " l1 " + l1 + " s2 "
				+ s2 + " l2 " + l2);
		for (int i = 0; i < a1.length; i++) {
			System.out.println("printing " + i + " " + a1[i]);
			if (s1 > a1[i]) {
				s1 = a1[i];
				System.out.println("s1 :" + s1);
			}
			if (l1 < a1[i]) {
				l1 = a1[i];
				System.out.println("l1 :" + l1);
			}
		}

		for (int x = 0; x < b1.length; x++) {
			System.out.println("printing " + x + " " + b1[x]);
			if (s2 > b1[x]) {
				s2 = b1[x];
				System.out.println("s2 :" + s2);
			}
			if (l2 < b1[x]) {
				l2 = b1[x];
				System.out.println("l2 :" + l2);
			}
		}

		System.out.println("after iteration values : s1 " + s1 + " l1 " + l1
				+ " s2 " + s2 + " l2 " + l2);
		if (s1 < s2) {
			ab[0] = s1;
			ab[1] = 1;
			ab[2] = 1;
		} else {
			ab[0] = s2;
			ab[1] = 2;
			ab[2] = 1;
		}

		if (l1 > l2) {
			ab[3] = l1;
			ab[4] = 1;
			ab[5] = 1;
		} else {
			ab[3] = l2;
			ab[4] = 2;
			ab[5] = 1;
		}

		System.out.println("Calculating the number found in all the arrays");
		if (ab[1] == 1) {
			for (int x = 0; x < b1.length; x++) {
				if (ab[0] == b1[x])
					ab[2] = 2;
			}
		} else {

			for (int x = 0; x < a1.length; x++) {
				if (ab[0] == a1[x])
					ab[2] = 2;
			}
		}

		if (ab[4] == 1) {
			for (int x = 0; x < b1.length; x++) {
				if (ab[3] == b1[x])
					ab[5] = 2;
			}
		} else {

			for (int x = 0; x < a1.length; x++) {
				if (ab[3] == a1[x])
					ab[5] = 2;
			}
		}
		System.out.println("Smallest " + ab[0] + " found in array " + ab[1]
				+ " avalible in " + ab[2] + " arrays");
		System.out.println("largest :" + ab[3] + " found in array " + ab[4]
				+ " avalible in " + ab[5] + " arrays");
		System.out.println("calculation completed...");
		return ab;
	}
}
