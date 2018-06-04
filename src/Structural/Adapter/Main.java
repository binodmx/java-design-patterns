/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structural.Adapter;

/**
 *
 * @author Binod
 */
public class Main {
    public static void main(String[] args){
        
        NumberSorter sorter = new NumberSorter();
        
        int[] numbers = new int[] {5,8,3,4,6};
        numbers = sorter.sort(numbers);
        
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
