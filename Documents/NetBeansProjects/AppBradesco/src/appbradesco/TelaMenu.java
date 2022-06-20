/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbradesco;

import Classes.Saldo;

/**
 *
 * @author Edimar
 */
public class TelaMenu extends javax.swing.JFrame {
    float saldo = 1000 ;
 
   

    public TelaMenu() {
        initComponents();
        
    }
    
    public void ExportaSaldoDeposito(Saldo model){
        cx1.setText(Float.toString(saldo + model.getSaldo()));
        saldo = saldo + model.getSaldo();
    }
       public void ExportaSaldoSaque(Saldo model){
        cx1.setText(Float.toString(saldo - model.getSaldo()));
        saldo = saldo - model.getSaldo();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnSaque = new javax.swing.JButton();
        btnDespositar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cx1 = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnVisualizar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(338, 84, 0, 0);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnSaque.setBackground(new java.awt.Color(255, 255, 255));
        btnSaque.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSaque.setForeground(new java.awt.Color(0, 0, 0));
        btnSaque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/saque1.png"))); // NOI18N
        btnSaque.setText("SAQUE");
        btnSaque.setAutoscrolls(true);
        btnSaque.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaqueActionPerformed(evt);
            }
        });

        btnDespositar.setBackground(new java.awt.Color(255, 255, 255));
        btnDespositar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnDespositar.setForeground(new java.awt.Color(0, 0, 0));
        btnDespositar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/deposito1.png"))); // NOI18N
        btnDespositar.setText("DEPOSITO");
        btnDespositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespositarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MEU SALDO DISPONIVEL");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BEM-VINDO, Edimar...");

        cx1.setBackground(new java.awt.Color(0, 0, 0));
        cx1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cx1.setForeground(new java.awt.Color(255, 255, 255));
        cx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cx1ActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(204, 204, 204));
        btnSair.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnVisualizar1.setBackground(new java.awt.Color(204, 204, 204));
        btnVisualizar1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnVisualizar1.setText("VISUALIZAR");
        btnVisualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizar1ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("R$");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logopretobradesco - Copia.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cx1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVisualizar1)))
                .addGap(103, 103, 103))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btnDespositar, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(186, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(158, 158, 158)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cx1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDespositar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnSair)
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jLabel3)
                    .addContainerGap(385, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 597, 450);

        setSize(new java.awt.Dimension(616, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaqueActionPerformed
       TelaSaque t1 = new TelaSaque();
       t1.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnSaqueActionPerformed

    private void cx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cx1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cx1ActionPerformed

    private void btnDespositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespositarActionPerformed
        TelaDeposito t1 = new TelaDeposito();
 
        t1.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnDespositarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
    System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnVisualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizar1ActionPerformed
     cx1.setText(Float.toString(saldo));
    }//GEN-LAST:event_btnVisualizar1ActionPerformed


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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnDespositar;
    private javax.swing.JButton btnSair;
    public javax.swing.JButton btnSaque;
    private javax.swing.JButton btnVisualizar1;
    private javax.swing.JTextField cx1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
