package tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TreeTest {
    Tree testEmpty;
    Tree testFull;
    Node node;

    @Before
    public void setUp () {
        testEmpty = new Tree();
        testFull = new Tree (node = new Node (1));
    }

    @Test
    public void testTreeConstructor_EmptyTree () {
        Assert.assertEquals(null, testEmpty.root);
    }

    @Test
    public void testTreeConstructor_WithRootNode () {
        Assert.assertEquals(1, testFull.root.value);
    }
}
