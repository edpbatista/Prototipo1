/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Edimar
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEntrada = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnSaida = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(84, 84, 84));
        jPanel2.setForeground(new java.awt.Color(51, 102, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONTROLE DE ESTOQUE ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(160, 10, 470, 47);

        btnEntrada.setBackground(new java.awt.Color(255, 102, 102));
        btnEntrada.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-enviar-mensagem-48.png"))); // NOI18N
        btnEntrada.setText("Registrar Entrada  ");
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });
        jPanel2.add(btnEntrada);
        btnEntrada.setBounds(230, 150, 320, 42);

        btnSair.setBackground(new java.awt.Color(255, 102, 102));
        btnSair.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-sair-48.png"))); // NOI18N
        btnSair.setText("sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel2.add(btnSair);
        btnSair.setBounds(231, 410, 320, 42);

        btnSaida.setBackground(new java.awt.Color(255, 102, 102));
        btnSaida.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-baixarmensagem-48 - Copia.png"))); // NOI18N
        btnSaida.setText("Registrar Saida      ");
        btnSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSaida);
        btnSaida.setBounds(230, 220, 320, 42);

        btnRelatorio.setBackground(new java.awt.Color(255, 102, 102));
        btnRelatorio.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-??rea-de-transfer??ncia-48.png"))); // NOI18N
        btnRelatorio.setText("Relatorio                 ");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });
        jPanel2.add(btnRelatorio);
        btnRelatorio.setBounds(230, 340, 320, 42);

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/INVENTORY cinza escuro.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(310, 30, 150, 121);

        btnCadastrar.setBackground(new java.awt.Color(255, 102, 102));
        btnCadastrar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-??rea-de-transfer??ncia-48.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar produtos");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCadastrar);
        btnCadastrar.setBounds(230, 280, 320, 42);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 2322, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1518, 534);

        setSize(new java.awt.Dimension(766, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
     TelaEntrada t1 = new TelaEntrada();
     t1.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_btnEntradaActionPerformed

    private void btnSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaActionPerformed
     TelaSainda t1 = new TelaSainda();
     t1.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_btnSaidaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       TelaLogin t1 = new TelaLogin ();
       t1.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
    JOptionPane.showMessageDialog(null, "RELATORIO GERADO! ");
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
       TelaCadastro t1 = new TelaCadastro ();
       t1.setVisible(true);
       this.dispose();     
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSaida;
    private javax.swing.JButton btnSair;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
