package br.com.filgueiras.binarytree;

public class Tree<T> {
    
    private Node<T> root;

    public Tree() {
        this.root = null;
    }

    public void add(Node<T> node) {
        node.setLeftNode(null);
        node.setRightNode(null);
        if(this.root == null) {
            this.root = node;
        } else {
            add(this.root, node);
        }
    }

    public int height() {
        return this.height(this.root);
    }

    public Node<T> getRoot() {
        return this.root;
    }

    public Node<T> find(Node<T> node) {
        return this.find(this.root, node);
    }

    public void inOrder() {
        this.inOrder(this.root);
    }

    public void preOrder() {
        this.preOrder(this.root);
    }

    public void postOrder() {
        this.postOrder(this.root);
    }

    private int height(Node<T> node) {
        if(node == null) {
            return -1;
        }
        int leftHeight = height(node.getLeftNode());
        int rightHeight = height(node.getRightNode());
        return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }

    private void postOrder(Node<T> node) {
        if (node != null) {
            postOrder(node.getLeftNode());
            postOrder(node.getRightNode());
            System.out.print(" " + node.value);
        }
    }

    private void preOrder(Node<T> node) {
        if(node != null) {
            System.out.print(" " + node.value);
            preOrder(node.getLeftNode());
            preOrder(node.getRightNode());
        }
    }

    private void inOrder(Node<T> node) {
        if(node != null) {
            inOrder(node.getLeftNode());
            System.out.print(" " + node.getValue());
            inOrder(node.getRightNode());
        }
    }

    private Node<T> find(Node<T> ref, Node<T> node) {   
        if(ref.getValue().equals(node.getValue())) {
            return ref;
        } else {
            if(node.weight() > ref.weight()) {
                if(ref.getRightNode() == null) {
                    throw new IllegalArgumentException("Node not found!");
                } else {
                    return find(ref.getRightNode(), node);
                }
            } else {
                if(ref.getLeftNode() == null) {
                    throw new IllegalArgumentException("Node not found!");
                } else {
                    return find(ref.getLeftNode(), node);
                }
            }
        }
    }

    private void add(Node<T> ref, Node<T> node) {
        if(node.weight() > ref.weight()) {
            if(ref.getRightNode() == null) {
                ref.setRightNode(node);
            } else {
                add(ref.getRightNode(), node);
            }
        } else if(node.weight() < ref.weight()) {
            if(ref.getLeftNode() == null) {
                ref.setLeftNode(node);
            } else {
                add(ref.getLeftNode(), node);
            }
        }
    }

    @Override
    public String toString() {
        return this.root == null ? "[(X)]" : this.root.toString();
    }
    

}
