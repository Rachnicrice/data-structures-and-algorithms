'use strict';

const AnimalShelter = require('../Stacks_Queues/AnimalShelter.js');

describe('testing animal shelter', () => {

  let emptyShelter;
  let fullShelter;

  beforeEach(() => {
    emptyShelter = new AnimalShelter();

    fullShelter = new AnimalShelter();
    fullShelter.enqueue('cat');
    fullShelter.enqueue('dog');
    fullShelter.enqueue('dog');
    fullShelter.enqueue('cat');
    fullShelter.enqueue('dog');
  })

  it('can instantiate an empty shelter', () => {
    expect(emptyShelter.oldest).toBe(null);
    expect(emptyShelter.newest).toBe(null);
  });

  it('can add one animal to a shelter', () => {
    emptyShelter.enqueue('dog');

    expect(emptyShelter.oldest.value).toBe('dog');
    expect(emptyShelter.newest.value).toBe('dog');
  });

  it('can add many animals to a shelter', () => {
    expect(fullShelter.oldest.value).toBe('cat');
    expect(fullShelter.newest.value).toBe('dog');
    expect(fullShelter.oldest.next.value).toBe('dog');
    expect(fullShelter.oldest.next.next.value).toBe('dog');
    expect(fullShelter.oldest.next.next.next.value).toBe('cat');
  });

  it('cannot adopt from an empty shelter', () => {
    expect(() => {
      emptyShelter.dequeue('dog');
    }).toThrow()
  });

  it('cannot adopt an animal other than a cat or dog from the shelter', () => {
    expect(() => {
      fullShelter.dequeue('unicorn');
    }).toThrow()
  });

  it('can adpot when the wanted type of animal is at the front of the queue', () => {
    console.log('###########################', fullShelter.oldest);
    expect(fullShelter.dequeue('cat')).toBe('cat');
  });

  it('can adpot when the wanted type of animal is not at the front of the queue', () => {
    expect(fullShelter.dequeue('dog')).toBe('dog');
  });

  it('can dequeue different types of animals in any order', () => {
    expect(fullShelter.dequeue('cat')).toBe('cat');
    expect(fullShelter.dequeue('cat')).toBe('cat');

    expect(fullShelter.dequeue('dog')).toBe('dog');
    expect(fullShelter.dequeue('dog')).toBe('dog');
    expect(fullShelter.dequeue('dog')).toBe('dog');

    expect(fullShelter.oldest).toBe(null);
    expect(fullShelter.newest).toBe(null);
  });

  it('can dequeue different types of animals in the order added', () => {
    expect(fullShelter.dequeue('cat')).toBe('cat');
    expect(fullShelter.dequeue('dog')).toBe('dog');
    expect(fullShelter.dequeue('dog')).toBe('dog');

    expect(fullShelter.dequeue('cat')).toBe('cat');
    expect(fullShelter.dequeue('dog')).toBe('dog');

    expect(fullShelter.oldest).toBe(null);
    expect(fullShelter.newest).toBe(null);
  });



});
