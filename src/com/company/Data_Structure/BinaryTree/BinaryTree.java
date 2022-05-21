package com.company.Data_Structure.BinaryTree;
import java.util.Stack;




public class BinaryTree {


    public void DFS(Node root){
        Stack<Node> s = new Stack();
        s.add(root); // Add Root;

        while (s.isEmpty() == false){
            Node x = s.pop();

            if(x.right != null){
                s.add(x.right);
            }
            if(x.left != null){
                s.add(x.left);
            }

            System.out.println(" " + x.data);
        }


    }


}
