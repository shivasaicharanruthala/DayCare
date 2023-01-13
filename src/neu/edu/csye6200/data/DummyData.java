package neu.edu.csye6200.data;

import java.util.ArrayList;
import java.util.List;
import neu.edu.csye6200.model.*;

public class DummyData {
    private static DummyData dataStore;
    private List<RatioRules> rules;
    private List<ClassRoom> classrooms;

    private DummyData(){
        rulesAdd();
        classRoomAdd();
    }

    private void rulesAdd(){
        rules = new ArrayList<>();
        rules.add(new RatioRules(6,12,4,"4:1",3));
        rules.add(new RatioRules(13,24,5,"5:1",3));
        rules.add(new RatioRules(25,35,6,"6:1",3));
        rules.add(new RatioRules(36,47,8,"8:1",3));
        rules.add(new RatioRules(48,59,12,"12:1",2));
        rules.add(new RatioRules(60,Integer.MAX_VALUE,15,"15:1",2));  
    }
    private void classRoomAdd(){
        classrooms = new ArrayList<>();
        classrooms.add(new ClassRoom("Class 1",12,6,12));
        classrooms.add(new ClassRoom("Class 2",24,13,15));
        classrooms.add(new ClassRoom("Class 3",35,25,18));
        classrooms.add(new ClassRoom("Class 4",47,36,24));
        classrooms.add(new ClassRoom("Class 5",59,48,24));
        classrooms.add(new ClassRoom("Class 6",Integer.MAX_VALUE,60,30)); 
    }
    public static DummyData getInstance() {
	if(dataStore == null)
            dataStore = new DummyData();
        return dataStore;
    }
    public List<RatioRules> getRules() {
        return rules;
    }

    public void setRules(List<RatioRules> rules) {
        this.rules = rules;
    }

    public List<ClassRoom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(List<ClassRoom> classrooms) {
        this.classrooms = classrooms;
    }
}
