package code401challenges.graph;

public class GraphEdge<T> {
    //instance variables
    T weight;
    GraphNode<T> node;

    //constructor function
    GraphEdge (GraphNode<T> node) {
        this.weight = null;
        this.node = node;
    }

    GraphEdge (GraphNode<T> node, T weight){
        this.weight = weight;
        this.node = node;
    }
}
