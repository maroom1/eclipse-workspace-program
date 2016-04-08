/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480r_week8_lab_10;

/**
 *
 * @author amitchojar
 */
public class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        
        System.out.println("SBI rate of interest: " + s.getRateOfInterest());
        System.out.println("ICICI rate of interest " + i.getRateOfInterest());
        System.out.println("AXIS rate of interest" + a.getRateOfInterest());
    }
    
}
