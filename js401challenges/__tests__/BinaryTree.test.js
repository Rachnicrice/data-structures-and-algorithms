'use strict';

const BinaryTree = require('../Trees/BinaryTree.js');
const Node = require('../Trees/Node.js');

describe('Binary Tree tests', () => {

  let testEmpty;
  let testFull;

  beforeEach(() => {
    testEmpty = new BinaryTree();
    testFull = new BinaryTree(new Node(1));
    testFull.root.left = new Node(5);
    testFull.root.right = new Node(2);
    testFull.root.left.right = new Node(8);
  });

  it('can instantiate empty tree', () => {
    expect(testEmpty.root).toBe(null);
  });

  it('can instantiate tree with a root node', () => {
    expect(testFull.root.value).toBe(1);
  });

  it('can perform a pre-order traversal', () => {
    let expected = [1, 5, 8, 2];
    let actual = testFull.preOrder();
    expect(expected).toEqual(actual);
  });

  it('can perform an in-order traversal', () => {
    let expected = [5, 8, 1, 2];
    let actual = testFull.inOrder();
    expect(expected).toEqual(actual);
  });

  it('can perform a post-order traversal', () => {
    let expected = [8, 5, 2, 1];
    let actual = testFull.postOrder();
    expect(expected).toEqual(actual);
  });

  it('throws error when attemp pre-order on empty tree', () => {
    expect(() => {
      testEmpty.preOrder();
    }).toThrow();
  });

  it('throws error when attempt in-order on empty tree', () => {
    expect(() => {
      testEmpty.inOrder();
    }).toThrow();
  });

  it('throws error when attempt post-order on empty tree', () => {
    expect(() => {
      testEmpty.postOrder();
    }).toThrow();
  });

  it('can perform a breadth first traversal', () => {
    let expected = [];
    expected.push(1);
    expected.push(5);
    expected.push(2);
    expected.push(8);
    let actual = testFull.breadthFirst();
    expected(expected).toEqual(actual);
  });


});
