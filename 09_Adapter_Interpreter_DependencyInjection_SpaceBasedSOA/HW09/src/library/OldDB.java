package library;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class OldDB {
    private ArrayList<String> entries;

    public OldDB(String filename) {
        entries = new ArrayList<>();
        try(BufferedReader csvReader = new BufferedReader(new FileReader(filename))) {
            String row;
            while((row = csvReader.readLine()) != null) {
                entries.add(row.replace(",", "|"));
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    //returns the whole string!
    public ArrayList<String> searchByAuthor(String author) {
        ArrayList<String> books = new ArrayList<>();
        for(String s: entries) {
            if(s.contains(author+"|")) {
                books.add(s);
            }
        }
        return books;
    }

    public ArrayList<String> searchByTitle(String title) {
        ArrayList<String> books = new ArrayList<>();
        for(String s: entries) {
            if(s.contains("|"+title+"|")) {
                books.add(s);
            }
        }
        return books;
    }
    
}
