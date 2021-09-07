'use strict';

class BinaryTree {

  constructor (root = null) {
    this.root = root;
  }

  preOrder () {
    if (this.root === null) throw new Error('Cannot traverse empty tree');
    return this.preOrderHelper(this.root);
  }

  preOrderHelper (node) {
    let values = [];
    if (node !== null) {
      values.push(node.value);
      values.push(this.preOrderHelper(node.left));
      values.push(this.preOrderHelper(node.right));
    }
    return values;
  }

  inOrder () {
    if (this.root === null) throw new Error('Cannot traverse empty tree');
    return this.inOrderHelper(this.root);
  }

  inOrderHelper (node) {
    let values = [];
    if (node !== null) {
      values.push(this.preOrderHelper(node.left));
      values.push(node.value);
      values.push(this.preOrderHelper(node.right));
    }
  }

  postOrder () {
    if (this.root === null) throw new Error('Cannot traverse empty tree');
    return this.postOrderHelper(this.root);
  }

  postOrderHelper (node) {
    let values = [];
    if (node !== null) {
      values.push(this.preOrderHelper(node.left));
      values.push(this.preOrderHelper(node.right));
      values.push(node.value);
    }
  }

  breadthFirst() {
    let answers = [];
    let q = [];
    let currentNode = this.root;
    q.push(currentNode);

    while (q[0] !== null) {
      if (currentNode.left !== null) {
        q.push(currentNode.left);
      }

      if (currentNode.right !== null) {
        q.push(currentNode.right);
      }

      answers.push(q.shift().value);
      currentNode = q[0];
    }

    return answers;
  }

  findMax() {
    if (this.root === null) throw new Error('Cannot find max on an empty tree');
    let max = Number.MIN_VALUE;
    return this.findMaxHelper(max, this.root);
  }

  findMaxHelper (max, node) {
    if (node !== null) {
      if (node.value > max) {
        max = node.value;
      }
      max = this.findMaxHelper(max, node.left);
      max = this.findMaxHelper(max, node.right);
    }
    return max;
  }

}

module.exports = BinaryTree;
