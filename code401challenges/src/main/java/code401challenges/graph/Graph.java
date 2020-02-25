package code401challenges.graph;


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Graph<T> {
    //instance variables
    public LinkedList<GraphNode<T>> map;

    //constructor function
    public Graph() {
        this.map = new LinkedList<>();
    }

    //instance methods
    public GraphNode<T> addNode (T value) {
        GraphNode<T> node = new GraphNode<>(value);
        map.add(node);
        return node;
    }

    public void addEdge (GraphNode<T> node, GraphNode<T> neighbor, T weight) {
        if (!map.contains(node)){
            map.add(node);
        }

        if (!map.contains(neighbor)){
            map.add(neighbor);
        }

        node.neighbors.add(new GraphEdge<>(neighbor, weight));
        neighbor.neighbors.add(new GraphEdge<>(node, weight));
    }

    public LinkedList<GraphNode<T>> getNodes () {
        return this.map;
    }

    public HashMap<GraphNode<T>, T> getNeighbors (GraphNode<T> node){
        LinkedList<GraphEdge<T>> edges =  map.get(map.indexOf(node)).neighbors;
        HashMap<GraphNode<T>, T> neighbors = new HashMap<>();

        for (GraphEdge<T> edge : edges) {
            neighbors.put(edge.node, edge.weight);
        }
        return neighbors;
    }

    public int size () {
        return map.size();
    }
}
