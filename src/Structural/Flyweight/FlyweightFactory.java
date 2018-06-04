/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structural.Flyweight;

/**
 *
 * @author Binod
 */
public class FlyweightFactory {
    private static Flyweight flyweight;
    
    public static Flyweight getFlyweight(){
        if(flyweight==null){
            flyweight = new ConcreteFlyweight();
        }
        return flyweight;
    }
}
