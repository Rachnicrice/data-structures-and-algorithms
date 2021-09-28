'use strict';

function firstRepeatedWord (input) {

  let set = new Set();
  let words = input.split(' ');

  let repeatedWord = '';

  words.forEach( word => {
    let purifying = word.split(',')[0];
    let pureWord = purifying.split('.')[0].toLowerCase();

    if(set.has(pureWord)) {
      return repeatedWord;
    }

    set.add(pureWord);
  })

  return repeatedWord;

}

module.exports = firstRepeatedWord;
