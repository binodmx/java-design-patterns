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
public class Main {
    public static void main(String[] args){
        
        for(int i = 0; i < 10; i++){
            ConcreteFlyweight cf = (ConcreteFlyweight) FlyweightFactory.getFlyweight();
            cf.setXY(i, 10);
            cf.move();
        }       
        
    }
}
