package code401challenges.LinkedList;

public class Node {
    //instance variables for Node Class
    String value;
    Node next;

    //Constructor for Node Class
    Node(String letter) {
        this.value = letter.toLowerCase();
        this.next = null;
    }

}