package code401challenges.utilities;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;

public class FizzBuzzTree {
    //instance variables
    FizzBuzzNode root;

    //constructor function
    FizzBuzzTree() {};

    public FizzBuzzTree makeFizzBuzzTree (Tree tree) {
        FizzBuzzTree fiBi = new FizzBuzzTree();
        fiBi.root = fizzBuzzTree(tree, tree.root, fiBi, fiBi.root);
        return fiBi;
    }

    private FizzBuzzNode fizzBuzzTree (Tree tree, Node node, FizzBuzzTree fiBi, FizzBuzzNode fizNode) {
        if (node != null) {
            if (node.value % 3 == 0 && node.value % 5 == 0) {
                fizNode = new FizzBuzzNode("FizzBuzz");
            } else if (node.value % 3 == 0) {
                fizNode = new FizzBuzzNode("Fizz");
            } else if (node.value % 5 == 0) {
                fizNode = new FizzBuzzNode("Buzz");
            } else {
                String number = Integer.toString(node.value);
                fizNode = new FizzBuzzNode(number);
            }

            fizNode.left = fizzBuzzTree(tree, node.left, fiBi, fizNode.left);
            fizNode.right = fizzBuzzTree(tree, node.right, fiBi, fizNode.right);
        }
        return fizNode;
    }
}
