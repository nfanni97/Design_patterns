import java.util.ArrayList;
import java.util.List;

public class StudentDaoImplMemory extends StudentDao {
    ArrayList<Student> list = new ArrayList<>();
    StudentDaoImplMemory() {
        list.add(new Student(0, "Joe"));
        list.add(new Student(1, "Jane"));

    }
    @Override
    List<Student> getAllStudents() {
        return list;
    }

    @Override
    void updateStudent(Student s) {
        //This doesn't actually do anything, as the same obejct is used everywhere, and we don't need to push back to a database
    }

    @Override
    void deleteStudent(Student s) {
        list.remove(s);
    }

    @Override
    void addStudent(Student s) {
        list.add(s);
    }
}
