import mockRequest from 'supertest';
import { app } from '../../src/app';
import {LocationService} from "../../src/service";

let appTest;
let service;

describe('Location route', ()=>{

    beforeAll(async ()=>{
        appTest = await app();
        service = new LocationService();
        await service.locationRepository().clear();
    });
    beforeEach(async ()=>{
        await service.locationRepository().clear();
    });
    afterEach(async()=>{
        await service.locationRepository().clear();
    })
    it('POST:/location should create a location', async ()=>{
        const res = await mockRequest(appTest)
            .post('/location').set('Accept', 'application/json')
            .send({locationName:'LAMPUNG'});
            expect(res.statusCode).toEqual(201);
            expect(res.body).toHaveProperty('idLocation');
            expect(res.body.locationName).toEqual('LAMPUNG')
    });
    it('GET:/location/:idLocation should return a location by idLocation', async ()=>{
        let data = {locationName:'LAMPUNG'};
        let expected = {... await service.saveLocation(data)};
        const res = await mockRequest(appTest)
            .get(`/location/${expected.idLocation}`)
            .set('Accept', 'application/json');
        expect(res.statusCode).toEqual(200);
        expect(res.body).toEqual(expected)
    });
    it('GET:/locations should return all locations', async ()=>{
        let data1 = {locationName:'LAMPUNG'};
        let data2 = {locationName:'SEMARANG'};
        let locations=[{...await service.saveLocation(data1)},{...await service.saveLocation(data2)}];
        const res = await mockRequest(appTest)
            .get(`/locations`)
            .set('Accept', 'application/json');
        expect(res.statusCode).toEqual(200)
        expect(res.body).toEqual(locations);
    });
});