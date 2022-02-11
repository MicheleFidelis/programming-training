package dataStruture.domain;

public class BinarySearchTree<T extends Comparable<T>> {
    private BinNode<T> root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(T value) {
        this.root = insert(root, value);
    }

    private BinNode<T> insert(BinNode<T> node, T value) {
        if (node == null) {
            return new BinNode<>(value);
        } else if (node.getValue().compareTo(value) > 0) {
            node.setNodeLeft(insert(node.getNodeLeft(), value));
        } else if (node.getValue().compareTo(value) < 0) {
            node.setNodeRight(insert(node.getNodeRight(), value));
        } else {
            return node;
        }
        return node;
    }

    public void printInOrder() {
        System.out.print("\nPrint in order: ");
        inOrder(this.root);
    }

    private void inOrder(BinNode<T> node) {
        if (node != null) {
            inOrder(node.getNodeLeft());
            System.out.print(node.getValue() + " ");
            inOrder(node.getNodeRight());
        }
    }

    public void printPreOrder() {
        System.out.print("\nPrint in pre order: ");
        preOrder(this.root);
    }

    private void preOrder(BinNode<T> node) {
        if (node != null) {
            System.out.print(node.getValue() + " ");
            preOrder(node.getNodeLeft());
            preOrder(node.getNodeRight());
        }
    }

    public void printPostOrder() {
        System.out.print("\nPrint in post order: ");
        postOrder(this.root);
    }

    private void postOrder(BinNode<T> node) {
        if (node != null) {
            postOrder(node.getNodeLeft());
            postOrder(node.getNodeRight());
            System.out.print(node.getValue() + " ");
        }
    }

    public void deleteNode(T value) {
        root = delete(root, value);
    }

    private BinNode<T> delete(BinNode<T> node, T value) {
        if (node == null)
            return node;
        if (node.getValue().compareTo(value) > 0) {
            node.setNodeLeft(delete(node.getNodeLeft(), value));
        } else if (node.getValue().compareTo(value) < 0) {
            node.setNodeRight(delete(node.getNodeRight(), value));
        } else {
            if (node.getNodeLeft() == null) {
                return node.getNodeRight();
            } else if (node.getNodeRight() == null) {
                return node.getNodeLeft();
            }
            //two children
            //get the smallest in the right subtree
            node.setValue(findMinValue(node.getNodeRight()));
            node.setNodeRight(delete(node.getNodeRight(), node.getValue()));
        }
        return node;
    }

    private T findMinValue(BinNode<T> node) {
        while (node.getNodeLeft() != null) {
            node = node.getNodeLeft();
        }
        return node.getValue();
    }

}
