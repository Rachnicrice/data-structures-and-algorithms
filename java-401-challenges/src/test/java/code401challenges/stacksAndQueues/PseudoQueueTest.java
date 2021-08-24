package code401challenges.stacksAndQueues;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

public class PseudoQueueTest {
    PseudoQueue testEmpty;
    PseudoQueue testFilled;

    @Before
    public void setUp () {
        testEmpty = new PseudoQueue();

        testFilled = new PseudoQueue();
        testFilled.enqueue("a");
        testFilled.enqueue("b");
        testFilled.enqueue("c");
    }

    @Test
    public void testPseudoQueueConstructor () {
        Assert.assertTrue(testEmpty.front.isEmpty());
        Assert.assertTrue(testEmpty.back.isEmpty());
    }

    @Test
    public void testEnqueue_SingleValueAdded () {
        testEmpty.enqueue("Zip");

        Assert.assertEquals("Zip", testEmpty.front.peek());
    }

    @Test
    public void testEnqueue_MultipleValuesAdded () {
        Assert.assertEquals("a", testFilled.front.peek());
        Assert.assertEquals("b", testFilled.front.top.next.value);
        Assert.assertEquals("c", testFilled.front.top.next.next.value);
    }

    @Test (expected = NoSuchElementException.class)
    public void testDequeue_EmptyQueue () {
        testEmpty.dequeue();
        Assert.assertEquals(null, testEmpty.front.top);
    }

    @Test
    public void testDequeue_MultipleValues () {
        Assert.assertEquals("a", testFilled.front.peek());
        testFilled.dequeue();
        Assert.assertEquals("b", testFilled.front.peek());
        testFilled.dequeue();
        Assert.assertEquals("c", testFilled.front.peek());
    }
}
