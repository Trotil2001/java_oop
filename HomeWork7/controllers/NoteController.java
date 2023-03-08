package Notes.controllers;

import Notes.model.Repository;
import Notes.model.Note;
import Notes.views.Validation;

import java.util.List;

public class NoteController {
    private final Repository repository;
    private final Validation validator;

    public NoteController(Repository repository, Validation validator)
    {
        this.validator = validator;
        this.repository = repository;
    }

    public void saveNote(Note note) throws Exception {
        validator.validateNote(note);
        repository.CreateNote(note);
    }

    public Note readNote(String noteId) throws Exception {
        List<Note> notes = repository.getAllNotes();
        Note note = noteSearch(noteId, notes);
        return note;
    }

    private static Note noteSearch(String noteId, List<Note> notes) throws Exception{
        for (Note note : notes) {
            if (note.getId().equals(noteId)) {
                return note;
            }
        }
        throw new Exception("Note not found");
    }

    public List<Note> readAllNotes(){
        return repository.getAllNotes();
    }

    public void updateNote(String noteId, Note newNote) throws Exception {
        validator.validateNote(newNote);
        List<Note> notes = repository.getAllNotes();
        Note note = noteSearch(noteId,notes);
        note.setHeaderNote(newNote.getHeaderNote());
        note.setTextNote(newNote.getTextNote());
        note.setDateNote(newNote.getDateNote());
        repository.saveNotes(notes);
    }

    public Note deleteNote(String noteId) throws Exception {
        List<Note> notes = repository.getAllNotes();
        Note note = noteSearch(noteId, notes);
        notes.remove(note);
        repository.saveNotes(notes);
        return note;
    }
}
