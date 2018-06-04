/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Observer;

import java.util.Observable;

/**
 *
 * @author Binod
 */
public class ConcreteObservable extends Observable {
    
    public void changeState(){
        super.setChanged();
    }
}
