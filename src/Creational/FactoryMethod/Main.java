/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.FactoryMethod;

/**
 *
 * @author Binod
 */
public class Main {
    public static void main(String[] args){
        
        AbstractFactory cf1 = new ConcreteFactory1();
        AbstractFactory cf2 = new ConcreteFactory2();
        
        Product p1 = cf1.getProduct();
        Product p2 = cf2.getProduct();
        
        p1.printType();
        p2.printType();
    }
}