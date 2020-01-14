package code401challenges.LinkedList;

public class Node {
    //instance variables for Node Class
    String value;
    Node next;

    //Constructor for Node Class
    Node(String value) {
        this.value = value.toLowerCase();
        this.next = null;
    }

}