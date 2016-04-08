import java.util.Scanner;

public class FractionLawrence {

	private int num; // data or attribute or field member
	private int denom;

	public FractionLawrence(int n, int d) {

		if (d > 0) {
			this.num = n;
			this.denom = d;
		} else if (d < 0) {
			this.num = -n;
			this.denom = -d;
		} else if (d == 0)
			while (d == 0) {
				Scanner input = new Scanner(System.in);
				System.out.println("\n d is 0:  not accepted: "
						+ "Re-enter value for d: ");
				d = input.nextInt();
			}

	}

	public FractionLawrence() {
		this.num = 50;
		this.denom = 6;

	}

	public FractionLawrence(int num) {
		this.num = num;
		this.denom = 6;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDenom() {
		return denom;
	}

	public void setDenom(int denom) {
		this.denom = denom;
	}

	public void print() {
		System.out.println("FractionLawrence  = [" + num + "/" + denom
				+ "]");
	}

	public int add() {

		return (int) (this.num + this.denom);
	}

	public int subtract() {

		return (int) (this.num + this.denom);
	}

	public int multiply() {

		return (int) (this.num + this.denom);
	}

	public int divide() {

		return (int) (this.num + this.denom);
	}

	public static void initLawrence() {
		 Scanner sc=new Scanner(System.in);
		int k=0;
		   while(true){
		
		System.out.println("   ****************************************");
		System.out.println("     * PRINTING MENU *");
		System.out.println("     * 1. Default initialisation *");
		System.out.println("     * 2. Do you want to enter the values and initilaise *");
		System.out.println("     * 3. Return to Previous MENU *");
		System.out.println("   ****************************************");
		System.out.println("   Select an option (1, 2, or 3): ");
		int b=sc.nextInt();
		switch(b){
		
		case 1:
		
			fr1 = new FractionLawrence();
			fr2 = new FractionLawrence();
		break;
		case 2:
			System.out.println(" Enter the numerator and denominator of fraction one: ");
			fr1 = new FractionLawrence(sc.nextInt(),sc.nextInt());
			System.out.println(" Enter the numerator and denominator of fraction two: ");
			fr2 = new FractionLawrence(sc.nextInt(),sc.nextInt());
			
			
			
			break;
		case 3:
			k=1;
			break;
			
		default:
			System.out.println(" You Entered wrong option...! ");
			break;	
		
		}
		
		if(k==1)
			break;
		   }


	
		

	}

	static FractionLawrence fr1;
	static FractionLawrence fr2;

	public static void addLawrence(FractionLawrence fr1, FractionLawrence fr2) {

		System.out.println((fr1.getNum() + fr2.getNum()) + "/"
				+ (fr1.getDenom() + fr2.getDenom()));
	}

	public static void subtractLawrence(FractionLawrence fr1,
			FractionLawrence fr2) {

		System.out.println((fr1.getNum() - fr2.getNum()) + "/"
				+ (fr1.getDenom() - fr2.getDenom()));
	}

	public static void multiplyLawrence(FractionLawrence fr1,
			FractionLawrence fr2) {

		System.out.println(fr1.getNum() * fr2.getNum() + "/" + fr1.getDenom()
				* fr2.getDenom());
	}

	public static void divideLawrence(FractionLawrence fr1, FractionLawrence fr2) {

		System.out.println(fr1.getNum() * fr2.getDenom() + "/" + fr1.getDenom()
				* fr2.getNum());
	}

	public static void printLawrence(FractionLawrence fr1, FractionLawrence fr2) {
		fr1.print();
		fr2.print();
			}

	public static void menuFractionLawrence(){
          Scanner sc=new Scanner(System.in);
		   while(true){
			   
	   System.out.println("*********************");
	   System.out.println("* MENU Fraction 	   *");
	   System.out.println("* 1. Initializing   *");
	   System.out.println("* 2. Adding 		   *");
	   System.out.println("* 3. Subtracting    *");
	   System.out.println("* 4. Multiplying    *");
	   System.out.println("* 5. Dividing	   *");
       System.out.println("* 6. Printing	   *");
	   System.out.println("* 7. Quit		   *");
	   System.out.println("*********************");
	   System.out.println("Select an option (use integer value only):");
	   int a=sc.nextInt();
		switch(a){
			
			case 1:
				System.out.println("Initialising the values.... ");
				initLawrence();
				break;
			
			case 2:

				System.out.println("Adding the two fractions.... ");
				if(fr1==null|| fr2==null){
					System.out.println(" Not a proper call as no Fractions are available! ");
				}else				
				addLawrence(fr1, fr2);
				
				break;
			case 3:

				System.out.println("Subtracting two fractions.... ");
				if(fr1==null|| fr2==null){
					System.out.println("Not a proper call as no Fractions are available! ");
				}else
				subtractLawrence(fr1, fr2);
				
				break;
			case 4:

				System.out.println("Multiplying two fractions....  ");
				if(fr1==null|| fr2==null){
					System.out.println(" Not a proper call as no Fractions are available! ");
				}else
				
				multiplyLawrence(fr1, fr2);
				break;
			case 5:

				System.out.println("Dividing two fractions.....  ");
				if(fr1==null|| fr2==null){
					System.out.println(" Not a proper call as no Fractions are available! ");
				}else
				divideLawrence(fr1, fr2);
				break;
			case 6:

				System.out.println("Printing the two fractions... ");
				int k=0;
				if(fr1==null|| fr2==null){
					System.out.println(" Not a proper call as no Fractions are available! ");
				}else
				{
				
					
					   while(true){
					
					System.out.println("   ****************************************");
					System.out.println("     * PRINTING MENU *");
					System.out.println("     * 1. print() - Member *");
					System.out.println("     * 2. printYourName() – Stand Alone *");
					System.out.println("     * 3. Return to Previous MENU *");
					System.out.println("   ****************************************");
					System.out.println("   Select an option (1, 2, or 3): ");
					int b=sc.nextInt();
					switch(b){
					
					case 1:
					fr1.print();
					fr2.print();
					break;
					case 2:
						printLawrence(fr1, fr2);
						break;
					case 3:
						k=1;
						break;
						
					default:
						System.out.println(" You Entered wrong option...! ");
						break;	
					
					}
					
					if(k==1)
						break;
					   }


					
				}
				break;
			case 7:
				
				System.out.println(" Having fun...! ");
				System.exit(1);
				break;
			default:
				
				System.out.println(" You Entered wrong option...! ");
				break;
				
		}   
		   
		   }
		
		}

	public static void main(String[] args) {

		System.out.println(" CS 480J – Java Programming ");
		System.out.println(" NPU ");
		System.out.println(" Kyi, Lawrence ");
		System.out.println(" Last 2 Digit of Student ID: dd : 97 ");
		System.out.println("**************************************");
		System.out.println(" Assignment Number: 04, ");
		System.out.println(" Coding Assignment ");
		System.out.println(" Written by: Kyi, Lawrence");
		System.out.println(" Submitted Date: 3/17/2016");

		menuFractionLawrence();
	}

}
