import java.util.ArrayList;
import java.util.List;

public class StudentDaoImplMemory implements StudentDao {
    private ArrayList<Student> db = new ArrayList<>();

    @Override
    public List<Student> getAllStudents() {
        return db;
    }

    @Override
    public void updateStudent(Student s) {
        //TODO
    }

    @Override
    public void deleteStudent(Student s) {
        db.remove(s);
    }

    @Override
    public void addStudent(Student s) {
        db.add(s);
    }
    
}
