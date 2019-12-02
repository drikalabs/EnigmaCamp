import createDBConnection from '../../src/database/connection';
import {LocationService} from '../../src/service';
import {PackageService} from '../../src/service';
import {fail,deepEqual,equal} from 'assert';
import configure from '../../src/config';

let connection;
let servicePackage;
let serviceLocation;
describe('Package Service', () => {
    beforeAll(async ()=>{
        configure();
        connection = await createDBConnection();
        if(! connection.isConnected)fail('unable to create database Connection');
        servicePackage = new PackageService();
        serviceLocation = new LocationService();
        await servicePackage.packageRepository().clear();
        await serviceLocation.locationRepository().clear();
    });
    
    beforeEach(async ()=>{
        await servicePackage.packageRepository().clear();
        await serviceLocation.locationRepository().clear();
    })
    afterEach(async()=>{
        await servicePackage.packageRepository().clear();
        await serviceLocation.locationRepository().clear();
    })


    it('savePackage should be able to save Package', async () => {
        let location1 ={
            locationName:'SURABAYA'
        }
        let location2 ={
            locationName:'BANDUNG'
        }
        location1 = await serviceLocation.saveLocation(location1)
        location2 = await serviceLocation.saveLocation(location2)
        let packageData ={
            ownerPackage:'bily',
            packageFrom:location1.idLocation,
            packageDestination:location2.idLocation,
            weight:1,
            price:20000
        }
        const actual = await servicePackage.savePackage(packageData);
        equal(actual.ownerPackage,packageData.ownerPackage);
    });
    it('getAllPackage should be able to return packages', async () => {
        let location1 ={
            locationName:'SURABAYA'
        }
        let location2 ={
            locationName:'BANDUNG'
        }
        location1 = await serviceLocation.saveLocation(location1)
        location2 = await serviceLocation.saveLocation(location2)
        let packageData ={
            ownerPackage:'bily',
            packageFrom:location1.idLocation,
            packageDestination:location2.idLocation,
            weight:1,
            price:20000
        }
        await servicePackage.savePackage(packageData)
        let data =await servicePackage.getAllPackages()
        deepEqual(data.length,1);
    })
    it('getPackageById should be able to return package id', async () => {
        let location1 ={
            locationName:'SURABAYA'
        }
        let location2 ={
            locationName:'BANDUNG'
        }
        location1 = await serviceLocation.saveLocation(location1)
        location2 = await serviceLocation.saveLocation(location2)
        let packageData ={
            ownerPackage:'bily',
            packageFrom:location1.idLocation,
            packageDestination:location2.idLocation,
            weight:1,
            price:20000
        }
        packageData = await servicePackage.savePackage(packageData)
        let actual =await servicePackage.getPackageById(packageData.idPackage)
        deepEqual(actual.idPackage,packageData.idPackage);
    })
})