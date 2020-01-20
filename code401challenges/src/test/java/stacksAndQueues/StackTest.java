package stacksAndQueues;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {
    Stack input;

    @Before
    public void setUp () {
        input = new Stack();
        input.push("a");
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

    @Test
    public void testPop () {
        String actual = input.pop();
        Assert.assertEquals("a", actual);
        Assert.assertEquals(null, input.top);
    }

    @Test
    public void testPeek () {
        Assert.assertEquals("a", input.peek());
    }
}
