import {EntitySchema} from 'typeorm';
import Packages from '../../models/packages';

const PackagesSchema = new EntitySchema({
    name:'Packages',
    target:Packages,
    tableName:'packages',
    columns:{
        idPackage:{
            primary:true,
            type:'uuid',
            generated:'uuid'
        },
        ownerPackage:{
            type:'varchar',
            nullable:false
        },
        weight:{
            type:'int',
            nullable:false
        },
        price:{
            type:'int',
            nullable:false
        }
    },
    relations:{
        packageFrom:{
            target:'Location',
            type:'many-to-one',
            nullable:false,
            eager:true
        },
        packageDestination:{
            target:'Location',
            type:'many-to-one',
            nullable:false,
            eager:true
        },
        transit:{
            target: 'TransitTrack',
            type: 'one-to-many',
            inverseSide: 'package',
            joinColumn: true,
            cascade: true,
            eager: false
        }
    }
});
export default PackagesSchema;