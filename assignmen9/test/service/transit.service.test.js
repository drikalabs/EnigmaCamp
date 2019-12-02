import createDBConnection from '../../src/database/connection';
import {LocationService} from '../../src/service';
import {PackageService} from '../../src/service';
import {TransitService} from '../../src/service';
import {fail,deepEqual,equal} from 'assert';
import configure from '../../src/config';

let connection;
let servicePackage;
let serviceLocation;
let serviceTransit;
describe('Package Service', () => {
    beforeAll(async ()=>{
        configure();
        connection = await createDBConnection();
        if(! connection.isConnected)fail('unable to create database Connection');
        servicePackage = new PackageService();
        serviceLocation = new LocationService();
        serviceTransit = new TransitService();
        await serviceTransit.transitRepository().clear();
        await servicePackage.packageRepository().clear();
        await serviceLocation.locationRepository().clear();
    });

    beforeEach(async ()=>{
        await serviceTransit.transitRepository().clear();
        await servicePackage.packageRepository().clear();
        await serviceLocation.locationRepository().clear();
    })
    afterEach(async()=>{
        await serviceTransit.transitRepository().clear();
        await servicePackage.packageRepository().clear();
        await serviceLocation.locationRepository().clear();
    })


    it('saveTransit should be able to save Transit', async () => {
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
        packageData = await servicePackage.savePackage(packageData);
        let transitData ={
            package:packageData.idPackage,
            location:location1.idLocation
        }
        transitData =await serviceTransit.saveTransit(transitData);
        deepEqual(transitData.package,transitData.package);
    });
    it('getAllTransitTrack should be able to return Transits', async () => {
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
        packageData = await servicePackage.savePackage(packageData);
        let transitData ={
            package:packageData.idPackage,
            location:location1.idLocation
        }
        await serviceTransit.saveTransit(transitData);
        let actual = await serviceTransit.getAllTransitTrack();
        deepEqual(actual.length,1);
    });
    it('getTransitTrackById should be able to return idTransit', async () => {
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
        packageData = await servicePackage.savePackage(packageData);
        let transitData ={
            package:packageData.idPackage,
            location:location1.idLocation
        }
        transitData = await serviceTransit.saveTransit(transitData);
        let actual = await serviceTransit.getTransitTrackById(transitData.idTransit);
        deepEqual(actual.idTransit,transitData.idTransit);
    });
})