package BsearchTree;

import Tree.BinaryTree;

public class Test {
    public static void main(String[] args) {
       BinarySearchTree binarySearchTree=new BinarySearchTree();
       binarySearchTree.insert(10);
       binarySearchTree.insert(20);
       binarySearchTree.insert(9);
       System.out.println(binarySearchTree.search(9));
    }
}
