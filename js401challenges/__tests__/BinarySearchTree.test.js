'use strict';

const BinarySearchTree = require('../Trees/BinarySearchTree.js');
const Node = require('../Trees/Node.js');

describe('Binary Search Tree tests', () => {
  let testEmpty;
  let testFull;

  beforeEach(() => {
    testEmpty = new BinarySearchTree();
    testFull = new BinarySearchTree(new Node(9));
  });

  it('can instantiate empty tree', () => {
    expect(testEmpty.root).toBe(null);
  });

  it('can instantiate tree with a root node', () => {
    expect(testFull.root.value).toBe(9);
  });

  it('can add a node to an empty tree', () => {
    testEmpty.add(1);
    expect(testEmpty.root.value).toBe(1);
  });

  it('can add a smaller value than the root', () => {
    testFull.add(8);
    expect(testFull.root.left.value).toBe(8);
  });

  it('can add a larger value than the root', () => {
    testFull.add(10);
    expect(testFull.root.right.value).toBe(9);
  });

  it('contains works when value is at the root', () => {
    expect(testFull.contains(9)).toBe(true);
  });

  it('contains fails when value is not in tree', () => {
    expect(testFull.contains(17)).toBe(false);
  });

});

