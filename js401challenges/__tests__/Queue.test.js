'use strict';

const Queue = require('../Stacks_Queues/Queue.js');

describe('Queue implementaion tests', () => {

  let q;

  beforeEach(() => {
    q = new Queue;
  })

  it('Can successfully enqueue onto a queue', () => {
    q.enqueue('a');
  });

  it('Can successfully enqueue multiple values onto a queue', () => {
    q.enqueue('a');
    q.enqueue('b');
    q.enqueue('c');
  });

  it('Can successfully dequeue off the queue', () => {
    q.enqueue('a');
    let actual = q.dequeue();
    expect(actual.value).toEqual('a');
  });

  it('Can successfully empty a queue after multiple dequeues', () => {
    q.enqueue('a');
    q.enqueue('b');
    q.dequeue();
    q.dequeue();

    expect(q.isEmpty()).toEqual(true);
  });

  it('Can successfully peek the next item on the queue', () => {
    q.enqueue('a');
    expect(q.peek()).toEqual('a');
  });

  it('Can successfully instantiate an empty queue', () => {
    expect(q.isEmpty()).toEqual(true);
  });

  it('Calling dequeue on empty queue raises exception', () => {
    expect(() => {
      q.dequeue();
    }).toThrow();
  });

  it('Calling peek on empty queue raises exception', () => {
    expect(() => {
      q.peek();
    }).toThrow();
  });

})
