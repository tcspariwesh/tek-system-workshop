const express = require('express');
const app = express();
const notesRoutes  = require('./routes/notesRoutes');//mapping between path and functions
// console.log('errrrrrrr##', notesRoutes);

app.use('/notes', notesRoutes); //middleware, global path
app.use(express.json());
app.listen(3001, ()=>{
    console.log('server started');
})
