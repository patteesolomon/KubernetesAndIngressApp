require('dotenv').config();
const cors = require('cors');
const express = require('express');
const mongoose = require('mongoose');
//const pg = require('pg');
const methodOverride = require('method-override');
const db = mongoose.connection;
const app = express();
// C
// controllers
const routerc = require('./Controllers/Command.js');
//

// models
const command = require('./models/Command.js');

//ops

const uri = process.env.MONGO_URI;
const port = process.env.PORT || 3001;

mongoose.connect(uri);

// Error/ disconnect
db.on('error', err => console.log(err.message + ' is Mongod not running?'));
db.on('disconnected', () => console.log('mongo disconnected'));

// Middleware
app.use(methodOverride("_method"));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(express.static('public'));
app.use(cors());

//route

app.use('/cmds', routerc);

const seedCommands = [];

app.get('/', (req, res) => {
    res.send(`Kubernetes commands GUI`);
});

app.get('/seed', async (req, res) => {
    await command.deleteMany({});
    await command.insertMany(seedCommands);
    res.send('done!');
});

app.get('/cmds', async (req, res) => {
    res.json(await command.find({}));
});
// Route to get pods at default
app.get('/pods', async (req, res) => {
    const pods = await getPods();
    res.json(pods);
});

app.get('/pods/getAll', async (req, res) => {
    const pods = await getPods();
    res.json(pods);
});


app.listen(port, () => {
    console.log(`Listening on port ${port}`);
})

