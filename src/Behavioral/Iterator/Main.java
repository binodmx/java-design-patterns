/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Binod
 */
public class Main {
    public static void main(String[] args){
        
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("Item1");
        list.add("Item2");
        
        Iterator<String> itr = list.iterator();
        
        for(;itr.hasNext();){
            System.out.println(itr.next());
        }
    }
}
