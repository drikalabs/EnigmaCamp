import express from 'express';

const app =express();
const port =3001;

let handleRequest =(req,res)=>{
    const {query,params,body} = req; 
 res.json({
     message:` request ${req.method} to ${req.originalUrl} `,
     body,
     params,
     query

});
}
let handleError =(req,res)=>{res.status(404).send(`<h1>There Is noting here</h1> `)}

app.use(express.json());
app.use(express.urlencoded());

app.get('/user',handleRequest)
app.get('/user/:id([0-1]+)',handleRequest)
app.get('/user/:username',handleRequest)
app.get('/post/:category',handleRequest)
app.get('/post/:category/:author',handleRequest)
app.get('/post',handleRequest)
app.get('/train/routes',handleRequest )
app.get('/user/:gender(male|female)',handleRequest)

app.use(handleError)

app.listen(port, () => {
    console.log(`App listening on port ${port}`);
});
