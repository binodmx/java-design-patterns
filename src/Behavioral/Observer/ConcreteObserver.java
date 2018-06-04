/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Binod
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update(Observable o, Object obj) {
        System.out.println("state is changed");
    }
    
}
