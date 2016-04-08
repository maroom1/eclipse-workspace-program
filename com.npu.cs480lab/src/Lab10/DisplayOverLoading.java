/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480r_week8_lab_10;

public class DisplayOverLoading {
    public void disp(char c) {
        System.out.println(c);
    }
    
    public void disp(char c, int num) {
        System.out.println(c + " " + num);
    }
}
