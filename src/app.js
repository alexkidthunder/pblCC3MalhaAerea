// Chamada do Express
const express = require('express');
const mongoose = require('mongoose');
require('dotenv').config();

// Instancia da aplicação na constante app
const app = express();

// Database
mongoose.connect(process.env.DATABASE_CONNECTION_STRING, {
    useUnifiedTopology: true,
    useFindAndModify: true,
    useNewUrlParser: true,
    useCreateIndex: true
});

const db = mongoose.connection;

db.on('connected', () => {
    console.log('Mongoose default connection is open');
});

db.on('error', err => {
    console.log(`Mongoose default connection has occured \n${err}`);
});

db.on('disconnected', () => {
    console.log('Mongoose default connection is disconnected');
});

process.on('SIGINT', () => {
    db.close(() => {
        console.log(
            'Mongoose default connection is disconnected due to application termination'
        );
        process.exit(0);
    });
});

// Load saturacao
const paciente = require('./models/paciente');

// Carregar na rota
const indexRoutes = require('./routes/index-routes');
app.use('/', indexRoutes);

//chamada para a nossa nova rota
const mentionsRoutes = require('./routes/paciente-routes');
app.use('/mentions', mentionsRoutes);

module.exports = app;