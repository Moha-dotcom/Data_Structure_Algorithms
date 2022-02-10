package com.company.Data_Structure.Big0.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int [] intarr = {1,2,3,4,5,6,8,9,10};
       MissingNumber(intarr);
       MissingNo(intarr);
    }

    // Solution 1()

    public static void MissingNumber(int [] arrs){
        int i = 1;
        int j = 0;


        while( i == arrs[j]){ // 0(n)
            i++;
            j++;
        }

        System.out.println(i);
    }


    //Solutuon 2


    public static void MissingNo(int [] arrs){
        int sum1 = 0;
        int sum2 = 0;


        for(int i = 0 ; i<=10; i++){
            sum1 += i;
        }

        for(int j=0; j<arrs.length; j++){
            sum2 += arrs[j];
        }


        int difference = sum1 - sum2;

        System.out.println(difference);


    }
}
