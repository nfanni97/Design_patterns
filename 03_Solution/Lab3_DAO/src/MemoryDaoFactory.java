public class MemoryDaoFactory extends AbstractDaoFactory {
    @Override
    StudentDao getStudentDaoImpl() {
        return new StudentDaoImplMemory();
    }
}
