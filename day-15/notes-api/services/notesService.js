const fs = require('fs').promises;

async function getNotes() {
    const data = await fs.readFile('./data/notes.json', 'utf-8')
    return JSON.parse(data);
}

module.exports = { getNotes };