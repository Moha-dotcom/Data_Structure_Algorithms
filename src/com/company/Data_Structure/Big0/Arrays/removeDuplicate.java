package com.company.Data_Structure.Big0.Arrays;

import java.util.Arrays;

public class removeDuplicate {

    public static void main(String[] args) {

        int[] tensArray = { 10,10, 20,30,40,20,50,60};
        int [] cool = removedup(tensArray);
        System.out.println(Arrays.toString(cool));

    }


    public static int [] removedup (int [] arr){
        int[] proxyArray = new int[arr.length];


        for(int i =0; i< arr.length; i++){
            for(int j = 1; j<arr.length ; j++){
                if(arr[i] == arr[j]){
                    continue;
                }

            }
            proxyArray[i] = arr[i];
        }

        return proxyArray;
    }
}
