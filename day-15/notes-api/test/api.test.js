const { describe, it } = require("mocha");
const app = require('../server');
const request  = require("supertest");
const { expect } = require("chai");
describe('GET /notes', () => {

  xit('should return all notes123 ', async () => {
    const res = await request(app).get('/notes/');
    expect(res.status).to.equal(200);
    expect(res.body).to.be.an('array');
  });


  xit('should return 404 for non existent noteID ', async () => {
    const res = await request(app).get('/notes/123');
    expect(res.status).to.equal(404);;
  });
  
  it('test create new note' , async ()=>{
    const res = await request(app).post('/notes/', {title:'task1', content:"this is a note"});
    // console.log(res);
    expect(res.status).to.equal(202);

  })
})