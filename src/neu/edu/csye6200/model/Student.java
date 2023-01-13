package neu.edu.csye6200.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends Person {
    private int stuId;
    private int age;
    private String parentName;
    private String parentEmail;
    private List<Immunization> immunizations;

    public Student() {

    }

    public Student(String firstName, String lastName, Date registerTime, int stuId, int age, String parentName, String parentEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registerTime = registerTime;
        this.stuId = stuId;
        this.age = age;
        this.parentName = parentName;
        this.parentEmail = parentEmail;
        immunizations = new ArrayList<>();

    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public List<Immunization> getImmunizations() {
        return immunizations;
    }

    public void setImmunizations(List<Immunization> immunizations) {
        this.immunizations = immunizations;
    }

    public String toString() {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(registerTime);
        return firstName + "," + lastName + "," + date + "," + stuId + "," + age + "," + parentName + "," + parentEmail;
    }

}
