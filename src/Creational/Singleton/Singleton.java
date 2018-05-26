/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Singleton;

/**
 *
 * @author Binod
 */
public class Singleton {
    private static Singleton instance;
    private Singleton(){
    
    }
    
    // normal method
    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
    
    // lazy method
    
    // double checking method
    
}
