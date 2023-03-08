package Notes.views;

import Notes.model.Note;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    Pattern headerNotePattern = Pattern.compile("^.$");
    Pattern datePattern = Pattern.compile("^(0?[1-9]|[12][0-9]|3[01]).(0?[1-9]|1[012]).((19|20)\\d\\d)$");

    public void validateNote(Note inputNote) throws Exception {
        Matcher headerMatcher = headerNotePattern.matcher(inputNote.getHeaderNote());
        Matcher textNoteMatcher = headerNotePattern.matcher(inputNote.getHeaderNote());
        Matcher dateMatcher = datePattern.matcher(inputNote.getDateNote());
        if (!headerMatcher.find()) {
            throw new Exception("Заголовок не должно быть пустым!");
        }
        if (!textNoteMatcher.find()) {
            throw new Exception("Текст записки не должен быть пустым!");
        }

        if (!dateMatcher.find()) {
            throw new Exception("Недопустимый формат даты!");
        }
    }
}