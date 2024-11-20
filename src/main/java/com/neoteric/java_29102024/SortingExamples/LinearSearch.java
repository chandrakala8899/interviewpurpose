package com.neoteric.java_29102024.SortingExamples;

public class LinearSearch {
    public static void main(String[] args) {
        String[] products = {"Mouse","Laptop","Keyboard","Monitor","Printer"};
        String target = "Monitor";
         int index = linearSearch(products,target);
         if(index!=-1){
             System.out.println(" product " +target + " Fount at Index  " + index);
         }else {
             System.out.println(" product " + target + " Not Found" + index);
         }
    }
    public static int  linearSearch(String[] arr,String target){
        for(int i =0;i< arr.length-1;i++){
          if(arr[i].equals(target)){
             return i;
          }
        }
        return -1;

    }
}
