import { useEffect, useState } from "react";
import { fetchNotes, addNoteAPI } from "./api";

function App() {
  const [notes, setNotes] = useState([]);

  useEffect(() => {
    fetchNotes().then(setNotes);
  }, []);

  const addNote = async (text) => {
    const newNote = await addNoteAPI(text);
    setNotes([...notes, newNote]);
  };

  return (
    <div>
      <h1>Notes API App</h1>
      <button onClick={() => addNote("Test Note")}>Add</button>
      <ul>
        {notes.map(n => <li key={n.id}>{n.text}</li>)}
      </ul>
    </div>
  );
}

export default App;
