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
  });

  it('can append a value', () => {
    let list = new LinkedList()
    list.insert('a');
    list.append('b');
    expect(list.head.value).toEqual('a');
  });

  it('can append multiple values', () => {
    let list = new LinkedList()
    list.insert('a');
    list.append('b');
    list.append('c')
    expect(list.head.value).toEqual('a');
    expect(list.head.next.value).toEqual('b');
  });

  it('can insert a node before a node in the middle of a linked list', () => {
    let list = new LinkedList();
    list.insert('z');
    list.insert('w');
    list.insert('x');
    list.insertBefore('w', 'a');

    expect(list.head.next.value).toEqual('a');
  });

  it('can insert a node before the head of a linked list', () => {
    let list = new LinkedList();
    list.insert('z');
    list.insert('w');
    list.insert('x');
    list.insertBefore('x', 'a');

    expect(list.head.value).toEqual('a');
  });

  it('can inert a node after a node in the middle of a linked list', () => {
    let list = new LinkedList();
    list.insert('z');
    list.insert('w');
    list.insert('x');
    list.insertAfter('w', 'a');

    expect(list.head.next.next.value).toEqual('a');
  });

  it('can insert a node after the last node in a linked list', () => {
    let list = new LinkedList();
    list.insert('z');
    list.insert('w');
    list.insert('x');
    list.insertAfter('a');

    expect(list.head.next.next.next.value).toEqual('a');
  });

  it('can return a node when k is greater than the length of the list', () => {
    let list = new LinkedList();
    list.insert('a');
    list.append('c');
    let kth = list.llKthFromEnd(3);

    expect(kth).toEqual('a');
  });

  it('can return a node when k is equal to the length of the list', () => {
    let list = new LinkedList();
    list.insert('a');
    list.append('c');
    let kth = list.llKthFromEnd(2);

    expect(kth).toEqual('c');
  });

  it('can return a node when k is a negative number', () => {
    let list = new LinkedList();
    list.insert('a');
    list.append('c');
    let kth = list.llKthFromEnd(-1);

    expect(kth).toEqual('a');
  });

  it('can return a node when the linked list has only one node', () => {
    let list = new LinkedList();
    list.insert('a');
    let kth = list.llKthFromEnd(4);

    expect(kth).toEqual('a');
  });

  it('can return a node when k is in the middle of the linked list', () => {
    let list = new LinkedList();
    list.insert('a');
    list.append('b');
    list.append('c');
    let kth = list.llKthFromEnd(1);

    expect(kth).toEqual('b');
  });

})
