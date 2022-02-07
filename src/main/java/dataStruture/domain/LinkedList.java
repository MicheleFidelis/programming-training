package dataStruture.domain;

public class LinkedList<T> {
    No<T> head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {
        int sizeList = 0;
        No<T> refAux = this.head;
        while (refAux != null) {
            sizeList++;
            refAux = refAux.getRefNextNo();
        }
        return sizeList;
    }

    public void add(T value) {
        No<T> newNo = new No<>(value);
        if (this.isEmpty()) {
            this.head = newNo;
        } else {
            No<T> last = this.head;
            while (last.getRefNextNo() != null) {
                last = last.getRefNextNo();
            }
            last.setRefNextNo(newNo);
        }
    }

    private void validateIndex(int index) {
        if (index >= this.size()) {
            throw new IndexOutOfBoundsException("Do not exist item in the index " + index + "in this list.");
        }
    }

    private No<T> getNo(int index) {
        validateIndex(index);
        No<T> currNo = this.head;
        No<T> backNo = null;
        for (int i = 0; i < this.size(); i++) {
            if (index == i) {
                backNo = currNo;
                break;
            }
            currNo = currNo.getRefNextNo();
        }
        return backNo;
    }

    public T remove(int index) {
        validateIndex(index);
        No<T> pivotNo = this.getNo(index);
        if (index == 0) {
            head = pivotNo.getRefNextNo();
            return pivotNo.getValue();
        }
        No<T> prevNo = this.getNo(index - 1);
        prevNo.setRefNextNo(pivotNo.getRefNextNo());
        return pivotNo.getValue();
    }

    public T get(int index) {
        return getNo(index).getValue();
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder("LinkedList{ ");
        No<T> currNo = head;
        while (currNo != null) {
            list.append(currNo.getValue()).append(" ");
            currNo = currNo.getRefNextNo();
        }
        list.append("}");
        return list.toString();
    }
}
