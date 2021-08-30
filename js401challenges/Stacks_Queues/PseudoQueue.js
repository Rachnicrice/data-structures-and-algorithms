'use strict';

const Stack = require('./Stack.js');

class PseudoQueue {

  constructor () {
    this.front = new Stack();
    this.back = new Stack();
  }

  enqueue (value) {
    while (!this.front.isEmpty()) {
      this.back.push(this.front.pop());
    }

    this.back.push(value);

    while (!this.back.isEmpty()) {
      this.front.push(this.back.pop());
    }
  }

  dequeue () {
    if (this.front.isEmpty()) {
      throw new Error ('Cannot dequeue() empty queue');
    } else {
      let value = this.front.top.value;
      this.front.top = this.front.top.next;
      return value;
    }
  }
}

module.exports = PseudoQueue;

