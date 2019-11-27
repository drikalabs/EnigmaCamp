import {getRepository} from 'typeorm';
import User from '../models/user.model';

class UserService{
    userRepository(){
        return getRepository(User);
    }
    async findAll(){
        return await this.userRepository().find();
    }

    async create(user){
        return await this.userRepository().save(user);
    }

    async findOne(id) {
        return await this.userRepository().findOne({where: {id}});
    }
    async delete(id) {
        return await this.userRepository().delete(id);
    }
}

export default UserService;