/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import model.bean.Vaga;
import model.dao.VagaDAO;
/**
 *
 * @author gabri
 */
public class JFCadastrarVaga extends javax.swing.JFrame {

    /**
     * Creates new form JFCadastrarVaga
     */
    public JFCadastrarVaga() {
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

        BGTipoVaga = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFnumero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFRua = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRBObliqua = new javax.swing.JRadioButton();
        jRBParalela = new javax.swing.JRadioButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnLimpar = new javax.swing.JButton();
        jBtnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastrar Vaga");

        jLabel2.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLabel2.setText("Número");

        jTFnumero.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jTFnumero.setName("jTFNumero"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLabel3.setText("Rua");

        jTFRua.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jTFRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFRuaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLabel4.setText("Tipo de vaga");

        BGTipoVaga.add(jRBObliqua);
        jRBObliqua.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jRBObliqua.setText("Obliqua");
        jRBObliqua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBObliquaActionPerformed(evt);
            }
        });

        BGTipoVaga.add(jRBParalela);
        jRBParalela.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jRBParalela.setText("Paralela");

        jBtnCancelar.setText("Cancelar");

        jBtnLimpar.setText("Limpar");

        jBtnSalvar.setText("Salvar");
        jBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFnumero)
                            .addComponent(jTFRua)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jRBObliqua)
                                .addGap(92, 92, 92)
                                .addComponent(jRBParalela)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBObliqua)
                    .addComponent(jRBParalela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSalvar)
                    .addComponent(jBtnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBObliquaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBObliquaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBObliquaActionPerformed

    private void jBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarActionPerformed
       Vaga v = new Vaga();
       VagaDAO dao = new VagaDAO();
       v.setNumero(Integer.parseInt(jTFnumero.getText()));
       v.setRua(jTFRua.getText());
       if(jRBObliqua.isSelected()){
           v.setObliquo(true);
       }else if (jRBParalela.isSelected()){
           v.setObliquo(false);
       }
       dao.create(v);
// TODO add your handling code here:
    }//GEN-LAST:event_jBtnSalvarActionPerformed

    private void jTFRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFRuaActionPerformed

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
            java.util.logging.Logger.getLogger(JFCadastrarVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCadastrarVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCadastrarVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCadastrarVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCadastrarVaga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGTipoVaga;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnLimpar;
    private javax.swing.JButton jBtnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRBObliqua;
    private javax.swing.JRadioButton jRBParalela;
    private javax.swing.JTextField jTFRua;
    private javax.swing.JTextField jTFnumero;
    // End of variables declaration//GEN-END:variables
}
