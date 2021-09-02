'use strict';

const Stack = require('./Stack');

class MultiBracketValidation {

  constructor () {
    this.round = new Stack();
    this.curly = new Stack();
    this.square = new Stack();
  }

  validate (input) {
    for (let i = 0; i < input.length; i++) {
      let c = input.charAt(i);

      if (c === '(') {
        if (this.round.isEmpty()) {
          this.round.push('(');
        } else { return false; }
      } else if ( c === '{') {
        if (this.curly.isEmpty()) {
          this.curly.push('{');
        } else { return false; }
      } else if (c === '[') {
        if (this.square.isEmpty()) {
          this.square.push('[');
        } else { return false; }
      } else if (c === ')') {
        if (!this.round.isEmpty()) {
          this.round.pop();
        } else { return false; }
      } else if (c === '}') {
        if (!this.curly.isEmpty()) {
          this.curly.pop();
        } else { return false; }
      } else if (c === ']') {
        if (!this.square.isEmpty()) {
          this.square.pop();
        } else { return false; }
      }
    }

    if (this.round.isEmpty() && this.curly.isEmpty() && this.square.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }

}

module.exports = MultiBracketValidation;