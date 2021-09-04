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

}

module.exports = BinaryTree;
