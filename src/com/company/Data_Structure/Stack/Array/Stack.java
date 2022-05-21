package com.company.Data_Structure.Stack.Array;

public class Stack {

    public int[] newArray;
    int topOfStack;


    public Stack() {
        this.newArray = new int[]{};
        this.topOfStack = -1;
        System.out.println("The stack size is " );

    }


    public boolean isFull() {
        if (topOfStack == newArray.length) {
            System.out.println("Stack is Full");
            return true;

        } else {
            System.out.println("Stack is not Full");
            return false;
        }
    }


    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("The Stack is Full");
        } else {
            newArray[topOfStack+1] = value;
            topOfStack++;
            System.out.println("The Value is Successfull inserted");
        }

    }

    public  int pop(){
        int popElement;
        if(isEmpty()){
            System.out.println("List is Empty");
            return -1;
        }else {
            int topstack  = newArray[topOfStack];
            topstack--;
            popElement = topOfStack;

        }

        return popElement;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;

        }else{
            return newArray[topOfStack];
        }
    }



    public void deleteStack(){
        newArray = null;
        System.out.println("Stack is SuccessFully Deleted: ");
    }



}
