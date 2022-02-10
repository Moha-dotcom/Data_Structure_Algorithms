package com.company.Data_Structure.Big0.Arrays;

import javax.print.attribute.PrintJobAttributeSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ShuffleArray {

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,4,3,2,1};
        System.out.println(nums[nums.length/2]);
        int [] result = shuffleArrays(nums, nums.length);

        System.out.println(Arrays.toString(result));


    }


    public static int [] shuffleArrays(int [] nums, int n){

        int i = 1;
        int mid = n/2;


        while(i < mid && mid < nums.length){

            int temp = nums[i];
            nums[i] = nums[mid];
            nums[mid] = temp;


            i++;
            mid++;
        }










        return nums;
    }

}
