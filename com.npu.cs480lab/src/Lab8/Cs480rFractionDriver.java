/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8; //change  package name

public class Cs480rFractionDriver {
    public static void main(String [] args) {
        FractionCA62 fr1;
        FractionCA62 fr2;
        
        fr1 = new FractionCA62();
        fr2 = new FractionCA62();
        int number ;
        number = getLarger(5,4);
        System.out.println(" Largest number of 5 and 4 is :"+number);
        System.out.println(" Standalone method");
        subtractFraction(fr1, fr2); //standalone method
        
        System.out.println(" invoking a method member ");
        fr1.printSubstraction(fr2);//invoking a method member
        
        fr1 = new FractionCA62(5);
        fr2 = new FractionCA62(6,0);
        System.out.println(" From constuctor objects  ");
        
        fr1.printSubstraction(fr2);
    }
    
    //stand-alone method
    public static void subtractFraction(FractionCA62 f1,FractionCA62 f2) {
        System.out.println(f1.getNum() * f2.getDenom()
                          - f1.getDenom() * f2.getNum() + "/" +
                           f1.getDenom() * f2.getDenom());
    }
     
    public static int getLarger(int n1, int n2) {
        return (n1 > n2) ? n1 : n2;
    } 
}
