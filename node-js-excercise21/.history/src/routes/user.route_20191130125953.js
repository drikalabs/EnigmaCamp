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
    .post("/user", async (req, res) =>{
        try {
            let user = {...req.body};
            user = await userService.create(user);

            res.status(201).json(user);
        } catch(error) {
            res.status(500).json({ message: error.message});
        }
    })
    .get('/user/:id([0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12})', async (req,res) =>{
        try {
            const {id} = req.params;
            const user = await userService.findById(id);
            res.json(user);
        } catch(error) {
            res.status(error.status).json({ message: error.message});
        }
    })
    .get("/user/:username", async (req,res) =>{
        try {
            const {username} = req.params;
            const user = await userService.findByUsername(username);

            res.json(user);
        } catch(error) {
            res.status(error.status).json({ message: error.message});
        }
    })
    .get('/user/:email(^\S+@\S+$)?', async (req,res) =>{
        try {
            const {email} = req.params;
            const user = await userService.findByEmail(email);

            res.json(user);
        } catch(error) {
            res.status(error.status).json({ message: error.message});
        }
    })
    .delete('/user/:id', async (req,res) =>{
        try {
            const {id} = req.params;
            let data =await userService.deleteById(id);
             res.json({ message:data.message});
        } catch(error) {
            res.status(error.status).json({ message: error.message});
        }
    })
    .put("/user", async (req, res) =>{
        try {
            let user = {...req.body};
            let updatedUser = await userService.updateById(user);

            res.status(201).json(user);
        } catch(error) {
            res.status(error.status).json({ message: error.message});
        }
    })
export default UserRouter;