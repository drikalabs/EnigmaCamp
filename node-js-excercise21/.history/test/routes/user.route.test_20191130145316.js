import mockRequest from 'supertest';
import {app} from '../../src/app';
import {UserService} from '../../src/service';


let appTest;
let service;
describe('User route',()=>{
    beforeAll(async()=>{
        appTest =await app();
        service =new UserService;
        await service.userRepository().clear();
    })
    beforeEach(async()=>{
        await service.userRepository().clear();
    })

    it('post should create a user', async () => {
        const res = await mockRequest(appTest)
        .post('/user')
        .set('Accept','application/json')
        .send({username : "adrika",email : "adrika@gmail.com", fullname : "adrika Rohman"})
        expect(res.statusCode).toEqual(201);
        expect(res.body).toHaveProperty('id');
        expect(res.body.username).toEqual('adrika');
    })
    it('get/:id shoud return user', async () => {
        let user ={
            username : "adrika",
            email : "adrika@gmail.com",
            fullname : "adrika Rohman"
        }
        let expectedUser ={...await service.create(user)}
        const res = await mockRequest(appTest)
        .get(`/user/${expectedUser.id}`);
        expect(res.statusCode).toEqual(200);
        expect(res.body).toEqual(expectedUser)
    })
    it('get/:id should return throws not found User', async () => {
        const givenId='ytasfd-63rkj-7y73t';
        const expectedError ={message:`User with id ${givenId} Not Found`,status:404}

        const res = await 
    })
})