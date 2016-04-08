package mid;

import java.util.Scanner;

class Area {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("YOU HAVE FOLLOWING CHOICES : ");
		System.out.println("1. Area of Circle");
		System.out.println("2. Area of Square ");
		System.out.println("3. Area of Rectangle ");
		System.out.println("4. Area of Rombus");
		System.out.println("ENTER YOUR CHOICE : ");
		int i = s.nextInt();

		double result = 0;// 'result' will store the result of operation

		switch (i) {
		case 1:
			System.out.println("ENTER RADIUS : ");
			int c = s.nextInt();
			result = 3.14 * c * c;
			break;
		case 2:
			System.out.println("ENTER LENGHT OF THE SIDE ");
			int d = s.nextInt();

			result = d * d;
			break;
		case 3:
			System.out.println("ENTER THE VALUE OF LENGTH : ");
			int E = s.nextInt();

			System.out.println("ENTER THE VALUE OF BREDTH :");
			int F = s.nextInt();

			result = E * F;
			break;
		case 4:
			System.out.println("ENTER THE SIDE 1 : ");
			int g = s.nextInt();

			System.out.println("ENTER THE SIDE 2 :");
			int h = s.nextInt();
			result = (g * h) / 2;
			break;
		default:
			System.out.println("YOU HAVE ENTERED A WRONG CHOICE");

		}

		System.out.println("RESULT = " + result);
	}
}