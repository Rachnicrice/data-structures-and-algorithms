'use strict';

const MultiBracketValidation = require('../Stacks_Queues/MultiBracketValidation.js');

describe('Bracket Validator tests', () => {

  let validator;

  beforeEach(() => {
    validator = new MultiBracketValidation();
  })

  it('Returns true for all matching brackets in order', () => {
    expect(validator.validate('(){}[()]')).toBe(true);
  });

  it('Returns false for non matching brackets', () => {
    expect(validator.validate('({]})')).toBe(false);
  });

  it('Returns true for matching brackets even with extra characters', () => {
    expect(validator.validate('[(This is totally okay{})]')).toBe(true);
  });

  it('Returns false for non matching opening/closing brackets', () => {
    expect(validator.validate('(}')).toBe(false);
  });

  it('Returns false for single bracket', () => {
    expect(validator.validate('{')).toBe(false);
  });

});
