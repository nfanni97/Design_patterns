import java.util.List;

public interface StudentDao {
    abstract List<Student> getAllStudents();
    abstract void updateStudent(Student s);
    abstract void deleteStudent(Student s);
    abstract void addStudent(Student s);

}
