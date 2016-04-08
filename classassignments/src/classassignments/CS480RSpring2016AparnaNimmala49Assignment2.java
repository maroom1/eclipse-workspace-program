package classassignments;

import java.util.Scanner;


public class CS480RSpring2016AparnaNimmala49Assignment2 {
    

    public static void main(String[] args) {
        
int option ;

        Scanner obj = new Scanner(System.in);
System.out.println("CS480R - Java Programing");
System.out.println("NPU");
System.out.println("Aparna Nimmala");
System.out.println("Last two digits of Student ID : 49");
System.out.println();
System.out.println("Assignment Information");
System.out.println(" Assigmentnumber : 02,Coding Assignment");
System.out.println(" Written by       : Aparna Nimmala");
System.out.println(" Submitted date   :2016-02-22");
do{
            System.out.println("\n\n*********************************************" +
                    "\n*                MENU                       *" + 
                    "\n* (1) Calling extractLargestAndSmallest()   *" + 
                    "\n* (2) Quit                                  *" +
                    "\n*********************************************" +
                    "\nEnter Your Option (1 Or 2) : ");
   option = obj.nextInt();
gotoSwitch(option);
}
while(option != 2);
   
    }
    public static int [] extractLargestAndSmallest(int a[],int b[]){
int[] resultArray = new int[8];
int value1=1,value2=2,i;
int maxValue1 = a[0],minValue1 = a[0],minValue2 = b[0],maxValue2 = b[0]; 
        for(i=1;i<a.length;i++){
            if(a[i]>maxValue1){
                maxValue1=a[i];
            }
            if(a[i]<minValue1){
                minValue1=a[i];
            }
        }
        for(i=1;i<b.length;i++){
            if(b[i]>maxValue2){
                maxValue2=b[i];
        }
            if(b[i]<minValue2){
                minValue2=b[i];
            }
        }

if(maxValue1 == maxValue2){
resultArray[0] = maxValue1;
resultArray[1] = 2;
resultArray[2] = value1;
resultArray[3] = value2;
if(minValue1 == minValue2){
resultArray[4] = minValue1;
resultArray[5] = 2;
resultArray[6] = value1;
resultArray[7] = value2;
            }
            else if(minValue1<minValue2){
resultArray[4]=minValue1;
resultArray[5]=1;
resultArray[6]=value1;
            }
            else if(minValue1>minValue2){
resultArray[4]=minValue2;
resultArray[5]=1;
resultArray[6]=value2;
            }
        }
        else if(maxValue1 > maxValue2){

resultArray[0] = maxValue1;
resultArray[1] = 1;
resultArray[2] = value1;

            if(minValue1==minValue2){

resultArray[3] = minValue1;
resultArray[4] = 2;
resultArray[5] = value1;
resultArray[6] = value2;
            }
            else if(minValue1<minValue2){
resultArray[3]=minValue1;
resultArray[4]=1;
resultArray[5]=value1;
            }
               else if(minValue1>minValue2){
resultArray[3]=minValue2;
resultArray[4]=1;
resultArray[5]=value2;
            }
        }
        else if(maxValue1 < maxValue2){

resultArray[0] = maxValue2;
resultArray[1] = 1;
resultArray[2] = value2;

            if(minValue1==minValue2){

resultArray[3] = minValue1;
resultArray[4] = 2;
resultArray[5] = value1;
resultArray[6] = value2;
            }
            else if(minValue1<minValue2){
resultArray[3]=minValue1;
resultArray[4]=1;
resultArray[5]=value1;
            }
            else if(minValue1>minValue2){
resultArray[3]=minValue2;
resultArray[4]=1;
resultArray[5]=value2;
            }
        }
        return resultArray; 
    }
    
 public static void gotoSwitch(int switchValue){
int array1,array2,i;
int[] display;
        display = new int[8];
           Scanner obj = new Scanner(System.in);
    switch(switchValue){
                case 1:
System.out.println("Building the first array –");
System.out.print(" Enter size of first array:");
                    array1 = obj.nextInt();
int firstArray[] = new int[array1];
System.out.println(" Enter first array elements");
                    for(i=0;i<array1;i++){
System.out.print(" Index "+i+": ");
firstArray[i] = obj.nextInt();
                    }
System.out.println("Building the second array –");                    
System.out.print(" Enter size of second array:");
                    array2 = obj.nextInt();
int secondArray[] = new int[array2];
System.out.println(" Enter second array elements");
                    for(i=0;i<array2;i++){
System.out.print(" Index "+i+": ");
secondArray[i] = obj.nextInt();
                    }
System.out.println("Calling extractLargestAndSmallest() --");
                    display = extractLargestAndSmallest(firstArray,secondArray);
System.out.println("The returning array -");
                    for(i=0;i<display.length;i++){
                        if(display[i] == 0)
                            continue;
System.out.print(display[i]+" ");
                    }
                    break;
                case 2:
System.out.println("\nWorking Good...!\n");
                    break;
                default:
System.out.println("\nWRONGOPTION..!\n");
                    break;
            }


    }

}
