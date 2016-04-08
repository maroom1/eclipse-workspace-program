package classassignments;
import java.util.Scanner;
/**
*Program Name : CS480RSudhakar18336prig2016assignment02
* Assignment : Week#4
* Written By : Sudhakar
* Due Date : 2016/02/22
*
**/
public class CS480RSudhakar18336prig2016assignment02 {
public static void main(String[] args) {
int[] results = { 0, 0, 0, 0, 0, 0, 0, 0 };
boolean quit = false;
{
menu();
Scanner scanner = new Scanner(System.in);
int option = scanner.nextInt();
switch (option) {
case 1: {
int[] firstArray = getValues("first");
int[] secondArray = getValues("second");
System.out.println("Calling extractLargestAndSmallest() --");
extractLargestAndSmallest(firstArray, secondArray, results);
displayResults(results);
break;
}
case 2: {
quit = true;
System.out.println("Working Good"); 
break;
}
default:
System.out.println("\nWRONG OPTION! \n");
break;
}
}
public static void menu() {
System.out.println("*****************************************************
***");
System.out.println("* MENU *");
System.out.println("* (1) Calling extractLargestAndSmallest() *");
System.out.println("* (2) Quit *");
System.out.println("*****************************************************
***");
System.out.print("Enter your option (1 or 2): ");
}
public static int[] getValues(String argArrayName) {
try {
Scanner scanner = new Scanner(System.in);
System.out.print("Building the " + argArrayName
+ " array - \n\t Enter the array size : ");
int size = scanner.nextInt();
System.out.println();
int[] elements = new int[size];
System.out.println("\tEnter the array element values - ");
for (int i = 0; i < size; i++) {
System.out.print("\tIndex " + i + ": ");
elements[i] = scanner.nextInt();
} 
return elements;
} catch (Exception Ex) {
System.out.println("Something went wrong, please check your input
value");
System.exit(0);
}
return null;
}
public static void displayResults(int[] argResults) {
System.out.println("The returning array –");
for (int i = 0; i < argResults.length; i++) {
if (argResults[i] == 0 && (i != 0 || i != 4)) {
// it is zero there is no need to print this value.
} else {
System.out.print(argResults[i] + " ");
}
}
System.out.println();
}
public static void extractLargestAndSmallest(int[] argFirstArray,
int[] argSecondArray, int[] argResultArray) {
int firstArrayLargest = findLargest(argFirstArray);
int firstArraySmallest = findSmallest(argFirstArray);
int secondArrayLargest = findLargest(argSecondArray);
int secondArraySmallest = findSmallest(argSecondArray);
if (firstArrayLargest > secondArrayLargest) {
addResults(argResultArray, 0, firstArrayLargest, 1, 1, 0);
}
else if (firstArrayLargest == secondArrayLargest) {
addResults(argResultArray, 0, firstArrayLargest, 2, 1, 2);
} else { 
addResults(argResultArray, 0, secondArrayLargest, 1, 0, 2);
}
if (firstArraySmallest < secondArraySmallest) {
addResults(argResultArray, 4, firstArraySmallest, 1, 1, 0);
} else if (firstArraySmallest == secondArraySmallest) {
addResults(argResultArray, 4, firstArraySmallest, 2, 1, 2);
} else {
addResults(argResultArray, 4, secondArraySmallest, 1, 0, 2);
}
}
public static void addResults(int[] argResults, int argStartAt,
int argValue, int argFoundCount, int argFoundInFirst,
int argFoundInSecond) {
argResults[argStartAt] = argValue;
argResults[argStartAt + 1] = argFoundCount;
argResults[argStartAt + 2] = argFoundInFirst;
argResults[argStartAt + 3] = argFoundInSecond;
}
public static int findLargest(int[] argArray) {
int maxValue = 0;
if (argArray != null && argArray.length > 0) {
maxValue = argArray[0];
for (int i = 0; i < argArray.length; i++) {
if (argArray[i] > maxValue) {
maxValue = argArray[i];
}
}
}
return maxValue; 
}
public static int findSmallest(int[] argArray) {
int minValue = 0;
if (argArray != null && argArray.length > 0) {
minValue = argArray[0];
for (int i = 0; i < argArray.length; i++) {
if (argArray[i] < minValue) {
minValue = argArray[i];
}
}
}
return minValue;
}
} 