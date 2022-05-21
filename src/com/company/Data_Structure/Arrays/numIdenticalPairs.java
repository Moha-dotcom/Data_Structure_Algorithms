package com.company.Data_Structure.Arrays;

public class numIdenticalPairs {

    public static void main(String[] args) {


        int []nums = {1,1,1,1};

        System.out.println(numIdenticalPairs(nums));

    }

    public static int numIdenticalPairs(int[] nums) {

        int count = 0;



        for( int i = 0; i< nums.length; i++){
            int j = i + 1;

            while( j < nums.length) {
                if (nums[i] == nums[j]) {
                    count += 1;

                }
                j++;
            }

        }




        return count;
    }
}
