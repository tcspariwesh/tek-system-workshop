const request = require('supertest');
const app = require('../server');
const { expect } = require('chai');

describe('Notes API', () => {

  it('should create a note', async () => {
    const res = await request(app)
      .post('/notes')
      .send({ title: 'Test', content: 'Hello' });

    expect(res.status).to.equal(201);
    expect(res.body).to.have.property('id');
  });

  it('should fail validation', async () => {
    const res = await request(app)
      .post('/notes')
      .send({ title: '', content: '' });

    expect(res.status).to.equal(400);
  });

  it('should get all notes', async () => {
    const res = await request(app).get('/notes');
    expect(res.status).to.equal(200);
    expect(res.body).to.be.an('array');
  });

});
