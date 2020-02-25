package code401challenges.BreadthFirst;

import code401challenges.graph.GraphEdge;
import code401challenges.graph.GraphNode;

import java.util.*;

public class BreadthFirst {

    public static HashSet<GraphNode<Integer>> breadthFirst (GraphNode<Integer> node) {
        HashSet<GraphNode<Integer>> allTheNodes = new HashSet<>();
        LinkedList<GraphNode<Integer>> nodesToVisit = new LinkedList<>();
        nodesToVisit.add(node);

        while (!nodesToVisit.isEmpty()) {
            GraphNode<Integer> visiting = nodesToVisit.getFirst();
            allTheNodes.add(visiting);
            for (GraphEdge<Integer> neighbor : visiting.neighbors){
                if (!allTheNodes.contains(neighbor.node)){
                    nodesToVisit.add(neighbor.node);
                }
            };
            al
        }

        return allTheNodes;
    }
}
