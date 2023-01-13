package neu.edu.csye6200.views;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;

public class PanelTeacher extends JPanel {
    private JPanel userProcessContainerJPanel;
    private PanelUpdateTeacher updateTeacherJPanel;
    private PanelAddTeacher  addTeacherJPanel;
    public PanelTeacher(JPanel userProcessContainerJPanel) {
        initComponents();
        this.userProcessContainerJPanel =userProcessContainerJPanel;
    }
    public void updateTeacherJPanel(){
        updateTeacherJPanel = new PanelUpdateTeacher();
        userProcessContainerJPanel.add("UpdateTeacherJPanel",updateTeacherJPanel);
        CardLayout layout = (CardLayout) userProcessContainerJPanel.getLayout();
        layout.next(userProcessContainerJPanel);
    }
    public void addTeacherJPanel(){
        addTeacherJPanel = new PanelAddTeacher();
        userProcessContainerJPanel.add("AddTeacherJPanel",addTeacherJPanel);
        CardLayout layout = (CardLayout) userProcessContainerJPanel.getLayout();
        layout.next(userProcessContainerJPanel);
    }

    public PanelUpdateTeacher getUpdateTeacherJPanel() {
        return updateTeacherJPanel;
    }

    public void setUpdateTeacherJPanel(PanelUpdateTeacher udateTeacherJPanel) {
        this.updateTeacherJPanel = udateTeacherJPanel;
    }

    public PanelAddTeacher getAddTeacherJPanel() {
        return addTeacherJPanel;
    }

    public void setAddTeacherJPanel(PanelAddTeacher addTeacherJPanel) {
        this.addTeacherJPanel = addTeacherJPanel;
    }

    public JPanel getUserProcessContainerJPanel() {
        return userProcessContainerJPanel;
    }

    public void setUserProcessContainerJPanel(JPanel userProcessContainerJPanel) {
        this.userProcessContainerJPanel = userProcessContainerJPanel;
    }

    public JButton getBtnAddTeacher() {
        return btnAddTeacher;
    }

    public void setBtnAddTeacher(JButton btnAddTeacher) {
        this.btnAddTeacher = btnAddTeacher;
    }

    public JButton getBtnDelete() {
        return btnDeleteTeacher;
    }

    public void setBtnDelete(JButton btnDelete) {
        this.btnDeleteTeacher = btnDelete;
    }

    public JButton getBtnUpdateTeacher() {
        return btnUpdateTeacher;
    }

    public void setBtnUpdateTeacher(JButton btnUpdateTeacher) {
        this.btnUpdateTeacher = btnUpdateTeacher;
    }

    public JTable getTblTeacherRecords() {
        return tblTeacherRecords;
    }

    public void setTblTeacherRecords(JTable tblTeacherRecords) {
        this.tblTeacherRecords = tblTeacherRecords;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTeacherRecords = new JTable();
        btnAddTeacher = new JButton();
        btnUpdateTeacher = new JButton();
        btnDeleteTeacher = new JButton();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30,144,255));

        tblTeacherRecords.setBackground(new java.awt.Color(251, 243, 228));
        tblTeacherRecords.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        tblTeacherRecords.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Teacher ID", "First Name", "Last Name", "Class Assigned"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTeacherRecords);

        btnAddTeacher.setBackground(new java.awt.Color(102, 255, 255));
        btnAddTeacher.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnAddTeacher.setForeground(new java.awt.Color(0, 71, 204));
        btnAddTeacher.setText("Add Teacher");

        btnUpdateTeacher.setBackground(new java.awt.Color(0, 255, 255));
        btnUpdateTeacher.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnUpdateTeacher.setForeground(new java.awt.Color(0, 71, 204));
        btnUpdateTeacher.setText("Update Teacher");
        btnUpdateTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTeacherActionPerformed(evt);
            }
        });

        btnDeleteTeacher.setBackground(new java.awt.Color(102, 255, 255));
        btnDeleteTeacher.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnDeleteTeacher.setForeground(new java.awt.Color(0, 71, 204));
        btnDeleteTeacher.setText("Delete Teacher");
        btnDeleteTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTeacherActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(251, 243, 228));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("TEACHER INFO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnAddTeacher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnUpdateTeacher, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnDeleteTeacher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnUpdateTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnDeleteTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(783, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateTeacherActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnDeleteTeacherActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private JButton btnAddTeacher;
    private JButton btnDeleteTeacher;
    private JButton btnUpdateTeacher;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private JTable tblTeacherRecords;
}
