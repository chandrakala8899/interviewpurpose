package com.neoteric.java_29102024.SortingExamples;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        double[] prices = {299.00,498.19,500.35,399.0};
        System.out.println(" before sorting" + Arrays.toString(prices));
       bubbleSorted(prices); // descending order
        System.out.println(" after bubble sorting " + Arrays.toString(prices));
    }
    public  static  void  bubbleSorted(double[] arr){
       int n = arr.length;
       for(int i =0;i<n-1;i++){
           for(int j= 0 ;j<n-i-1;j++){
            if(arr[j]<arr[j+1]){
                double temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
           }
       }

    }
}

