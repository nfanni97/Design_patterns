import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImplFile extends StudentDao {
    ArrayList<Student> list = new ArrayList<>();
    StudentDaoImplFile() {
        readFile();
        if (list.isEmpty()) {
            list.add(new Student(0, "Joe"));
            list.add(new Student(1, "Jane"));
        }
    }

    static String fname = "myDB.txt";

    protected void writeFile() {
        try {
            FileOutputStream f = new FileOutputStream(new File(fname));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(list);
            o.close();
            f.close();


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

    protected void readFile() {
        try(FileInputStream fi = new FileInputStream(new File(fname));
            ObjectInputStream oi = new ObjectInputStream(fi);) {

            // Read objects
            list = (ArrayList<Student>) oi.readObject();


        } catch (FileNotFoundException e) {
            System.out.println("File not found - creating empty database");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    List<Student> getAllStudents() {
        return list;
    }

    @Override
    void updateStudent(Student s) {
        writeFile();
    }

    @Override
    void deleteStudent(Student s) {
        list.remove(s);
        writeFile();
    }

    @Override
    void addStudent(Student s) {
        list.add(s);
        writeFile();
    }
}
