package code401challenges.utilities;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;

public class FizzBuzzTree {
    //instance variables
    FizzBuzzNode root;

    //constructor function
    FizzBuzzTree() {};

    public FizzBuzzTree fizzBuzzTree (Tree tree) {
        FizzBuzzTree fiBi = new FizzBuzzTree();
        return fizzBuzzTree(tree, tree.root, fiBi, fiBi.root);
    }

    private FizzBuzzTree fizzBuzzTree (Tree tree, Node node, FizzBuzzTree fiBi, FizzBuzzNode fizNode) {
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

            fizzBuzzTree(tree, node.left, fiBi, fizNode.left);
            fizzBuzzTree(tree, node.right, fiBi, fizNode.right);
        }
        return fiBi;
    }
}
