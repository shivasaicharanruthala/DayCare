package neu.edu.csye6200.interfaces;

public class ImmunizationFactory extends AbstractFactory {
    private static ImmunizationFactory factoryInstance = null;
    private static ImmunizationDataManagement immunizationDataManagement = null;

    private ImmunizationFactory() {

    }

    public static AbstractFactory getFactoryInstance() {
        if (factoryInstance == null) {
            factoryInstance = new ImmunizationFactory();
        }
        return factoryInstance;
    }

    @Override
    public DataManagement getObject() {
        if (immunizationDataManagement == null)
            immunizationDataManagement = new ImmunizationDataManagement();
        return immunizationDataManagement;
    }
}
    
    

