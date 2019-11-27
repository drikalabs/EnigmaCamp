import{Router} from 'express';
import{UserService} from '../service';

const userService = new UserService();
const UserRouter = Router()
    
    .get('/users', async(req, res) =>{
        try{
            const users = await userService.findAll();
            res.json(users);
        } catch (error) {
            res.status(500).json({ message: error.message});
        }
    })
    .post('/user', async (req, res) =>{
        try {
            let user = {...req.body};
            user = await userService.create(user);

            res.status(201).json(user);
        } catch(error) {
            res.status(500).json({ message: error.message});
        }
    })
    .get('/user/:id', async (req,res) =>{
        try {
            const {id} = req.params;
            const user = await userService.findOne(id);

            if(user) res.json(user);
            else res.status(404).json({ message: `User ID ${id} not found. `});
        } catch(error) {
            res.status(500).json({ message: error.message});
        }
    })
    .put('/user', async (req, res) =>{
        try {
            let user = {...req.body};
            user = await userService.create(user);

            res.status(201).json(user);
        } catch(error) {
            res.status(500).json({ message: error.message});
        }
    })
    .delete('/user/:id', async (req,res) =>{
        try {
            const {id} = req.params;
            userService.delete(id)

            if(res.status(200)) res.json({message:`user with ID ${id} deleted`});
            else res.status(404).json({ message: `User ID ${id} not found. `});
        } catch(error) {
            res.status(500).json({ message: error.message});
        }
    })
    
export default UserRouter;