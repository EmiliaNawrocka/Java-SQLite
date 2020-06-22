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
public class tabela_zamowienia extends javax.swing.JFrame {
    DefaultTableModel defaultTableModel = new DefaultTableModel();
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form tabela_klienci
     */
    public tabela_zamowienia() {
        initComponents();
        setLocationRelativeTo(null);
        Object columns[] = {"ID Zamówienia","ID pracownika","ID klienta","Data"};
        defaultTableModel.setColumnIdentifiers(columns);
        zamowienia.setModel(defaultTableModel);
        
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
        zamowienia = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sidp = new javax.swing.JTextField();
        sdate = new javax.swing.JTextField();
        sidcust = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        zamowienia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "ID pracownika", "ID klienta", "data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        zamowienia.setColumnSelectionAllowed(true);
        zamowienia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zamowieniaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(zamowienia);
        zamowienia.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel1.setText("ID pracownika");

        jLabel2.setText("Data wykonania");

        jLabel3.setText("ID klienta");

        sidp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidpActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sidp, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sidcust, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton1)
                        .addGap(45, 45, 45)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(28, 28, 28)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(34, Short.MAX_VALUE))
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
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sidp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(sidcust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sidpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidpActionPerformed

    private void zamowieniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zamowieniaMouseClicked
        int currentRow = zamowienia.getSelectedRow();
        //System.out.println(currentRow);
        
        sidp.setText(zamowienia.getValueAt(currentRow,1).toString());
        sidcust.setText(zamowienia.getValueAt(currentRow,2).toString());
        sdate.setText(zamowienia.getValueAt(currentRow,3).toString());
        
        //String fvalue = klienty.getValueAt(currentRow,0).toString();
        //System.out.println(fvalue);
    }//GEN-LAST:event_zamowieniaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //deletacja rekordu
        conn = connect.ConnecrDb();
        if(conn != null){
            String currentID = zamowienia.getValueAt(zamowienia.getSelectedRow(),0).toString();
            String sql = "delete from BookOrder where id_BookOrder = '" + currentID + "'";
            try{
                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deletacja zakończona sukcesem");
                defaultTableModel.removeRow(zamowienia.getSelectedRow());
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
            String currentID = zamowienia.getValueAt(zamowienia.getSelectedRow(),0).toString();
            String id_Employee = sidp.getText();
            String id_Customer = sidcust.getText();
            String date = sdate.getText();
            
            
            String sql = "update BookOrder set id_Employee='" + id_Employee + "', id_Customer='" + id_Customer + "', date='" + date + "' where id_BookOrder='"+currentID+"'";
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
            String sql = "insert into BookOrder(id_Employee, id_Customer, date) values(?,?,?);";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, sidp.getText());
                pst.setString(2, sidcust.getText());
                pst.setString(3, sdate.getText());
                

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
            java.util.logging.Logger.getLogger(tabela_zamowienia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabela_zamowienia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabela_zamowienia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabela_zamowienia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabela_zamowienia().setVisible(true);
            }
        });
    }
    
    public void clearField(){
         sidp.setText("");
         sidcust.setText("");
         sdate.setText("");
         
    }
    
    public void loadData() {
        conn = connect.ConnecrDb();
        if(conn != null){
            String sql = "select * from BookOrder";
            try {
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                
                Object columnData[] = new Object[4];
                while(rs.next()){
                    columnData[0] = rs.getString("id_BookOrder");
                    columnData[1] = rs.getString("id_Employee");
                    columnData[2] = rs.getString("id_Customer");
                    columnData[3] = rs.getString("date");
                   
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sdate;
    private javax.swing.JTextField sidcust;
    private javax.swing.JTextField sidp;
    private javax.swing.JTable zamowienia;
    // End of variables declaration//GEN-END:variables

    
}