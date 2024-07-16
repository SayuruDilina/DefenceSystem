/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import com.sun.nio.sctp.PeerAddressChangeNotification;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author HP
 */
public class MainController extends javax.swing.JFrame {

    /**
     * Creates new form MainController
     */
     public Observable observable;
     int Value;
      int ValueAmmo;
      
      
    public MainController(Observable observable ) {
        	this.observable=observable;
              
        initComponents();
       
    }

    public MainController( ) {
      
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        chckInfo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        AreaClearBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMain = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        sldPosition = new javax.swing.JSlider();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtWarnings = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtMsgDisplay = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        btnSend = new javax.swing.JButton();
        jComboBox5 = new javax.swing.JComboBox<>();
        lblSoldierCount = new javax.swing.JLabel();
        lblAmmoCount = new javax.swing.JLabel();
        lblFuel = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainController");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chckInfo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defence", "Helicopter", "Tank", "Submarine" }));
        chckInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckInfoActionPerformed(evt);
            }
        });
        getContentPane().add(chckInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 34, 121, 39));

        jButton1.setBackground(new java.awt.Color(51, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Collect Informations");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 34, 170, 39));

        AreaClearBox.setBackground(new java.awt.Color(51, 255, 204));
        AreaClearBox.setText("Area Clear ");
        AreaClearBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                AreaClearBoxStateChanged(evt);
            }
        });
        AreaClearBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaClearBoxActionPerformed(evt);
            }
        });
        getContentPane().add(AreaClearBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 43, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Soldier Count");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 91, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fuel Amount");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 119, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ammo Count");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 153, -1, -1));

        txtMain.setColumns(20);
        txtMain.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMain.setRows(5);
        jScrollPane2.setViewportView(txtMain);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 91, 170, 88));

        jLabel4.setForeground(new java.awt.Color(51, 251, 254));
        jLabel4.setText("Position");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 197, -1, -1));

        sldPosition.setBackground(new java.awt.Color(0, 51, 51));
        sldPosition.setForeground(new java.awt.Color(255, 255, 255));
        sldPosition.setMajorTickSpacing(10);
        sldPosition.setPaintLabels(true);
        sldPosition.setPaintTicks(true);
        sldPosition.setValue(10);
        sldPosition.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldPositionStateChanged(evt);
            }
        });
        getContentPane().add(sldPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 242, 310, -1));

        txtWarnings.setColumns(20);
        txtWarnings.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtWarnings.setForeground(new java.awt.Color(255, 0, 0));
        txtWarnings.setRows(5);
        jScrollPane3.setViewportView(txtWarnings);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 292, 203, 90));

        txtMsgDisplay.setColumns(20);
        txtMsgDisplay.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMsgDisplay.setRows(5);
        jScrollPane4.setViewportView(txtMsgDisplay);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 292, 213, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 20));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jCheckBox1.setBackground(new java.awt.Color(51, 255, 204));
        jCheckBox1.setText("Private");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defence", "Helicopter", "Tank", "Submarine" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defence", "Helicopter", "Tank", "Submarine" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        btnSend.setBackground(new java.awt.Color(51, 255, 204));
        btnSend.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defence", "Helicopter", "Tank", "Submarine" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        lblSoldierCount.setForeground(new java.awt.Color(255, 255, 255));
        lblSoldierCount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblAmmoCount.setForeground(new java.awt.Color(255, 255, 255));
        lblAmmoCount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblFuel.setForeground(new java.awt.Color(255, 255, 255));
        lblFuel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jCheckBox1)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblAmmoCount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblFuel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)))))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 455, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chckInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckInfoActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_chckInfoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          /*Helicopter helicopter=new Helicopter();
          Tank tank=new Tank();
          Submarine submarine=new Submarine();*/
          
        //System.out.println(spinnerValue);   
             
      String selectedItem = (String)chckInfo.getSelectedItem(); 
      int[] details = observable.setDetails(selectedItem);
            
      
        // System.out.println(selectedItem);
          lblSoldierCount.setText(""+details[0]);                      
          lblAmmoCount.setText(""+details[1]);
          lblFuel.setText(""+details[2]);
            
         /*         if(selectedItem=="Tank"){
            jLabel9.setText(""+(int)tank.jSlider1.getValue());                
           jLabel7.setText(""+(int) tank.jSpinner1.getValue());
             jLabel8.setText(""+(int) tank.jSpinner2.getValue());
            
         }
         if(selectedItem=="Submarine"){
                  jLabel9.setText(""+submarine.jSlider1.getValue());                   
           jLabel7.setText(""+(int) submarine.jSpinner1.getValue());
          jLabel8.setText(""+(int) submarine.jSpinner2.getValue());
            
         }*/
           
    }//GEN-LAST:event_jButton1ActionPerformed
  //  boolean select = false;
    private void AreaClearBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaClearBoxActionPerformed
        // TODO add your handling code here:
        //AreaClearBox.addActionListener(new ActionListener() {
            //@Override
            //public void actionPerformed(ActionEvent e) {
               boolean select = AreaClearBox.isSelected();
                System.out.println(select);

//                if(select) {
//                    select = false;
//                     //observable.setArea(select);
//                } else {
//                    select = true;
//                    //observable.setArea(select);
//                }
                observable.setArea(select);
            
        //});
       
    }//GEN-LAST:event_AreaClearBoxActionPerformed

    private void AreaClearBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_AreaClearBoxStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_AreaClearBoxStateChanged

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
    

    // observable. SetMainmessge(message);
    
                String message=txtMain.getText();
                boolean select = jCheckBox1.isSelected();
                String selectedItem = (String) jComboBox5.getSelectedItem();  
                observable.SetPrivateMessage ( message,select, selectedItem);
  
     
      // observable.SetPrivateMessage(selectItem, selectedItem,PMessage);
    }//GEN-LAST:event_btnSendActionPerformed

    private void sldPositionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldPositionStateChanged
        // TODO add your handling code here
        observable.SetBtnEnable( sldPosition.getValue());
        
    }//GEN-LAST:event_sldPositionStateChanged

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
      
        
      
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

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
            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AreaClearBox;
    private javax.swing.JButton btnSend;
    private javax.swing.JComboBox<String> chckInfo;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JLabel lblAmmoCount;
    private javax.swing.JLabel lblFuel;
    public static javax.swing.JLabel lblSoldierCount;
    private javax.swing.JSlider sldPosition;
    private javax.swing.JTextArea txtMain;
    public static javax.swing.JTextArea txtMsgDisplay;
    public static javax.swing.JTextArea txtWarnings;
    // End of variables declaration//GEN-END:variables

    
    public void OxygenLevelWarning(String OxygenLevel){
          txtWarnings.append("\n"+OxygenLevel);
} 
    public void DieWarning(String SoldierDied){
     txtWarnings.append("\n"+SoldierDied);
    }
    public void Warning(String warning){
            txtWarnings.append("\n"+warning);
}
  public void SendPriavteMessage(String privateMessage ){
   
   txtMsgDisplay.append("\n"+privateMessage);
  System.out.println(privateMessage);
  
  }
 /* public  void Details(int spinnerValue ){
  
  Value=spinnerValue;
  jLabel7.setText(""+spinnerValue);
      System.out.println(Value);  
  }*/
public  void Details2(int Ammo ){
  
  ValueAmmo=Ammo;
 lblAmmoCount.setText(""+Ammo);
      System.out.println(Value);  
  }
}

