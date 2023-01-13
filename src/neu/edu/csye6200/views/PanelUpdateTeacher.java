package neu.edu.csye6200.views;

import javax.swing.JButton;
import javax.swing.JTextField;

public class PanelUpdateTeacher extends javax.swing.JPanel {
    public PanelUpdateTeacher() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblClassRoomAssigned = new javax.swing.JLabel();
        lblTeacherId = new javax.swing.JLabel();
        txtFirstName = new JTextField();
        txtLastName = new JTextField();
        txtClassRoomAssigned = new JTextField();
        txtTeacherId = new JTextField();
        btnUpdateTeacher = new JButton();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30,144,255));

        lblFirstName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(251, 243, 228));
        lblFirstName.setText("First Name");

        lblLastName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(251, 243, 228));
        lblLastName.setText("Last Name:");

        lblClassRoomAssigned.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblClassRoomAssigned.setForeground(new java.awt.Color(251, 243, 228));
        lblClassRoomAssigned.setText("Class Room Assigned:");

        lblTeacherId.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblTeacherId.setForeground(new java.awt.Color(251, 243, 228));
        lblTeacherId.setText("Teacher Id:");

        txtFirstName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N

        txtLastName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        txtClassRoomAssigned.setEditable(false);
        txtClassRoomAssigned.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N

        txtTeacherId.setEditable(false);
        txtTeacherId.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        txtTeacherId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeacherIdActionPerformed(evt);
            }
        });

        btnUpdateTeacher.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnUpdateTeacher.setForeground(new java.awt.Color(0, 71, 204));
        btnUpdateTeacher.setText("Update");

        lblTitle.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(251, 243, 228));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("UPDATE TEACHER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(lblTeacherId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(19, Short.MAX_VALUE)
                                                .addComponent(txtTeacherId)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtFirstName))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                        .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtClassRoomAssigned)
                                        .addComponent(lblClassRoomAssigned, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(53, 53, 53))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(19, 19, 19))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(345, 345, 345)
                                .addComponent(btnUpdateTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[]{lblClassRoomAssigned, lblFirstName, lblLastName, lblTeacherId});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[]{txtClassRoomAssigned, txtFirstName, txtLastName, txtTeacherId});

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblFirstName)
                                        .addComponent(lblLastName)
                                        .addComponent(lblClassRoomAssigned, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTeacherId))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtClassRoomAssigned, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTeacherId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdateTeacher)
                                .addContainerGap(317, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[]{lblClassRoomAssigned, lblFirstName, lblLastName, lblTeacherId, txtClassRoomAssigned, txtFirstName, txtLastName, txtTeacherId});

    }// </editor-fold>//GEN-END:initComponents

    private void txtTeacherIdActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public JButton getBtnUpdate() {
        return btnUpdateTeacher;
    }

    public void setBtnUpdate(JButton btnUpdate) {
        this.btnUpdateTeacher = btnUpdate;
    }

    public JTextField getTextFieldClassRoomAssigned() {
        return txtClassRoomAssigned;
    }

    public void setTextFieldClassRoomAssigned(JTextField textFieldClassRoomAssigned) {
        this.txtClassRoomAssigned = textFieldClassRoomAssigned;
    }

    public JTextField getTextFieldTeacherId() {
        return txtTeacherId;
    }

    public void setTextFieldTeacherId(JTextField textFieldTeacherId) {
        this.txtTeacherId = textFieldTeacherId;
    }

    public JTextField getTxtFieldFName() {
        return txtFirstName;
    }

    public void setTxtFieldFName(JTextField txtFieldFName) {
        this.txtFirstName = txtFieldFName;
    }

    public JTextField getTxtFieldLName() {
        return txtLastName;
    }

    public void setTxtFieldLName(JTextField txtFieldLName) {
        this.txtLastName = txtFieldLName;
    }

    private JButton btnUpdateTeacher;
    private javax.swing.JLabel lblClassRoomAssigned;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblTeacherId;
    private javax.swing.JLabel lblTitle;
    private JTextField txtClassRoomAssigned;
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JTextField txtTeacherId;
}
