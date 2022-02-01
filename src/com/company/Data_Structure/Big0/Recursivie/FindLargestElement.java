package com.company.Data_Structure.Big0.Recursivie;

public class FindLargestElement {

    public static void main(String[] args) {


        int arr[] = {9,284, 84, 10,172, 1};
        System.out.println(findMacNumbRec(arr, arr.length));


    }


    // Finding Largest Element in a List using recursive


    public  static int findMacNumbRec(int [] sampleArray, int n){
        if ( n == 1)
            return sampleArray[0];


        return Math.min(sampleArray[n-1],  findMacNumbRec(sampleArray, n-1));
    }
}
