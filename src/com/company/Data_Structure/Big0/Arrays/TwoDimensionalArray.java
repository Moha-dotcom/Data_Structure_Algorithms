package com.company.Data_Structure.Big0.Arrays;

public class TwoDimensionalArray {

    int arr[][] = null;

    public TwoDimensionalArray(int numberofRows, int numberofCol) {
        this.arr = new int[numberofRows][numberofCol];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }

    }

    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("The value is successfully inserted");
            } else {
                System.out.println("This cell is alreay occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }

    public void accessCell(int row, int col) {
        System.out.println("\nAccessing Row#" + row + ", col#" + col);
        try {
            System.out.println("Cell value is :" + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Col#" + col + ", Row#" + row + "Doesn't Exist");

        }
    }


    public void tranverse2Darray(){

        for(int row =0; row<arr.length; row++){  // Will take 0(m) complexity
            for(int col = 0; col<arr[row].length; col++){ // O(n)
                System.out.print(arr[row][col] + " "); // 0(1)
            }
            System.out.println();   //0(1)


            // Time complexity 0(n)
            // Space Complexity 0(1)
        }

    }



    public void search2DArray(int value){
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col] == value)
                    System.out.println("value #" + value + " is in " + "Row#" + row + "Col#" + col);
            }

        }



    }


}


class main{
    public static void main(String[] args) {

     TwoDimensionalArray arrys = new TwoDimensionalArray(3, 3);
     arrys.insertValueInTheArray(0,0,10);
     arrys.insertValueInTheArray(0,1,1);
     arrys.insertValueInTheArray(0,2,12);
        arrys.insertValueInTheArray(2,2,40);
     arrys.accessCell(1,2);
     arrys.tranverse2Darray();
     arrys.search2DArray(40);
    }
}