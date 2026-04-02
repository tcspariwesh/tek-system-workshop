const express = require('express');
const app = express();
const notesRoutes = require('./routes/notesRoutes');

app.use(express.json());
app.use('/notes', notesRoutes);

module.exports = app;
