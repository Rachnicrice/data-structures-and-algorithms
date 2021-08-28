'use strict';

const Node = require('./Node.js')

class Stack {

  constructor () {
    this.top = 0;
  }

  push (value) {
    if (this.isEmpty) {
      let node = new Node(value)
      this[this.top++] = node;
    } else {
      let node = new Node(value, this[this.top]);
      this[this.top++] = node;
    }
  }

  pop () {
    if (this.top === 0) throw new Error('Cannot pop from empty stack');
    let poppedNode = this[this.top];
    delete this[this.top];
    this.top--;
    return poppedNode;
  }

  peek () {
    if (this.top === 0) throw new Error('Cannot pop from empty stack');
    return this[this.top].value;
  }

  isEmpty () {
    return (this.top === 0) ? true : false;
  }

}

module.exports = Stack;
