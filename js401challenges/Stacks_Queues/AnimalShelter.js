'use strict';

const Node = require('./Node.js')

class AnimalShelter {

  constructor(){
    this.oldest = null;
    this.newest = null;
  }

  enqueue (animal) {
    let node = new Node(animal);
    if (this.oldest === null) {
      this.oldest = node;
    } else if (this.oldest === this.newest){
      this.oldest.next = node;
    } else {
      this.newest.next = node;
    }
    this.newest = node;
  }

  dequeue (wantedAnimal) {
    console.log('inside dequeue', this.oldest);
    let adopted = this.findAnimal(wantedAnimal, this.oldest, this.oldest);
    return adopted.value;
  }

  findAnimal (wantedAnimal, node, lastAnimal) {
    if (node === null) {
      throw new Error('We don\'t currently have that animal in our shelter');
    }

    if (!node.animal === 'cat' && !node.animal === 'dog') {
      throw new Error('Sorry we are only adopting cats and dogs right now');
    } else if (node.animal === wantedAnimal) {
      if (node === this.oldest && node === this.newest) {
        this.oldest = node.next;
        this.newest = node.next;
      } else if (node === this.oldest) {
        this.oldest = node.next;
      }
      lastAnimal.next = node.next;
      return node;
    } else {
      lastAnimal = node;
      return this.findAnimal(wantedAnimal, lastAnimal.next, lastAnimal);
    }
  }

}

module.exports = AnimalShelter;
