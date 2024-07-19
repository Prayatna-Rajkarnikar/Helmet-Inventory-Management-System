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
public class InsertionSort {
    public HelmetModel[] insertionSortHelmetID(HelmetModel[] helmetArray){
        int scale = helmetArray.length;
        
        //Iterate through the array beginning with the second element.
        for (int step = 1; step < scale; step++) {
            //Select the current element as the key for comparison
            HelmetModel key = helmetArray[step];
            int currentIndex = step - 1;
            
            //Move elements that are greater than key to a position one position 
            //ahead of their current position.
            while (currentIndex >= 0 && helmetArray[currentIndex].getHelmetId()> key.getHelmetId()) {
               helmetArray[currentIndex + 1] = helmetArray[currentIndex];
               currentIndex = currentIndex  - 1;
            }
            // Place the key in its correct position
            helmetArray[currentIndex + 1] = key;
        }
        return helmetArray;
    }
    
    public HelmetModel[] insertionSortHelmetPrice(HelmetModel[] helmetArray){
        int scale = helmetArray.length;
        
        //Iterate through the array beginning with the second element.
        for (int step = 1; step < scale; step++) {
            //Select the current element as the key for comparison
            HelmetModel key = helmetArray[step];
            int currentIndex = step - 1;
            
            //Move elements that are greater than key to a position one position 
            //ahead of their current position.
            while (currentIndex >= 0 && helmetArray[currentIndex].getPrice()> key.getPrice()) {
               helmetArray[currentIndex + 1] = helmetArray[currentIndex];
               currentIndex = currentIndex - 1;
            }
            // Place the key in its correct position
            helmetArray[currentIndex + 1] = key;
        }
        return helmetArray;
    }
}
 
