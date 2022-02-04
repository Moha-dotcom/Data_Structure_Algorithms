package com.company.Data_Structure.Big0.Recursivie;

public class FindLargestElement {

    public static void main(String[] args) {


        int arr[] = {11119, 9,284, 84, 10,172, 1, -1};
        int n = arr.length-1;
        System.out.println(findMacNumbRec(arr, n));



    }


    // Finding Largest Element in a List using recursive


    public  static int findMacNumbRec(int [] sampleArray, int n){
        if ( n == 0)
            return sampleArray[0];

        return Math.max(sampleArray[n],  findMacNumbRec(sampleArray, n-1));
    }
}
