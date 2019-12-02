import{Router} from 'express';
import {TransitService} from '../service';

const transitService = new TransitService();
const TransitRouter = Router()
    .get('/transits',async(req,res)=>{
        try{
            const transitData = await transitService.getAllTransitTrack();
             res.json(transitData);
        }catch(error){
            res.status(error.status).json({message:error.message});
        }
    })
    .get('/transit/:idTransit([0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12})',async(req,res)=>{
        try{
            const {idTransit} = req.params;
            const transitData = await transitService.getTransitTrackById(idTransit);
            res.json(transitData);
        }catch(error){
            res.status(error.status).json({message:error.message});
        }
    })
    .post('/transit',async (req,res)=>{
        try{
            let transitData ={...req.body};
            transitData = await transitService.saveTransit(transitData);
             res.status(201).json(transitData);
        }catch(error){
            res.status(500).json({message:error.message});
        }
    })

export default TransitRouter;    