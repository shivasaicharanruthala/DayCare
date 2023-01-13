package neu.edu.csye6200.views;

import javax.swing.JButton;
import javax.swing.JTextField;

public class PanelAddTeacher extends javax.swing.JPanel {
    public PanelAddTeacher() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTeacherFirstName = new javax.swing.JLabel();
        lblTeacherLastName = new javax.swing.JLabel();
        txtTeacherFirstName = new JTextField();
        txtTeacherLastName = new JTextField();
        btnAddTeacher = new JButton();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30,144,255));

        lblTeacherFirstName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblTeacherFirstName.setForeground(new java.awt.Color(251, 243, 228));
        lblTeacherFirstName.setText("First Name");

        lblTeacherLastName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblTeacherLastName.setForeground(new java.awt.Color(251, 243, 228));
        lblTeacherLastName.setText("Last Name:");

        txtTeacherFirstName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N

        btnAddTeacher.setBackground(new java.awt.Color(102, 255, 255));
        btnAddTeacher.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnAddTeacher.setForeground(new java.awt.Color(0, 71, 204));
        btnAddTeacher.setText("Add New Teacher");

        lblTitle.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(251, 243, 228));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("ADD TEACHER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTeacherFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTeacherFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTeacherLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtTeacherLastName)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnAddTeacher)))
                                .addContainerGap(295, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(237, 237, 237))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtTeacherFirstName, txtTeacherLastName});

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblTeacherFirstName)
                                        .addComponent(lblTeacherLastName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTeacherFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTeacherLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(443, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblTeacherFirstName, lblTeacherLastName, txtTeacherFirstName, txtTeacherLastName});

    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnAdd() {
        return btnAddTeacher;
    }

    public void setBtnAdd(JButton btnAdd) {
        this.btnAddTeacher = btnAdd;
    }

    public JTextField getTxtFieldFName() {
        return txtTeacherFirstName;
    }

    public void setTxtFieldFName(JTextField txtFieldFName) {
        this.txtTeacherFirstName = txtFieldFName;
    }

    public JTextField getTxtFieldLName() {
        return txtTeacherLastName;
    }

    public void setTxtFieldLName(JTextField txtFieldLName) {
        this.txtTeacherLastName = txtFieldLName;
    }

    private JButton btnAddTeacher;
    private javax.swing.JLabel lblTeacherFirstName;
    private javax.swing.JLabel lblTeacherLastName;
    private javax.swing.JLabel lblTitle;
    private JTextField txtTeacherFirstName;
    private JTextField txtTeacherLastName;
}
