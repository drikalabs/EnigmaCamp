import {EntitySchema} from 'typeorm';
import Post from '../../models/post.model';

const PostSchema = new EntitySchema({
    name:'post',
    target: Post,
    tableName:'post',
    columns:{
        id:{
            primary: true,
            type: "uuid",
            generated: "uuid"
        },
        title:{
            type:'varchar',
            nullable:false
        },
        content:{
            type:'text',
            nullable:false
        },
        createdAt:{
            name:'created_at',
            type:,
            nullable:false,
            default:()=>'CURRENT_TIMESTAMP'
        },
        updateAt:{
            name:'update_at',
            type:'timestamp',
            nullable:false,
            default:()=>'CURRENT_TIMESTAMP'
        } 
    },
    relations:{
        author:{
            target:'User',
            type: 'many-to-one',
            joinColumn:true,
            eager:false
        },
    }
});
export default PostSchema;