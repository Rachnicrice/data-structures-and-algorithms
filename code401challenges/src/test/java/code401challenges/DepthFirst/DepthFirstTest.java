package code401challenges.DepthFirst;

import code401challenges.BreadthFirst.BreadthFirst;
import code401challenges.graph.Graph;
import code401challenges.graph.GraphNode;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class DepthFirstTest {
    Graph<String> graph;
    GraphNode<String> node;

    @Before
    public void setUp () {
        graph = new Graph<>();

        node = graph.addNode("a");
        graph.addEdge(graph.map.getFirst(), new GraphNode<>("b"), "c");
    }
    

}
