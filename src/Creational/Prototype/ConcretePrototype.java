/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Prototype;

/**
 *
 * @author Binod
 */
public class ConcretePrototype implements Prototype{                            // this can be done by implementing Cloneable interface also.
    @Override
    public Object clone() {   
        ConcretePrototype clone = null;
        try {
           clone = (ConcretePrototype) super.clone();

        } catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }   
        return clone;
    }
}
