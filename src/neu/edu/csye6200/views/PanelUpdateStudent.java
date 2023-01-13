package neu.edu.csye6200.views;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class PanelUpdateStudent extends JPanel {
    private JPanel userProcessControllerJPanel;
    private PanelAddImmnunization addImmunJPanel;
    private PanelUpdateImmuization updateImmunJPanel;

    public PanelUpdateStudent(JPanel userProcessControllerJPanel) {
        this.userProcessControllerJPanel = userProcessControllerJPanel;
        initComponents();
    }

    public void addImmunization() {
        addImmunJPanel = new PanelAddImmnunization();
        userProcessControllerJPanel.add("AddImmunizationJPanel", addImmunJPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
    }

    public void updateImmunization() {
        updateImmunJPanel = new PanelUpdateImmuization();
        userProcessControllerJPanel.add("updateImmunizationJPanel", updateImmunJPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
    }

    public PanelAddImmnunization getAddImmunJPanel() {
        return addImmunJPanel;
    }

    public void setAddImmunJPanel(PanelAddImmnunization addImmunJPanel) {
        this.addImmunJPanel = addImmunJPanel;
    }

    public PanelUpdateImmuization getUpdateImmunJPanel() {
        return updateImmunJPanel;
    }

    public void setUpdateImmunJPanel(PanelUpdateImmuization updateImmunJPanel) {
        this.updateImmunJPanel = updateImmunJPanel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new JTable();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblParentName = new javax.swing.JLabel();
        lblParentEmail = new javax.swing.JLabel();
        lblStudentId = new javax.swing.JLabel();
        txtFirstName = new JTextField();
        txtAge = new JTextField();
        txtLastName = new JTextField();
        txtParentName = new JTextField();
        txtParentEmail = new JTextField();
        txtStudentId = new JTextField();
        btnUpdateStudent = new JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblImmunInfo = new JTable();
        btnUpdateImmun = new JButton();
        btnDeleteImmun = new JButton();
        btnAddImmun = new JButton();
        lblTitle = new javax.swing.JLabel();
        lblTitle2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(30,144,255));

        lblFirstName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(251, 243, 228));
        lblFirstName.setText("First Name:");

        lblLastName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(251, 243, 228));
        lblLastName.setText("Last Name:");

        lblAge.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblAge.setForeground(new java.awt.Color(251, 243, 228));
        lblAge.setText("Age:");

        lblParentName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblParentName.setForeground(new java.awt.Color(251, 243, 228));
        lblParentName.setText("Parent Name:");

        lblParentEmail.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblParentEmail.setForeground(new java.awt.Color(251, 243, 228));
        lblParentEmail.setText("Parent Email:");

        lblStudentId.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblStudentId.setForeground(new java.awt.Color(251, 243, 228));
        lblStudentId.setText("Student Id:");

        txtFirstName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N

        txtAge.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N

        txtLastName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        txtParentName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        txtParentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParentNameActionPerformed(evt);
            }
        });

        txtParentEmail.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N

        txtStudentId.setEditable(false);
        txtStudentId.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        txtStudentId.setToolTipText("ID cant be changed");

        btnUpdateStudent.setBackground(new java.awt.Color(0, 255, 255));
        btnUpdateStudent.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnUpdateStudent.setForeground(new java.awt.Color(0, 71, 204));
        btnUpdateStudent.setText("Update");

        jScrollPane2.setForeground(new java.awt.Color(251, 243, 228));

        tblImmunInfo.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        tblImmunInfo.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Immun Name", "Immun ID", "Duration", "Status", "Immunization Anniversary"
                }
        ));
        jScrollPane2.setViewportView(tblImmunInfo);
        if (tblImmunInfo.getColumnModel().getColumnCount() > 0) {
            tblImmunInfo.getColumnModel().getColumn(4).setResizable(false);
        }

        btnUpdateImmun.setBackground(new java.awt.Color(51, 255, 255));
        btnUpdateImmun.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnUpdateImmun.setForeground(new java.awt.Color(0, 71, 204));
        btnUpdateImmun.setText("Update Immunization");

        btnDeleteImmun.setBackground(new java.awt.Color(153, 255, 255));
        btnDeleteImmun.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnDeleteImmun.setForeground(new java.awt.Color(0, 71, 204));
        btnDeleteImmun.setText("Delete Immunization");

        btnAddImmun.setBackground(new java.awt.Color(153, 255, 255));
        btnAddImmun.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnAddImmun.setForeground(new java.awt.Color(0, 71, 204));
        btnAddImmun.setText("Add Immunization");
        btnAddImmun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddImmunActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(251, 243, 228));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("UPDATE STUDENT");

        lblTitle2.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        lblTitle2.setForeground(new java.awt.Color(251, 243, 228));
        lblTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle2.setText("IMMUNIZATION INFO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtFirstName)
                                                        .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblParentName, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                                        .addComponent(txtParentName))
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtLastName)
                                                        .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblParentEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtParentEmail)
                                                        .addComponent(btnUpdateStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(26, 26, 26)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                                        .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblStudentId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtStudentId))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(50, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnUpdateImmun, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                                        .addComponent(btnAddImmun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnDeleteImmun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[]{lblAge, lblFirstName, lblLastName, lblParentEmail, lblParentName, lblStudentId});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[]{txtAge, txtFirstName, txtLastName, txtParentEmail, txtParentName, txtStudentId});

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblAge))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblParentName)
                                        .addComponent(lblParentEmail)
                                        .addComponent(lblStudentId))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtParentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtParentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdateStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnAddImmun)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnUpdateImmun)
                                                .addGap(9, 9, 9)
                                                .addComponent(btnDeleteImmun))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(83, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[]{lblAge, lblFirstName, lblLastName, lblParentEmail, lblParentName, lblStudentId, txtAge, txtFirstName, txtLastName, txtParentEmail, txtParentName, txtStudentId});

    }// </editor-fold>//GEN-END:initComponents

    private void txtParentNameActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnAddImmunActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public JTable getTblImmunInfo() {
        return tblImmunInfo;
    }

    public void setTblImmunInfo(JTable tblImmunInfo) {
        this.tblImmunInfo = tblImmunInfo;
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

    public void setTxtFieldParentName(JTextField txtFieldParentName) {
        this.txtParentName = txtFieldParentName;
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

    public void setTxtFieldParentEmail(JTextField txtFieldParentEmail) {
        this.txtParentEmail = txtFieldParentEmail;
    }

    public JTextField getTxtFieldStudentId() {
        return txtStudentId;
    }

    public void setTxtFieldStudentId(JTextField txtFieldStudentId) {
        this.txtStudentId = txtFieldStudentId;
    }

    public JButton getBtnUpdate() {
        return btnUpdateStudent;
    }

    public void setBtnUpdate(JButton btnUpdate) {
        this.btnUpdateStudent = btnUpdate;
    }

    public JButton getBtnDeleteImmun() {
        return btnDeleteImmun;
    }

    public JButton getBtnUpdateImmun() {
        return btnUpdateImmun;
    }

    public JButton getBtnAddImmun() {
        return btnAddImmun;
    }

    public void setBtnAddImmun(JButton btnAddImmun) {
        this.btnAddImmun = btnAddImmun;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnAddImmun;
    private JButton btnDeleteImmun;
    private JButton btnUpdateImmun;
    private JButton btnUpdateStudent;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private JTable jTable1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblParentEmail;
    private javax.swing.JLabel lblParentName;
    private javax.swing.JLabel lblStudentId;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle2;
    private JTable tblImmunInfo;
    private JTextField txtAge;
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JTextField txtParentEmail;
    private JTextField txtParentName;
    private JTextField txtStudentId;
}
