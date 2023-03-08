package Notes.model;

public class NoteMapper {
    public String map(Note user) {
        return String.format("%s,%s,%s,%s", user.getId(), user.getHeaderNote(), user.getTextNote(), user.getDateNote());
    }

    public Note map(String line) {
        String[] lines = line.split(",");
        return new Note(lines[0], lines[1], lines[2], lines[3]);
    }
}
