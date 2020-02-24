package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GraphNodeTest {
    GraphNode<Integer> node;

    @Before
    public void setUp() {
        node = new GraphNode<>(5);
    }

    @Test
    public void testGraphNodeConstructor () {
        int value = node.value;
        assertEquals(5, value);
    }
}
