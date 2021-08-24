package code401challenges.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NodeTest {
    Node test;

    @Before
    public void setUp () {
        test = new Node (3);
    }

    @Test
    public void testNodeConstructor () {
        Assert.assertEquals(3, test.value);
    }
}
