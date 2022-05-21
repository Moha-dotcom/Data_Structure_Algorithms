package com.company.Data_Structure.Stack;

public class PreviousSmallerNth {

    public static void main(String[] args) {


        int arr [] = new int[]{678976668, 90, 2,5,3, 190000, 1200,  7,8,1,9, 9000, 60000000 };

        System.out.println( LargestKth(arr));;
        System.out.println(SecondLargestKth(arr));

     }


     public static int LargestKth(int[] arr){

        int LargeKth = 0;

        int i = 0;


        while(i < arr.length){
            if(LargeKth < arr[i]){
                LargeKth = arr[i];

            }
            i++;
        }

        return LargeKth;

     }



    public static int SecondLargestKth(int[] arr){

        int i = 0;
        int j = arr.length - 1;


        while( i != j ){
            if(arr[i] < arr[j]){
                i++;
            }else{
                j--;
            }


        }



        return arr[j];

    }

//
//    public static void   findPrevSmaller(int [] arr) {
//
//        Stack<Integer>  newStack = new Stack<>();
//
//        if(arr.length == 0){
//            System.out.println("is Empty");
//        }
//
//
//        // [ 2,5,3,7,8,1, 9]   [-1, 2, 2, 3, 7, -1, 1]
//        // [   ]
//
//
//
//        for(int i = 0; i<arr.length;  i++){
//
//            while (!newStack.empty()){
//                if(newStack.peek() < arr[i]){
//
//                }
//            }
//
//
//
//            newStack.push(arr[i]);
//
//
//        }
//
//
//        for (Integer i : newStack){
//            System.out.println(i);
//        }




}
