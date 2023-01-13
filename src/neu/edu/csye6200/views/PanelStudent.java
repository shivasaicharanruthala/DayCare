package neu.edu.csye6200.views;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class PanelStudent extends JPanel {
    private PanelUpdateStudent updateStudentJPanel;
    private PanelAddStudent addStudentJPanel;
    private JPanel userProcessControllerJPanel;
    public PanelStudent(JPanel userProcessControllerJPanel) {
        initComponents();
        this.userProcessControllerJPanel = userProcessControllerJPanel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        lblStudentId = new javax.swing.JLabel();
        txtStudentId = new JTextField();
        btnUpdate = new JToggleButton();
        btnAddNewStudent = new JButton();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30,144,255));

        lblStudentId.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblStudentId.setForeground(new java.awt.Color(251, 243, 228));
        lblStudentId.setText("Student Id:");

        txtStudentId.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N

        btnUpdate.setBackground(new java.awt.Color(102, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 71, 204));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAddNewStudent.setBackground(new java.awt.Color(102, 255, 255));
        btnAddNewStudent.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnAddNewStudent.setForeground(new java.awt.Color(0, 71, 204));
        btnAddNewStudent.setText("Add New Student");
        btnAddNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewStudentActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(251, 243, 228));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("STUDENT INFO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(lblStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddNewStudent)
                                .addContainerGap(26, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblStudentId)
                                        .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnUpdate)
                                        .addComponent(btnAddNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(398, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddNewStudent, btnUpdate, lblStudentId, txtStudentId});

    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnAddNewStudentActionPerformed(java.awt.event.ActionEvent evt) {

    }
    public void updateStudent(){
        updateStudentJPanel = new PanelUpdateStudent(userProcessControllerJPanel);
        userProcessControllerJPanel.add("UpdateStudentJPanel",updateStudentJPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
    }
    public void addStudent(){
        addStudentJPanel = new PanelAddStudent();
        userProcessControllerJPanel.add("addStudentJPanel",addStudentJPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
    }
    public JTextField getTxtFieldStudentId() {
        return txtStudentId;
    }

    public void setTxtFieldStudentId(JTextField txtFieldStudentId) {
        this.txtStudentId = txtFieldStudentId;
    }

    public JToggleButton getUpdateStudentBtn() {
        return btnUpdate;
    }

    public void setUpdateStudentBtn(JToggleButton updateStudentBtn) {
        this.btnUpdate = updateStudentBtn;
    }

    public PanelUpdateStudent getUpdateStudentJPanel() {
        return updateStudentJPanel;
    }

    public void setUpdateStudentJPanel(PanelUpdateStudent updateStudentJPanel) {
        this.updateStudentJPanel = updateStudentJPanel;
    }

    public JPanel getUserProcessControllerJPanel() {
        return userProcessControllerJPanel;
    }

    public void setUserProcessControllerJPanel(JPanel userProcessControllerJPanel) {
        this.userProcessControllerJPanel = userProcessControllerJPanel;
    }

    public JButton getBtnAddStudent() {
        return btnAddNewStudent;
    }

    public PanelAddStudent getAddStudentJPanel() {
        return addStudentJPanel;
    }

    private JButton btnAddNewStudent;
    private JToggleButton btnUpdate;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblStudentId;
    private javax.swing.JLabel lblTitle;
    private JTextField txtStudentId;
}
