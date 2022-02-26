package com.company.Data_Structure.Big0.LinkedList.Doubly;

public class DoublyLinkedlist {
    public Node head;
    public Node tail;
    public int size;

    public DoublyLinkedlist(Node head, Node tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public DoublyLinkedlist() {
    }

    public Node createDoublyLinkedList(int val){
        head = new Node();
        Node newNode = new Node(val, null, null );
        head = newNode;
        tail = newNode;
        size = 1;
        return head;

    }


    public String insertion(int val, int loc) {
        Node newNode  = new Node(val);
        if( head == null){
            createDoublyLinkedList(val);
            return "Empty Linked List";

            // Insertion at beginning
        }else if(loc == 0){
               newNode.next = head;
               newNode.prev = null;
               head.prev = newNode;
               head = newNode;

               return "Added at the Front of the Linked List";

            // Insertion at a End Location
        }else if(loc >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }else {

            // Insertion at a specific Location
            Node temp  = head;
            int index = 0;
            while (index < loc -1){
                temp = temp.next;
                index++;
            }

            newNode.prev = temp;
            newNode.next = temp.next;
            temp.next = newNode;
            newNode.next.prev = newNode;
    }

        size++;
        return null;
    }


    public void transverse(){
        if(head != null){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }



        }else{
            System.out.println("Zero Elementds - >");
        }
    }


    public void reverseTransverse(){


        if(head != null){
            Node temp = tail;
            System.out.println();
            while(temp != head){

                System.out.print(temp.value + " - >");
                temp = temp.prev;
            }

            System.out.println(temp.value);
        }
    }


    public void DeleteElement(int val) {
        Node curNode = head;


        if(val == head.value){
            head = head.next;
            head.prev = null;
        }else if(val == tail.value)
        {
            tail = tail.prev;
            tail.next = null;
        }else {
            while(curNode.value != val){
                curNode = curNode.next;
            }

            curNode.prev.next = curNode.next;
            curNode.next.prev = curNode.prev;
        }

    }



}
