import createDBConnection from '../../src/database/connection';
import {UserService} from '../../src/service';
import {fail,deepStricEqual,equal} from 'assert';
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
    it('create should be able to create a user', async () => {
        const expected ={
            username : "",
            email : "",
            fullname : ""
        }
        const actual = await service.create(expected);
        equal(expected.username,actual.username)
    });
    it('FindById should be able to get a user', async () => {
        const expected ={
            username : "",
            email : "",
            fullname : ""
        }
        const actual = await service.create(expected);
        equal(expected.username,actual.username)
    });
});