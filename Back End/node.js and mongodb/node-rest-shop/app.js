//handling request are easy for us

const express = require('express');//package
const app = express();// to create all kind of utility method
const morgan = require('morgan');
const bodyParser = require('body-parser');

const productRoutes = require('./api/routes/products');
const orderRoutes = require('./api/routes/orders');
const mongoose = require('mongoose');
const mongl='mongodb://localhost/Abhaya';
const userRoutes = require('./api/routes/user');

// //mongoose.connect('mongodb+srv://Lucky:' + process.env.MONGO_ATLAS_PW +'root@lucky-84wkx.mongodb.netnodeapi-qxd1n.mongodb.net. 60 ', //test?retryWrites=true&w=majority
/*mongoose.connect('mongodb://Lucky:' + process.env.MONGO_ATLAS_PW + 'root@nodeapi-shard-00-00-qxd1n.mongodb.net:27017,nodeapi-shard-00-01-qxd1n.mongodb.net:27017,nodeapi-shard-00-01-qxd1n.mongodb.net/database?ssl=true&authSource=admin&replicaSet=NodeAPI-shard-0',
{ 
   useNewUrlParser: true ,
   useUnifiedTopology: true
});*/
mongoose
  .connect(mongl, { useUnifiedTopology: true, useNewUrlParser: true, useCreateIndex: true })
  .then(() => {
    console.log('Connected to database!');
  })
  .catch(error => {
    console.log('Connection failed!');
    console.log(error);
  });

mongoose.Promise = global.Promise;

const connection = mongoose.connection;
connection.once('open', () => {
  console.log('MongoDB database connection established successfully');
});

app.use(morgan('dev'));
app.use('/uploads',express.static('uploads'));
app.use(bodyParser.urlencoded({extended: false}));
app.use(bodyParser.json());

app.use((req, res, next) => {
  res.header('Access-Control-Allow-Origin', '*');
  res.header('Access-Control-Allow-Headers', 'Origin , X-Requested-With, Content-Type,Accept,Authorization');
  if (req.method === 'OPTIONS'){
     res.header('Access-Control-Allow-Methods','PUT','POST','PATCH','DELETE, GET');
     Response.status(200).json({});
  }
  next();
});

// app.use((req, res, next) => {
//    res.status(200).json({            //this whole code ensure that we hold a responce 
//     message: 'It works!'
//    });

// });

//Routes which should handle requests
app.use('/products', productRoutes);
app.use('/orders', orderRoutes);
app.use('/user', userRoutes);

//handel error
app.use((req, res, next) => {
   const error = new Error(' Not found ');
   error.status = 404;
   next(error);
}) 

app.use((error, req, res, next) => {
   res.status(error.status || 500);
   res.json({
      error: {
         message: error.message
      }
   });
});

module.exports = app; 
