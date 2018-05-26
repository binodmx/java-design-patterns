/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Multiton;

import java.util.HashMap;

/**
 *
 * @author Binod
 */
public class Multiton {
    private static HashMap<String,Multiton> multitons = new HashMap<String,Multiton>();
    private static Object lock = new Object();
    
    private Multiton(){
        
    }
    
    public static Multiton getMultiton(String key){
        if (!multitons.containsKey(key)){
            synchronized(lock){
                if(!multitons.containsKey(key)){
                    multitons.put(key, new Multiton());
                }
            }
        }
        return multitons.get(key);
    }
}
