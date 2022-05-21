package com.company.Data_Structure.BinaryTree.Exercise1;



import java.util.*;

public class Node {

    City city;
    Node left;
    Node right;

    public Node(City city) {
        this.city = city;
        this.left = left;
        this.right = right;
    }


    @Override
    public String toString() {
        return "Node{" +
                "city=" + city +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    public static void main(String[] args) {
        City seattle  =  new City("Seattle", 0);
        City denver  =  new City("denver", 1305);
        City miami  =  new City("miami", 2064);
        City LosAngelos  =  new City("Los Angelos", 1016);
        City dallas  =  new City("dallas", 1435);
        City minneapols  =  new City("minneapolis", 990);
        City newyork  =  new City("newyork", 2401);
        City boston  =  new City("boston", 216);





        Node root = new Node(seattle);


        // Left Childen

        root.left = new Node(denver);
        root.left.left = new Node(miami);
        root.left.right = new Node(LosAngelos);
        root.left.right.left = new Node(dallas);
        root.left.right.left.right = new Node(minneapols);

        // Right

        root.right = new Node(newyork);
        root.right.right = new Node(boston);

        FindPath(root, "dallas");

    }


    public static void FindPath(Node root, String city){
        ArrayList arr = new ArrayList();
        if(CheckPath(root, arr,  city)){
           for(int i = 0; i< arr.size()-1; i++){
               System.out.print(arr.get(i) + "->");
           }

            System.out.print(arr.get(arr.size()-1));
        }else{
            System.out.println("No Route");
        }
    }


    public static boolean CheckPath(Node root, ArrayList<Object> arr, String city){
        if (root == null) return false; // no path
        arr.add(root.city.getName());

        if(root.city.getName() == city) return true;
        // else check whether the required node lies
        // in the left subtree or right subtree of
        // the current node

        if(CheckPath(root.left, arr,  city) || CheckPath(root.right, arr, city)) {
            return  true;
        }else{
            arr.remove(arr.size()-1);
            return false;
        }


    }
}
