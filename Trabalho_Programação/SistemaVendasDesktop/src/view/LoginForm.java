package view;

import connection.SingleConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.beans.VendedorBeans;
import model.dao.DaoVendedor;

public class LoginForm extends javax.swing.JFrame {


    DaoVendedor daoVendedor = new DaoVendedor();
    VendedorBeans beans = new VendedorBeans();
//    VendasForm form = new VendasForm();
    private Connection connection;
    public static int idVendedor;
    public static String nome;

    public LoginForm() {
        initComponents();
        connection = SingleConnection.getConnection();
    }

    public void validarVendedor() {
        try {
            String sql = "select * from vendedor where nomeUsuario = ? and codVendedor = ?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, jTextFieldUsuario.getText());
            pst.setString(2, jPasswordField.getText());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                MainForm main = new MainForm();
                main.setVisible(true);
                dispose();
                VendasForm form = new VendasForm();
                nome = rs.getString(5);
                idVendedor = rs.getInt("idVendedor");
            } else {
                JOptionPane.showMessageDialog(null, "Dados Inválidos!!!");
                jTextFieldUsuario.setText("");
                jPasswordField.setText("");
                jTextFieldUsuario.requestFocus();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados Inválidos!!!");
            jTextFieldUsuario.setText("");
            jPasswordField.setText("");
            jTextFieldUsuario.requestFocus();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonSair = new javax.swing.JButton();
        jButtonEntrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuario:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 140, 80, 30);

        jTextFieldUsuario.setBackground(new java.awt.Color(240, 240, 245));
        jTextFieldUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(90, 140, 270, 30);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PassWord:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 190, 80, 19);

        jPasswordField.setBackground(new java.awt.Color(240, 240, 245));
        jPasswordField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField);
        jPasswordField.setBounds(90, 190, 270, 30);

        jButtonSair.setBackground(new java.awt.Color(255, 51, 51));
        jButtonSair.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setText("Sair");
        jButtonSair.setBorderPainted(false);
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSair.setFocusPainted(false);
        jButtonSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSairMouseExited(evt);
            }
        });
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSair);
        jButtonSair.setBounds(10, 290, 350, 35);

        jButtonEntrar.setBackground(new java.awt.Color(0, 102, 153));
        jButtonEntrar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntrar.setText("Acessar");
        jButtonEntrar.setBorderPainted(false);
        jButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrar.setFocusPainted(false);
        jButtonEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEntrarMouseExited(evt);
            }
        });
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEntrar);
        jButtonEntrar.setBounds(10, 240, 350, 35);

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setBackground(new java.awt.Color(153, 204, 255));
        jLabel1.setFont(new java.awt.Font("GungsuhChe", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Acesso Ao Sistema ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 390, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(372, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEntrarMouseEntered
        jButtonEntrar.setBackground(new Color(235, 235, 235));
        jButtonEntrar.setForeground(new Color(0, 102, 153));
    }//GEN-LAST:event_jButtonEntrarMouseEntered

    private void jButtonSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSairMouseExited
        jButtonSair.setBackground(new Color(255, 51, 51));
        jButtonSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButtonSairMouseExited

    private void jButtonSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSairMouseEntered
        jButtonSair.setBackground(new Color(235, 235, 235));
        jButtonSair.setForeground(new Color(255, 51, 51));
    }//GEN-LAST:event_jButtonSairMouseEntered

    private void jButtonEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEntrarMouseExited
        jButtonEntrar.setBackground(new Color(0, 102, 153));
        jButtonEntrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButtonEntrarMouseExited

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        validarVendedor();
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        jPasswordField.requestFocus();
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        validarVendedor();
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
