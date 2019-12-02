import{Router} from 'express';
import {LocationService} from '../service';

const locationService = new LocationService();
const LocationRouter = Router()
    .get('/locations',async(req,res)=>{
        try{
            const locations = await locationService.getAllLocation();
             res.json(locations);
        }catch(error){
            res.status(error.status).json({message:error.message});
        }
    })
    .get('/location/:idLocation(\\d+)?',async(req,res)=>{
        try{
            const {idLocation} = req.params;
            const location = await locationService.getLocationById(idLocation);
            res.json(location);
        }catch(error){
            res.status(error.status).json({message:error.message});
        }
    })
    .post('/location',async (req,res)=>{
        try{
            let location ={...req.body};
            location = await locationService.saveLocation(location);
             res.status(201).json(location);
        }catch(error){
            res.status(500).json({message:error.message});
        }
    })

export default LocationRouter;    