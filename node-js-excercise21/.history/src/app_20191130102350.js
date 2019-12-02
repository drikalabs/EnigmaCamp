import express from 'express';
import AppRouter from './routes';
import createDBConnection from './database/connection';
import configure from './config';
import middleware from './middlewares/app-middlewares';
export async function app() {
    configure();
    try {
        const connection = await createDBConnection();
        const app = express();
        if (connection.isConnected) {
            console.log(`Connected to ${process.env.DB_DRIVER} on port ${process.env.APP_PORT}`)
            // app.use(middleware);
            app.use(AppRouter);
        } else {
            throw new Error(`Connectiion failed to ${process.env.DB_HOST}`)
        }
        return app;
    } catch (error) {
        throw error;
    }
}