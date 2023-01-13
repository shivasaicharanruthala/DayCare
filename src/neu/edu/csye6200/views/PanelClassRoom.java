package neu.edu.csye6200.views;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import neu.edu.csye6200.model.ClassRoom;


public class PanelClassRoom extends JPanel {
    private JPanel userProcessControlJPanel;
    public PanelClassRoom(JPanel userProcessControlJPanel) {
        initComponents();
        this.userProcessControlJPanel = userProcessControlJPanel;
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

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClassRooms = new JTable();
        btnShowDetail = new JToggleButton();

        setBackground(new java.awt.Color(30,144,255));

        lblTitle.setFont(new java.awt.Font("Charter", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(251, 243, 228));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("CLASSROOOMS");

        tblClassRooms.setBackground(new java.awt.Color(251, 243, 228));
        tblClassRooms.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        tblClassRooms.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Age", "Group Size", "Ratio", "Max Groups/Room"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblClassRooms);

        btnShowDetail.setBackground(new java.awt.Color(0, 0, 0));
        btnShowDetail.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnShowDetail.setForeground(new java.awt.Color(0, 71, 204));
        btnShowDetail.setText("Show Detail");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnShowDetail))
                                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnShowDetail)
                                .addContainerGap(152, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private JToggleButton btnShowDetail;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private JTable tblClassRooms;

    public JToggleButton getBtnShowDetail() {
        return btnShowDetail;
    }

    public void setBtnShowDetail(JToggleButton btnShowDetail) {
        this.btnShowDetail = btnShowDetail;
    }

    public JTable getTblClassRooms() {
        return tblClassRooms;
    }

    public void setTblClassRooms(JTable tblClassRooms) {
        this.tblClassRooms = tblClassRooms;
    }
}
