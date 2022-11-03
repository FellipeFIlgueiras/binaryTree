package br.com.filgueiras.binarytree;

public abstract class Node<T> {
    
    protected T value;
    private Node<T> rightNode;
    private Node<T> leftNode;

    public Node(T value) {
        this.value = value;
        this.rightNode = null;
        this.leftNode = null;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node<T> rightNode) {
        this.rightNode = rightNode;
    }

    public Node<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node<T> leftNode) {
        this.leftNode = leftNode;
    }

    public abstract int weight();

    @Override
    public String toString() {
        return 
            (this.leftNode == null ? "[(X)]" : "[(" + this.leftNode.toString() + ")]") + 
            "[(" + this.value.toString() + ")]" + 
            (this.rightNode == null ? "[(X)]" : "[(" + this.rightNode.toString() + ")]");
    }

}
