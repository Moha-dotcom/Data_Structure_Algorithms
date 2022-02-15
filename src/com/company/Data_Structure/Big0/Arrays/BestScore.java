package com.company.Data_Structure.Big0.Arrays;

import com.sun.source.tree.WhileLoopTree;

import java.util.*;

public class BestScore {

    public static void main(String[] args) {


//        Integer[] arr = {84,85,86,87,88,89,90, 85,83,23};
//        System.out.println(firstSecond(arr));


        int [] arr1 = {1,2,3,4,1,5,2};
//        int  arr = removeDuplicates(arr1, arr1.length);



    }



   public static String firstSecond(Integer[] myArray) {

       Arrays.sort(myArray, Collections.reverseOrder());

       int first = myArray[0];
       System.out.println(first);
       Integer second  = null;
       for(int s : myArray){
           if(s != first){
               second = s;
               break;
           }
       }

        return first + " " + second;

    }

////    public static int  removeDuplicates(int [] arr,  int n) {
////
////        if(n == 0 || n == 1){
////            return n;
////        }
////
////        int j = 0;
////        for(int i = 0; i< n - 1; i++){
////            if(arr[i] == arr[i+1]){
////                arr[j++] = arr[i];
////            }
////        }
////
////        arr[j++]  = arr[n-1];
////
////        return j;
////
////    }
//
//
//
//    public static int [] removeDuplicates(int [] arr) {
//
////
////        Set<Integer> set = new HashSet<>();
////
////        ArrayList<Integer> newArr = new ArrayList<>();
////        int [] item1 = new int[newArr.size()];
////
////
////        for(int i = 0; i < arr.length-1; i++){
////            set.add(arr[i]);
////        }
////
////        Iterator list= set.iterator();
////
////        int j =0;
////        while (list.hasNext()){
////            int item = (int) list.next();
////
////            item1[j] = item;
////            j++;
////
////        }
////
////
////        for(int i =0; i<item1.length; i++){
////            System.out.println(newArr.get(i) + " Hele");
////            item1[i] = newArr.get(i);
////
////        }
////
//
//        return item1;
//
//
//
//
//
//
//
//    }
}
