package classassignments;

/**
* Program Name: Cs480R_sairam_16135_Program01_0222.java
* Discussion: Assignment #2
* Written By: sarugu.sairam
* Due Date: 2016/02/22
*/
import java.util.Scanner;
public class CS480R_SAIRAM_16135SS_PROGRAM1_0222 {

 public static void main(String[] args) {

 System.out.println("CS 480J – Java Programming \n NPU");
 System.out.println("\nsairam, sarugu");
 System.out.println("\nLast 2 Digit of Student ID: 35");
 System.out.println("\nAssignment Information --"+
 "\nAssignment Number: 02,"+
 "\nCoding Assignment"+
 "\nWritten by: sairam, sarugu"+
 "\nSubmitted Date: 02/22/2016");
 menu();
 }
 public static void menu() {
 int option;
 Scanner scanner = new Scanner(System.in);
 do {
 System.out.print("\n\n*****************************************" +
 "\n* MENU *" +
 "\n* (1) Calling extractLargestAndSmallest()*" +
 "\n* (2) Quit *" +
 "\n*****************************************" +
 "\nEnter your option (1 or 2): ");
 option = scanner.nextInt();
 switch (option) {
 case 1:
 System.out.print("\n\nCalling extractLargestAndSmallest()");
 extractLargestAndSmallest();
 break;
 case 2:
 System.out.print("\nUnderstood...!\n");
 break;
 default:
 System.out.print("\nWRONG OPTION!\n");
 }
 } while (option != 2);

}
public static void extractLargestAndSmallest()
{
Scanner scan=new Scanner(System.in);
System.out.println("\nBuilding the first array"+"\n"+"Enter the array size: ");
int size1=scan.nextInt();
System.out.println("\nEnter the array element values –");
int[] array_number1=new int[size1];
for(int i=0;i<size1;i++)
{
System.out.println("Index "+i+": ");
array_number1[i]=scan.nextInt();
}
System.out.println("\nBuilding the second array"+"\n"+"Enter the array size: ");
int size2=scan.nextInt();
System.out.println("\nEnter the array element values –");
int[] array_number2=new int[size2];
for(int i=0;i<size2;i++)
{
System.out.println("Index "+i+": ");
array_number2[i]=scan.nextInt();
}
int largest=array_number1[0];
int smallest=array_number1[0];
for(int i=1;i<array_number1.length;i++)
{
System.out.println(array_number1[i]);
if(largest<array_number1[i])
largest=array_number1[i];
if(smallest>array_number1[i])
smallest=array_number1[i];
}
int largest_temp=largest;
int smallest_temp=smallest;
boolean flag1=false;
boolean flag2=false;
for(int i=0;i<array_number2.length;i++)
{
System.out.println(array_number2[i]);
if(largest<=array_number2[i])
{
flag1=true;
largest=array_number2[i];
System.out.println(" The returning array ");
}
if(smallest>=array_number2[i])
{
flag2=true;
smallest=array_number2[i];
}
}
System.out.print(largest+" ");
if(largest_temp==largest)
{
if(flag1)
System.out.print(2+" "+1+" "+2+" ");
else
System.out.print(1+" "+1+" ");
}
else
System.out.print(1+" "+2+" ");
System.out.print(smallest+" ");
if(smallest_temp==smallest)
{
if(flag2)
 System.out.print(2+" "+1+" "+2+" ");
else
 System.out.print(1+" "+1+" ");
}
else
 System.out.print(1+" "+2+" ");
}
}