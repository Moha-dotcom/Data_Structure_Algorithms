package com.company.Data_Structure.LinkedList.Doubly;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedlist doublyLinkedlist = new DoublyLinkedlist();
        doublyLinkedlist.createDoublyLinkedList(1);
        doublyLinkedlist.insertion(9,0);
        doublyLinkedlist.insertion(10, 1);
        doublyLinkedlist.insertion(11, 2);
        doublyLinkedlist.insertion(19, 2);
        doublyLinkedlist.insertion(18, 2);
        doublyLinkedlist.insertion(17, 2);
        doublyLinkedlist.insertion(12, 2);

//        System.out.println(doublyLinkedlist.head.next.next.next.value);

        doublyLinkedlist.transverse();
        System.out.println();
        doublyLinkedlist.DeleteElement(9);


       doublyLinkedlist.transverse();

       doublyLinkedlist.DeleteEntireList();
       doublyLinkedlist.transverse();
    }
}
