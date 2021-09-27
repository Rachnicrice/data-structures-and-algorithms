'use strict';

const firstRepeatedWord = require('../HashTable/RepeatedWord');

describe('testing repeated word function', () => {

  it('can return the first repeated word in a short string', () => {
    let result = firstRepeatedWord('One penny, two penny.');
    expect(result).toEqual('penny');
  })

  it('can return the first repeated word in a long string', () => {
    let result = firstRepeatedWord('It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...');

    expect(result).toEqual('it');
  })

  it('will return an empty string if there is no repeated word', () => {
    let result = firstRepeatedWord('Hi, my name is Fred.');
    expect(result).toEqual('');
  })

});
