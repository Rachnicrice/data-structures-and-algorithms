'use strict';

function treeIntersection (tree1, tree2) {

  let treeSet = hashTree(tree1.root);

  return findCommonValues(tree2.root, treeSet, []);
}

function hashTree (node, set) {
  if (node !== null) {
    set.add(node.value);
    set = hashTree(node.left, set);
    set = hashTree(node.right, set);
  }

  return set;
}

function findCommonValues (node, set, commonArray) {
  if (node !== null) {
    if (set.has(node.value)) {
      commonArray.push(node.value);
    }

    findCommonValues(node.left, set, commonArray);
    findCommonValues(node.right, set, commonArray);
  }

  return commonArray;
}



module.exports = treeIntersection;
