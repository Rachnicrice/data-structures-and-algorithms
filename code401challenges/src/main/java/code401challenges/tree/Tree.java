package code401challenges.tree;

import java.util.LinkedList;
import java.util.NoSuchElementException;

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

    public LinkedList<Integer> breadthFirst () {
        LinkedList<Integer> answers = new LinkedList<>();
        LinkedList<Node> q = new LinkedList<>();
        Node currentNode = this.root;
        q.addFirst(currentNode);

        while (q.peekFirst() != null) {
            if (currentNode.left != null) {
                q.addLast(currentNode.left);
            }

            if (currentNode.right != null) {
                q.addLast(currentNode.right);
            }

            answers.addLast(q.removeFirst().value);
            currentNode = q.peekFirst();
        }

        return answers;
    }

    public int find_Maximum_Value () {
        if (this.root == null) {
            throw new NoSuchElementException("Cannot find max on an empty tree");
        }
        int max = Integer.MIN_VALUE;
        return find_Maximum_Value(max, this.root);
    }

    public int find_Maximum_Value (int max, Node node) {
        if (node != null) {
            if (node.value > max) {
                max = node.value;
            }
            max = find_Maximum_Value(max, node.left);
            max = find_Maximum_Value(max, node.right);
        }

        return max;
    }
}
