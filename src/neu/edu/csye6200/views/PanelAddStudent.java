package neu.edu.csye6200.views;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelAddStudent extends JPanel {
    private JPanel  userProcessJPanel;
    private PanelStudent studentJPanel;
    public PanelAddStudent() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new JTextField();
        lblParentName = new javax.swing.JLabel();
        txtParentName = new JTextField();
        lblParentEmail = new javax.swing.JLabel();
        txtParentEmail = new JTextField();
        btnAddStudent = new JButton();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30,144,255));

        lblFirstName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(251, 243, 228));
        lblFirstName.setText("First Name:");

        txtFirstName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N

        lblLastName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(251, 243, 228));
        lblLastName.setText("Last Name:");

        txtLastName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N

        lblAge.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblAge.setForeground(new java.awt.Color(251, 243, 228));
        lblAge.setText("Age:");

        txtAge.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N

        lblParentName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblParentName.setForeground(new java.awt.Color(251, 243, 228));
        lblParentName.setText("Parent Name:");

        txtParentName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        txtParentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParentNameActionPerformed(evt);
            }
        });

        lblParentEmail.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblParentEmail.setForeground(new java.awt.Color(251, 243, 228));
        lblParentEmail.setText("Parent Email");

        txtParentEmail.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        txtParentEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParentEmailActionPerformed(evt);
            }
        });

        btnAddStudent.setBackground(new java.awt.Color(153, 255, 255));
        btnAddStudent.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnAddStudent.setForeground(new java.awt.Color(0, 71, 204));
        btnAddStudent.setText("Add Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(251, 243, 228));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("ADD STUDENT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtFirstName)
                                                        .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(22, 22, 22)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(98, 98, 98)
                                                                .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(txtLastName)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtAge))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(131, 131, 131)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblParentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtParentName))
                                                .addGap(55, 55, 55)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblParentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtParentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(346, 346, 346)
                                .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAge, lblFirstName, lblLastName, lblParentEmail, lblParentName});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAge, txtFirstName, txtLastName, txtParentEmail, txtParentName});

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblAge))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblParentName)
                                        .addComponent(lblParentEmail))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtParentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtParentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnAddStudent)
                                .addContainerGap(321, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAge, lblFirstName, lblLastName, lblParentEmail, lblParentName, txtAge, txtFirstName, txtLastName, txtParentEmail, txtParentName});

    }// </editor-fold>//GEN-END:initComponents

    private void txtParentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParentNameActionPerformed

    }

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
    }

    private void txtParentEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParentEmailActionPerformed

    }

    public JButton getBtnAdd() {
        return btnAddStudent;
    }

    public void setBtnAdd(JButton btnAdd) {
        this.btnAddStudent = btnAdd;
    }

    public JTextField getTxtFieldAge() {
        return txtAge;
    }

    public void setTxtFieldAge(JTextField txtFieldAge) {
        this.txtAge = txtFieldAge;
    }

    public JTextField getTxtFieldFName() {
        return txtFirstName;
    }

    public void setTxtFieldFName(JTextField txtFieldFName) {
        this.txtFirstName = txtFieldFName;
    }

    public JTextField getTxtFieldParentName() {
        return txtParentName;
    }

    public void setTxtFieldParentName(JTextField txtFieldFatherName) {
        this.txtParentName = txtFieldFatherName;
    }

    public JTextField getTxtFieldLName() {
        return txtLastName;
    }

    public void setTxtFieldLName(JTextField txtFieldLName) {
        this.txtLastName = txtFieldLName;
    }

    public JTextField getTxtFieldParentEmail() {
        return txtParentEmail;
    }

    public void setTxtFieldParentEmail(JTextField txtFieldMotherName) {
        this.txtParentEmail = txtFieldMotherName;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnAddStudent;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblParentEmail;
    private javax.swing.JLabel lblParentName;
    private javax.swing.JLabel lblTitle;
    private JTextField txtAge;
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JTextField txtParentEmail;
    private JTextField txtParentName;
}
