document.addEventListener('DOMContentLoaded', function() {
    const addNoteButton = document.getElementById('addNoteButton');
    const noteModal = document.getElementById('noteModal');
    const closeButton = document.querySelector('.close-button');
    const noteForm = document.getElementById('noteForm');
    const cancelButton = document.getElementById('cancelButton');
    const notesGrid = document.getElementById('notesGrid');
    const generateTextButton = document.getElementById('generateTextButton');
    const generatedTextModal = document.getElementById('generatedTextModal');
    const generatedTextContent = document.getElementById('generatedTextContent');
    const generatedTextCloseButton = generatedTextModal.querySelector('.close-button');

    addNoteButton.addEventListener('click', function() {
        noteModal.style.display = 'block';
    });

    closeButton.addEventListener('click', function() {
        noteModal.style.display = 'none';
    });

    cancelButton.addEventListener('click', function() {
        noteModal.style.display = 'none';
    });

    noteForm.addEventListener('submit', function(event) {
        event.preventDefault();
        const noteType = document.querySelector('input[name="noteType"]:checked').value;
        const noteTitle = document.getElementById('noteTitle').value;
        const noteObservation = document.getElementById('noteObservation').value;

        addNoteToGrid(noteType, noteTitle, noteObservation);
        noteModal.style.display = 'none';
        noteForm.reset();
    });

    function addNoteToGrid(type, title, observation) {
        const note = document.createElement('div');
        note.classList.add('note', 'bg-gray-100', 'dark:bg-gray-700', 'p-4', 'border', 'border-gray-300', 'dark:border-gray-600', 'rounded', 'relative');
        note.innerHTML = `
            <p><strong>Tipo:</strong> ${type}</p>
            <p><strong>Título:</strong> ${title}</p>
            <p><strong>Observação:</strong> ${observation}</p>
            <button class="edit-button bg-blue-500 text-white px-2 py-1 rounded absolute top-2 right-16">Editar</button>
            <button class="delete-button bg-red-500 text-white px-2 py-1 rounded absolute top-2 right-2">Deletar</button>
        `;

        const editButton = note.querySelector('.edit-button');
        const deleteButton = note.querySelector('.delete-button');

        editButton.addEventListener('click', function() {
            editNoteInGrid(note, type, title, observation);
        });

        deleteButton.addEventListener('click', function() {
            deleteNoteFromGrid(note);
        });

        notesGrid.appendChild(note);
    }

    function deleteNoteFromGrid(note) {
        notesGrid.removeChild(note);
    }

    function editNoteInGrid(note, type, title, observation) {
        document.querySelector(`input[name="noteType"][value="${type}"]`).checked = true;
        document.getElementById('noteTitle').value = title;
        document.getElementById('noteObservation').value = observation;
        noteModal.style.display = 'block';

        deleteNoteFromGrid(note);
    }

    generateTextButton.addEventListener('click', function() {
        let allNotesText = '';
        const notes = notesGrid.querySelectorAll('.note');
        notes.forEach(note => {
            const type = note.querySelector('p:nth-child(1)').textContent.replace('Tipo: ', '');
            const title = note.querySelector('p:nth-child(2)').textContent.replace('Título: ', '');
            const observation = note.querySelector('p:nth-child(3)').textContent.replace('Observação: ', '');
            allNotesText += `**** ${type.toUpperCase()} ****\r\nREF ${title.toUpperCase()}\r\n${observation.replace(' / ', '\r\n').toUpperCase()}\r\n\r\n`;
        });
        generatedTextContent.textContent = allNotesText;
        generatedTextModal.style.display = 'block';
    });

    generatedTextCloseButton.addEventListener('click', function() {
        generatedTextModal.style.display = 'none';
    });
});
