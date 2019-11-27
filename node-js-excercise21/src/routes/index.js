import express from 'express';
import UserRouter from './user.route'

export  default express.Router()
                .use('/', UserRouter);