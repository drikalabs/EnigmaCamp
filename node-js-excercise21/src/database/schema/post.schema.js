import {EntitySchema} from 'typeorm';
import Post from '../../models/post.model'

const PostSchema = new EntitySchema({
    name:'post',
    target:Post,
    tableName:'post',
    columns:{
        id:{
            primary: true,
            type: 'varchar',
            generated: 'uuid',
        },
        title:{

        },
        content:{

        },
        author:{

        },
        createdAt:{

        },
        updateAt:{

        }
    }
});
export default PostSchema;