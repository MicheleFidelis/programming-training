package dataStruture.test;

import dataStruture.domain.CircularSinglyLinkedList;

public class TestCircularSinglyLinkedList {
    public static void main(String[] args) {
        CircularSinglyLinkedList<String> circularLinkedList = new CircularSinglyLinkedList<>();
        System.out.println("Is empty: " + circularLinkedList.isEmpty());

        circularLinkedList.addAtIndex("Ana", 0);
        circularLinkedList.addAtIndex("Pedro", 0);
        circularLinkedList.addAtFirst("Paulo");
        circularLinkedList.addAtIndex("Joao", 3);
        circularLinkedList.addAtLast("Caio");
        circularLinkedList.addAtIndex("Emilio", 1);
        System.out.println("Is empty: " + circularLinkedList.isEmpty());
        System.out.println("Size: " + circularLinkedList.size());
        System.out.println(circularLinkedList);

        circularLinkedList.removeAtIndex(0);
        System.out.println("Size: " + circularLinkedList.size());
        System.out.println(circularLinkedList);
        circularLinkedList.removeAtIndex(4);
        System.out.println(circularLinkedList);
        circularLinkedList.removeAtIndex(2);
        System.out.println(circularLinkedList);
        circularLinkedList.removeAtIndex(1);
        System.out.println(circularLinkedList);


    }
}
