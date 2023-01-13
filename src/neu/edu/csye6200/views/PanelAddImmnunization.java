package neu.edu.csye6200.views;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PanelAddImmnunization extends javax.swing.JPanel {
    public PanelAddImmnunization() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImmunName = new javax.swing.JLabel();
        txtImmunName = new JTextField();
        lblImmunDate = new javax.swing.JLabel();
        txtImmunDate = new JTextField();
        lblIsImmunTaken = new javax.swing.JLabel();
        radioBtnYes = new JRadioButton();
        raadioBtnNo = new JRadioButton();
        btnAddImmunization = new JButton();
        lblDuration = new javax.swing.JLabel();
        txtDuration = new JTextField();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30,144,255));

        lblImmunName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblImmunName.setForeground(new java.awt.Color(251, 243, 228));
        lblImmunName.setText("Immunization Name:");

        lblImmunDate.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblImmunDate.setForeground(new java.awt.Color(251, 243, 228));
        lblImmunDate.setText("Immunization Date:");

        lblIsImmunTaken.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblIsImmunTaken.setForeground(new java.awt.Color(251, 243, 228));
        lblIsImmunTaken.setText("Is Immunization Taken:");

        radioBtnYes.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        radioBtnYes.setForeground(new java.awt.Color(251, 243, 228));
        radioBtnYes.setText("Yes");
        radioBtnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnYesActionPerformed(evt);
            }
        });

        raadioBtnNo.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        raadioBtnNo.setForeground(new java.awt.Color(251, 243, 228));
        raadioBtnNo.setText("No");
        raadioBtnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raadioBtnNoActionPerformed(evt);
            }
        });

        btnAddImmunization.setBackground(new java.awt.Color(102, 255, 255));
        btnAddImmunization.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddImmunization.setForeground(new java.awt.Color(0, 71, 204));
        btnAddImmunization.setText("Add Immunization");
        btnAddImmunization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddImmunizationActionPerformed(evt);
            }
        });

        lblDuration.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblDuration.setForeground(new java.awt.Color(251, 243, 228));
        lblDuration.setText("Duration:");

        txtDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDurationActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Charter", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(251, 243, 228));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("ADD NEW IMMUNIZATION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblImmunName)
                                                        .addComponent(txtImmunName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblImmunDate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtImmunDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addComponent(lblIsImmunTaken)
                                                                .addGap(18, 18, 18))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(radioBtnYes)
                                                                .addGap(36, 36, 36)
                                                                .addComponent(raadioBtnNo)
                                                                .addGap(27, 27, 27)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(lblDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(376, 376, 376)
                                                .addComponent(btnAddImmunization)))
                                .addContainerGap(215, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(92, 92, 92))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblDuration, lblImmunDate, lblImmunName, lblIsImmunTaken});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDuration, txtImmunDate, txtImmunName});

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblImmunName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblImmunDate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblIsImmunTaken)
                                        .addComponent(lblDuration))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtImmunName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtImmunDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(radioBtnYes)
                                        .addComponent(raadioBtnNo)
                                        .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnAddImmunization)
                                .addContainerGap(285, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblDuration, lblImmunDate, lblImmunName, lblIsImmunTaken});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {raadioBtnNo, txtDuration, txtImmunDate, txtImmunName});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAddImmunizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddImmunizationActionPerformed

    }

    private void radioBtnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnYesActionPerformed
        raadioBtnNo.setSelected(false);
    }

    private void raadioBtnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raadioBtnNoActionPerformed
        radioBtnYes.setSelected(false);
    }

    private void txtDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDurationActionPerformed

    }

    public JTextField getTextFieldDuration() {
        return txtDuration;
    }

    public void setTextFieldDuration(JTextField textFieldDuration) {
        this.txtDuration = textFieldDuration;
    }

    public JButton getBtnAddImmunization() {
        return btnAddImmunization;
    }

    public void setBtnAddImmunization(JButton btnAddImmunization) {
        this.btnAddImmunization = btnAddImmunization;
    }

    public JRadioButton getRaadioBtnNo() {
        return raadioBtnNo;
    }

    public void setRaadioBtnNo(JRadioButton raadioBtnNo) {
        this.raadioBtnNo = raadioBtnNo;
    }

    public JRadioButton getRadioBtnYes() {
        return radioBtnYes;
    }

    public void setRadioBtnYes(JRadioButton radioBtnYes) {
        this.radioBtnYes = radioBtnYes;
    }

    public JTextField getTextFieldDate() {
        return txtImmunDate;
    }

    public void setTextFieldDate(JTextField textFieldDate) {
        this.txtImmunDate = textFieldDate;
    }

    public JTextField getTextFieldName() {
        return txtImmunName;
    }

    public void setTextFieldName(JTextField textFieldName) {
        this.txtImmunName = textFieldName;
    }


    private JButton btnAddImmunization;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblImmunDate;
    private javax.swing.JLabel lblImmunName;
    private javax.swing.JLabel lblIsImmunTaken;
    private javax.swing.JLabel lblTitle;
    private JRadioButton raadioBtnNo;
    private JRadioButton radioBtnYes;
    private JTextField txtDuration;
    private JTextField txtImmunDate;
    private JTextField txtImmunName;
}
