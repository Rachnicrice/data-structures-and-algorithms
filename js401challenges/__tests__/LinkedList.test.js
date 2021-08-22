'use strict';

const LinkedList = require('../LinkedList/LinkedList.js');

describe('Linked List Class', () => {

  it('can instantiate empty linked list', () => {
    let list = new LinkedList();
    expect(list.head).toEqual(null);
  });

  it('can add one value to the list', () => {
    let list = new LinkedList();
    list.insert('first');
    expect(list.head.value).toEqual('first');
  });

  it('head node correctly points to the first node in the list', () => {
    let list = new LinkedList()
    list.insert('a');
    list.insert('b');
    expect(list.head.value).toEqual('b');
  });

  it('can insert multiple nodes into a linked lisr', () => {
    let list = new LinkedList()
    list.insert('a');
    list.insert('b');
    expect(list.head.value).toEqual('b');
    expect(list.head.next.value).toEqual('a');
  });

  it('can turn linked list into a sting containing all values', () => {
    let list = new LinkedList();
    list.insert('z');
    list.insert('w');
    list.insert('x');

    let expected = '{x} -> {w} -> {z} -> NULL';

    expect(expected).toEqual(list.toString());
  });

  it('returns true when value is in linked list', () => {
    let list = new LinkedList();
    list.insert('z');
    list.insert('w');
    list.insert('x');

    expect(list.includes('w')).toEqual(true);
  });

  it('returns false when value is not in the linked list', () => {
    let list = new LinkedList();
    list.insert('z');
    list.insert('w');
    list.insert('x');

    expect(list.includes('a')).toEqual(false);
  })
})
