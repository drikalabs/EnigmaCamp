import {EntitySchema} from 'typeorm';
import TransitTrack from '../../models/transit.model';

const TransitTrackSchema = new EntitySchema({
    name:'TransitTrack',
    target:TransitTrack,
    tableName:'transit',
    columns:{
        idTransit:{
            primary:true,
            type:'uuid',
            generated:'uuid'
        },
        dateCome:{
            type:'date',
            nullable:false,
            default:()=>'CURRENT_TIMESTAMP'
        }
    },
    relations:{
        location:{
            target:'Location',
            type:'many-to-one',
            eager:true
        },
        package:{
            target:'Packages',
            type:'many-to-one',
            nullable:false,
            eager:true
        }
    }

})
export default TransitTrackSchema;