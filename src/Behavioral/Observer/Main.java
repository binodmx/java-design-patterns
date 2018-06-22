/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Observer;

/**
 *
 * @author Binod
 */
public class Main {
    public static void main(String[] args){
        
        ConcreteObservable observable = new ConcreteObservable();
        
        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();
        ConcreteObserver observer3 = new ConcreteObserver();
        
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);
        
        observable.changeState();
        
    }
}
