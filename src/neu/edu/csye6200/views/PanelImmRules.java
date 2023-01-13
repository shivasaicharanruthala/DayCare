package neu.edu.csye6200.views;

import javax.swing.JPanel;

public class PanelImmRules extends JPanel {
    private JPanel userProcessControlJPanel;

    public PanelImmRules(JPanel userProcessControlJPanel) {
        initComponents();
        this.userProcessControlJPanel = userProcessControlJPanel;
        jTable1.setVisible(true);
        jTable2.setVisible(false);
        jTable3.setVisible(false);

        jTable4.setVisible(false);
    }

    public JPanel getUserProcessControlJPanel() {
        return userProcessControlJPanel;
    }

    public void setUserProcessControlJPanel(JPanel userProcessControlJPanel) {
        this.userProcessControlJPanel = userProcessControlJPanel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();

        setBackground(new java.awt.Color(30,144,255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                        {"HiB", "2 - 3", "6 Months"},
                        {"DTaP", "1", "6 Months"},
                        {"Hepatities B", "3", "6 Months"},
                        {"MMR", "1", "7 Months"}

                },
                new String[]{
                        "Vaccine Name", "Dosage", "Duration"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Massachusetts Immunization Rules :");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"6 - 24", "25 - 48", "49 - 59", "Above 59"}));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                        {"HiB", "2", "3 Months"},
                        {"DTaP", "3", "8 Months"},
                        {"Polio", "2", "4 Months"},
                        {"MMR", "2", "6 Months"}
                },
                new String[]{
                        "Vaccine Name", "Dosage", "Duration"
                }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {"HiB", "1 - 4", "6 Months"},
                        {"DTaP", "4", "6 Months"},
                        {"Polio", "3", "8 Months"},
                },
                new String[]{
                        "Vaccine Name", "Dosage", "Duration"
                }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {"HiB", "1 - 4", "8 Months"},
                        {"DTaP", "4", "6 Months"},
                        {"Polio", "3", "4 Months"},
                        {"MMR", "2", "6 Months"}
                },
                new String[]{
                        "Vaccine Name", "Dosage", "Duration"
                }
        ));
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                                        .addComponent(jScrollPane4))
                                .addGap(30, 30, 30))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(400, 400, 400))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    public javax.swing.JComboBox getAge() {
        return this.jComboBox2;
    }

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (getAge().getSelectedIndex() == 0) {
            jTable1.setVisible(true);
            jTable2.setVisible(false);
            jTable3.setVisible(false);

            jTable4.setVisible(false);

        }
        if (getAge().getSelectedIndex() == 1) {
            jTable1.setVisible(false);

            jTable3.setVisible(false);

            jTable4.setVisible(false);

            jTable2.setVisible(true);
        }
        if (getAge().getSelectedIndex() == 2) {
            jTable1.setVisible(false);

            jTable2.setVisible(false);

            jTable4.setVisible(false);

            jTable3.setVisible(true);
        }
        if (getAge().getSelectedIndex() == 3) {
            jTable1.setVisible(false);

            jTable2.setVisible(false);
            jTable3.setVisible(false);


            jTable4.setVisible(true);
        }

    }

    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
}

