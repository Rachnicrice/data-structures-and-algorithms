package stacksAndQueues;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NodeTest {
    Node input;

    @Before
    public void setUp () {
        input = new Node ("I'm a Node");
    }

    @Test
    public void testNodeConstructor () {
        Assert.assertEquals("I'm a Node", input.value);
    }

}
