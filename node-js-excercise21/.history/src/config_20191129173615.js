import dotenv from "dotenv";
import {dirname,resolve} from 'path';
export default function configure(){
    if(process.env.NODE_ENV ==='test'){
        dotenv.config({path:resolve()})
    }
    dotenv.config();
    if(!process.env.APP_NAME){
        console.error(`Environment filr(.env) cannot be found in the root folders,copy .env.example to .env`);
        process.exit(1);
    }
    process.env.BASE_PATH= dirname(resolve('index.js'));
}