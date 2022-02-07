package dataStruture.test;

import dataStruture.domain.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Is empty: " + list.isEmpty());
        System.out.println("size: " + list.size());
        System.out.println("Get value: " + list.get(0));
        System.out.println("Remove: " + list.remove(0));
        System.out.println("Size: " + list.size());
        System.out.println("Remove: " + list.remove(1));
        System.out.println("Size: " + list.size());
    }
}
