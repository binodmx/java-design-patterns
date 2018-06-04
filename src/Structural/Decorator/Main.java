/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structural.Decorator;

/**
 *
 * @author Binod
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Circle with normal border");
        Shape circle = new Circle();
        circle.draw();
        
        System.out.println("\nCircle with red border");
        circle = new RedShapeDecorator(circle);
        circle.draw();

    }
}
