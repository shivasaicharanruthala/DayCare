package neu.edu.csye6200.interfaces;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import neu.edu.csye6200.model.Student;
import neu.edu.csye6200.util.FileIO;

public class StudentDataManagement implements DataManagement<Student> {
    @Override
    public List<Student> getDataList() {
        List<Student> students = null;
        try {
            // TODO Auto-generated method stub
            students = FileIO.readFile(Student.class, "student.csv");
        } catch (ParseException ex) {
            Logger.getLogger(StudentDataManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    @Override
    public List<Student> getDataList(String key) {
        return null;
    }

    @Override
    public List<Student> getDataList(int key) {
        List<Student> stus = new ArrayList<>();
        getDataList().forEach(stu -> {
            if (stu.getStuId() == key) stus.add(stu);
        });
        return stus;
    }

    @Override
    public List<Student> getDataList(int min, int max) {
        List<Student> students = new ArrayList<>();
        for (Student s : getDataList()) {
            if (s.getAge() > min && s.getAge() <= max) {
                students.add(s);
            }
        }
        return students;
    }

    @Override
    public List<Student> getDataList(String min, String max) {
        List<Student> stus = new ArrayList<>();
        getDataList().forEach(stu -> {
            if (stu.firstName.compareTo(min) >= 0 && stu.firstName.compareTo(max) <= 0) stus.add(stu);
        });
        return stus;
    }

    @Override
    public void registerOneObject(Student stu) {
        List<Student> stus = new ArrayList<>();
        int maxId = 0;
        List<Student> allStus = getDataList();
        for (Student s : allStus) {
            if (s.getStuId() > maxId) maxId = s.getStuId();
        }
        stu.setStuId(maxId + 1);
        stus.add(stu);
        FileIO.writeFileAppended(stus, "student.csv");
    }

    @Override
    public void updateOneObject(Student student) {
        List<Student> students = new ArrayList<>();
        for (Student s : getDataList()) {
            if (s.getStuId() != student.getStuId()) {
                students.add(s);
            } else {
                students.add(student);
            }
        }
        rewriteData(students);
    }


    @Override
    public void deleteOneObject(Student stu) {
        List<Student> stus = new ArrayList<>();
        getDataList().forEach(s -> {
            if (s.getStuId() != stu.getStuId()) stus.add(s);
        });
        rewriteData(stus);
    }

    @Override
    public void rewriteData(List<Student> list) {
        FileIO.writeFile(list, Student.class, "student.csv");
    }

}
