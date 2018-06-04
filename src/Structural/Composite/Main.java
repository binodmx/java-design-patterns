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
public class Main {
    public static void main(String[] args){
        Composite c1 = new ConcreteComposite1(4);
        Composite c2 = new ConcreteComposite2(7);
        Composite c3 = new ConcreteComposite2(3);
        Leaf l1 = new Leaf(5);
        Leaf l2 = new Leaf(8);
        
        c1.add(c2);
        c1.add(c3);
        c2.add(l1);
        c3.add(l2);
        
        c1.traverse();
    }
}
