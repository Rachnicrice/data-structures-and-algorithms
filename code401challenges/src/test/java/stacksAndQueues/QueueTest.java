package stacksAndQueues;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueTest {
    Queue input;

    @Before
    public void setUp () {
        input = new Queue();
    }

    @Test
    public void testQueueConstructor () {
        Assert.assertEquals(null, input.front);
    }

    @Test
    public void testEnqueue_EmptyQueue () {
        input.enqueue("a");
        Assert.assertEquals("a", input.front.value);
        Assert.assertEquals("a", input.back.value);
    }

    @Test
    public void testEnqueue_OneValueInQueue () {
        input.enqueue("a");
        input.enqueue("b");
        Assert.assertEquals("a", input.front.value);
        Assert.assertEquals("b", input.back.value);
        Assert.assertEquals("b", input.front.next.value);
    }

    @Test
    public void testDequeue_OneValueInQueue () {
        input.enqueue("a");
        Assert.assertEquals("a", input.dequeue());
        Assert.assertEquals(null, input.front);
        Assert.assertEquals(null, input.back);
    }
}
