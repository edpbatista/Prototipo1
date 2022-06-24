/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Edimar
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cx_nome = new javax.swing.JTextField();
        cx_estoque = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cx_tabela = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        cx_pesquisa = new javax.swing.JTextField();
        btn_pequisa = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cx_codigo1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(84, 84, 84));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("código:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 10, 60, 19);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 10, 44, 19);
        jPanel1.add(cx_nome);
        cx_nome.setBounds(150, 40, 560, 30);
        jPanel1.add(cx_estoque);
        cx_estoque.setBounds(50, 110, 660, 30);

        cx_tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cx_tabela);
        if (cx_tabela.getColumnModel().getColumnCount() > 0) {
            cx_tabela.getColumnModel().getColumn(1).setPreferredWidth(400);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 210, 660, 230);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pesquisar : ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 160, 90, 30);
        jPanel1.add(cx_pesquisa);
        cx_pesquisa.setBounds(140, 160, 440, 30);

        btn_pequisa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_pequisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-pesquisar-48.png"))); // NOI18N
        btn_pequisa.setText("Pesquisar");
        jPanel1.add(btn_pequisa);
        btn_pequisa.setBounds(590, 160, 120, 30);

        btnVoltar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-desfazer-48.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar);
        btnVoltar.setBounds(50, 450, 110, 30);

        btn_novo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-adicionar-48.png"))); // NOI18N
        btn_novo.setText("Novo");
        jPanel1.add(btn_novo);
        btn_novo.setBounds(410, 450, 110, 30);

        btn_alterar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-atualizações-disponíveis-48.png"))); // NOI18N
        btn_alterar.setText("Alterar");
        jPanel1.add(btn_alterar);
        btn_alterar.setBounds(290, 450, 110, 30);

        btn_excluir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-excluir-propriedade-48.png"))); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.setMaximumSize(new java.awt.Dimension(109, 29));
        btn_excluir.setMinimumSize(new java.awt.Dimension(109, 29));
        jPanel1.add(btn_excluir);
        btn_excluir.setBounds(170, 450, 110, 30);

        btn_salvar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-salvar-e-fechar-48.png"))); // NOI18N
        btn_salvar.setText("Salvar");
        jPanel1.add(btn_salvar);
        btn_salvar.setBounds(600, 450, 110, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/INVENTORY cinza escuro.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(310, 10, 150, 170);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Código de barra: ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 80, 140, 19);
        jPanel1.add(cx_codigo1);
        cx_codigo1.setBounds(50, 40, 80, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 750, 500);

        setSize(new java.awt.Dimension(766, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
     TelaMenu t1 = new TelaMenu ();
     t1.setVisible(true);
     this.dispose();
    
      
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_pequisa;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JTextField cx_codigo1;
    private javax.swing.JTextField cx_estoque;
    private javax.swing.JTextField cx_nome;
    private javax.swing.JTextField cx_pesquisa;
    private javax.swing.JTable cx_tabela;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}