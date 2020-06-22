/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emiko
 */
public class tabela_faktury extends javax.swing.JFrame {
    DefaultTableModel defaultTableModel = new DefaultTableModel();
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form tabela_klienci
     */
    public tabela_faktury() {
        initComponents();
        setLocationRelativeTo(null);
        Object columns[] = {"ID","ID Zamówienia","ID Pracownika","ID Klienta","Data wystawienia", "Suma", "Czy anulowalna"};
        defaultTableModel.setColumnIdentifiers(columns);
        faktury.setModel(defaultTableModel);
        
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        faktury = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        soid = new javax.swing.JTextField();
        seid = new javax.swing.JTextField();
        ssum = new javax.swing.JTextField();
        sdate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        scid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        srev = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        faktury.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "id_BookOrder", "id_Employee", "id_Customer", "date", "sum", "is_reversal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        faktury.setColumnSelectionAllowed(true);
        faktury.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fakturyMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(faktury);
        faktury.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel1.setText("ID zamówienia");

        jLabel2.setText("ID pracownika");

        jLabel3.setText("ID klienta");

        jLabel4.setText("Data");

        soid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soidActionPerformed(evt);
            }
        });

        jButton1.setText("Usuń Zaznaczony");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edytuj Zaznaczony");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Dodaj nowy rekord z danymi z textboxów");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Wróć");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        scid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scidActionPerformed(evt);
            }
        });

        jLabel5.setText("Suma ");

        jLabel6.setText("Czy anulowalna (1 lub 0)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(44, 44, 44)
                                .addComponent(jButton3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(soid, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ssum, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scid, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(srev, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(sdate)
                            .addComponent(seid))
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton4)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(seid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ssum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(srev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void soidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soidActionPerformed

    private void fakturyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fakturyMouseClicked
        int currentRow = faktury.getSelectedRow();
        //System.out.println(currentRow);
        
        soid.setText(faktury.getValueAt(currentRow,1).toString());
        seid.setText(faktury.getValueAt(currentRow,2).toString());
        scid.setText(faktury.getValueAt(currentRow,3).toString());
        sdate.setText(faktury.getValueAt(currentRow,4).toString());
        ssum.setText(faktury.getValueAt(currentRow,5).toString());
        srev.setText(faktury.getValueAt(currentRow,6).toString());
        //String fvalue = klienty.getValueAt(currentRow,0).toString();
        //System.out.println(fvalue);
    }//GEN-LAST:event_fakturyMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //deletacja rekordu
        conn = connect.ConnecrDb();
        if(conn != null){
            String currentID = faktury.getValueAt(faktury.getSelectedRow(),0).toString();
            String sql = "delete from Invoice where id_Invoice = '" + currentID + "'";
            try{
                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deletacja zakończona sukcesem");
                defaultTableModel.removeRow(faktury.getSelectedRow());
                clearField();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            finally{
                try {
                    conn.close();
                    pst.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //update rekordu
        conn = connect.ConnecrDb();
         if(conn != null){
            String currentID = faktury.getValueAt(faktury.getSelectedRow(),0).toString();
            String order = soid.getText();
            String customer = scid.getText();
            String employee = seid.getText();
            String sum = ssum.getText();
            String date = sdate.getText();
            String rev = srev.getText();
            
            String sql = "update Invoice set id_BookOrder='" + order + "', id_Employee='" + employee + "', id_Customer='" + customer + "', date='" + date + "', sum='" + sum + "', is_reversal='" + rev + "' where id_Invoice='"+currentID+"'";
             try {
                 pst = conn.prepareStatement(sql);
                 pst.execute();
                 JOptionPane.showMessageDialog(null, "Dane zaktualizowane");
                 defaultTableModel.getDataVector().removeAllElements();
                 defaultTableModel.fireTableDataChanged();
                 loadData();
                 clearField();
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e);
             }finally{
                try {
                    conn.close();
                    pst.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // dodanie rekordu
        conn = connect.ConnecrDb();
        if(conn != null){
            String sql = "insert into Invoice(id_BookOrder, id_Employee, id_Customer, date, sum, is_reversal) values(?,?,?,?,?,?);";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, soid.getText());
                pst.setString(2, seid.getText());
                pst.setString(3, scid.getText());
                pst.setString(4, sdate.getText());
                pst.setString(5, ssum.getText());
                pst.setString(6, srev.getText());

                pst.execute();
                defaultTableModel.getDataVector().removeAllElements();
                defaultTableModel.fireTableDataChanged();
                loadData();
                clearField();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }finally{
                try {
                    conn.close();
                    pst.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        home home = new home();
        home.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void scidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scidActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tabela_faktury.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabela_faktury.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabela_faktury.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabela_faktury.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabela_faktury().setVisible(true);
            }
        });
    }
    
    public void clearField(){
         soid.setText("");
         ssum.setText("");
         seid.setText("");
         sdate.setText("");
         scid.setText("");
         srev.setText("");
    }
    
    public void loadData() {
        conn = connect.ConnecrDb();
        if(conn != null){
            String sql = "select * from Invoice";
            try {
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                
                Object columnData[] = new Object[7];
                while(rs.next()){
                    columnData[0] = rs.getString("id_Invoice");
                    columnData[1] = rs.getString("id_BookOrder");
                    columnData[2] = rs.getString("id_Employee");
                    columnData[3] = rs.getString("id_Customer");
                    columnData[4] = rs.getString("date");
                    columnData[5] = rs.getString("sum");
                    columnData[6] = rs.getString("is_reversal");
                    defaultTableModel.addRow(columnData);
                    
                }
                
                //JOptionPane.showMessageDialog(null, "Display Succeeded");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable faktury;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField scid;
    private javax.swing.JTextField sdate;
    private javax.swing.JTextField seid;
    private javax.swing.JTextField soid;
    private javax.swing.JTextField srev;
    private javax.swing.JTextField ssum;
    // End of variables declaration//GEN-END:variables

    
}