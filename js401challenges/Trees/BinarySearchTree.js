'use strict';

const BinaryTree = require('./BinaryTree.js');

class BinarySearchTree extends BinaryTree {

  constructor (root = null) {
    super(root);
  }

  add (value) {
    return this.root = this.addHelper(value, this.root);
  }

  addHelper (value, root) {
    if (root === null) {
      return new Node(value);
    } else {

      if (value < root.value) {
        root.left = this.addHelper(value, root.left);
      } else if (value > root.value) {
        root.right = this.addHelper(value, root.right);
      } else {
        throw new Error('Value already exists in the code401challenges.tree');
      }
    }
    return root;
  }

  contains (value) {
    return this.containsHelper(value, this.root);
  }

  containsHelper (value, node) {
    if (node === null) {
      return false;
    } else {
      if (value === node.value) {
        return true;
      } else if (value < node.value) {
        return this.containsHelper(value, node.left);
      } else {
        return this.containsHelper(value, node.right);
      }
    }
  }

}

module.exports = BinarySearchTree;
