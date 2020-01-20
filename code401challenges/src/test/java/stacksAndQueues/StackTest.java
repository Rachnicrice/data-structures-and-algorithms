package stacksAndQueues;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {
    Stack input;

    @Before
    public void setUp () {
        input = new Stack();
    }

    @Test
    public void testStackConstructor () {
        Assert.assertEquals(null, input.top);
    }

    @Test
    public void testPush () {
        input.push("hello");
        Assert.assertEquals("hello", input.top.value);
    }
}
