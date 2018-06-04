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
public class ConcreteComposite1 extends Composite {
    public ConcreteComposite1(int val){
        super(val);
    }
    
    @Override
    public void traverse(){
        System.out.print("(1)");
        super.traverse();
    }
}
