let todos = JSON.parse(localStorage.getItem('todos')) || [];
const errorDiv = document.getElementById('error');

function saveTodos() {
    localStorage.setItem('todos', JSON.stringify(todos));
}
function sort() {
    todos.sort((e1, e2) => {
        return e1.text.localeCompare(e2.text);
    })
    console.log(todos);
    renderTodos();
}
function validate() { //event handler
    errorDiv.style.display = (event.target.value.trim() !== '') ? 'none' : 'inline';
}
function renderTodos() {
    const list = document.getElementById('todo-list');
    list.innerHTML = '';

    todos.forEach((todo, index) => {
        const li = document.createElement('li');
        if (todo.completed) li.classList.add('completed');

        li.innerHTML = `
        <span>${todo.text}</span>
        <div class="actions">
          <button class="complete" onclick="toggleComplete(${index})">✔</button>
          <button onclick="deleteTodo(${index})">✖</button>
        </div>
      `;

        list.appendChild(li);
    });
}

function addTodo() {
    const input = document.getElementById('todo-input');
    const text = input.value.trim();

    if (text === '') return;

    todos.push({ text, completed: false });
    input.value = '';

    saveTodos();
    renderTodos();
}

function deleteTodo(index) {
    todos.splice(index, 1);
    saveTodos();
    renderTodos();
}

function toggleComplete(index) {
    todos[index].completed = !todos[index].completed;
    saveTodos();
    renderTodos();
}

// Initial render
renderTodos();