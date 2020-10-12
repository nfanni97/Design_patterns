public class FileDaoFActory extends AbstractDaoFactory {
    @Override
    StudentDao getStudentDaoImpl() {
        return new StudentDaoImplFile();
    }
}
