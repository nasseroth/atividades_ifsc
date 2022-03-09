package view;

import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.beans.ProdutoBeans;
import model.dao.DaoProduto;

/**
 *
 * @author Nasser-Othman
 */
public class ProdutoForm extends javax.swing.JInternalFrame {

    DaoProduto produto = new DaoProduto();
    ProdutoBeans beans = new ProdutoBeans();
    DefaultTableModel model = new DefaultTableModel();
    int flag = 0;

    public ProdutoForm() {
        initComponents();
        listar();
    }

    //Metodo resposanvel por listar os dados na tabela
    private void listar() {
        List<ProdutoBeans> lista = produto.listarProduto();
        model = (DefaultTableModel) jTableProduto.getModel();
        Object[] objects = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            objects[0] = lista.get(i).getIdProduto();
            objects[1] = lista.get(i).getNomeProduto();
            objects[2] = lista.get(i).getPrecoProduto();
            objects[3] = lista.get(i).getQuantProduto();
            objects[4] = lista.get(i).getEstadoProduto();
            model.addRow(objects);
        }
        jTableProduto.setModel(model);
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
        jTextFieldPreco.setEnabled(!true);
        jTextFieldStock.setEnabled(!true);
        jComboBoxEstado.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(!true);
        jButtonEditar.setEnabled(!true);
        jButtonEliminar.setEnabled(!true);
        jButtonCancel.setEnabled(!true);
        jTextFieldID.setText("");
        jTextFieldNome.setText("");
        jTextFieldPreco.setText("");
        jTextFieldStock.setText("");
        jComboBoxEstado.setSelectedItem("Selecione");
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
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldStock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProduto = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Produtos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(248, 248, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("ID:");

        jTextFieldID.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jTextFieldID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextFieldID.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nome do Produto:");

        jTextFieldNome.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jTextFieldNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextFieldNome.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Preco do Produto:");

        jTextFieldPreco.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jTextFieldPreco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextFieldPreco.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Stock:");

        jTextFieldStock.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jTextFieldStock.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextFieldStock.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Estado:");

        jComboBoxEstado.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1", "0" }));
        jComboBoxEstado.setToolTipText("1 - Activo, 0 - Inactivo");
        jComboBoxEstado.setEnabled(false);

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

        jButtonCancel.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCancel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.setBorderPainted(false);
        jButtonCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancel.setEnabled(false);
        jButtonCancel.setFocusPainted(false);
        jButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCancelMouseExited(evt);
            }
        });
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldStock))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
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
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonNovo))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(248, 248, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome do Produto", "Preco", "Stock", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProduto);
        if (jTableProduto.getColumnModel().getColumnCount() > 0) {
            jTableProduto.getColumnModel().getColumn(0).setResizable(false);
            jTableProduto.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTableProduto.getColumnModel().getColumn(1).setResizable(false);
            jTableProduto.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTableProduto.getColumnModel().getColumn(2).setResizable(false);
            jTableProduto.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTableProduto.getColumnModel().getColumn(3).setResizable(false);
            jTableProduto.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTableProduto.getColumnModel().getColumn(4).setResizable(false);
            jTableProduto.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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
        jTextFieldPreco.setEnabled(true);
        jTextFieldStock.setEnabled(true);
        jComboBoxEstado.setEnabled(true);
        jButtonNovo.setEnabled(!true);
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(!true);
        jButtonEliminar.setEnabled(!true);
        jButtonCancel.setEnabled(true);
        jTextFieldID.setText("");
        jTextFieldNome.setText("");
        jTextFieldPreco.setText("");
        jTextFieldStock.setText("");
        jComboBoxEstado.setSelectedItem("Selecione");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome do Produto!");
            jTextFieldNome.requestFocus();
        } else if (jTextFieldPreco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Preco!");
            jTextFieldPreco.requestFocus();
        } else if (jTextFieldStock.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Stock");
            jTextFieldStock.requestFocus();
        } else if (!jComboBoxEstado.getSelectedItem().equals("1")
                && !jComboBoxEstado.getSelectedItem().equals("0")) {
            JOptionPane.showMessageDialog(null, "Selecione Um Estado\n1-Activo 0-Inactivo");
            jComboBoxEstado.requestFocus();
        } else if (flag == 1) {
            if (!produto.validaNomeProduto(jTextFieldNome.getText())) {
                JOptionPane.showMessageDialog(null, "Oops!\nNome do Produto ja Existe, Tente Outro!");
                jTextFieldNome.setText("");
                jTextFieldNome.requestFocus();
            } else if (produto.validaNomeProduto(jTextFieldNome.getText())) {
                beans.setNomeProduto(jTextFieldNome.getText());
                beans.setPrecoProduto(Double.parseDouble(jTextFieldPreco.getText()));
                beans.setQuantProduto(Integer.parseInt(jTextFieldStock.getText()));
                beans.setEstadoProduto(jComboBoxEstado.getSelectedItem().toString());
                produto.inserirProduto(beans);
                limparTabela();
                listar();
                refreshForm();
            } else {
                if (!produto.validaNomeProdutoUpdate(jTextFieldNome.getText(),
                        Integer.parseInt(jTextFieldID.getText()))) {
                    JOptionPane.showMessageDialog(null, "Oops!\nNome do Produto ja Existe, Tente Outro!");
                    jTextFieldNome.setText("");
                    jTextFieldNome.requestFocus();
                } else if (produto.validaNomeProdutoUpdate(jTextFieldNome.getText(),
                        Integer.parseInt(jTextFieldID.getText()))) {
                    beans.setNomeProduto(jTextFieldNome.getText());
                    beans.setPrecoProduto(Double.parseDouble(jTextFieldPreco.getText()));
                    beans.setQuantProduto(Integer.parseInt(jTextFieldStock.getText()));
                    beans.setEstadoProduto(jComboBoxEstado.getSelectedItem().toString());
                    beans.setIdProduto(Integer.parseInt(jTextFieldID.getText()));
                    produto.atualizarProduto(beans);
                    limparTabela();
                    listar();
                    refreshForm();
                }
            }
        } else {
            if (!produto.validaNomeProdutoUpdate(jTextFieldNome.getText(),
                    Integer.parseInt(jTextFieldID.getText()))) {
                JOptionPane.showMessageDialog(null, "Oops!\nNome do Produto ja Existe, Tente Outro!");
                jTextFieldNome.setText("");
                jTextFieldNome.requestFocus();
            } else if (produto.validaNomeProdutoUpdate(jTextFieldNome.getText(),
                    Integer.parseInt(jTextFieldID.getText()))) {
                beans.setNomeProduto(jTextFieldNome.getText());
                beans.setPrecoProduto(Double.parseDouble(jTextFieldPreco.getText()));
                beans.setQuantProduto(Integer.parseInt(jTextFieldStock.getText()));
                beans.setEstadoProduto(jComboBoxEstado.getSelectedItem().toString());
                beans.setIdProduto(Integer.parseInt(jTextFieldID.getText()));
                produto.atualizarProduto(beans);
                limparTabela();
                listar();
                refreshForm();
            }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        jTextFieldNome.setEnabled(true);
        jTextFieldPreco.setEnabled(true);
        jTextFieldStock.setEnabled(true);
        jComboBoxEstado.setEnabled(true);
        jButtonNovo.setEnabled(!true);
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(!true);
        jButtonEliminar.setEnabled(!true);
        jButtonCancel.setEnabled(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int excluir = JOptionPane.showConfirmDialog(null, "Deseja Excluir esse Registo?",
                "Atencao", JOptionPane.YES_NO_OPTION);
        if (excluir == JOptionPane.YES_OPTION) {
            beans.setIdProduto(Integer.parseInt(jTextFieldID.getText()));
            produto.excluirProduto(beans);
            limparTabela();
            listar();
            refreshForm();
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        refreshForm();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutoMouseClicked
        int row = jTableProduto.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma Fila");
        } else {
            jTextFieldID.setText(jTableProduto.getValueAt(row, 0).toString());
            jTextFieldNome.setText(jTableProduto.getValueAt(row, 1).toString());
            jTextFieldPreco.setText(jTableProduto.getValueAt(row, 2).toString());
            jTextFieldStock.setText(jTableProduto.getValueAt(row, 3).toString());
            jComboBoxEstado.setSelectedItem(jTableProduto.getValueAt(row, 4).toString());
            jTextFieldNome.setEnabled(!true);
            jTextFieldPreco.setEnabled(!true);
            jTextFieldStock.setEnabled(!true);
            jComboBoxEstado.setEnabled(!true);
            jButtonNovo.setEnabled(!true);
            jButtonSalvar.setEnabled(!true);
            jButtonEditar.setEnabled(true);
            jButtonEliminar.setEnabled(true);
            jButtonCancel.setEnabled(true);
        }
    }//GEN-LAST:event_jTableProdutoMouseClicked

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

    private void jButtonCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseEntered
        jButtonCancel.setBackground(new Color(235, 235, 235));
        jButtonCancel.setForeground(new Color(255, 51, 51));
    }//GEN-LAST:event_jButtonCancelMouseEntered

    private void jButtonCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseExited
        jButtonCancel.setBackground(new Color(255, 51, 51));
        jButtonCancel.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonCancelMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProduto;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldStock;
    // End of variables declaration//GEN-END:variables
}
