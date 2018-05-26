
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
public class GameManager {
    public static void main(String[] args){
        final  List<Memento> mementoList = new ArrayList<>();
        
        Contestant contestant1 = new Contestant();
        contestant1.setState("@flag23");
        mementoList.add(contestant1.saveStateToMemento());
        
        contestant1.setState("@flag25");
        System.out.println("contestant1 state: " + contestant1.getState());
        
        contestant1.getStateFromMemento(mementoList.get(0));
        System.out.println("contestant1 state: " + contestant1.getState());
    }
}
