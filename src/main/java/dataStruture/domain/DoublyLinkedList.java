package dataStruture.domain;

import org.omg.CORBA.NO_IMPLEMENT;

public class DoublyLinkedList<T> {
    private NoDouble<T> head;
    private NoDouble<T> tail;
    private int sizeList = 0;

    public DoublyLinkedList() {
        this.sizeList = 0;
        this.head = null;
        this.tail = null;
    }

    public T get(int index) {
        return getNo(index).getValue();
    }

    private NoDouble<T> getNo(int index) {
        NoDouble<T> noAux = this.head;
        for (int i = 0; i < size() && i != index; i++) {
            noAux = noAux.getRefNextNo();
        }
        return noAux;
    }

    public int size() {
        return this.sizeList;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void addAtLast(T value) {
        NoDouble<T> newNo = new NoDouble<>(value);
        tail.setRefNextNo(newNo);
        newNo.setRefPrevNo(tail);
        tail = newNo;
        sizeList++;
    }

    public void addAtFirst(T value) {
        NoDouble<T> newNo = new NoDouble<>(value);
        if (isEmpty()) {
            tail = newNo;
        } else {
            head.setRefPrevNo(newNo);
            newNo.setRefNextNo(head);
        }
        head = newNo;
        sizeList++;
    }

    public void addAtIndex(T value, int index) {
        if (index >= 0 && index <= this.sizeList) {
            NoDouble<T> newNo = new NoDouble<>(value);
            if (index == 0) {
                addAtFirst(value);
            } else if (index == this.sizeList) {
                addAtLast(value);
            } else {
                NoDouble<T> prevNo = getNo(index - 1);
                newNo.setRefNextNo(prevNo.getRefNextNo());
                newNo.setRefPrevNo(prevNo.getRefNextNo().getRefPrevNo());
                prevNo.getRefNextNo().setRefPrevNo(newNo);
                prevNo.setRefNextNo(newNo);
                sizeList++;
            }
        } else {
            System.out.println("Index " + index + " not valid for linked list of size " + this.sizeList);
        }
    }

    private T removeFirstNode() {
        NoDouble<T> firstNo = head;
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        } else {
            if (this.sizeList == 1) {
                tail = null;
            } else {
                head.getRefNextNo().setRefPrevNo(null);
            }
            head = head.getRefNextNo();
            sizeList--;
            return firstNo.getValue();
        }
    }

    private T removeLastNo() {
        NoDouble<T> lastNo = tail;
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        } else {
            if (this.sizeList == 1) {
                head = null;
            } else {
                tail.getRefPrevNo().setRefNextNo(null);
            }
            tail = tail.getRefPrevNo();
            sizeList--;
            return lastNo.getValue();
        }
    }

    public T removeAtIndex(int index) {
        if (index >= 0 && index < sizeList) {
            if (index == 0) {
                return removeFirstNode();
            } else if (index == sizeList - 1) {
                return removeLastNo();
            } else {
                NoDouble<T> currNo = getNo(index);
                currNo.getRefPrevNo().setRefNextNo(currNo.getRefNextNo());
                currNo.getRefNextNo().setRefPrevNo(currNo.getRefPrevNo());
                sizeList--;
                return currNo.getValue();
            }
        } else {
            System.out.println("Index " + index + " not valid for linked list of size " + this.sizeList);
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder("DoublyLinkedList{ ");
        NoDouble<T> currNo = head;
        while (currNo != null) {
            list.append(currNo.getValue()).append(" ");
            currNo = currNo.getRefNextNo();
        }
        list.append(" }");
        return list.toString();
    }
}
