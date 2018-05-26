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
public abstract class AbstractFactory {
    
    public AbstractFactory(){
        
    }
     
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}
