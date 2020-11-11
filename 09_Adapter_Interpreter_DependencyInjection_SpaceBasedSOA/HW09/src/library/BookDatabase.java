package library;

import java.util.ArrayList;

public interface BookDatabase {
    public ArrayList<String> searchByAuthor(String author);
    public ArrayList<String> searchByTitle(String title);
}
