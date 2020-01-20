package code401challenges.stacksAndQueues;

import java.util.NoSuchElementException;

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

    public String pop () throws NoSuchElementException {
        if (this.top == null) {
            throw new NoSuchElementException("Cannot perform pop() on empty stack");
        }
        String value = this.top.value;
        this.top = this.top.next;
        return value;
    }

    public String peek () throws NoSuchElementException{
        if (this.top != null) {
            return this.top.value;
        } else {
            throw new NoSuchElementException("Cannot perform peek() on empty stack");
        }
    }

    public Boolean isEmpty () {
        return this.top == null ? true : false;
    }


}
