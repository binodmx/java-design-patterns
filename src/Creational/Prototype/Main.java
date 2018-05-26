/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Prototype;

/**
 *
 * @author Binod
 */
public class Main {
    public static void main (String[] args){
        Prototype obj1 = new ConcretePrototype();  
        Prototype obj2 = (ConcretePrototype) obj1.clone();
        
        if (!obj1.equals(obj2)){
            System.out.println("obj1 & obj2 are not equal.");
        }
    }
}
