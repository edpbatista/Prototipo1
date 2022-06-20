
package appbradesco;

import Classes.Saldo;
import javax.swing.JOptionPane;

public class TelaDeposito extends javax.swing.JFrame {
    float deposito ;
    float enviaSaldo ;
    
    public TelaDeposito() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnDepositoImediato = new javax.swing.JButton();
        btnDepositoCheque = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BtnVoltaMenuDeposito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logopretobradesco - Copia.png"))); // NOI18N

        btnDepositoImediato.setBackground(new java.awt.Color(255, 255, 255));
        btnDepositoImediato.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDepositoImediato.setForeground(new java.awt.Color(0, 0, 0));
        btnDepositoImediato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/depositoimediato.png"))); // NOI18N
        btnDepositoImediato.setText("DEPOSITO IMEDIATO");
        btnDepositoImediato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositoImediatoActionPerformed(evt);
            }
        });

        btnDepositoCheque.setBackground(new java.awt.Color(255, 255, 255));
        btnDepositoCheque.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDepositoCheque.setForeground(new java.awt.Color(0, 0, 0));
        btnDepositoCheque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/depositocheque.jpg"))); // NOI18N
        btnDepositoCheque.setText("DEPOSITO EM CHEQUE");
        btnDepositoCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositoChequeActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ÁREA DE DEPOSITO");

        BtnVoltaMenuDeposito.setText("VOLTAR PARA O MENU");
        BtnVoltaMenuDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltaMenuDepositoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(BtnVoltaMenuDeposito)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 155, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDepositoCheque)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDepositoImediato)
                        .addGap(163, 163, 163))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)))
                .addGap(21, 21, 21)
                .addComponent(btnDepositoImediato, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnDepositoCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(BtnVoltaMenuDeposito)
                .addGap(60, 60, 60))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 450);

        setSize(new java.awt.Dimension(616, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositoChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoChequeActionPerformed
       JOptionPane.showMessageDialog(null, "Deposito em cheque indisponivel no momento",
      "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnDepositoChequeActionPerformed

    private void BtnVoltaMenuDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltaMenuDepositoActionPerformed
        TelaMenu t1 = new TelaMenu();
 
        t1.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_BtnVoltaMenuDepositoActionPerformed
    
    private void btnDepositoImediatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoImediatoActionPerformed
      deposito = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor do deposito "));
      JOptionPane.showMessageDialog(null, "O valor depositado é " + deposito);
      Saldo model = new Saldo ();
      model.setSaldo(deposito);
      TelaMenu menu = new TelaMenu();
      menu.ExportaSaldoDeposito(model);
      menu.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnDepositoImediatoActionPerformed

   
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
            java.util.logging.Logger.getLogger(TelaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeposito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVoltaMenuDeposito;
    private javax.swing.JButton btnDepositoCheque;
    private javax.swing.JButton btnDepositoImediato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
