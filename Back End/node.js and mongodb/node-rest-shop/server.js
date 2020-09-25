const http = require('http'); 
const app = require('./app');

const port= process.env.PORT || 3000;//this is use to injecting the environment to the port

const server = http.createServer(app);//server is created

server.listen(port); //listen the value of port mention above