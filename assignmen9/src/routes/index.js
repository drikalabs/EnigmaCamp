import express from 'express';
import LocationRouter from './location.route';
import PackageRouter from './package.route';
import TransitRouter from './transit.router';
export default express.Router()
.use(LocationRouter)
.use(PackageRouter)
.use(TransitRouter)