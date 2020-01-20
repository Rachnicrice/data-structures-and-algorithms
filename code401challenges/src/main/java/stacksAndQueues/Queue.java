package stacksAndQueues;

public class Queue {
    //instance variables
    Node front;
    Node back;
    Node next;

    //constructor function
    Queue () {
        this.front = null;
        this.next = null;
        this.back = null;
    }

    //instance methods
    public void enqueue (String value) {
        Node node = new Node(value);
        if (this.front == null) {
            this.front = node;
        } else if (this.front == this.back){
            this.front.next = node;
        } else {
            this.back.next = node;
        }
        this.back = node;
    }

    public String dequeue () {
        String value = this.front.value;
        if (this.front == this.back) {
            this.back = null;
        }
        this.front = this.front.next;
        return value;
    }
}
