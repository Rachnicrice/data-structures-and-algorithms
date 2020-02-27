package code401challenges.DepthFirst;

import code401challenges.BreadthFirst.BreadthFirst;
import code401challenges.graph.Graph;
import code401challenges.graph.GraphNode;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class DepthFirstTest {
    Graph<String> graph;

    @Before
    public void setUp () {
        graph = new Graph<>();

        graph.addNode("a");
        graph.addEdge(graph.map.getFirst(), new GraphNode<>("b"), "c");
    }

    @Test
    public void testDepthFirst () {
        LinkedList<GraphNode<String>> actual = DepthFirst.DepthFirst(graph.map.getFirst().neighbors);

        for (int i = 0; i < actual.size(); i++) {
            if (i == 0) {
                String value = actual.get(i).value;
                assertEquals("a", value);
            } else if (i == 1) {
                String value = actual.get(i).value;
                assertEquals("c", value);
            }
        }
    }

}
