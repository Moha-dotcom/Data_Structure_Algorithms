package com.company.Data_Structure.Arrays;

import java.util.Arrays;

public class MiddleFunction {

    public static void main(String[] args) {

        int [] arr = new int[]{1,2,3,4,5,6};
        int [] result = middle(arr);
        int [] result1 = middleFunction(arr);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result1));

    }

    public static int[] middle(int[] arr) {
            int i;
            int j;
            int [] arr1;


        if(arr.length % 2 == 0){
            i = arr[arr.length/2];
            j = arr[arr.length/2 - 1];
            arr1 = new int[]{j, i};
        }else {
            i = arr[arr.length/2];
            arr1 =  new int[]{i};
        }

        return arr1;
    }


    public static  int[] middleFunction(int [] arr){

        return Arrays.copyOfRange(arr, 1, arr.length-1);


    }
}
