package code401challenges.graph;


import java.util.LinkedList;

public class GraphNode<T> {
    //instance variables
    T value;
    public LinkedList<GraphEdge<T>> neighbors;

    //constructor function
    GraphNode (T value) {
        this.value = value;
        this.neighbors = new LinkedList();
    }
}
