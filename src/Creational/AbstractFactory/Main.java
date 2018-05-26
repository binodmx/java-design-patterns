/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.AbstractFactory;

/**
 *
 * @author Binod
 */
public class Main {
    public static void main(String[] args){
        ConcreteFactory1 cf1 = new ConcreteFactory1();
        ConcreteFactory2 cf2 = new ConcreteFactory2();
        
        AbstractProductA p = cf1.createProductA();
        AbstractProductB q = cf1.createProductB();
        AbstractProductA r = cf2.createProductA();
        AbstractProductB s = cf2.createProductB();
        
        System.out.println(p.getClass().toString());
        System.out.println(q.getClass().toString());
        System.out.println(r.getClass().toString());
        System.out.println(s.getClass().toString());
        
    }
}