import{Router} from 'express';
import {PackageService} from '../service';

const packageService = new PackageService();
const PackageRouter = Router()
    .get('/packages',async(req,res)=>{
        try{
            const packages = await packageService.getAllPackages();
             res.json(packages);
        }catch(error){
            res.status(error.status).json({message:error.message});
        }
    })
    .get('/package/:idPackage([0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12})',async(req,res)=>{
        try{
            const {idPackage} = req.params;
            const packageData = await packageService.getPackageById(idPackage);
            res.json(packageData);
        }catch(error){
            res.status(error.status).json({message:error.message});
        }
    })
    .post('/package',async (req,res)=>{
        try{
            let packageData ={...req.body};
            packageData = await packageService.savePackage(packageData);
             res.status(201).json(packageData);
        }catch(error){
            res.status(500).json({message:error.message});
        }
    })

export default PackageRouter;    