package com.company.Data_Structure.Arrays;

import java.util.Arrays;

public class ArraysTypes {

    public static void main(String[] args) {
        int arr[][] = new int[10][10];

        arr[9][9] = 14;


        System.out.println(Arrays.deepToString(arr));



        String s2DArray [][] =  {{"a", "b"}, {"c", "d"}};

        System.out.println(Arrays.deepToString(s2DArray));
        System.out.println(s2DArray[0][1]);


    }





}