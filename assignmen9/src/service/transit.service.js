import {getRepository} from 'typeorm';
import TransitTrack from '../models/transit.model';

class TransitService{
    transitRepository(){
        return getRepository(TransitTrack);
    }


    async saveTransit(transitData){
        return await this.transitRepository().save(transitData);
    }
    async getAllTransitTrack(){
        let transitData = await this.transitRepository().find();
        if(!transitData)throw{message:'No Data Transit Available',status:500};
        return transitData;
    }
    async getTransitTrackById(idTransit){
        let transitData = await this.transitRepository().findOne({where:{idTransit}});
        if(!transitData)throw{message:`Transit with ID ${idTransit} not found`,status:404};
        return transitData;
    }
}
export default TransitService;