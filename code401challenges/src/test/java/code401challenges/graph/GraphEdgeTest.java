package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GraphEdgeTest {
    GraphEdge<String> edge;
    GraphNode<String> node;

    @Before
    public void setUp () {
        node = new GraphNode<>("I'm a node");
        edge = new GraphEdge<>(node, "heavy");
    }

    @Test
    public void testGraphEdgeConstructor () {
        assertEquals(node, edge.node);
        assertEquals("heavy", edge.weight);
    }
}
