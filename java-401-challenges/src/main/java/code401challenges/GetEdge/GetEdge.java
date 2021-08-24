package code401challenges.GetEdge;

import code401challenges.graph.Graph;
import code401challenges.graph.GraphEdge;
import code401challenges.graph.GraphNode;

import java.util.LinkedList;

public class GetEdge {

    public static Trip flightPlan (Graph graph, String[] destinations) {
        LinkedList<GraphEdge<String>> neighbors = new LinkedList<>();
        Trip trip = new Trip();

        for (int i = 0; i < graph.map.size(); i++) {
            GraphNode<String> node = (GraphNode<String>) graph.map.get(i);
            if (node.value.equals(destinations[0])) {
                neighbors = node.neighbors;
            }
        }

        for (int i = 0; i < neighbors.size(); i++) {
            GraphEdge<String> edge = neighbors.get(i);
            if (edge.node.value.equals(destinations[1])){
                trip = new Trip(true, edge.weight);
            }
        }
        return trip;
    }
}
