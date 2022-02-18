package com.company.Data_Structure.Big0.LinkedList.Circular;

public class Main {

    public static void main(String[] args) {

        Circular circular = new Circular();
        circular.CreateSLL(12);
        circular.insert(43, 0);
        System.out.println(circular.head.value);
        circular.SearchElement(43);

    }
}
