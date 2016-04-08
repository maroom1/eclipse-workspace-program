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
public class ElectricBassGuitar extends StringedInstrument{
    public ElectricBassGuitar() {
        super();
        this.name = "Bass Guitar";
        this.numberOfStrings = 4;
    }
    
    public ElectricBassGuitar(int numberOfStrings) {
        super();
        this.name = "Bass Guitar";
        this.numberOfStrings = numberOfStrings;
    }
   
    public void play() {
        System.out.println("An electric " + numberOfStrings + " string " + 
                name + " is rocking. ");
        
    }
}
