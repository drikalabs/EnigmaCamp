import createDBConnection from '../../src/database/connection';
import {LocationService} from '../../src/service';
import {fail,deepEqual,equal} from 'assert';
import configure from '../../src/config';

let connection;
let service;
describe('Location Service', () => {
    beforeAll(async ()=>{
        configure();
        connection = await createDBConnection();
        if(! connection.isConnected)fail('unable to create database Connection');
        service = new LocationService();
        await service.locationRepository().clear();
    });
    
    beforeEach(async ()=>{
        await service.locationRepository().clear();
    })
    afterEach(async()=>{
        await service.locationRepository().clear();
    })
    

    it('saveLocation should be able to save location', async () => {
        const expected ={
            locationName:'SURABAYA'
        }
        const actual = await service.saveLocation(expected);
        equal(actual.locationName,expected.locationName);
    });
    it('getLocationById should be Able to get location', async () => {
        let expected ={
            locationName:'BOGOR'
        }
        expected = {...await service.saveLocation(expected)}
        deepEqual(await service.getLocationById(expected.idLocation),expected)
    })
    it('getAllLocation should return locations', async () => {
        let location1 ={
            locationName:'YOGYAKARTA'
        }
        let location2 ={
            locationName:'BANDUNG'
        }
        let expected =[await service.saveLocation(location1),await service.saveLocation(location2)];
        deepEqual(await service.getAllLocation(),expected);
    })

})