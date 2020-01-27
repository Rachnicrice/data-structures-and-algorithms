package tree;

public class Node {
    //instance variables
    Node left;
    Node right;
    int value;

    //constructor function
    Node (int value) {
        this.value  = value;
        this.left = null;
        this.right = null;
    }
}
