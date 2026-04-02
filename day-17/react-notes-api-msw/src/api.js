export async function fetchNotes() {
  const res = await fetch('/api/notes');
  return res.json();
}

export async function addNoteAPI(text) {
  const res = await fetch('/api/notes', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ text })
  });
  return res.json();
}
