package neu.edu.csye6200.interfaces;

public class TeacherFactory extends AbstractFactory {
    private static TeacherFactory factoryInstance = null;
    private static TeacherDataManagement teacherDataManagement = null;

    private TeacherFactory() {

    }

    public static AbstractFactory getFactoryInstance() {
        if (factoryInstance == null) {
            factoryInstance = new TeacherFactory();
        }
        return factoryInstance;
    }

    @Override
    public DataManagement getObject() {
        if (teacherDataManagement == null)
            teacherDataManagement = new TeacherDataManagement();
        return teacherDataManagement;
    }

}
