package neu.edu.csye6200.interfaces;

public class StudentFactory extends AbstractFactory {
    private static StudentFactory factoryInstance = null;
    private static StudentDataManagement studentDataManagement = null;

    private StudentFactory() {
    }

    public static AbstractFactory getFactoryInstance() {
        if (factoryInstance == null) {
            factoryInstance = new StudentFactory();
        }
        return factoryInstance;
    }

    @Override
    public DataManagement getObject() {
        if (studentDataManagement == null)
            studentDataManagement = new StudentDataManagement();
        return studentDataManagement;
    }
}
