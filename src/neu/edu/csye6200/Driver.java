package neu.edu.csye6200;

import neu.edu.csye6200.controller.DashboardController;
import neu.edu.csye6200.views.MainJFrame;

public class Driver {
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainJFrame view = new MainJFrame();
                view.setVisible(true);
                DashboardController controller = new DashboardController(view);
            }
        });
    }
    
}
