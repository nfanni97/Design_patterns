package library;

import java.util.ArrayList;

public class OldDBAdapter implements BookDatabase {
    private OldDB oldDB;

    public OldDBAdapter(OldDB o) {
        oldDB = o;
    }

    @Override
    public ArrayList<String> searchByAuthor(String author) {
        ArrayList<String> returnedIndexes = oldDB.searchByAuthor(author);
        ArrayList<String> locations = new ArrayList<>();
        for(String s: returnedIndexes) {
            String[] data = s.split("\\|");
            locations.add(data[2]);
        }
        return locations;
    }

    @Override
    public ArrayList<String> searchByTitle(String title) {
        ArrayList<String> returnedIndexes = oldDB.searchByTitle(title);
        ArrayList<String> locations = new ArrayList<>();
        for(String s: returnedIndexes) {
            locations.add(s.split("\\|")[2]);
        }
        return locations;
    }
    
}
