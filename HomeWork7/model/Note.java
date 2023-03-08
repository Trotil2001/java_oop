package Notes.model;

public class Note {
    private String id = "";
    private String headerNote;
    private String textNote;
    private String dateNote;

    public Note(String headerNote, String textNote, String dateNote) {
        this.headerNote = headerNote;
        this.textNote = textNote;
        this.dateNote = dateNote;
    }

    public Note(String id, String headerNote, String textNote, String dateNote) {
        this(headerNote, textNote, dateNote);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeaderNote() {
        return headerNote;
    }

    public void setHeaderNote(String headerNote) {
        this.headerNote = headerNote;
    }

    public String getTextNote() {
        return textNote;
    }

    public void setTextNote(String textNote) {
        this.textNote = textNote;
    }

    public String getDateNote() {
        return dateNote;
    }

    public void setDateNote(String dateNote) {
        this.dateNote = dateNote;
    }

    @Override
    public String toString() {
        return String.format("Идентафикатор: %s\nЗаголовок: %s,\nТекст записки: %s,\nДата: %s", id, headerNote, textNote, dateNote);
    }
}
