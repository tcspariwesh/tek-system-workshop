const { getNotes, saveNotes } = require('../services/notesService');

exports.getAllNotes = async (req, res) => {
  const notes = await getNotes();
  res.json(notes);
};

exports.createNote = async (req, res) => {
  const { title, content } = req.body;

  if (!title || !content) {
    return res.status(400).json({ error: 'Title & content required' });
  }

  const notes = await getNotes();

  const newNote = {
    id: Date.now(),
    title,
    content,
    status: "CREATED"
  };

  notes.push(newNote);
  await saveNotes(notes);

  res.status(201).json(newNote);
};

exports.getNoteById = async (req, res) => {
  const notes = await getNotes();
  const note = notes.find(n => n.id == req.params.id);

  if (!note) res.status(404);

  res.json(note);
};

exports.updateNote = async (req, res) => {
  const notes = await getNotes();

  const note = notes.map(n =>
    n.id == req.params.id ? { ...n, ...req.body } : n);
  await saveNotes(note);
  res.json({ message: 'Updated' });
};

exports.deleteNote = async (req, res) => {
  const notes = await getNotes();
  const filtered = notes.filter(n => n.id != req.params.id);

  await saveNotes(filtered);
  res.json({ message: 'Deleted' });
};
