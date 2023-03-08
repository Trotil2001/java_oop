package Notes;

import Notes.controllers.NoteController;
import Notes.model.FileOperation;
import Notes.model.FileOperationImpl;
import Notes.model.Repository;
import Notes.model.RepositoryFile;
import Notes.views.Validation;
import Notes.views.ViewNote;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("Note.txt");
        Repository repository = new RepositoryFile(fileOperation);
        NoteController controller = new NoteController(repository,new Validation());
        ViewNote view = new ViewNote(controller);
//        Date date = new Date();
        System.out.println("READ, " +
                "CREATE, " +
                "UPDATE, " +
                "LIST, " +
                "DELETE, " +
                "EXIT\n");
        view.run();
    }
}
