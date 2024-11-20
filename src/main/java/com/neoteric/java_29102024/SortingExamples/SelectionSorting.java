package com.neoteric.java_29102024.SortingExamples;

import java.util.Arrays;

public class SelectionSorting {
    public  static void main (String args[]){
        int [] scores = {20,30,10,50};



        System.out.println(" before sorting " + Arrays.toString(scores));
        selectionSorted(scores); // Ascending order
        System.out.println("  After Sorting " + Arrays.toString(scores));


    }
    public static void  selectionSorted(int [] arr){
  int n = arr.length;

        // Iterate through the array
  for( int i =0;i < n-1;i++){
      // Find the index of the minimum element in the unsorted portion of the array
      int minimumIndex = i;
      // Search for the minimum element in the unsorted portion
      for(int j=i+1;j<n;j++){
          if(arr[j] < arr[minimumIndex]){
             minimumIndex = j;
          }
      }
      // Swap the found minimum element with the first element of the unsorted portion
       int temp = arr[minimumIndex];
      arr[minimumIndex]=arr[i];
      arr[i] = temp;
  }

    }

}
