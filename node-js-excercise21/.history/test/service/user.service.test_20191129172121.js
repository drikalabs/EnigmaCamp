import createDBConnection from '../../src/database/connection';
import {UserService} from '../../src/service';
import {fail,deepStricEqual,equal} from 'assert';

let connection;
let service;
describe('user Service',()=>{
    beforeAll(async ()=>{
        connection = await createDBConnection();
        if(! connection.isConnected()) fail('Unable to create database connection');
        service = new UserService();
        await service.userRepository().query('SET FOREIGN_KEY_CHECKS=0');
        await service.userRepository().clear();
        await service.userRepository().query('SET FOREIGN_KEY_CHECKS=1');
    });
    it('create should be able to create a user', async () => {
        const expected ={
            username : "",
            email : "",
            fullname : ""
        }
        const actual = await service.create(expected);
        equal(actual.username,expected.username)
    })
});