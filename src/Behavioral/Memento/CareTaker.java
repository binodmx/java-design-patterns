
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 160278m
 */
public class CareTaker {
    public static void main(String[] args){
        final  List<Memento> mementoList = new ArrayList<>();
        
        Originator originator1 = new Originator();
        
        originator1.setState("@flag23");
        mementoList.add(originator1.saveStateToMemento());
        System.out.println("contestant1 state: " + originator1.getState());
        
        originator1.setState("@flag25");
        System.out.println("contestant1 state: " + originator1.getState());
        
        originator1.restoreStateFromMemento(mementoList.get(0));
        System.out.println("contestant1 state: " + originator1.getState());
        
    }
}
