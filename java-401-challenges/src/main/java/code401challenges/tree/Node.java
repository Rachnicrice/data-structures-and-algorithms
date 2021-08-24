package code401challenges.tree;

public class Node {
    //instance variables
    public Node left;
    public Node right;
    public int value;

    //constructor function
    public Node(int value) {
        this.value  = value;
        this.left = null;
        this.right = null;
    }
}
