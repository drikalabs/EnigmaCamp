import {getRepository, getConnection, L} from 'typeorm';
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
        return await this.userRepository().delete(data);
    }
    async updateById(user){
        let userToUpdate = await this.findById(user.id)
        this.userRepository().merge(userToUpdate,user)
        return await this.userRepository().save(userToUpdate);
    }
    async findByCriteria(criteria){
        let data = await this.userRepository().find(wh)
        .createQueryBuilder('users')
        .where(`users.username like '%${criteria.username}%' || users.email like '%${criteria.email}%' || users.fullname like '%${criteria.fullname}%'`)
        .getMany();
        return data;
    }
}

export default UserService;