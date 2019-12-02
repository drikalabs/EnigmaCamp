import {getRepository} from 'typeorm';
import Post from '../models/post.model';

class PostService{
    postRepository(){
        return getRepository(Post);
    }
    async findAll(){
        return await this.postRepository().find();
    }

    async create(post){
        return await this.postRepository().save(post);
    }

    async findById(id) {
        let data =await this.postRepository().findOne({where:{id}})
        if(!data)throw{message:`User with id ${id} Not Found`,status:404};
        return data;
    }
    async deleteById(id) {
        let data =this.findById(id) 
        this.postRepository().delete(data.id);
        return  {message:`user with ID ${id} Deleted`,status:200}
    }
    async updateById(post){
        let oldDataWillUpdate = this.findById(post.id)
        this.postRepository().merge(oldDataWillUpdate,user)
        return await this.postRepository().save(oldDataWillUpdate)

    }
}

export default UserService;