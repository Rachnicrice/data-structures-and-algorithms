package code401challenges.LinkedList;


import java.util.NoSuchElementException;

public class LinkedList {
    //instance variables for LinkedList Class
    Node head;

    //instance methods for LinkedList Class
    public void append (String value) {
        //Create a new node
        Node newNode = new Node(value);

        //Check to see if Nodes already exist in the Linked List
        if (this.head == null) {
            //If no Nodes exist set the new Node to the head
            this.head = newNode;
        } else {
            //If one does exist start at the head
            Node nextNode = this.head;

            //Traverse the list until the last node is reached
            while (nextNode.next != null) {
                nextNode = nextNode.next;
            }
            //Add the new Node to the end of the list
            nextNode.next = newNode;
        }
    };

    public void insert(String value) {
        //Create a new node
        Node newNode = new Node(value);

        if (this.head == null) {
            this.head = newNode;
        } else {
            //Make the new node point to the head
            newNode.next = this.head;

            //Make the head point to the newNode
            this.head = newNode;
        }
    };

    public Boolean includes (String searchKey) {
        Node currentNode = this.head;

        while (currentNode.next != null) {
            if (currentNode.value.equals(searchKey.toLowerCase())) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public String toString () {
        String listValues = "";
        Node currentNode = this.head;

        while (currentNode != null) {
            listValues += "{" + currentNode.value + "} -> ";
            currentNode = currentNode.next;
        }

        return listValues + "NULL";
    }

    public void insertBefore (String searchVal, String newVal) {
        Node lastNode = this.head;
        Node currentNode = this.head;

        while (currentNode !=null) {

            if (currentNode.value.equals(searchVal)){
                Node newNode = new Node(newVal);
                if (currentNode == this.head) {
                    newNode.next = currentNode.next;
                    this.head = newNode;
                } else {
                    newNode.next = lastNode.next;
                    lastNode.next = newNode;
                }
                break;
            }
            lastNode = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode == null) {
            throw new NoSuchElementException("Search Value not included in List");
        }

    }

    public void insertAfter (String searchVal, String newVal) {
        Node currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.value.equals(searchVal)){
                Node newNode = new Node(newVal);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                break;
            }
            currentNode = currentNode.next;
        }

        if (currentNode == null) {
            throw new NoSuchElementException("Search Value not included in List");
        }
    }

    public void llKthFromEnd () {

    }

}
