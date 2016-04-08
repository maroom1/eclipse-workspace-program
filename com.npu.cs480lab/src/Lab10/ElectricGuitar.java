/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480r_week8_lab_10;


public class ElectricGuitar extends StringedInstrument{
    public ElectricGuitar () {
        super();
        this.name = name;
        this.numberOfStrings = numberOfStrings; 
    }
    
    public ElectricGuitar (int numberOfStrings) {
        super();
        this.name = "Guitar";
        this.numberOfStrings = numberOfStrings; 
    }
      
    public void play() {
        System.out.println("An electric guitar " + numberOfStrings + " string" +
                name + "is rocking.");
    }
            
}
