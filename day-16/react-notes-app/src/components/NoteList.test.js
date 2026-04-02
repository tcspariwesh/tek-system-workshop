import { render, screen } from "@testing-library/react";
import NoteList from "./NoteList";
import '@testing-library/jest-dom';
test("renders notes", () => {
  const notes = [
    { id: 1, text: "Note 1" },
    { id: 2, text: "Note 2" }
  ];

  render(<NoteList notes={notes} deleteNote={() => {}} />);

  expect(screen.getByText("Note 1")).toBeInTheDocument();
  expect(screen.getByText("Note 2")).toBeInTheDocument();
});
