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
public class Execution {
    public static void main(String[] args) {
        ElectricGuitar guitar = new ElectricGuitar();
        ElectricBassGuitar bassGuitar = new ElectricBassGuitar();
        
        guitar.play();
        bassGuitar.play();
        
        guitar = new ElectricGuitar(7);
        bassGuitar = new ElectricBassGuitar(5);
        
        guitar.play();
        bassGuitar.play();
        
    }
}
