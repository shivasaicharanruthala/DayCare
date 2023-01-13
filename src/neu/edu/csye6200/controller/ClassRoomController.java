package neu.edu.csye6200.controller;

import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import neu.edu.csye6200.data.DummyData;
import neu.edu.csye6200.interfaces.StudentFactory;
import neu.edu.csye6200.interfaces.TeacherFactory;
import neu.edu.csye6200.model.ClassRoom;
import neu.edu.csye6200.model.Student;
import neu.edu.csye6200.model.Teacher;
import neu.edu.csye6200.views.PanelClassRoom;
import neu.edu.csye6200.views.PanelViewStudent;

public class ClassRoomController {
    private PanelViewStudent viewJPanel;
    private final PanelClassRoom classRoomPanel;

    private static ClassRoomController instance;

    public static ClassRoomController getInstance(PanelClassRoom classRoomPanel) {
        instance = new ClassRoomController(classRoomPanel);
        return instance;
    }

    private ClassRoomController(PanelClassRoom classRoomPanel) {
        this.classRoomPanel = classRoomPanel;
    }

    public void setTableRecords() {
        DefaultTableModel dtm = (DefaultTableModel) classRoomPanel.getTblClassRooms().getModel();
        dtm.setRowCount(0);
        DummyData.getInstance().getRules().stream().map(rule -> {
            Object[] row = new Object[dtm.getColumnCount()];
            if (rule.getMaxAge() == Integer.MAX_VALUE) {
                row[0] = rule.getMinAge() + "- and up";
            } else {
                row[0] = rule.getMinAge() + "-" + rule.getMaxAge();
            }
            row[1] = rule.getGroupSize();
            row[2] = rule.getRatio();
            row[3] = rule.getMaxGroup();
            return row;
        }).forEachOrdered(row -> {
            dtm.addRow(row);
        });
        this.classRoomPanel.getBtnShowDetail().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int selectedRow = classRoomPanel.getTblClassRooms().getSelectedRow();
                if (selectedRow >= 0) {

                    String age = (String) classRoomPanel.getTblClassRooms().getValueAt(selectedRow, 0);
                    String minAge[] = age.split("-");
                    ClassRoom c = getClassRoom(Integer.parseInt(minAge[0]));
                    viewJPanel = new PanelViewStudent(classRoomPanel.getUserProcessControlJPanel());
                    populateTableWithStudents(c);
                    classRoomPanel.getUserProcessControlJPanel().add("ViewStudentJPanel", viewJPanel);
                    CardLayout layout = (CardLayout) classRoomPanel.getUserProcessControlJPanel().getLayout();
                    layout.next(classRoomPanel.getUserProcessControlJPanel());
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a row from table first to view Details!", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    public void populateTableWithStudents(ClassRoom c) {
        DefaultTableModel dtm = (DefaultTableModel) viewJPanel.getTblStudents().getModel();
        dtm.setRowCount(0);
        @SuppressWarnings("unchecked")
        List<Student> students = StudentFactory.getFactoryInstance().getObject().getDataList(c.getMinAge(), c.getMaxAge());
        System.out.println(c.getMinAge() + " " + c.getMaxAge());
        students.stream().map(s -> {
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = s.firstName;
            row[1] = s.lastName;
            row[2] = s.getAge();
            row[3] = s.getStuId();
            return row;
        }).forEachOrdered(row -> {
            dtm.addRow(row);
        });
        populateTeacherRecords(c);
    }

    public void populateTeacherRecords(ClassRoom c) {
        @SuppressWarnings("unchecked")
        List<Teacher> teacher = TeacherFactory.getFactoryInstance().getObject().getDataList(c.getName());

        if (!teacher.isEmpty()) {
            Teacher t = teacher.get(0);
            String pattern = "dd/MM/yyyy";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date = simpleDateFormat.format(t.registerTime);
            System.out.println(t.getClassRoomName());
            viewJPanel.getTextFieldFName().setText(t.getFirstName());
            viewJPanel.getTextFieldLName().setText(t.getLastName());
            viewJPanel.getTextFieldTime().setText(date);
            viewJPanel.getTextFieldId().setText(Integer.toString(t.getTeachID()));
        }
    }

    public ClassRoom getClassRoom(int minAge) {
        for (ClassRoom c : DummyData.getInstance().getClassrooms()) {
            if (minAge == c.getMinAge()) {
                return c;
            }
        }
        return null;
    }
}
