/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 160278m
 */
public class Contestant {
    private String state; 

    public void setState(String state){ 
        this.state = state;
    } 
    public String getState(){ 
        return state; 
    } 
    public Memento saveStateToMemento(){ 
        return new Memento(state); 
    } 
    public void getStateFromMemento(Memento Memento){         
        state = Memento.getState();
        System.out.println("state restored");
    }
}
