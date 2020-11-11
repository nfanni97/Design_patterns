package library;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class NewDB implements BookDatabase {
    private class Book {
        private final String author, title, location;
    
        public Book(String a, String t, String l) {
            author = a;
            title = t;
            location = l;
        }
    }
    ArrayList<Book> entries;

    public NewDB(String filename) {
        entries = new ArrayList<>();
        try(BufferedReader csvReader  = new BufferedReader(new FileReader(filename))) {
            String row;
            while((row = csvReader.readLine()) != null) {
                String[] data = row.split(",");
                entries.add(new Book(data[0],data[1],data[2]));
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<String> searchByAuthor(String author) {
        ArrayList<String> locations = new ArrayList<>();
        for(Book b: entries) {
            if(b.author.equals(author)) {
                locations.add(b.location);
            }
        }
        return locations;
    }

    @Override
    public ArrayList<String> searchByTitle(String title) {
        ArrayList<String> locations = new ArrayList<>();
        for(Book b: entries) {
            if(b.title.equals(title)) {
                locations.add(b.location);
            }
        }
        return locations;
    }
    
}
