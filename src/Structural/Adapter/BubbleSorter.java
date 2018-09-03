/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structural.Adapter;

import java.util.ArrayList;

/**
 *
 * @author Binod
 */
public class BubbleSorter {                                                     // Adaptee
    
    public ArrayList<Integer> sort(ArrayList<Integer> numberList){
        
        for(int i = 0; i < numberList.size(); i++){
            for(int j = 0; j < numberList.size()-1; j++){
                if(numberList.get(j)>numberList.get(j+1)){
                    int temp = numberList.get(j+1);
                    numberList.set(j+1, numberList.get(j));
                    numberList.set(j, temp);                            
                }
            }
        }
        return numberList;
        
    }
    
}
