package com.company.Data_Structure.BinaryTree;

public class Node {


    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        BinaryTree binaryTree = new BinaryTree();
        System.out.println("Depth First Search");
        binaryTree.DFS(root);




    }
}
