/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.headguardheaven.controller;

import com.headguardheaven.model.HelmetModel;

/**
 *
 * @author HP
 */
public class SelectionSort {
    public HelmetModel[] selectionSortHelmetBrand(HelmetModel[] helmetArray){
        int size = helmetArray.length;
        
        // Iterate through each element in the array
        for(int step = 0; step < size - 1; step++){
            int minIndex = step;
            
            // Find the smallest element in the array's unsorted portion.
            for(int next = step + 1; next < size; next++){
                if (helmetArray[next].getBrand().compareTo(
                        helmetArray[minIndex].getBrand())<0){
                    minIndex = next;
                }
            }
            //word swap
            HelmetModel tempWord = helmetArray[step];
            helmetArray[step] = helmetArray[minIndex];
            helmetArray[minIndex] = tempWord;
        }
        return helmetArray;
    }
    
    public HelmetModel[] selectionSortSize(HelmetModel[] helmetArray)
    {
        int size = helmetArray.length;
        
        // Iterate through each element in the array
        for(int step = 0; step < size - 1; step++){
            int minIndex = step;
            
            // Find the smallest element in the array's unsorted portion.
            for(int next = step + 1; next < size; next++){
                if(helmetArray[next].getHelmetSize().compareTo(
                        helmetArray[minIndex].getHelmetSize())<0){
                    minIndex = next;
                }
            }
            //word swap
            HelmetModel tempWord = helmetArray[step];
            helmetArray[step] = helmetArray[minIndex];
            helmetArray[minIndex] = tempWord;
        }
        return helmetArray;
    }
}
