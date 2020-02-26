package code401challenges.GetEdge;

import code401challenges.graph.Graph;
import code401challenges.graph.GraphNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetEdgeTest {
    Graph<String> graph;
    String[] input;


    @Before
    public void setUp () {
        graph = new Graph<>();
        input = new String[] {
                "Pandora",
                "Arendelle"
        };

        graph.addEdge(new GraphNode<>("Pandora"), new GraphNode<>("Arendelle"), "$150");
    }

    @Test
    public void testGetEdge_EdgeExists() {
        Trip expected = new Trip(true, "$150");
        Trip actual = GetEdge.flightPlan(graph, input);

        assertEquals(expected.direct, actual.direct);
        assertEquals(expected.cost, actual.cost);
    }
}
