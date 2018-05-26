/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.FactoryMethod;

/**
 *
 * @author Binod
 */
public abstract class Factory {
    
    public Factory(){
        
    }
        
    public Product getProduct(){
        return factoryMethod();
    }
    
    protected abstract Product factoryMethod();
}
