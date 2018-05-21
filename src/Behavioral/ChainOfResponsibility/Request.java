/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.ChainOfResponsibility;

/**
 *
 * @author Binod
 */
public class Request {	
    private int value;
    private String description;

    public Request(String description, int value){
        this.value = value;
        this.description = description;
    }

    public int getValue(){
        return value;
    }

    public String getDescription(){
        return description;
    }          
}
