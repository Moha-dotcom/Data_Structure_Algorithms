package com.company.Data_Structure.Big0.LinkedList.Doubly;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedlist doublyLinkedlist = new DoublyLinkedlist();
        doublyLinkedlist.createDoublyLinkedList(1);
        doublyLinkedlist.insertion(2,0);
        doublyLinkedlist.insertion(3, 1);
        doublyLinkedlist.insertion(4, 2);
        System.out.println(doublyLinkedlist.head.next.next.next.value);
    }
}
