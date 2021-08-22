'use strict';

const Node = require('./Node.js');

class LinkedList {

  constructor () {
    this.head = null;
  }

  append () {

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

}

module.exports = LinkedList;

