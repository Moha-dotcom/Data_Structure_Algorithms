package com.company.Data_Structure.Big0.LinkedList.Circular;

public class Circular {
    public Node head;
    public Node tail;
    int size;


    public  Node CreateSLL(int nodevalue){
        head = new Node();
        Node node = new Node();
        node.value = nodevalue;
        node.next  = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }


    public void insert(int value, int location){
        // New Node
        Node node = new Node();
        node.value = value;

        if(head == null){
            CreateSLL(value);
            // Front of the LinkedLst
        }else if(location == 0){
           node.next = head;
           head = node;
           tail.next = head;
            // End Location
        }else if(location >= size){
            tail.next = node;
            tail = node;
            tail.next = head;

            // Specified Location
        }else{
            Node tempNode = head;
            int index = 0;
            while(index < location){
                tempNode = tempNode.next;
                index++;
            }

            node.next = tempNode.next;
            tempNode.next = node;

        }
        size++;



    }


    public boolean SearchElement(int val){

        if(head != null){
            Node temp = head;
            for(int i = 0; i<size; i++){
                if(temp.value != val){
                    System.out.println("found the Element in the LinkedList:  ");
                    return true;
                }
                temp = temp.next;
            }
        }
        System.out.println("Element Not Found !");
        return false;
    }


}
