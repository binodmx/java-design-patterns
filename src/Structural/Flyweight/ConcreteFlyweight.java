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
public class ConcreteFlyweight implements Flyweight{
    int x;
    int y;
    
    @Override
    public void move() {
        System.out.println("Flyweight is moved from " + this.x + " to " + this.y);
    }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
}
