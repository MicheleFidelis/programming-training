package dataStruture.test;

import dataStruture.domain.BinarySearchTree;

public class TestBinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(50);
        binarySearchTree.insert(30);
        binarySearchTree.insert(20);
        binarySearchTree.insert(40);
        binarySearchTree.insert(70);
        binarySearchTree.insert(60);
        binarySearchTree.insert(80);

        binarySearchTree.printInOrder();
        binarySearchTree.printPreOrder();
        binarySearchTree.printPostOrder();

        System.out.println("\nDelete 20");
        binarySearchTree.deleteNode(20);
        binarySearchTree.printInOrder();

        System.out.println("\nDelete 30");
        binarySearchTree.deleteNode(30);
        binarySearchTree.printInOrder();

        System.out.println("\nDelete 50");
        binarySearchTree.deleteNode(50);
        binarySearchTree.printInOrder();
    }
}
