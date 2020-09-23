import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImplFile implements StudentDao {

    @Override
    public List<Student> getAllStudents() {
        try (BufferedReader reader = new BufferedReader(new FileReader("newMyDB.txt"))) {
            ArrayList<Student> students = new ArrayList<>();
            String row;
            while ((row = reader.readLine()) != null) {
                students.add(studentFromRow(row));
            }
            return students;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void updateStudent(Student s) {
        // TODO
    }

    @Override
    public void deleteStudent(Student s) {
        // create tempfile, read every line from input file and write to tempfile unless
        // it is the record of this student
        File input = new File("newMyDB.txt");
        File temp = new File("temp.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(input));
                BufferedWriter writer = new BufferedWriter(new FileWriter(temp))) {
                    String row;
                    while((row = reader.readLine()) != null) {
                        Student cs = studentFromRow(row);
                        if(!cs.getName().equals(s.getName())) {
                            writer.write(cs.getName()+","+cs.getRollNo());
                            writer.newLine();
                        }
                    }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addStudent(Student s) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("newMyDB.txt", true))) {
            writer.write(s.getName()+","+s.getRollNo());
            writer.newLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Student studentFromRow(String row) {
        String[] data = row.split(",");
        return new Student(Integer.parseInt(data[1]), data[0]);
    }

}
