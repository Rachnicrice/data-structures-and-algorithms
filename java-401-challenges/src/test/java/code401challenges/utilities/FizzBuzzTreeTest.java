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

    @Test
    public void testFizzBuzzTree_Full () {
        Assert.assertEquals(15, convertToFizz.root.value);
        Assert.assertEquals(2, convertToFizz.root.left.value);
        Assert.assertEquals(10, convertToFizz.root.right.value);
        Assert.assertEquals(6, convertToFizz.root.left.left.value);
    }

    @Test
    public void testMakeFizzBuzzTree () {
        FizzBuzzTree blah = new FizzBuzzTree();
        FizzBuzzTree test1 = blah.makeFizzBuzzTree(convertToFizz);

        Assert.assertEquals("FizzBuzz", test1.root.value);
        Assert.assertEquals("2", test1.root.left.value);
        Assert.assertEquals("Buzz", test1.root.right.value);
        Assert.assertEquals("Fizz", test1.root.left.left.value);
    }

    @Test
    public void testMakeFizzBuzzTree_EmptyTree () {
        FizzBuzzTree meep = new FizzBuzzTree();
        FizzBuzzTree test2 = meep.makeFizzBuzzTree(new Tree());

        Assert.assertNull(test2.root);
    }

}
