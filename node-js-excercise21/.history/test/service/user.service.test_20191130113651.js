import createDBConnection from '../../src/database/connection';
import {UserService} from '../../src/service';
import {fail,deepEqual,equal} from 'assert';
import configure from '../../src/config';

let connection;
let service;
describe('user Service',()=>{
    beforeAll(async ()=>{
        configure();
        connection = await createDBConnection();
        if(! connection.isConnected) fail('Unable to create database connection');
        service = new UserService();
        await service.userRepository().clear();
    });

    beforeEach(async ()=>{
        await service.userRepository().clear();
    });

    it('create should be able to create a user', async () => {
        const expected ={
            username : "adrika",
            email : "adrika@gmail.com",
            fullname : "adrika Rohman"
        }
        const actual = await service.create(expected);
        equal(expected.username,actual.username)
    });

    it('findById should be able to get a user by id', async () => {
        let expected ={
            username : "adrika",
            email : "adrika@gmail.com",
            fullname : "adrika Rohman",
            post:[]
        } 
        expected = {...await service.create(expected)};
        let actual = await service.findById(expected.id);
        deepEqual(actual,expected)
    });

    it('updateById should be able to update user by id', async () => {
        let oldData ={
            username : "adrika",
            email : "adrika@gmail.com",
            fullname : "adrika Rohman",
            post:[]
        } 
        oldData = {...await service.create(oldData)};
        let newData ={...oldData}
        let actual = await service.updateById(newData);
        let expected =await service.findById(oldData.id)
        deepEqual(actual,expected)
    });
});