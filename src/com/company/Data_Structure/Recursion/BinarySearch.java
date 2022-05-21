package com.company.Data_Structure.Recursion;

public class BinarySearch {



    public static void main(String[] args) {

        int [] A = new int[]{-1,0,1,2,3,4,7,9,10,20};

//        System.out.println(binarySearchA(A, 0, A.length , 10));

        mergeSort(A, 0, A.length-1);
        System.out.println("Stop");

    }



    // Sorted Array
    public static int binarySearchA(int [] A, int left, int right, int x){
        if(left > right) return -1;

        int mid = ( left + right) /2;

        if(x == A[mid]) return mid;

        if(x < A[mid]){
            return binarySearchA(A, left, mid -1 , x);
        }

        else {
            return binarySearchA(A, mid+1 , right, x);
        }
    }


    //
    public static void mergeSort(int [] data , int start, int end){
        if(start < end){
            int mid =( start + end) /2;

            mergeSort(data, start, mid);
            mergeSort(data, mid+ 1, end);
            merge(data, start, mid, end);
        }


    }

    public static void merge(int [] data, int start, int mid, int end){
            int [] temp = new int[end - start + 1];
            int i = start,   j = mid,  k =0;
            // While both sub-arrays have values ,then try to merge them in a sorted order
            while(i <= mid && j <= end){
                if(data[i] <= data[j]) temp[k++] = data[i++];
                temp[k++] = data[j++];
            }

            while(i <= mid) {
                temp[k++] = data[i++];
            }
            while (j <= end) {
                temp[k] = data[j];
                k++;
                j++;
            }

            for (i = start; i<= end; i++ ){
                    data[i] = temp[i-start];
            }


    }


}
