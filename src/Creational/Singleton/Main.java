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
public class Main {
    public static void main(String[] args){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        
        if(singleton1.equals(singleton2)){
            System.out.println("Only 1 Singleton object is created.");
        }
    }
}
