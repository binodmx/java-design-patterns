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
    private static Singleton instance;                                          // lazy initialization
    /* private static Singleton instance = new Singleton();*/                   // eager initialization
    
    private Singleton(){
    }
    
    // normal method
    public static synchronized Singleton getInstanceByNormalMethod(){
        if(instance == null){
            instance=new Singleton();
        }
        return instance;
    }
    
    // double checking method
    public static Singleton getInstanceByDoubleCheckingMethod(){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
