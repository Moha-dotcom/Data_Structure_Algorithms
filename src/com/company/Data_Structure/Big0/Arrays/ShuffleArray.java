package com.company.Data_Structure.Big0.Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ShuffleArray {

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,4,3,2,1};
        System.out.println(nums[nums.length/2]);
        int [] result = shuffleArrays(nums, nums.length/2);

        System.out.println(Arrays.toString(result));


    }


    public static int [] shuffleArrays(int [] nums, int n){



        for(int i = 0; i< n; i++){

        }







        int j = n;
        int i = 1;

        int length = nums.length;

        while( i< j){
            do{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j++;
            }while (i < n && n < length);

            i++;



        }












        return nums;
    }

}
