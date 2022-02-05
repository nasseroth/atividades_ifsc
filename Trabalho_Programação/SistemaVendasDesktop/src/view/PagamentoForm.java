package view;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import static view.VendasForm.totalPagar;

/**
 *
 * @author Nasser-Othman
 */
public class PagamentoForm extends javax.swing.JFrame {

    DecimalFormat b = new DecimalFormat("#,###.00 MZN");
    private double money;
    private double pagarTotal;

    public PagamentoForm() {
        initComponents();
        jTextFieldPagar.setText(b.format(VendasForm.totalPagar));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldPagar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCard = new javax.swing.JTextField();
        jTextFieldVista = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBoxCard = new javax.swing.JCheckBox();
        jCheckBoxVista = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTroco = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButtonFimPag = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(248, 248, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pagamento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 10, 370, 60);

        jPanel3.setBackground(new java.awt.Color(248, 248, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldPagar.setEditable(false);
        jTextFieldPagar.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldPagar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextFieldPagar.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPagar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPagar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Valor A Pagar:");

        jTextFieldCard.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCard.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextFieldCard.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCard.setToolTipText("");

        jTextFieldVista.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldVista.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextFieldVista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldVista.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Insira o Valor:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Insira o Valor:");

        jCheckBoxCard.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jCheckBoxCard.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBoxCard.setText("Cartao");

        jCheckBoxVista.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jCheckBoxVista.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBoxVista.setText("A Vista");
        jCheckBoxVista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxVistaMouseClicked(evt);
            }
        });
        jCheckBoxVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxVistaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Forma de Pagamento");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Trocos:");

        jTextFieldTroco.setEditable(false);
        jTextFieldTroco.setBackground(new java.awt.Color(255, 153, 153));
        jTextFieldTroco.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextFieldTroco.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldTroco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTroco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxVista, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldVista, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBoxCard, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldTroco)
                            .addComponent(jTextFieldCard, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(jTextFieldPagar))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxVista)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldVista, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jCheckBoxCard)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 80, 370, 350);

        jPanel4.setBackground(new java.awt.Color(248, 248, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonFimPag.setBackground(new java.awt.Color(255, 51, 51));
        jButtonFimPag.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jButtonFimPag.setForeground(new java.awt.Color(0, 0, 0));
        jButtonFimPag.setText("Finalizar Pagamento");
        jButtonFimPag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFimPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFimPagActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jButtonFimPag, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonFimPag, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 440, 370, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(421, 551));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxVistaActionPerformed

    }//GEN-LAST:event_jCheckBoxVistaActionPerformed

    private void jCheckBoxVistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxVistaMouseClicked

    }//GEN-LAST:event_jCheckBoxVistaMouseClicked

    private void jButtonFimPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFimPagActionPerformed
        if (jCheckBoxVista.isSelected()) {
            if (jTextFieldVista.getText() == null) {
                JOptionPane.showMessageDialog(null, "Insira o Valor Primeiro!!!");
            } else {
                VendasForm form = new VendasForm();
                pagarVista();
                form.salvarVenda();
                form.salvarDetalhes();
                form.actualizarStock();
                form.gerarNrSerie();
                JOptionPane.showMessageDialog(null, "Venda Realizada Com Sucesso");
                dispose();
            }

        }

    }//GEN-LAST:event_jButtonFimPagActionPerformed

    public void pagarVista() {
        money = Double.parseDouble(jTextFieldVista.getText());
        pagarTotal = totalPagar - money;
        if (money == totalPagar) {
            JOptionPane.showMessageDialog(null, "Venda Realizada com Sucesso!!!");
            dispose();
        } else if (money < totalPagar) {
            JOptionPane.showMessageDialog(null, "Venda nao Realizada\n"
                    + "O Valor Inserido nao e suficiente\nFaltam " + b.format(pagarTotal));
        } else if (money > totalPagar) {
            pagarTotal = money - totalPagar;
            jTextFieldTroco.setText(b.format(pagarTotal));
            JOptionPane.showMessageDialog(null, "Venda Realizada com Sucesso!!!");
            dispose();
        }
    }

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
            java.util.logging.Logger.getLogger(PagamentoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagamentoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagamentoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagamentoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagamentoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFimPag;
    private javax.swing.JCheckBox jCheckBoxCard;
    private javax.swing.JCheckBox jCheckBoxVista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextFieldCard;
    private javax.swing.JTextField jTextFieldPagar;
    public static javax.swing.JTextField jTextFieldTroco;
    public static javax.swing.JTextField jTextFieldVista;
    // End of variables declaration//GEN-END:variables
}
