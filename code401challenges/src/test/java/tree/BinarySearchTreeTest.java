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
}
