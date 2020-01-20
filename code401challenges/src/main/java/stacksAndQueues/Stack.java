package stacksAndQueues;

public class Stack {
    //instance variables
    Node top;

    //constructor function
    Stack () {
        this.top = null;
    }

    //instance methods
    public void push (String nodeValue) {
        Node node = new Node(nodeValue);
        node.next = this.top;
        this.top = node;
    }
}
