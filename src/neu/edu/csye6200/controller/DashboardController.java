
package neu.edu.csye6200.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import neu.edu.csye6200.views.MainJFrame;

public class DashboardController {
    private final MainJFrame view;
    private ClassRoomController classController;
    private StudentController studentController;
    private TeacherController teacherController;
    private ImmRulesController immRulesController;

    public DashboardController(MainJFrame view) {
        this.view = view;
        code();

    }

    public MainJFrame getView() {
        return view;
    }

    private void code() {
        this.view.getAdminBtn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                view.classRoomJPanel();
                classController = ClassRoomController.getInstance(view.getClassRoomJPanel());
                ClassRoomController.getInstance(view.getClassRoomJPanel()).setTableRecords();


            }
        });
        this.view.getStudentBtn1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                view.studentJPanel();
                studentController = StudentController.getInstance(view.getStudentJPanel());

            }
        });
        this.view.getTeacherBtn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                view.teacherJPanel();
                teacherController = TeacherController.getInstance(view.getTeacherJPanel());
                teacherController.setTableRecords();
            }
        });

        this.view.getImmRulesBtn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                view.immRulesJPanel();
                immRulesController = ImmRulesController.getInstance(view.getImmRulesJPanel());
            }
        });
    }
}
