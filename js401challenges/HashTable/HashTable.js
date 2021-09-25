'use strict';

let LinkedList = require('../LinkedList/LinkedList.js');

class HashTable {

  constructor (size) {
    this.size = size;
    this.map = new Array(size).fill();
  }

  hash(key) {
    let chars = key.split('');
    return chars.reduce((p, character) => {
      return p + character.charCodeAt(0);
    }, 0) * 599 % this.size;
  }

  add (key, value) {
    let hashCode = this.hash(key);

    if (!this.map[hashCode]) {
      this.map[hashCode] = new LinkedList();
    }

    let entry = { [key]: value };
    this.map[hashCode].add(entry);
  }

  get (key) {
    let hashCode = this.hash(key);
    if (!this.map[hashCode]) { return null; }

    let current = this.map[hashCode].head;
    while (current) {
      let data = current.value;
      if (data[key]) { return data[key]; }
      current = current.next;
    }

    return null;
  }

  contains (key) {
    let hashCode = this.hash(key);
    if (!this.map[hashCode]) { return false; }

    let current = this.map[hashCode].head;
    while (current) {
      let data = current.value;
      if (data[key]) { return true; }
      current = current.next;
    }

    return false;
  }

}

module.exports = HashTable;
