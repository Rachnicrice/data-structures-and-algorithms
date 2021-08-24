package code401challenges.stacksAndQueues;

import java.util.NoSuchElementException;

public class PseudoQueue {
    //instance variables
    Stack front;
    Stack back;

    //constructor function
    PseudoQueue () {
        this.front = new Stack();
        this.back = new Stack();
    }

    //instance methods
    public void enqueue (String value) {
        while (!this.front.isEmpty()) {
            this.back.push(this.front.pop());
        }
        this.back.push(value);
        while (!this.back.isEmpty()) {
            this.front.push(this.back.pop());
        }
    }

    public String dequeue () throws NoSuchElementException {
        if (this.front.isEmpty()) {
            throw new NoSuchElementException("Cannot dequeue() empty queue");
        } else {
            String value = this.front.top.value;
            this.front.top = this.front.top.next;
            return value;
        }
    }
}
