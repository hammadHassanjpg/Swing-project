/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent.a.car;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class CustomerOperations extends javax.swing.JFrame {

    /**
     * Creates new form CustomerOperations
     */
    int selectedRow;
    public static List<Customer> CusList = new ArrayList<>();

    public CustomerOperations() {
        initComponents();

        ListSelectionModel model = CusTable.getSelectionModel();
        model.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!model.isSelectionEmpty()) {
                    selectedRow = model.getMinSelectionIndex();
                }
            }
        });

        DefaultTableModel model2 = (DefaultTableModel) CusTable.getModel();
        model2.getDataVector().removeAllElements();
        model2.fireTableDataChanged();
        for (int i = 0; i < CusList.size(); i++) {
            int id = i + 1;
            model2.addRow(new Object[]{id, CusList.get(i).getFirstName(), CusList.get(i).getLastName(), CusList.get(i).getEmail(), CusList.get(i).getPhoneNumber()});
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        PhoneField = new javax.swing.JTextField();
        LastNameField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        AddCus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CusTable = new javax.swing.JTable();
        Sear = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("First Name: ");

        jLabel2.setText("Last Name:");

        jLabel3.setText("Email: ");

        jLabel4.setText("Phone Number:");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        AddCus.setText("Add Customer");
        AddCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCusActionPerformed(evt);
            }
        });

        CusTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "Email", "Phone Number"
            }
        ));
        jScrollPane1.setViewportView(CusTable);

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(479, 479, 479)
                        .addComponent(Sear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(152, 152, 152))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(AddCus)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(52, 52, 52)
                .addComponent(Save)
                .addGap(47, 47, 47)
                .addComponent(jButton3)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(PhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(AddCus)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Save)
                    .addComponent(jButton3))
                .addGap(88, 88, 88))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void AddCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCusActionPerformed
        String phone = this.PhoneField.getText().toString();
        String email = this.EmailField.getText().toString();
        boolean flag = true;
        String regex = "[0-9]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(phone);

        if (this.nameField.getText().toString().isEmpty() && this.LastNameField.getText().toString().isEmpty() && this.EmailField.getText().toString().isEmpty() && this.PhoneField.getText().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter All Fields");
        } else {
            if (m.matches() == false || phone.length() < 8) {
                JOptionPane.showMessageDialog(null, "Phone Number must be a number and Number of digits should be equal to or more than 8");
                flag = false;
            }

            if (!email.contains("@") || email.contains(" ") || !email.contains(".com")) {
                JOptionPane.showMessageDialog(null, "Email has Incorrect format");
                flag = false;
            }

            if (flag == true) {
                int size = CusList.size();
                size++;
                Customer C = new Customer(size, nameField.getText().toString(), LastNameField.getText().toString(), EmailField.getText().toString(), PhoneField.getText().toString());
                CusList.add(C);
                DefaultTableModel model = (DefaultTableModel) CusTable.getModel();
                model.addRow(new Object[]{String.valueOf(size), C.getFirstName(), C.getLastName(), C.getEmail(), C.getPhoneNumber()});
            }
        }
    }//GEN-LAST:event_AddCusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CusList.remove(selectedRow);

        DefaultTableModel model = (DefaultTableModel) CusTable.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        for (int i = 0; i < CusList.size(); i++) {
            int id = i + 1;
            model.addRow(new Object[]{id, CusList.get(i).getFirstName(), CusList.get(i).getLastName(), CusList.get(i).getEmail(), CusList.get(i).getPhoneNumber()});
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) CusTable.getModel();
        CusList.clear();
        for (int i = 0; i < CusTable.getRowCount(); i++) {
            int id = Integer.valueOf(CusTable.getValueAt(i, 0).toString());
            String fn = (String) CusTable.getValueAt(i, 1).toString();
            String ln = (String) CusTable.getValueAt(i, 2).toString();
            String email = (String) CusTable.getValueAt(i, 3).toString();
            String Phone = (String) CusTable.getValueAt(i, 4).toString();

            Customer C = new Customer(id, fn, ln, email, Phone);
            CusList.add(C);
        }
        Menu M = new Menu();
        M.setVisible(true);
        this.setVisible(false);

        try {
            FileWriter csvWriter = new FileWriter("Customer.csv");
            for(int i=0 ; i<CusList.size() ; i++)
            {
            csvWriter.append(CusList.get(i).getId()+"");
            csvWriter.append(",");    
            
            csvWriter.append(CusList.get(i).getFirstName());
            csvWriter.append(",");    
            
            csvWriter.append(CusList.get(i).getLastName());
            csvWriter.append(",");    
            
            csvWriter.append(CusList.get(i).getEmail());
            csvWriter.append(",");    
            
            csvWriter.append(CusList.get(i).getPhoneNumber());
            csvWriter.append("\n");    
                 
            }
            
            csvWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(CustomerOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
      

    }//GEN-LAST:event_SaveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String searcher = this.Sear.getText().toString();
        DefaultTableModel model = (DefaultTableModel) CusTable.getModel();
        int id2 = 0;
        String fn2 = null, ln2 = null, e2 = null, p2 = null;

        for (int i = 0; i < CusTable.getRowCount(); i++) {
            int id = Integer.valueOf(CusTable.getValueAt(i, 0).toString());
            String fn = (String) CusTable.getValueAt(i, 1).toString();
            String ln = (String) CusTable.getValueAt(i, 2).toString();
            String email = (String) CusTable.getValueAt(i, 3).toString();
            String Phone = (String) CusTable.getValueAt(i, 4).toString();
            if (fn.equals(searcher) || ln.equals(searcher) || email.equals(searcher) || Phone.equals(searcher));
            {
                id2 = id;
                fn2 = fn;
                ln2 = ln;
                e2 = email;
                p2 = Phone;
            }
        }
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        model.addRow(new Object[]{id2, fn2, ln2, e2, p2});
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) CusTable.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        for (int i = 0; i < CusList.size(); i++) {
            int id = i + 1;
            model.addRow(new Object[]{id, CusList.get(i).getFirstName(), CusList.get(i).getLastName(), CusList.get(i).getEmail(), CusList.get(i).getPhoneNumber()});
        }

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerOperations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCus;
    private javax.swing.JTable CusTable;
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JTextField PhoneField;
    private javax.swing.JButton Save;
    private javax.swing.JTextField Sear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    // End of variables declaration//GEN-END:variables
}
