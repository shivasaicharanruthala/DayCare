package neu.edu.csye6200.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import neu.edu.csye6200.interfaces.TeacherFactory;
import neu.edu.csye6200.model.Teacher;
import neu.edu.csye6200.views.PanelTeacher;

public class TeacherController {
    private static TeacherController instance;
    private final PanelTeacher teacherJPanel;

    public static TeacherController getInstance(PanelTeacher teacherJPanel) {
        instance = new TeacherController(teacherJPanel);
        return instance;
    }

    private TeacherController(PanelTeacher teacherJPanel) {
        this.teacherJPanel = teacherJPanel;
    }

    public void setTableRecords() {
        DefaultTableModel dtm = (DefaultTableModel) teacherJPanel.getTblTeacherRecords().getModel();
        dtm.setRowCount(0);
        for (Object teacher : TeacherFactory.getFactoryInstance().getObject().getDataList()) {
            Teacher t = (Teacher) teacher;
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = Integer.toString(t.getTeachID());
            row[1] = t.getFirstName();
            row[2] = t.getLastName();
            row[3] = t.getIsAssigned() ? t.getClassRoomName() : "-";
            dtm.addRow(row);
        }
        teacherJPanel.getBtnDelete().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                deleteTeacher();
            }
        });
        teacherJPanel.getBtnUpdateTeacher().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updateTeacher();
            }
        });
        teacherJPanel.getBtnAddTeacher().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addTeacher();
            }
        });
    }

    @SuppressWarnings("unchecked")
    public void deleteTeacher() {
        int selectedRow = teacherJPanel.getTblTeacherRecords().getSelectedRow();
        if (selectedRow >= 0) {
            String id = (String) teacherJPanel.getTblTeacherRecords().getValueAt(selectedRow, 0);
            @SuppressWarnings("unchecked")
            List<Teacher> teachers = TeacherFactory.getFactoryInstance().getObject().getDataList(Integer.parseInt(id));
            if (!teachers.isEmpty()) {
                Teacher t = teachers.get(0);
                if (!t.getIsAssigned()) {
                    TeacherFactory.getFactoryInstance().getObject().deleteOneObject(t);
                    JOptionPane.showMessageDialog(null, "Deleted Successfully!");
                    setTableRecords();
                } else {
                    JOptionPane.showMessageDialog(null, "You cannot delete a assigned Teacher!", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row from table first to delete!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }

    public void updateTeacher() {
        int selectedRow = teacherJPanel.getTblTeacherRecords().getSelectedRow();
        if (selectedRow >= 0) {
            teacherJPanel.updateTeacherJPanel();
            String id = (String) teacherJPanel.getTblTeacherRecords().getValueAt(selectedRow, 0);
            List<Teacher> teachers = TeacherFactory.getFactoryInstance().getObject().getDataList(Integer.parseInt(id));
            if (!teachers.isEmpty()) {
                Teacher t = teachers.get(0);
                setTeacherRecords(t);
                updateRecord(t);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row from table first to update!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }

    public void setTeacherRecords(Teacher t) {
        teacherJPanel.getUpdateTeacherJPanel().getTxtFieldFName().setText((t.getFirstName()));
        teacherJPanel.getUpdateTeacherJPanel().getTxtFieldLName().setText((t.getLastName()));
        String name = t.getIsAssigned() ? t.getClassRoomName() : "-";
        teacherJPanel.getUpdateTeacherJPanel().getTextFieldClassRoomAssigned().setText(name);
        teacherJPanel.getUpdateTeacherJPanel().getTextFieldTeacherId().setText((Integer.toString(t.getTeachID())));
    }

    public void updateRecord(Teacher t) {
        teacherJPanel.getUpdateTeacherJPanel().getBtnUpdate().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                String fName = teacherJPanel.getUpdateTeacherJPanel().getTxtFieldFName().getText();
                String lName = teacherJPanel.getUpdateTeacherJPanel().getTxtFieldLName().getText();
                if (fName.equals("") || lName.equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter both fields as both are required");
                    return;
                } else {
                    t.setFirstName(fName);
                    t.setLastName(lName);
                    TeacherFactory.getFactoryInstance().getObject().updateOneObject(t);
                    setTeacherRecords(t);
                    JOptionPane.showMessageDialog(null, "Updated Successfully");

                }
            }
        });
    }

    public void addTeacher() {
        teacherJPanel.addTeacherJPanel();
        teacherJPanel.getAddTeacherJPanel().getBtnAdd().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                String fName = teacherJPanel.getAddTeacherJPanel().getTxtFieldFName().getText();
                String lName = teacherJPanel.getAddTeacherJPanel().getTxtFieldLName().getText();
                if (fName.equals("") || lName.equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter both fields, as both are required");
                    return;
                } else {
                    Teacher t = new Teacher(fName, lName, new Date(), 0, false, "");
                    TeacherFactory.getFactoryInstance().getObject().registerOneObject(t);
                    setNewTeacherRecord();
                    JOptionPane.showMessageDialog(null, "Added Successfully");

                }
            }
        });
    }

    public void setNewTeacherRecord() {
        teacherJPanel.getAddTeacherJPanel().getTxtFieldFName().setText("");
        teacherJPanel.getAddTeacherJPanel().getTxtFieldLName().setText("");
    }
}
