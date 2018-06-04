/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structural.Composite;

import java.util.ArrayList;

/**
 *
 * @author Binod
 */
public abstract class Composite implements Component {
    private ArrayList<Component>  parts = new ArrayList<Component>(); 
    private int total = 0;
    private int value;
    
    public Composite(int val){ 
        this.value = val; 
    }
    
    public void add(Component c) {
        this.total++;
        this.parts.add(c);		   
    } 
    
    @Override
    public void traverse() {                                 
	System.out.print(this.value + " ");
	for (int i=0; i < total; i++){	    	 
	    (parts.get(i)).traverse();  
        }
    }  
    
    @Override
    public int getValue(){
        return this.value;
    }
}
