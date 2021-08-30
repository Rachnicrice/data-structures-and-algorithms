'use strict';

const PseudoQueue = require('../Stacks_Queues/PseudoQueue.js');

describe('testing psuedo queue', () => {

  let emptyPQ;
  let fullPQ;

  beforeEach(() => {
    emptyPQ = new PseudoQueue();

    fullPQ = new PseudoQueue();
    fullPQ.enqueue('a');
    fullPQ.enqueue('b');
  })

  it('can create an empty pseudo queue', () => {
    expect(emptyPQ.front.isEmpty()).toEqual(true);
    expect(emptyPQ.back.isEmpty()).toEqual(true);
  });

  it('can enqueue one value', () => {
    emptyPQ.enqueue('test');
    expect(emptyPQ.front.peek()).toEqual('test');
  });

  it('can enqueue multiple values', () => {
    expect(emptyPQ.front.peek()).toEqual('a');
    expect(emptyPQ.front.top.next.value).toEqual('b');
  });

  it('can dequeue one value', () => {
    fullPQ.dequeue();
    expect(fullPQ.front.peek()).toEqual('b');
  });

  it('can dequeue multiple values', () => {
    fullPQ.dequeue();
    fullPQ.dequeue();
    expect(fullPQ.front.isEmpty()).toEqual(true);
    expect(fullPQ.back.isEmpty()).toEqual(true);
  });

});

