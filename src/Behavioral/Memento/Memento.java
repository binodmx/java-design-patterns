/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 160278m
 */
public class Memento {
    private final String state; 
    
    public Memento(String state){ 
        this.state = state;
    } 
    
    public String getState(){ 
        return state;
    }    
}
