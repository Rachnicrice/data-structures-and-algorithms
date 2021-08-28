'use strict';

const Node = require('./Node.js');

class Queue {

  constructor () {
    this.front = null;
    this.back = null;
  }

  enqueue (value) {
    let node = new Node (value)
    if (this.front === null) {
      this.front = node;
    } else if (this.front === this.back) {
      this.front.next = node;
    } else {
      this.back.next = node;
    }
    this.back = node;
  }

  dequeue () {
    if (this.isEmpty()) throw new Error('cannot dequeue() empty queue');
    let front = this.front;
    if (this.front === this.back) {
      this.back = null;
    }
    this.front = this.front.next;

    return front;
  }

  peek () {
    if (this.isEmpty()) throw new Error('cannot peek() empty queue');
    return this.front.value;
  }

  isEmpty () {
    return (this.length === 0) ? true : false;
  }

}

module.exports = Queue;
