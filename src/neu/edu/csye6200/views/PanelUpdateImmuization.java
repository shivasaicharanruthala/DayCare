package neu.edu.csye6200.views;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PanelUpdateImmuization extends javax.swing.JPanel {
    public PanelUpdateImmuization() {
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
        lblDuration = new javax.swing.JLabel();
        txtDuration = new JTextField();
        btnUpdateImmunization = new JButton();
        lblImmunId = new javax.swing.JLabel();
        txtImmunId = new JTextField();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30,144,255));

        lblImmunName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblImmunName.setForeground(new java.awt.Color(251, 243, 228));
        lblImmunName.setText("Immunization Name:");

        txtImmunName.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N

        lblImmunDate.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblImmunDate.setForeground(new java.awt.Color(251, 243, 228));
        lblImmunDate.setText("Immunization Date:");

        txtImmunDate.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        txtImmunDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImmunDateActionPerformed(evt);
            }
        });

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

        lblDuration.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblDuration.setForeground(new java.awt.Color(251, 243, 228));
        lblDuration.setText("Duration:");

        txtDuration.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        txtDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDurationActionPerformed(evt);
            }
        });

        btnUpdateImmunization.setBackground(new java.awt.Color(102, 255, 255));
        btnUpdateImmunization.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnUpdateImmunization.setForeground(new java.awt.Color(0, 71, 204));
        btnUpdateImmunization.setText("Update Immunization");
        btnUpdateImmunization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateImmunizationActionPerformed(evt);
            }
        });

        lblImmunId.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        lblImmunId.setForeground(new java.awt.Color(251, 243, 228));
        lblImmunId.setText("Immunization Id:");

        txtImmunId.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        txtImmunId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImmunIdActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(251, 243, 228));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("UPDATE IMMUNIZATION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lblImmunName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(78, 78, 78)
                                                                .addComponent(lblImmunDate)
                                                                .addGap(72, 72, 72)
                                                                .addComponent(lblIsImmunTaken))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(lblDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtImmunName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(txtImmunDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lblImmunId, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(35, 35, 35)
                                                                .addComponent(radioBtnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(raadioBtnNo))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(57, 57, 57)
                                                                .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtImmunId, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(210, 210, 210)
                                                .addComponent(btnUpdateImmunization)))
                                .addGap(112, 189, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[]{lblDuration, lblImmunDate, lblImmunId, lblImmunName, lblIsImmunTaken});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[]{txtDuration, txtImmunDate, txtImmunId, txtImmunName});

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblImmunName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblImmunDate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblIsImmunTaken))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtImmunName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtImmunDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(radioBtnYes)
                                        .addComponent(raadioBtnNo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblDuration)
                                        .addComponent(lblImmunId, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtImmunId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdateImmunization)
                                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[]{lblDuration, lblImmunDate, lblImmunId, lblImmunName, lblIsImmunTaken});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[]{raadioBtnNo, radioBtnYes, txtDuration, txtImmunDate, txtImmunId, txtImmunName});

    }// </editor-fold>//GEN-END:initComponents

    private void radioBtnYesActionPerformed(java.awt.event.ActionEvent evt) {
        raadioBtnNo.setSelected(false);
    }

    private void raadioBtnNoActionPerformed(java.awt.event.ActionEvent evt) {
        radioBtnYes.setSelected(false);
    }

    private void txtDurationActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void btnUpdateImmunizationActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtImmunIdActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtImmunDateActionPerformed(java.awt.event.ActionEvent evt) {
    }

    public JButton getBtnUpdateImmunization() {
        return btnUpdateImmunization;
    }

    public JTextField getTextFieldId() {
        return txtImmunId;
    }


    public JRadioButton getRaadioBtnNo() {
        return raadioBtnNo;
    }

    public JRadioButton getRadioBtnYes() {
        return radioBtnYes;
    }

    public JTextField getTextFieldDate() {
        return txtImmunDate;
    }

    public JTextField getTextFieldDuration() {
        return txtDuration;
    }

    public JTextField getTextFieldName() {
        return txtImmunName;
    }

    private JButton btnUpdateImmunization;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblImmunDate;
    private javax.swing.JLabel lblImmunId;
    private javax.swing.JLabel lblImmunName;
    private javax.swing.JLabel lblIsImmunTaken;
    private javax.swing.JLabel lblTitle;
    private JRadioButton raadioBtnNo;
    private JRadioButton radioBtnYes;
    private JTextField txtDuration;
    private JTextField txtImmunDate;
    private JTextField txtImmunId;
    private JTextField txtImmunName;
}
