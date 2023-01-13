package neu.edu.csye6200.views;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import neu.edu.csye6200.controller.DashboardController;

public class MainJFrame extends javax.swing.JFrame {
    private PanelStudent studentJPanel;
    private PanelTeacher teacherJPanel;
    private PanelAdmin adminJPanel;
    private PanelClassRoom classRoomJPanel;
    private PanelImmRules immRulesJPanel;

    public MainJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new JPanel();
        containerJPanel = new JPanel();
        splitPane = new javax.swing.JSplitPane();
        userProcessControllerJPanel = new JPanel();
        controlJPanel = new JPanel();
        jPanel2 = new JPanel();
        lblMainTitle = new javax.swing.JLabel();
        btnAdmin = new JButton();
        btnStudent = new JButton();
        btnTeacher = new JButton();
        immRulesBtn = new JButton();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        containerJPanel.setBackground(new java.awt.Color(255, 255, 255));
        containerJPanel.setSize(new java.awt.Dimension(900, 600));

        splitPane.setDividerLocation(150);
        splitPane.setDividerSize(0);
        splitPane.setMinimumSize(new java.awt.Dimension(800, 25));

        userProcessControllerJPanel.setBackground(new java.awt.Color(30,144,255));
        userProcessControllerJPanel.setLayout(new CardLayout());

        controlJPanel.setBackground(new java.awt.Color(30,144,255));

        javax.swing.GroupLayout controlJPanelLayout = new javax.swing.GroupLayout(controlJPanel);
        controlJPanel.setLayout(controlJPanelLayout);
        controlJPanelLayout.setHorizontalGroup(
                controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 899, Short.MAX_VALUE)
        );
        controlJPanelLayout.setVerticalGroup(
                controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 692, Short.MAX_VALUE)
        );

        userProcessControllerJPanel.add(controlJPanel, "card2");

        splitPane.setRightComponent(userProcessControllerJPanel);

        lblMainTitle.setFont(new java.awt.Font("Charter", 1, 24));
        lblMainTitle.setForeground(new java.awt.Color(0, 71, 204));
        lblMainTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainTitle.setText("DAY CARE");

        btnAdmin.setFont(new java.awt.Font("Charter", 1, 14));
        btnAdmin.setForeground(new java.awt.Color(0, 71, 204));
        btnAdmin.setText("Administrator");
        btnAdmin.setToolTipText("Student");
        btnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnStudent.setFont(new java.awt.Font("Charter", 1, 14));
        btnStudent.setForeground(new java.awt.Color(0, 71, 204));
        btnStudent.setText("Student");
        btnStudent.setToolTipText("Student");
        btnStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnStudent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        btnTeacher.setFont(new java.awt.Font("Charter", 1, 14));
        btnTeacher.setForeground(new java.awt.Color(0, 71, 204));
        btnTeacher.setText("Teacher");
        btnTeacher.setToolTipText("teacher");
        btnTeacher.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTeacher.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        immRulesBtn.setFont(new java.awt.Font("Charter", 1, 14));
        immRulesBtn.setForeground(new java.awt.Color(0, 71, 204));
        immRulesBtn.setText("Immunization Rules");
        immRulesBtn.setToolTipText("teacher");
        immRulesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        immRulesBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        immRulesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                immRulesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblMainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAdmin)
                                .addGap(18, 18, 18)
                                .addComponent(btnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(immRulesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnAdmin)
                                                .addComponent(btnStudent)
                                                .addComponent(btnTeacher)
                                                .addComponent(immRulesBtn))
                                        .addComponent(lblMainTitle))
                                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[]{btnStudent, btnTeacher});

        javax.swing.GroupLayout containerJPanelLayout = new javax.swing.GroupLayout(containerJPanel);
        containerJPanel.setLayout(containerJPanelLayout);
        containerJPanelLayout.setHorizontalGroup(
                containerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(containerJPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(containerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        containerJPanelLayout.setVerticalGroup(
                containerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerJPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(containerJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(containerJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed

    }

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
    }

    private void immRulesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_immRulesBtnActionPerformed
    }

    public void classRoomJPanel() {
        classRoomJPanel = new PanelClassRoom(userProcessControllerJPanel);
        userProcessControllerJPanel.add("classRoomJPanel", classRoomJPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
    }

    public void studentJPanel() {
        studentJPanel = new PanelStudent(userProcessControllerJPanel);
        userProcessControllerJPanel.add("studentJPanel", studentJPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
    }

    public void teacherJPanel() {
        teacherJPanel = new PanelTeacher(userProcessControllerJPanel);
        userProcessControllerJPanel.add("teacherJPanel", teacherJPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
    }

    public void immRulesJPanel() {
        immRulesJPanel = new PanelImmRules(userProcessControllerJPanel);
        userProcessControllerJPanel.add("immRulesJPanel", immRulesJPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
    }

    public JButton getAdminBtn() {
        return btnAdmin;
    }

    public JButton getStudentBtn1() {
        return btnStudent;
    }

    public JButton getTeacherBtn() {
        return btnTeacher;
    }

    public JButton getImmRulesBtn() {
        return immRulesBtn;
    }

    public void setStudentJPanel(PanelStudent studentJPanel) {
        this.studentJPanel = studentJPanel;
    }

    public void setTeacherJPanel(PanelTeacher teacherJPanel) {
        this.teacherJPanel = teacherJPanel;
    }

    public void setImmRulesJPanel(PanelImmRules immRulesJPanel) {
        this.immRulesJPanel = immRulesJPanel;
    }

    public PanelStudent getStudentJPanel() {
        return studentJPanel;
    }

    public PanelTeacher getTeacherJPanel() {
        return teacherJPanel;
    }

    public PanelImmRules getImmRulesJPanel() {
        return immRulesJPanel;
    }

    public JPanel getUserProcessControllerJPanel() {
        return userProcessControllerJPanel;
    }

    public PanelAdmin getAdminJPanel() {
        return adminJPanel;
    }

    public void setAdminJPanel(PanelAdmin adminJPanel) {
        this.adminJPanel = adminJPanel;
    }

    public PanelClassRoom getClassRoomJPanel() {
        return classRoomJPanel;
    }

    public void setClassRoomJPanel(PanelClassRoom classRoomJPanel) {
        this.classRoomJPanel = classRoomJPanel;
    }

    private JButton btnAdmin;
    private JButton btnStudent;
    private JButton btnTeacher;
    private JPanel containerJPanel;
    private JPanel controlJPanel;
    private JButton immRulesBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private javax.swing.JLabel lblMainTitle;
    private javax.swing.JSplitPane splitPane;
    private JPanel userProcessControllerJPanel;
}
