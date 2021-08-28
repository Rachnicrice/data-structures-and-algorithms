'use strict';

const Stack = require(`../Stacks_Queues/Stack.js`);

describe ('Stack class tests', () => {

  let stack;

  beforeEach(() => {
    stack = new Stack;
    stack.push('a');
  })

  it('Can successfully push onto a stack', () => {
    expect(stack[stack.top].value).toEqual('a');
  });

  it('Can successfully push multiple values onto a stack', () => {
    stack.push('hello');
    expect(stack[stack.top].value).toEqual('hello');
    expect(stack[stack.top].next.value).toEqual('a');
  });

  it('Can successfully pop off the stack', () => {
    let actual = stack.pop();
    expect (actual.value).toEqual('a');
  });

  it('Can successfully empty a stack after multiple pops', () => {
    stack.push('b');
    stack.pop();
    stack.pop();
    expect(stack.isEmpty()).toEqual(true);
  });

  it('Can successfully peek the next item on the stack', () => {
    let actual = stack.peek()
    expect (actual).toEqual('a');
  });

  it('Can successfully instantiate an empty stack', () => {
    let newStack = new Stack ();
    expect(newStack.isEmpty()).toEqual(true);
  });

  it('Calling pop on empty stack raises exception', () => {
    let newStack = new Stack ();
    expect(() => {
      newStack.pop();
    }).toThrow();
  });

  it('Calling peek on empty stack raises exception', () => {
    let newStack = new Stack ();
    expect(() => {
      newStack.peek();
    }).toThrow();
  });

})

