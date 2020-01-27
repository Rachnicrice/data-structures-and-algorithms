package tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {
    BinarySearchTree testEmpty;
    BinarySearchTree testFull;
    Node node;

    @Before
    public void setUp () {
        testEmpty = new BinarySearchTree();
        testFull = new BinarySearchTree (node = new Node (9));
    }

    @Test
    public void testTreeConstructor_EmptyTree () {
        Assert.assertEquals(null, testEmpty.root);
    }

    @Test
    public void testTreeConstructor_WithRootNode () {
        Assert.assertEquals(9, testFull.root.value);
    }

    @Test
    public void testAdd_ToEmptyTree () {
        testEmpty.add(1);
        Assert.assertEquals(1, testEmpty.root.value);
    }

    @Test
    public void testAdd_SmallerValue () {
        testFull.add(8);
        Assert.assertEquals(8, testFull.root.left.value);
    }

    @Test
    public void testAdd_LargerValue () {
        testFull.add(10);
        Assert.assertEquals(10, testFull.root.right.value);
    }
}
