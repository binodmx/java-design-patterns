/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structural.Composite;

/**
 *
 * @author Binod
 */
public class Leaf implements Component {
    private int value;
    
    public Leaf(int val) {
        this.value = val; 
    }
    
    @Override
    public void traverse(){ 
        System.out.print( "(L)" + this.value + " " ); }
    
    @Override
    public int getValue(){
        return this.value;
    }
}
