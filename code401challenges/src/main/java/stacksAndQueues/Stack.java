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

    public String pop () {
        String value = this.top.value;
        this.top = this.top.next;
        return value;
    }

    public String peek () {
        if (this.top != null) {
            return this.top.value;
        } else {
            return null;
        }
    }

    public Boolean isEmpty () {
        return this.top == null ? true : false;
    }


}
