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
public class Factory {
    
    public Shape getShape(String type){
        if(type=="circle"){
            return new Circle();
        } else if (type == "square"){
            return new Square();
        } else {
            return null;
        }
    }
    
}
