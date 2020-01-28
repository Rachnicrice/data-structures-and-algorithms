package code401challenges.tree;

import java.util.LinkedList;

public class Tree {
    //instance variables
    public Node root;

    //Constructor function
    public Tree() {
        this.root = null;
    }

    public Tree (Node node) {
        this.root = node;
    }

    //instance methods
    public Integer[] preOrder () {
        return preOrder(this.root).toArray(new Integer[0]);
    }

    public LinkedList<Integer> preOrder (Node node) {
        LinkedList<Integer> values = new LinkedList<>();
        if (node != null) {
            values.add(node.value);
            values.addAll(preOrder(node.left));
            values.addAll(preOrder(node.right));
        }
        return values;
    }

    public Integer[] inOrder () {
        return inOrder(this.root).toArray(new Integer[0]);
    }

    public LinkedList<Integer> inOrder (Node node) {
        LinkedList<Integer> values = new LinkedList<>();
        if (node != null) {
            values.addAll(inOrder(node.left));
            values.add(node.value);
            values.addAll(inOrder(node.right));
        }
        return values;
    }

    public Integer[] postOrder () {
        return postOrder(this.root).toArray(new Integer[0]);
    }

    public LinkedList<Integer> postOrder (Node node) {
        LinkedList<Integer> values = new LinkedList<>();
        if (node != null) {
            values.addAll(postOrder(node.left));
            values.addAll(postOrder(node.right));
            values.add(node.value);
        }
        return values;
    }
}
