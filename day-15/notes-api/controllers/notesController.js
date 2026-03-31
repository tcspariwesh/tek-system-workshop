const service = require('../services/notesService')

exports.getAllNotes = async (request, response) =>{
    const notes = await service.getNotes();
    
    response.json(notes);
    // console.log(request.method);
    // console.log(request.headers);
}

exports.getNoteById= async (request, response) => {
    // request
}