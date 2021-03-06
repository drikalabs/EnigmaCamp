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

    async findById(id) {
        let data =await this.userRepository().findOne({where:{id}})
        if(!data)throw{message:`User with id ${id} Not Found`,status:404};
        return data;
    }
    async findByUsername(username) {
        let data = await this.userRepository().findOne({where: {username}});
        if(!data)throw{ message: `User With Username ${username} not found. `,status:404}
        return data;
    }
    async findByEmail(email) {
        let data = await this.userRepository().findOne({where: {email}});
        if(!data)throw{ message: `User With Email ${email} not found. `,status:404}
        return data;
    }
    async deleteById(id) {
        let data =this.findById(id) 
        this.userRepository().delete({where:data.id});
        return  {message:`user with ID ${id} Deleted`,status:200}
    }
    async updateById(user){
        let oldDataWillUpdate = this.findById(user.id)
        this.userRepository().merge(oldDataWillUpdate,user)
        return await this.userRepository().save(oldDataWillUpdate)

    }
}

export default UserService;