/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Factory;

/**
 *
 * @author Binod
 */
public class Main {
    public static void main(String[] args){
        Factory shapeFactory = new Factory();
        Circle c = (Circle) shapeFactory.getShape("circle");
        Square s = (Square) shapeFactory.getShape("square");
        
        c.printType();
        s.printType();
    }
}
