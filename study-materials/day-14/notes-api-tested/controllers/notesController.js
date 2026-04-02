const { getNotes, saveNotes } = require('../services/notesService');
const { noteSchema } = require('../validators/noteValidator');

exports.getAllNotes = async (req, res) => {
  const notes = await getNotes();
  res.json(notes);
};

exports.createNote = async (req, res) => {
  const validation = noteSchema.safeParse(req.body);
  if (!validation.success) {
    return res.status(400).json({ error: validation.error.errors });
  }
  const notes = await getNotes();
  const newNote = { id: Date.now(), ...validation.data };
  notes.push(newNote);
  await saveNotes(notes);
  res.status(201).json(newNote);
};
