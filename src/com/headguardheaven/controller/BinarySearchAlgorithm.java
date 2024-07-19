package com.headguardheaven.controller;

import com.headguardheaven.model.HelmetModel;

/**
 *
 * 
 */
public class BinarySearchAlgorithm {
    
    public int searchBrand(HelmetModel[] modelArr, int low, int high, String searchKey){
        if(high>=low){
            int midValue = (low + high)/2;

            // If the brand at midpoint is equal to the search key
            if (modelArr[midValue].getBrand().equals(searchKey))
                return midValue;
 
            // If the brand at the midpoint is greater than the search key, search in the left half.
            if (modelArr[midValue].getBrand().compareTo(searchKey)>0)
                return searchBrand(modelArr, low, midValue - 1, searchKey);
            
            // Otherwise, search in the right half
            return searchBrand(modelArr, midValue + 1, high, searchKey);
        }
        return -1;  // Brand not found
    }
      
    public int searchID(HelmetModel[] modelArr, int low, int high, int searchKey){
       if(high>=low){
            int midValue = (low + high)/2;
           
            // If the helmet ID at midpoint is equal to the search key
            if (modelArr[midValue].getHelmetId()== searchKey)
                return midValue;
 
            // If the helmet ID at mid is greater than the search key, search in the left half
            if (modelArr[midValue].getHelmetId()> searchKey)
                return searchID(modelArr, low, midValue - 1, searchKey);

             // Otherwise, search in the right half
            return searchID(modelArr, midValue + 1, high, searchKey);
        }
        return -1;  // Helmet ID not found
    } 
    
    public int searchPrice(HelmetModel[] modelArr, int low, int high, int searchKey){
        if(high>=low){
            int midValue = (low + high)/2;
           
            if (modelArr[midValue].getPrice() == searchKey)
                return midValue;
 
            if (modelArr[midValue].getPrice() > searchKey)
                return searchPrice(modelArr, low, midValue - 1, searchKey);
 
            return searchPrice(modelArr, midValue + 1, high, searchKey);
        }
        return -1;
    } 
}

