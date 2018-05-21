/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Binod
 */
public class IteratorDemo {
    public static void main(String[] args){
        
        List<Object> list = new ArrayList<Object>();
        list.add("Item1");
        Iterator<Object> itr=list.iterator();
        
        for(;itr.hasNext();){
            
        }
    }
}
