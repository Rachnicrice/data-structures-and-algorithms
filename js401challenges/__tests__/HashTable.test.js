'use strict';

const HashTable = require('../HashTable/HashTable.js');

describe('Hash Table implementation test', () => {

  let ht;

  beforeEach(() => {
    ht = new HashTable(16);
  })

  it('can add something to the hashtable', () => {
    ht.add('nutella', 'is good');
    let result = ht.contains('nutella');

    expect(result).toBe(true);
  })

  it('will return false if not contained in the hashtable', () => {
    let result = ht.contains('nutella');
    expect(result).toBe(false);
  })

  it('will return null if you try to get from an empty hashtable', () => {
    let result = ht.get('nutella');
    expect(result).toBe(null);
  })

  it('can handle a collision', () => {
    ht.add('Sean', 'my husbandaru');
    ht.add('Saen', 'some weirdo');

    let sean = ht.contains('Sean');
    let saen = ht.contains('Saen')

    expect(sean).toBe(true);
    expect(saen).toBe(true);
  })

  it('can hash a thing', () => {
    let hash = ht.hash('random string');
    expect(hash).toBeLessThan(ht.map.length);
  })

});
