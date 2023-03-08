package Notes.views;

import Notes.controllers.NoteController;
import Notes.model.Note;

import java.util.List;
import java.util.Scanner;

public class ViewNote {

    private final NoteController noteController;

    public ViewNote(NoteController NoteController) {
        this.noteController = NoteController;
    }

    public void run() {
        Commands com;

        while (true) {
            String command = prompt("Введите команду: ");
            try {
                com = Commands.valueOf(command.toUpperCase());

                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        createNote();
                        break;
                    case READ:
                        readNote();
                        break;
                    case LIST:
                        listNotes();
                        break;
                    case UPDATE:
                        updateNote();
                        break;
                    case DELETE:
                        deleteNote();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void listNotes() {
        List<Note> listNotes = noteController.readAllNotes();
        for (Note Note : listNotes) {
            System.out.println(Note + "\n");
        }
    }

    private void readNote() throws Exception {
        String id = prompt("Идентификатор пользователя: ");
        Note note = noteController.readNote(id);
        System.out.println(note);

    }

    private Note inputNote() {
        String headerNote = prompt("Заголовок: ");
        String textNote = prompt("Текст записки: ");
        String dateNote = prompt("Дата: ");
        return new Note(headerNote, textNote, dateNote);
    }

    private void createNote() throws Exception {
        noteController.saveNote(inputNote());
    }

    private void updateNote() throws Exception {
        String readId = prompt("Введиет редактируемый ID записки: ");
        noteController.updateNote(readId, inputNote());
    }
    private void deleteNote() throws Exception {
        String id = prompt("Введиет удаляемый ID записки: ");
        Note Note = noteController.deleteNote(id);
        System.out.println(Note);
    }


    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
