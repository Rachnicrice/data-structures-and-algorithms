package tree;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tree {
    //instance variables
    Node root;

    //Constructor function
    Tree () {
        this.root = null;
    }

    Tree (Node node) {
        this.root = node;
    }

    //instance methods
    public Integer[] preOrder () {
        return (Integer[]) preOrder(this.root).toArray();
    }

    public ArrayList<Integer> preOrder (Node node) {
        ArrayList<Integer> values = new ArrayList<>();
        if (node != null) {
            values.add(node.value);
            preOrder(node.left);
            preOrder(node.right);
        }
        return values;
    }

    public Integer[] inOrder () {
        return (Integer[]) inOrder(this.root).toArray();
    }

    public ArrayList<Integer> inOrder (Node node) {
        ArrayList<Integer> values = new ArrayList<>();
        if (node != null) {
            inOrder(node.left);
            values.add(node.value);
            inOrder(node.right);
        }
        return values;
    }

    public Integer[] postOrder () {
        return (Integer[]) postOrder(this.root).toArray();
    }

    public ArrayList<Integer> postOrder (Node node) {
        ArrayList<Integer> values = new ArrayList<>();
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            values.add(node.value);
        }
        return values;
    }
}
