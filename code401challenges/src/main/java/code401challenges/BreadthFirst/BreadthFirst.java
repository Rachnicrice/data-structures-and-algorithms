package code401challenges.BreadthFirst;

import code401challenges.graph.GraphEdge;
import code401challenges.graph.GraphNode;

import java.util.*;

public class BreadthFirst {

    public static LinkedList<GraphNode<Integer>> breadthFirst (GraphNode<Integer> node) {
        LinkedList<GraphNode<Integer>> allTheNodes = new LinkedList<>();
        LinkedList<GraphNode<Integer>> nodesToVisit = new LinkedList<>();
        nodesToVisit.add(node);

        while (!nodesToVisit.isEmpty()) {
            GraphNode<Integer> visiting = nodesToVisit.getFirst();
            allTheNodes.add(visiting);
            for (GraphEdge<Integer> neighbor : visiting.neighbors){
                if (!allTheNodes.contains(neighbor.node)){
                    nodesToVisit.addLast(neighbor.node);
                }
            };
            nodesToVisit.removeFirst();
        }

        return allTheNodes;
    }
}
