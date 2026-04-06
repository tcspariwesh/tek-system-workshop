import { http, HttpResponse } from 'msw';

let notes = [{ id: 1, text: "Mock Note" }];

export const handlers = [
  http.get('/api/notes', () => HttpResponse.json(notes)),

  http.post('/api/notes', async ({ request }) => {
    const body = await request.json();
    const newNote = { id: Date.now(), text: body.text };
    notes.push(newNote);
    return HttpResponse.json(newNote);
  })
];
