package dataStruture.domain;

public class BinNode<T extends Comparable<T>> {
    private T value;
    private BinNode<T> nodeLeft;
    private BinNode<T> nodeRight;

    public BinNode(T value) {
        this.value = value;
        nodeLeft = nodeRight = null;

    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BinNode<T> getNodeLeft() {
        return nodeLeft;
    }

    public void setNodeLeft(BinNode<T> nodeLeft) {
        this.nodeLeft = nodeLeft;
    }

    public BinNode<T> getNodeRight() {
        return nodeRight;
    }

    public void setNodeRight(BinNode<T> nodeRight) {
        this.nodeRight = nodeRight;
    }

    @Override
    public String toString() {
        return "BinNode{" +
                "value=" + value +
                '}';
    }
}
