package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {
    Graph<Integer> graph;
    GraphNode<Integer> node;
    GraphEdge<Integer> edge;

    @Before
    public void setUp () {
        graph = new Graph<>();
        node = new GraphNode<>(6);
        edge = new GraphEdge<>(node, 2);
    }

    @Test
    public void testAddNode () {
        graph.addNode(2);
        int value = graph.map.getFirst().value;
        assertEquals(2, value);
    }

    @Test
    public void testAddEdge () {
        graph.addNode(2);
        graph.addEdge(graph.map.getFirst(), node, 4);
        int connectedNode = graph.map.getFirst().neighbors.getFirst().node.value;
        int weight = graph.map.getFirst().neighbors.getFirst().weight;

        assertEquals(6, connectedNode);
        assertEquals(4, weight);
    }

    @Test
    public void testGetNodes () {
        graph.addNode(2);
        Object[] nodes = graph.getNodes().toArray();
        assertTrue(nodes.length == 1);
    }

    @Test
    public void testGetSize () {
        graph.addNode(1);
        assertEquals(1, graph.size());
    }
}
