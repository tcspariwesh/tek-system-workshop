import { render, screen, fireEvent } from "@testing-library/react";
import App from "./App";

test("fetches notes", async () => {
  render(<App />);
  expect(await screen.findByText("Mock Note")).toBeInTheDocument();
});

test("adds note", async () => {
  render(<App />);
  fireEvent.click(screen.getByText("Add"));
  expect(await screen.findByText("Test Note")).toBeInTheDocument();
});
