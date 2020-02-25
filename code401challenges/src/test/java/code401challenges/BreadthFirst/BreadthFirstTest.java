package code401challenges.BreadthFirst;


import code401challenges.graph.Graph;
import code401challenges.graph.GraphNode;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class BreadthFirstTest {
    Graph<Integer> graph;

    @Before
    public void setUp () {
        graph = new Graph<>();

        graph.addNode(2);
        graph.addEdge(graph.map.getFirst(), new GraphNode<>(3), 4);
    }

    @Test
    public void testBreadthFirst () {
        LinkedList<GraphNode<Integer>> actual = BreadthFirst.breadthFirst(graph.map.getFirst());

        for (int i = 0; i < actual.size(); i++) {
            if (i == 0) {
                int value = actual.get(i).value;
                assertEquals(2, value);
            } else if (i == 1) {
                int value = actual.get(i).value;
                assertEquals(3, value);
            }
        }

    }

}
