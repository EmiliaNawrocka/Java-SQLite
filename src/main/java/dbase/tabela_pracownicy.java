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
public class tabela_pracownicy extends javax.swing.JFrame {
    DefaultTableModel defaultTableModel = new DefaultTableModel();
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form tabela_klienci
     */
    public tabela_pracownicy() {
        initComponents();
        setLocationRelativeTo(null);
        Object columns[] = {"ID","Imię i Nazwisko","Numer telefonu","Numer smarcard","Zniżka", "Adres e-mail"};
        defaultTableModel.setColumnIdentifiers(columns);
        pracowniki.setModel(defaultTableModel);
        
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
        pracowniki = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        scard = new javax.swing.JTextField();
        sdis = new javax.swing.JTextField();
        semail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        sphone1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pracowniki.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Imię i Nazwisko", "Numer Telefonu", "Płeć", "Adres e-mail", "aaaaa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pracowniki.setColumnSelectionAllowed(true);
        pracowniki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pracownikiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pracowniki);
        pracowniki.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel1.setText("Imię i Nazwisko:");

        jLabel2.setText("Numer smarcard");

        jLabel3.setText("Numer telefonu:");

        jLabel4.setText("e-mail");

        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
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

        sphone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sphone1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Zniżka (w %)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sphone1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(semail, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(scard))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton1)
                        .addGap(44, 44, 44)
                        .addComponent(jButton3)
                        .addGap(28, 28, 28)
                        .addComponent(jButton2)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(sdis, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
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
                            .addComponent(scard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(semail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(sphone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sdis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snameActionPerformed

    private void pracownikiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pracownikiMouseClicked
        int currentRow = pracowniki.getSelectedRow();
        //System.out.println(currentRow);
        
        sname.setText(pracowniki.getValueAt(currentRow,1).toString());
        sphone1.setText(pracowniki.getValueAt(currentRow,2).toString());
        scard.setText(pracowniki.getValueAt(currentRow,3).toString());
        sdis.setText(pracowniki.getValueAt(currentRow,4).toString());
        semail.setText(pracowniki.getValueAt(currentRow,5).toString());
        //String fvalue = klienty.getValueAt(currentRow,0).toString();
        //System.out.println(fvalue);
    }//GEN-LAST:event_pracownikiMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //deletacja rekordu
        conn = connect.ConnecrDb();
        if(conn != null){
            String currentID = pracowniki.getValueAt(pracowniki.getSelectedRow(),0).toString();
            String sql = "delete from Employee where id_Employee = '" + currentID + "'";
            try{
                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deletacja zakończona sukcesem");
                defaultTableModel.removeRow(pracowniki.getSelectedRow());
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
            String currentID = pracowniki.getValueAt(pracowniki.getSelectedRow(),0).toString();
            String name = sname.getText();
            String phone = sphone1.getText();
            String card = scard.getText();
            String dis = sdis.getText();
            String email = semail.getText();
            
            String sql = "update Employee set name='" + name + "', discount='" + dis + "', phone='" + phone + "', smarcard='" + card + "', email='" + email + "' where id_Employee='"+currentID+"'";
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
            String sql = "insert into Employee(name, phone, smarcard, discount, email) values(?,?,?,?,?);";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, sname.getText());
                pst.setString(2, sphone1.getText());
                pst.setString(3, scard.getText());
                pst.setString(4, sdis.getText());
                pst.setString(5, semail.getText());

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

    private void sphone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sphone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sphone1ActionPerformed

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
            java.util.logging.Logger.getLogger(tabela_pracownicy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabela_pracownicy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabela_pracownicy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabela_pracownicy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabela_pracownicy().setVisible(true);
            }
        });
    }
    
    public void clearField(){
         sname.setText("");
         sdis.setText("");
         scard.setText("");
         semail.setText("");
         sphone1.setText("");
    }
    
    public void loadData() {
        conn = connect.ConnecrDb();
        if(conn != null){
            String sql = "select * from Employee";
            try {
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                
                Object columnData[] = new Object[6];
                while(rs.next()){
                    columnData[0] = rs.getString("id_Employee");
                    columnData[1] = rs.getString("name");
                    columnData[2] = rs.getString("phone");
                    columnData[3] = rs.getString("smarcard");
                    columnData[4] = rs.getString("discount");
                    columnData[5] = rs.getString("email");
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pracowniki;
    private javax.swing.JTextField scard;
    private javax.swing.JTextField sdis;
    private javax.swing.JTextField semail;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField sphone1;
    // End of variables declaration//GEN-END:variables

    
}