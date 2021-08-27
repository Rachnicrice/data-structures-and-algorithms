'use strict';

const Node = require('./Node.js');

class LinkedList {

  constructor () {
    this.head = null;
  }

  append (value) {
    let newNode = new Node(value);

    if (this.head === null) {
      this.head = newNode;
    } else {
      let nextNode = this.head;
      while (nextNode.next !== null) {
        nextNode = nextNode.next;
      }
      nextNode.next = newNode;
    }
  }

  insert (value) {
    let newNode = new Node(value);

    if (this.head === null) {
      this.head = newNode;
    } else {
      newNode.next = this.head;
      this.head = newNode;
    }
  }

  includes (searchKey) {
    let currentNode = this.head;

    while (currentNode.next !== null) {
      if (currentNode.value.equals(searchKey.toLowerCase())) {
        return true;
      }
      currentNode = currentNode.next;
    }
    return false;
  }

  toString () {
    let listValues = '';
    let currentNode = this.head;

    while (currentNode !== null) {
      listValues += '{' + currentNode.value + '} -> ';
      currentNode = currentNode.next;
    }

    return listValues + 'NULL';
  }

  insertBefore (searchVal, newVal) {
    let lastNode = this.head;
    let currentNode = this.head;

    while (currentNode !== null) {
      if (currentNode.value.equals(searchVal)){
        let newNode = new Node(newVal);

        if (currentNode === this.head) {
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

    if (currentNode === null) {
      throw new Error('Search Value not included in List');
    }

  }

  insertAfter (searchVal, newVal) {
    let currentNode = this.head;

    while (currentNode !== null) {
      if (currentNode.value.equals(searchVal)){
        let newNode = new Node(newVal);
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        break;
      }
      currentNode = currentNode.next;
    }

    if (currentNode === null) {
      throw new Error('Search Value not included in List');
    }
  }

  size () {
    let numberOfNodes = 0;
    let currentNode = this.head;

    while (currentNode !== null) {
      numberOfNodes++;
      currentNode = currentNode.next;
    }
    return numberOfNodes;
  }

  kthFromEnd (k) {
    let currentNode = this.head;
    let wantedNodeValue = '';
    let kNodeLocation = this.size() - k;

    if (kNodeLocation >= 0 && kNodeLocation <= this.size()) {
      for(let i = 1; i < k; i++) {
        currentNode = currentNode.next;
      }
      wantedNodeValue = currentNode.value;
    } else {
      throw new Error('Input k cannot be greater than list length');
    }

    return wantedNodeValue;
  }

}

module.exports = LinkedList;

