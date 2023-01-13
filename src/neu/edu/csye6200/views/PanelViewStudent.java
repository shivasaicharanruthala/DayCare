package neu.edu.csye6200.views;

import java.awt.CardLayout;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import neu.edu.csye6200.model.RatioRules;
import neu.edu.csye6200.model.Student;

public class PanelViewStudent extends JPanel {
    private JPanel userProcessJPanel;

    public PanelViewStudent(JPanel userProcessJPanel) {
        initComponents();
        this.userProcessJPanel = userProcessJPanel;
    }

    public JTable getTblStudents() {
        return tblStudents;
    }

    public void setTblStudents(JTable tblStudents) {
        this.tblStudents = tblStudents;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudents = new JTable();
        btnBack = new javax.swing.JButton();
        lblFirstName = new JLabel();
        txtFirstName = new JTextField();
        lblLastName = new JLabel();
        txtLastName = new JTextField();
        lblRegisterTime = new JLabel();
        txtRegTime = new JTextField();
        lblId = new JLabel();
        txtId = new JTextField();

        setBackground(new java.awt.Color(30,144,255));

        tblStudents.setBackground(new java.awt.Color(251, 243, 228));
        tblStudents.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        tblStudents.setModel(new DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "FirstName", "LastName", "Age", "StudentID"
                }
        ));
        jScrollPane1.setViewportView(tblStudents);

        btnBack.setBackground(new java.awt.Color(153, 255, 255));
        btnBack.setFont(new java.awt.Font("Charter", 1, 13)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 71, 204));
        btnBack.setText("<Back ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblFirstName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(251, 243, 228));
        lblFirstName.setText("First Name:");

        txtFirstName.setEditable(false);
        txtFirstName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        lblLastName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(251, 243, 228));
        lblLastName.setText("Last Name:");

        txtLastName.setEditable(false);
        txtLastName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        lblRegisterTime.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblRegisterTime.setForeground(new java.awt.Color(251, 243, 228));
        lblRegisterTime.setText("Register Time:");

        txtRegTime.setEditable(false);
        txtRegTime.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N

        lblId.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(251, 243, 228));
        lblId.setText("ID:");

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(71, 71, 71)
                                                                .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(77, 77, 77)
                                                                .addComponent(lblRegisterTime, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtRegTime, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(btnBack, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(94, 94, 94)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(53, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[]{lblFirstName, lblId, lblLastName, lblRegisterTime});

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblId)
                                        .addComponent(lblFirstName)
                                        .addComponent(lblLastName)
                                        .addComponent(lblRegisterTime))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtRegTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBack)
                                .addContainerGap(191, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[]{lblFirstName, lblId, lblLastName, lblRegisterTime, txtFirstName, txtId, txtLastName, txtRegTime});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
        userProcessJPanel.remove(this);
        CardLayout layout = (CardLayout) userProcessJPanel.getLayout();
        layout.previous(userProcessJPanel);
    }

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public JTextField getTextFieldFName() {
        return txtFirstName;
    }

    public JTextField getTextFieldId() {
        return txtId;
    }

    public JTextField getTextFieldLName() {
        return txtLastName;
    }

    public JTextField getTextFieldTime() {
        return txtRegTime;
    }

    public JPanel getUserProcessJPanel() {
        return userProcessJPanel;
    }

    public void setUserProcessJPanel(JPanel userProcessJPanel) {
        this.userProcessJPanel = userProcessJPanel;
    }

    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private JLabel lblFirstName;
    private JLabel lblId;
    private JLabel lblLastName;
    private JLabel lblRegisterTime;
    private JTable tblStudents;
    private JTextField txtFirstName;
    private JTextField txtId;
    private JTextField txtLastName;
    private JTextField txtRegTime;
}
