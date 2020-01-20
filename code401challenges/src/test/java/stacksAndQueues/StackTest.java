package stacksAndQueues;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

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
    public void testPush_OneValue () {
        input.push("hello");
        Assert.assertEquals("hello", input.top.value);
    }

    @Test
    public void testPush_MultipleValues () {
        input.push("b");
        input.push("c");

        Assert.assertEquals("c", input.top.value);
        Assert.assertEquals("b", input.top.next.value);
        Assert.assertEquals("a", input.top.next.next.value);
    }

    @Test
    public void testPop_OneValue () {
        String actual = input.pop();
        Assert.assertEquals("a", actual);
        Assert.assertEquals(null, input.top);
    }

    @Test
    public void testPop_MultipleValues () {
        input.push("b");
        input.push("c");

        input.pop();
        Assert.assertEquals("b", input.top.value);

        input.pop();
        Assert.assertEquals("a", input.top.value);

        input.pop();
        Assert.assertEquals(null, input.top);
    }

    @Test (expected = NoSuchElementException.class)
    public void testPop_EmptyQueue () {
        input.pop();
        input.pop();
        Assert.assertEquals(null, input.top);
    }

    @Test
    public void testPeek () {
        Assert.assertEquals("a", input.peek());
    }

    @Test (expected = NoSuchElementException.class)
    public void testPeek_EmptyStack () {
        input.pop();
        input.peek();
        Assert.assertEquals(null, input.top);
    }

    @Test
    public void testIsEmpty () {
        Assert.assertFalse(input.isEmpty());
    }

    @Test
    public void testIsEmpty_EmptyStack () {
        input.pop();
        Assert.assertTrue(input.isEmpty());
    }
}
