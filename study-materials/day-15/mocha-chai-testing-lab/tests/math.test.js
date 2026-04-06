const { expect } = require('chai');
const { add, multiply } = require('../src/math');

describe('Math Functions (Fix the Bugs)', () => {

  it('should add numbers correctly', () => {
    expect(add(2, 3)).to.equal(6); // ❌ wrong expected
  });

  it('should multiply numbers correctly', () => {
    expect(multiply(2, 3)).to.equal(5); // ❌ wrong expected
  });

  it('should handle negative numbers', () => {
    expect(add(-2, -3)).to.equal(-4); // ❌ wrong expected
  });

  it('should return a number', () => {
    expect(add(2, 3)).to.be.a('string'); // ❌ wrong type
  });

  it('async test example', (done) => {
    setTimeout(() => {
      expect(add(1,1)).to.equal(3); // ❌ wrong
      done();
    }, 100);
  });

});
