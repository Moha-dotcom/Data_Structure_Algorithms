package com.company.Data_Structure.Big0.LinkedList.Circlular_DoublyLinkedList;

public class Main {
    public static void main(String[] args) {

        CDLinkedList cdl = new CDLinkedList();
       cdl.CreateCDLinkedList(12);
       cdl.insertion(0,1);
        cdl.insertion(2, 5);
        cdl.insertion(3,9);
        cdl.insertion(4,18);
        cdl.insertion(5,5);
        cdl.insertion(4,19);
       cdl.insertion(7,20);

//        System.out.println("Forward Tranvese");
//        cdl.traverse();
//
//        System.out.println("Backward Tranvese");
//        cdl.ReverseTraverse();
//
//
//        System.out.println("Search Specific Element in the List: ");
//        cdl.SearchNode(999);
        cdl.traverse();

        System.out.println("Deleting Elements: ");
        cdl.DeleteNode(2);
        cdl.DeleteNode(3);

        System.out.println();
        cdl.traverse();
    }
}
