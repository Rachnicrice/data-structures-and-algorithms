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

    public int[] inOrder () {

        return null;
    }

    public int[] postOrder () {

        return null;
    }
}
