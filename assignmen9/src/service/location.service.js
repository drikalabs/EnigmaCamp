import {getRepository} from 'typeorm';
import Location from '../models/mst.location';

class LocationService{
    locationRepository(){
        return getRepository(Location);
    }

    async getAllLocation(){
        const locations = await this.locationRepository().find();
        if(!locations)throw{message:'No Data Location Available',status:500};
        return locations;
    }
    async saveLocation(location){
        return await this.locationRepository().save(location);
    }
    async getLocationById(idLocation){
        let data = await this.locationRepository().findOne({where:{idLocation}})
        if(!data)throw{message:`Location with ID ${idLocation} not found`,status:404};
        return data
    }
}
export default LocationService;