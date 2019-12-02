import mockRequest from 'supertest';
import {app} from '../../src/app';

let appTest;
describe('User route',()=>{
    beforeAll(async()=>{
        appTest =await app();
    })

    it('post should create a user', async () => {
        const res = await mockRequest(appTest.post('/user')
        .set('Accept','application')
        .send({
            username : "adrika",
            email : "adrika@gmail.com",
            fullname : "adrika Rohman"
        })
    )
})