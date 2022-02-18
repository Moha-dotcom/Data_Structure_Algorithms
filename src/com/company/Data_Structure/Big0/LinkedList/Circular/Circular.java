package com.company.Data_Structure.Big0.LinkedList.Circular;

public class Circular {
    public Node head;
    public Node tail;
    int size;

    public Circular(Node head, Node tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public Node CreateSLL(int nodevalue) {
        head = new Node();
        Node newNode = new Node(nodevalue, head );
        Circular circular = new Circular(newNode, newNode, 1);
        return head;



//        head = new Node();
//        Node node = new Node();
//        node.value = nodevalue;
//        node.next = node;
//        head = node;
//        tail = node;
//        size = 1;
//        return head;
    }


    public void insert(int value, int location) {
        // New Node
        Node node = new Node();
        node.value = value;

        if (head == null) {
            CreateSLL(value);
            // Front of the LinkedLst
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
            // End Location
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;

            // Specified Location
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location) {
                tempNode = tempNode.next;
                index++;
            }

            node.next = tempNode.next;
            tempNode.next = node;

        }
        size++;


    }


    public boolean SearchElement(int val) {

        if (head != null) {
            Node temp = head;
            for (int i = 0; i < size; i++) {
                if (temp.value != val) {
                    System.out.println("found the Element in the LinkedList:  ");
                    return true;
                }
                temp = temp.next;
            }
        }
        System.out.println("Element Not Found !");
        return false;
    }


    public void deleteNode(int location){
        // If Linked List Size is equal to zero
        if(head == null){
            System.out.println("CLL doesnt exist");
            return;
            //If We only only have one element in the List
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                tail = null;
                head.next = null;
                head = null;
            }

            // More than one element
        } else if (location >= size) {
            Node temp = head;
            int i = 0;
            for (i = 0; i < size; i++) {
                temp = temp.next;
            }


            if (temp == head) {
                head.next = null;
                tail = head = null;
                head = null;
                size--;
                return;

            }
            temp.next = head;
            tail = temp;
            size--;

        } else {
            Node temp = head;

            for(int i =0; i<location - 1; i++){
                temp = temp.next;
            }

            temp.next = temp.next.next;
            size--;
        }







    }
}
