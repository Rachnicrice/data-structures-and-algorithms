package tree;

import java.rmi.AlreadyBoundException;

public class BinarySearchTree {
    //instance variables
    Node root;

    //Constructor function
    BinarySearchTree () {
        this.root = null;
    }

    BinarySearchTree (Node node) {
        this.root = node;
    }

    //instance methods
    public void add (int value) {
        this.root = add(value, this.root);
    }

    public Node add (int value, Node root) {
        if (root == null) {
            return new Node(value);
        } else {

            if (value < root.value) {
               root.left = add(value, root.left);
            } else if (value > root.value) {
                root.right = add(value, root.right);
            } else {
                throw new IllegalArgumentException("Value already exists in the tree");
            }
        }
        return root;
    }

    public boolean contains (int value) {
        return contains(value, this.root);
    }

    public boolean contains (int value, Node node) {
        if (node == null) {
            return false;
        } else {
            if (value < root.value) {
                return contains(value, node.left);
            } else if (value > root.value) {
                return contains(value, node.right);
            } else {
                return true;
            }
        }
    }
}
