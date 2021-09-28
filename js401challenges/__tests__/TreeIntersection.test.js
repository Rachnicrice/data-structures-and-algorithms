'use strict';

const treeIntersection = require('../HashTable/TreeIntersection.js');
const Tree = require('../Trees/BinaryTree.js');
const Node = require('../Trees/Node.js');

describe('tree intersection tests', () => {

  let t1;
  let t2;
  let array;

  beforeEach(() => {
    array = [1, 5, 2, 8];

    t1 = new Tree (new Node(1));
    t1.root.left = new Node(5);
    t1.root.right = new Node(2);
    t1.root.left.right = new Node(8);

    t2 = new Tree (new Node(1));
    t2.root.left = new Node(5);
    t2.root.right = new Node(2);
    t2.root.left.right = new Node(8);

  });

  it('will return an array of common values', () => {
    let result = treeIntersection(t1, t2)
    expect(array.sort()).toEqual(result.sort());
  });

  it('will return an  empty array if no common values', () => {
    let t3 = new Tree (new Node(7));
    t3.root.left = new Node(50);
    t3.root.right = new Node(3);

    let result = treeIntersection(t1, t3);
    expect(result).toEqual([]);
  });

  it('will return an  empty array if null trees', () => {
    let result = treeIntersection(new Tree, new Tree);
    expect(result).toEqual([]);

  });

});
