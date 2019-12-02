import {EntitySchema} from 'typeorm';
import Location from '../../models/mst.location';

const LocationSchema = new EntitySchema({
    name:'Location',
    target:Location,
    tableName:'mst_location',
    columns:{
        idLocation:{
            primary:true,
            type:'int',
            generated:true
        },
        locationName:{
            type:'varchar',
            unique: true,
            nullable:false,
        }
    }
});
export default LocationSchema;