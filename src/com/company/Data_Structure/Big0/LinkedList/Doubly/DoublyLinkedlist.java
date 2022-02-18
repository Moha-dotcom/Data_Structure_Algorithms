package com.company.Data_Structure.Big0.LinkedList.Doubly;

public class DoublyLinkedlist {
    public Node head;
    public Node tail;
    public int size;



    public Node createDoublyLinkedList(int val){
        Node newNode = new Node(val, null, null );
        head = newNode;
        tail = newNode;
        size = 1;


    }


}
