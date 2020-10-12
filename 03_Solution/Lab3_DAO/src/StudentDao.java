import java.util.List;

public abstract class StudentDao {
    abstract List<Student> getAllStudents();
    abstract void updateStudent(Student s);
    abstract void deleteStudent(Student s);
    abstract void addStudent(Student s);

}
