import {getRepository} from 'typeorm';
import Packages from '../models/packages';
import {LocationService} from '../service';

class PackageService{
    packageRepository(){
        return getRepository(Packages);
    }

    async savePackage(packageData){
        return await this.packageRepository().save(packageData);
    }
    async getAllPackages(){
        let packages = await this.packageRepository().find();
        if(!packages)throw{message:'No Data Package Available',status:500};
        return packages;
    }
    async getPackageById(idPackage){
        let packageData = await this.packageRepository().findOne({where:{idPackage}});
        if(!packageData)throw{message:`Package with ID ${idPackage} not found`,status:404};
        return packageData;
    }
}
export default PackageService;