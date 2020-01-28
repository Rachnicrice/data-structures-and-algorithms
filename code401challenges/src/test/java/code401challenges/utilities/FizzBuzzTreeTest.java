package code401challenges.utilities;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTreeTest {
    FizzBuzzTree test;
    Tree convertToFizz;

    @Before
    public void setUp () {
        test = new FizzBuzzTree();
        convertToFizz = new Tree(new Node(15));

        convertToFizz.root.left = new Node(2);
        convertToFizz.root.right = new Node(10);
        convertToFizz.root.left.left = new Node (6);
    }

    @Test
    public void testFizzBuzzTreeConstructor () {
        Assert.assertNull(test.root);
    }

}
