'use strict';

const Node = require('./Node.js');

class Queue {

  constructor () {
    this.front = null;
    this.back = null;
  }

  enqueue (value) {
    let node = new Node (value);
    
    if(this.isEmpty()) {
      this.front = new Node(value);
    } else {
      this[this.]
    }
    this[this.length] = value;
    this.length++;

  }

  dequeue () {
    if (this.isEmpty()) throw new Error('cannot dequeue() empty queue');

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
