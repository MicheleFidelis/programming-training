package dataStruture.test;

import dataStruture.domain.DoublyLinkedList;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
        System.out.println(doublyLinkedList.isEmpty());
        System.out.println(doublyLinkedList.size());

        doublyLinkedList.addAtFirst(1);
        doublyLinkedList.addAtLast(2);
        doublyLinkedList.addAtLast(3);
        doublyLinkedList.addAtLast(4);
        System.out.println(doublyLinkedList);
        System.out.println(doublyLinkedList.isEmpty());
        System.out.println(doublyLinkedList.size());

        System.out.println(doublyLinkedList.get(0));
        System.out.println(doublyLinkedList.get(1));
        System.out.println(doublyLinkedList.get(2));
        System.out.println(doublyLinkedList.get(3));

        doublyLinkedList.addAtIndex(1, 0);
        doublyLinkedList.addAtIndex(21, 3);
        doublyLinkedList.addAtIndex(51, 7);
        System.out.println(doublyLinkedList);

        System.out.println("Remove: " + doublyLinkedList.removeAtIndex(0));
        System.out.println("Remove: " + doublyLinkedList.removeAtIndex(doublyLinkedList.size() - 1));
        System.out.println(doublyLinkedList);
        System.out.println("Remove: " + doublyLinkedList.removeAtIndex(0));
        System.out.println("Remove: " + doublyLinkedList.removeAtIndex(2));
        System.out.println(doublyLinkedList);
        System.out.println("Remove: " + doublyLinkedList.removeAtIndex(1));
        System.out.println(doublyLinkedList);


    }
}
