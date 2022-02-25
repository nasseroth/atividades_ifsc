package view;

import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.beans.VendedorBeans;
import model.dao.DaoVendedor;

/**
 *
 * @author Nasser-Othman
 */
public class VendedorForm extends javax.swing.JInternalFrame {

    VendedorBeans beans = new VendedorBeans();
    DaoVendedor vendedor = new DaoVendedor();
    DefaultTableModel model = new DefaultTableModel();
    int flag = 0;

    public VendedorForm() {
        initComponents();
        listar();
    }

    //Metodo resposanvel por listar os dados na tabela
    private void listar() {
        List<VendedorBeans> lista = vendedor.listarVendedor();
        model = (DefaultTableModel) jTableVendedor.getModel();
        Object[] objects = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            objects[0] = lista.get(i).getIdVendedor();
            objects[1] = lista.get(i).getNomeVendedor();
            objects[2] = lista.get(i).getTelefoneVendedor();
            objects[3] = lista.get(i).getNomeUsuario();
            objects[4] = lista.get(i).getEstadoVendedor();
            objects[5] = lista.get(i).getCodVendedor();
            model.addRow(objects);
        }
        jTableVendedor.setModel(model);
    }

    //Limpa a tabela quando ha uma actualizacao 
    private void limparTabela() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

    private void refreshForm() {
        jTextFieldNome.setEnabled(!true);
        jTextFieldMobile.setEnabled(!true);
        jTextFieldUserName.setEnabled(!true);
        jPasswordFieldPass.setEnabled(!true);
        jComboBoxEstado.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(!true);
        jButtonEditar.setEnabled(!true);
        jButtonEliminar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jComboBoxEstado.setSelectedItem("Selecione");
        jTextFieldID.setText("");
        jTextFieldMobile.setText("");
        jTextFieldNome.setText("");
        jTextFieldUserName.setText("");
        jPasswordFieldPass.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMobile = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordFieldPass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jButtonEditar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVendedor = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Vendedor");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(248, 248, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("ID:");

        jTextFieldID.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jTextFieldID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextFieldID.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jTextFieldNome.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jTextFieldNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextFieldNome.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Telefone:");

        jTextFieldMobile.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jTextFieldMobile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextFieldMobile.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Nome de Usuario:");

        jTextFieldUserName.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jTextFieldUserName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextFieldUserName.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Senha:");

        jPasswordFieldPass.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jPasswordFieldPass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPasswordFieldPass.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Estado:");

        jComboBoxEstado.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1", "0" }));
        jComboBoxEstado.setToolTipText("1 - Activo, 0 - Inactivo");
        jComboBoxEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxEstado.setEnabled(false);

        jButtonEditar.setBackground(new java.awt.Color(153, 255, 153));
        jButtonEditar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setBorderPainted(false);
        jButtonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditar.setEnabled(false);
        jButtonEditar.setFocusPainted(false);
        jButtonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEditarMouseExited(evt);
            }
        });
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonSalvar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonSalvar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/floppy.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setBorderPainted(false);
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.setFocusPainted(false);
        jButtonSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSalvarMouseExited(evt);
            }
        });
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonNovo.setBackground(new java.awt.Color(0, 102, 153));
        jButtonNovo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-button1.png"))); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.setBorderPainted(false);
        jButtonNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNovo.setFocusPainted(false);
        jButtonNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNovoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonNovoMouseExited(evt);
            }
        });
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCancelar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setBorderPainted(false);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.setFocusPainted(false);
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseExited(evt);
            }
        });
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(241, 116, 33));
        jButtonEliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setBorderPainted(false);
        jButtonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEliminar.setEnabled(false);
        jButtonEliminar.setFocusPainted(false);
        jButtonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEliminarMouseExited(evt);
            }
        });
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordFieldPass))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPasswordFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonNovo))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(240, 240, 245));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableVendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome do Vendedor ", "Telefone", "Nome de Usuário", "Estado", "Senha", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVendedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVendedor);
        if (jTableVendedor.getColumnModel().getColumnCount() > 0) {
            jTableVendedor.getColumnModel().getColumn(0).setResizable(false);
            jTableVendedor.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTableVendedor.getColumnModel().getColumn(1).setResizable(false);
            jTableVendedor.getColumnModel().getColumn(1).setPreferredWidth(220);
            jTableVendedor.getColumnModel().getColumn(2).setResizable(false);
            jTableVendedor.getColumnModel().getColumn(2).setPreferredWidth(110);
            jTableVendedor.getColumnModel().getColumn(3).setResizable(false);
            jTableVendedor.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTableVendedor.getColumnModel().getColumn(4).setResizable(false);
            jTableVendedor.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTableVendedor.getColumnModel().getColumn(5).setResizable(false);
            jTableVendedor.getColumnModel().getColumn(5).setPreferredWidth(65);
            jTableVendedor.getColumnModel().getColumn(6).setResizable(false);
            jTableVendedor.getColumnModel().getColumn(6).setPreferredWidth(0);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jTextFieldNome.setEnabled(true);
        jTextFieldMobile.setEnabled(true);
        jTextFieldUserName.setEnabled(true);
        jPasswordFieldPass.setEnabled(true);
        jComboBoxEstado.setEnabled(true);
        jButtonNovo.setEnabled(!true);
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(!true);
        jButtonEliminar.setEnabled(!true);
        jButtonCancelar.setEnabled(true);
        jTextFieldID.setText("");
        jTextFieldMobile.setText("");
        jTextFieldNome.setText("");
        jTextFieldUserName.setText("");
        jPasswordFieldPass.setText("");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Nome!");
            jTextFieldNome.requestFocus();
        } else if (jTextFieldUserName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome De Usuario!");
            jTextFieldUserName.requestFocus();
        } else if (jPasswordFieldPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Senha");
            jPasswordFieldPass.requestFocus();
        } else if (!jComboBoxEstado.getSelectedItem().equals("1")
                && !jComboBoxEstado.getSelectedItem().equals("0")) {
            JOptionPane.showMessageDialog(null, "Selecione Um Estado\n1-Activo 0-Inactivo");
            jComboBoxEstado.requestFocus();
        } else if (flag == 1) {
            if (!vendedor.validaNomeUsuario(jTextFieldUserName.getText())) {
                JOptionPane.showMessageDialog(null, "Oops!\nNome de Usuario ja Existe, Tente Outro!");
                jTextFieldUserName.setText("");
                jTextFieldUserName.requestFocus();
            } else if (!vendedor.validaCodVendedor(jPasswordFieldPass.getText())) {
                JOptionPane.showMessageDialog(null, "Oops\nSenha ja Existe, Tente Outra!");
                jPasswordFieldPass.setText("");
                jPasswordFieldPass.requestFocus();
            } else if (vendedor.validaNomeUsuario(jTextFieldUserName.getText())
                    && vendedor.validaCodVendedor(jPasswordFieldPass.getText())) {
                beans.setNomeVendedor(jTextFieldNome.getText());
                beans.setTelefoneVendedor(jTextFieldMobile.getText());
                beans.setNomeUsuario(jTextFieldUserName.getText());
                beans.setCodVendedor(jPasswordFieldPass.getText());
                beans.setEstadoVendedor(jComboBoxEstado.getSelectedItem().toString());
                vendedor.inserirVendedor(beans);
                limparTabela();
                listar();
                refreshForm();
            }
        } else {
            if (!vendedor.validaNomeUsuarioUpdate(jTextFieldUserName.getText(),
                    Integer.parseInt(jTextFieldID.getText()))) {
                JOptionPane.showMessageDialog(null, "Oops!!!\nNome de Usuario ja Existe, Tente Outro!");
                jTextFieldUserName.setText("");
                jTextFieldUserName.requestFocus();
            } else if (!vendedor.validaCodVendedorUpdate(jPasswordFieldPass.getText(),
                    Integer.parseInt(jTextFieldID.getText()))) {
                JOptionPane.showMessageDialog(null, "Oops!!!\nSenha ja existe, Tente Outra");
                jPasswordFieldPass.setText("");
                jPasswordFieldPass.requestFocus();
            } else if (vendedor.validaNomeUsuarioUpdate(jTextFieldUserName.getText(),
                    Integer.parseInt(jTextFieldID.getText()))
                    && vendedor.validaCodVendedorUpdate(jPasswordFieldPass.getText(),
                            Integer.parseInt(jTextFieldID.getText()))) {
                beans.setNomeVendedor(jTextFieldNome.getText());
                beans.setTelefoneVendedor(jTextFieldMobile.getText());
                beans.setNomeUsuario(jTextFieldUserName.getText());
                beans.setCodVendedor(jPasswordFieldPass.getText());
                beans.setEstadoVendedor(jComboBoxEstado.getSelectedItem().toString());
                beans.setIdVendedor(Integer.parseInt(jTextFieldID.getText()));
                vendedor.actualizaVendedor(beans);
                limparTabela();
                listar();
                refreshForm();
            }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        jTextFieldNome.setEnabled(true);
        jTextFieldMobile.setEnabled(true);
        jTextFieldUserName.setEnabled(true);
        jPasswordFieldPass.setEnabled(true);
        jComboBoxEstado.setEnabled(true);
        jButtonNovo.setEnabled(!true);
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(!true);
        jButtonEliminar.setEnabled(!true);
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int excluir = JOptionPane.showConfirmDialog(null, "Deseja Excluir esse Registo?",
                "Atencao", JOptionPane.YES_NO_OPTION);
        if (excluir == JOptionPane.YES_OPTION) {
            beans.setIdVendedor(Integer.parseInt(jTextFieldID.getText()));
            vendedor.excluirVendedor(beans);
            limparTabela();
            listar();
            refreshForm();
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        refreshForm();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTableVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVendedorMouseClicked
        int row = jTableVendedor.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma fila");
        } else {
            jTextFieldID.setText(jTableVendedor.getValueAt(row, 0).toString());
            jTextFieldNome.setText(jTableVendedor.getValueAt(row, 1).toString());
            jTextFieldMobile.setText(jTableVendedor.getValueAt(row, 2).toString());
            jTextFieldUserName.setText(jTableVendedor.getValueAt(row, 3).toString());
            jComboBoxEstado.setSelectedItem(jTableVendedor.getValueAt(row, 4).toString());
            jPasswordFieldPass.setText(jTableVendedor.getValueAt(row, 5).toString());
            jTextFieldNome.setEnabled(!true);
            jTextFieldMobile.setEnabled(!true);
            jTextFieldUserName.setEnabled(!true);
            jPasswordFieldPass.setEnabled(!true);
            jComboBoxEstado.setEnabled(!true);
            jButtonNovo.setEnabled(!true);
            jButtonSalvar.setEnabled(!true);
            jButtonEditar.setEnabled(true);
            jButtonEliminar.setEnabled(true);
            jButtonCancelar.setEnabled(true);
        }
    }//GEN-LAST:event_jTableVendedorMouseClicked

    private void jButtonNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNovoMouseEntered
        jButtonNovo.setBackground(new Color(235, 235, 235));
        jButtonNovo.setForeground(new Color(0, 102, 153));
    }//GEN-LAST:event_jButtonNovoMouseEntered

    private void jButtonNovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNovoMouseExited
        jButtonNovo.setBackground(new Color(0, 102, 153));
        jButtonNovo.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonNovoMouseExited

    private void jButtonSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvarMouseEntered
        jButtonSalvar.setBackground(new Color(235, 235, 235));
        jButtonSalvar.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_jButtonSalvarMouseEntered

    private void jButtonSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvarMouseExited
        jButtonSalvar.setBackground(new Color(0, 153, 153));
        jButtonSalvar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonSalvarMouseExited

    private void jButtonEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarMouseEntered
        jButtonEditar.setBackground(new Color(235, 235, 235));
        jButtonEditar.setForeground(new Color(153, 255, 153));
    }//GEN-LAST:event_jButtonEditarMouseEntered

    private void jButtonEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarMouseExited
        jButtonEditar.setBackground(new Color(153, 255, 153));
        jButtonEditar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonEditarMouseExited

    private void jButtonEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseEntered
        jButtonEliminar.setBackground(new Color(235, 235, 235));
        jButtonEliminar.setForeground(new Color(241, 116, 33));
    }//GEN-LAST:event_jButtonEliminarMouseEntered

    private void jButtonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseExited
        jButtonEliminar.setBackground(new Color(241, 116, 33));
        jButtonEliminar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonEliminarMouseExited

    private void jButtonCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseEntered
        jButtonCancelar.setBackground(new Color(235, 235, 235));
        jButtonCancelar.setForeground(new Color(255, 51, 51));
    }//GEN-LAST:event_jButtonCancelarMouseEntered

    private void jButtonCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseExited
        jButtonCancelar.setBackground(new Color(255, 51, 51));
        jButtonCancelar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonCancelarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVendedor;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldMobile;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
