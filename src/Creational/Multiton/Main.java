/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Multiton;

/**
 *
 * @author Binod
 */
public class Main {
    public static void main(String[] args){
        Multiton m1 = Multiton.getMultiton("m1");
        Multiton m2 = Multiton.getMultiton("m2");
        Multiton m3 = Multiton.getMultiton("m1");
        
        if (!m1.equals(m2)){
            System.out.println("m1 and m2 are different objects.");
        }
        
        if (m1.equals(m3)){
            System.out.println("m1 and m3 are same objects.");
        }
    }
}
