import java.util.List;
import java.util.Scanner;

public class DaoPatternDemo {

    public static void main(String[] args) {
        AbstractDaoFactory factory;
        System.out.print("1 - Memory database 2 - File database : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        if (input.equals("1"))
            factory = new MemoryDaoFactory();
        else
            factory = new FileDaoFActory();


        StudentDao dao = factory.getStudentDaoImpl();

        dao.addStudent(new Student(3, "Jake"));
        List<Student> students = dao.getAllStudents();
        for (Student s : students) {
            System.out.println(s);
        }

    }


}
