/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structural.Adapter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Binod
 */
public class NumberSorter {                                                     // Adapter
    
    public int[] sort(int[] numbers){      
        
        ArrayList<Integer> numberList = new ArrayList<Integer>(); 
        
        // Convert array to array list
        for(int i = 0; i < numbers.length; i++){
            numberList.add(numbers[i]);
        }
        
        BubbleSorter bubbleSorter = new BubbleSorter(); 
        numberList = bubbleSorter.sort(numberList);
        
        // Convert array list to array
        for(int j = 0; j < numbers.length; j++){
            numbers[j] = numberList.get(j);
        }
        
        return numbers; 
    }
}
