package code401challenges.DepthFirst;

import code401challenges.graph.GraphEdge;
import code401challenges.graph.GraphNode;

import java.util.LinkedList;
import java.util.Stack;

public class DepthFirst {

    public static LinkedList<GraphNode<String>> DepthFirst (LinkedList<GraphNode<String>> map) {
        LinkedList<GraphNode<String>> traversedNodes = new LinkedList<>();
        Stack<GraphNode<String>> visited = new Stack<>();

        GraphNode<String> current = map.getFirst();
        visited.add(current);

        while (!visited.isEmpty()) {
            LinkedList<GraphEdge<String>> neighbors = current.neighbors;
            int counter = 0;

            for (int i = 0; i < neighbors.size(); i++) {
                if (!visited.contains(neighbors.get(i).node)){
                    visited.add(neighbors.get(i).node);
                    current = neighbors.get(i).node;
                } else {
                    counter ++;
                }
            }

            if (counter == neighbors.size()){
                traversedNodes.addFirst(current);
                current = visited.pop();
            }
        }

        return traversedNodes;
    }
}
