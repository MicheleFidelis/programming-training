package dataStruture.domain;

public class CircularSinglyLinkedList<T> {
    private No<T> head;
    private No<T> tail;
    private int sizeList;

    public CircularSinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.sizeList = 0;
    }

    public int size() {
        return this.sizeList;
    }

    public boolean isEmpty() {
        return this.sizeList == 0;
    }

    private No<T> getNo(int index) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        if (index < 0 || index > this.sizeList) {
            throw new IndexOutOfBoundsException("Index error");
        }
        No<T> currNo = head;
        for (int i = 0; i < sizeList && i != index; i++) {
            currNo = currNo.getRefNextNo();
        }
        return currNo;
    }

    public T get(int index) {
        return getNo(index).getValue();
    }

    public void addAtFirst(T value) {
        No<T> newNo = new No<>(value);
        if (this.head == null) {
            tail = newNo;
            newNo.setRefNextNo(tail);
        } else {
            newNo.setRefNextNo(head);
            tail.setRefNextNo(newNo);
        }
        sizeList++;
        head = newNo;
    }

    public void addAtLast(T value) {
        No<T> newNo = new No<>(value);
        if (this.head == null) {
            head = newNo;
        } else {
            tail.setRefNextNo(newNo);
        }
        newNo.setRefNextNo(head);
        tail = newNo;
        sizeList++;
    }

    public void addAtIndex(T value, int index) {
        if (index < 0 || index > sizeList) {
            throw new IndexOutOfBoundsException("Index error");
        }
        if (index == 0) {
            addAtFirst(value);
        } else if (index == sizeList) {
            addAtLast(value);
        } else {
            No<T> newNo = new No<>(value);
            No<T> prevNo = getNo(index - 1);
            newNo.setRefNextNo(prevNo.getRefNextNo());
            prevNo.setRefNextNo(newNo);
            sizeList++;
        }
    }

    private void removeFirst() {
        if (sizeList == 1) {
            head = null;
            tail = null;
        } else {
            tail.setRefNextNo(head.getRefNextNo());
            head = tail.getRefNextNo();
        }
        sizeList--;
    }

    private void removeLast() {
        if (sizeList == 1) {
            head = null;
            tail = null;
        } else {
            No<T> prevNo = getNo(sizeList - 2);
            prevNo.setRefNextNo(head);
            tail = prevNo;
        }
        sizeList--;
    }

    public void removeAtIndex(int index) {
        if (isEmpty() || index < 0 || index >= sizeList) {
            throw new IndexOutOfBoundsException("Index error");
        } else {
            if (index == 0) {
                removeFirst();
            } else if (index == sizeList - 1) {
                removeLast();
            } else {
                No<T> prevNo = getNo(index - 1);
                prevNo.setRefNextNo(prevNo.getRefNextNo().getRefNextNo());
                sizeList--;
            }
        }
    }

    @Override
    public String toString() {
        String list = "CircularSinglyLinkedList{ ";
        No<T> currNo = head;
        if (currNo != null) {
            do {
                list = list + currNo.getValue() + " ";
                currNo = currNo.getRefNextNo();
            } while (currNo != head);
        }
        list = list + " }";
        return list;
    }
}
