package mid;

import java.util.Scanner;

public class sumconsecuitveoddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer :");
		int sumodd = 0, sumeven = 0, a = sc.nextInt();
		int i = 1, j = 0;
		while (true) {
			if (i % 2 == 0) {
				sumeven += i;
				j++;
				// System.out.println(sumeven);
			}
			i++;
			if (j == a)
				break;
		}
		int k = 0, p = 1;
		while (true) {
			if (p % 2 != 0) {
				sumodd += p;
				k++;
				// System.out.println(sumodd);
			}
			p++;
			if (k == a)
				break;
		}
		System.out.println("Sum of " + a
				+ " consecutive even and odd numbers is " + sumeven + " and "
				+ sumodd);
	}
}
