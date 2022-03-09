package view;

import java.awt.Color;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.beans.CaracteristicaProdutoBeans;
import model.beans.CorBeans;
import model.beans.ProdutoBeans;
import model.dao.DaoCaracteristicaProduto;
import model.dao.DaoCor;
import model.dao.DaoProduto;

/**
 *
 * @author Nasser-Othman
 */
public class CaracteristicaProdutoForm extends javax.swing.JInternalFrame {

    DaoCaracteristicaProduto caracteristicaProduto = new DaoCaracteristicaProduto();
    CaracteristicaProdutoBeans beans = new CaracteristicaProdutoBeans();
    DefaultTableModel model = new DefaultTableModel();
    ProdutoBeans produtoBeans = new ProdutoBeans();
    CorBeans corBeans = new CorBeans();
    DaoProduto daoProduto = new DaoProduto();
    DaoCor daoCor = new DaoCor();

    int flag = 0;

    public CaracteristicaProdutoForm() {
        initComponents();
        listar();
    }

    //Metodo resposanvel por listar os dados na tabela
    public void listar() {
        List<CaracteristicaProdutoBeans> lista = caracteristicaProduto.listarCaracteristicaProduto();
        model = (DefaultTableModel) jTableCaracteristicaProduto.getModel();
        Object[] objects = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            objects[0] = lista.get(i).getIdCaracteristicaProduto();
            objects[1] = lista.get(i).getProduto().getIdProduto();
            objects[2] = lista.get(i).getCor().getIdCor();
            objects[3] = lista.get(i).getTamanhoProduto();
            objects[4] = lista.get(i).getBarraProduto();
            objects[5] = lista.get(i).getQtdEstoqueProduto();

            model.addRow(objects);
        }
        jTableCaracteristicaProduto.setModel(model);
    }

    //Limpa a tabela quando ha uma actualizacao 
    public void limparTabela() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

    public void refreshForm() {
        jTextFieldID.setEnabled(!true);
        jTextFieldCodProd.setEnabled(!true);
        jTextFieldNomeProd.setEnabled(!true);
        jTextFieldCodCor.setEnabled(!true);
        jTextFieldNomeCor.setEnabled(!true);
        jTextFieldTamanho.setEnabled(!true);
        jTextFieldBarras.setEnabled(!true);
        jTextFieldEstoque.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(!true);
        jButtonEditar.setEnabled(!true);
        jButtonEliminar.setEnabled(!true);
        jButtonCancel.setEnabled(!true);

        jTextFieldID.setText("");
        jTextFieldCodProd.setText("");
        jTextFieldNomeProd.setText("");
        jTextFieldCodCor.setText("");
        jTextFieldNomeCor.setText("");
        jTextFieldTamanho.setText("");
        jTextFieldBarras.setText("");
        jTextFieldEstoque.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCodProd = new javax.swing.JTextField();
        jButtonBuscaProd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCodCor = new javax.swing.JTextField();
        jButtonBuscaCor = new javax.swing.JButton();
        jTextFieldNomeProd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldNomeCor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTamanho = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldBarras = new javax.swing.JTextField();
        jTextFieldEstoque = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCaracteristicaProduto = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Caracteristicas do Produto");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(248, 248, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("ID:");

        jTextFieldID.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jTextFieldID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextFieldID.setEnabled(false);

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

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("COD.PRODUTO:");

        jTextFieldCodProd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextFieldCodProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodProdActionPerformed(evt);
            }
        });

        jButtonBuscaProd.setBackground(new java.awt.Color(153, 255, 153));
        jButtonBuscaProd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonBuscaProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jButtonBuscaProd.setText("Buscar");
        jButtonBuscaProd.setBorderPainted(false);
        jButtonBuscaProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscaProd.setFocusPainted(false);
        jButtonBuscaProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonBuscaProdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonBuscaProdMouseExited(evt);
            }
        });
        jButtonBuscaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaProdActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("COR:");

        jTextFieldCodCor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextFieldCodCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodCorActionPerformed(evt);
            }
        });

        jButtonBuscaCor.setBackground(new java.awt.Color(153, 255, 153));
        jButtonBuscaCor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonBuscaCor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jButtonBuscaCor.setText("Buscar");
        jButtonBuscaCor.setBorderPainted(false);
        jButtonBuscaCor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscaCor.setFocusPainted(false);
        jButtonBuscaCor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonBuscaCorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonBuscaCorMouseExited(evt);
            }
        });
        jButtonBuscaCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaCorActionPerformed(evt);
            }
        });

        jTextFieldNomeProd.setEditable(false);
        jTextFieldNomeProd.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeProd.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextFieldNomeProd.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldNomeProd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("PRODUTO:");

        jTextFieldNomeCor.setEditable(false);
        jTextFieldNomeCor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeCor.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextFieldNomeCor.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldNomeCor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("COR:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Tamanho Prod:");

        jTextFieldTamanho.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jTextFieldTamanho.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextFieldTamanho.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Cod. Barras:");

        jTextFieldBarras.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jTextFieldBarras.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextFieldBarras.setEnabled(false);

        jTextFieldEstoque.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEstoque.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextFieldEstoque.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldEstoque.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("ESTOQUE:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonBuscaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodCor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonBuscaCor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNomeCor, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(541, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jTextFieldNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jTextFieldCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonBuscaProd)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextFieldCodCor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonBuscaCor))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jTextFieldNomeCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextFieldBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonEliminar)
                        .addComponent(jButtonCancel))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonNovo)
                        .addComponent(jButtonSalvar)
                        .addComponent(jButtonEditar)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(95, 95, 95)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(95, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(248, 248, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableCaracteristicaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produto", "Cor", "Tamanho", "Cod Barras", "Estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCaracteristicaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCaracteristicaProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCaracteristicaProduto);
        if (jTableCaracteristicaProduto.getColumnModel().getColumnCount() > 0) {
            jTableCaracteristicaProduto.getColumnModel().getColumn(0).setResizable(false);
            jTableCaracteristicaProduto.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTableCaracteristicaProduto.getColumnModel().getColumn(1).setResizable(false);
            jTableCaracteristicaProduto.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTableCaracteristicaProduto.getColumnModel().getColumn(2).setResizable(false);
            jTableCaracteristicaProduto.getColumnModel().getColumn(3).setResizable(false);
            jTableCaracteristicaProduto.getColumnModel().getColumn(4).setResizable(false);
            jTableCaracteristicaProduto.getColumnModel().getColumn(5).setResizable(false);
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
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
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

    private void jTableCaracteristicaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCaracteristicaProdutoMouseClicked
        int row = jTableCaracteristicaProduto.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma Fila");
        } else {
            jTextFieldID.setText(jTableCaracteristicaProduto.getValueAt(row, 0).toString());
            jTextFieldCodProd.setText(jTableCaracteristicaProduto.getValueAt(row, 1).toString());
            jTextFieldCodCor.setText(jTableCaracteristicaProduto.getValueAt(row, 2).toString());
            jTextFieldTamanho.setText(jTableCaracteristicaProduto.getValueAt(row, 3).toString());
            jTextFieldBarras.setText(jTableCaracteristicaProduto.getValueAt(row, 4).toString());
            jTextFieldEstoque.setText(jTableCaracteristicaProduto.getValueAt(row, 5).toString());
            
            jTextFieldCodProd.setEnabled(!true);
            jTextFieldNomeProd.setEnabled(!true);
            jTextFieldCodCor.setEnabled(!true);
            jTextFieldNomeCor.setEnabled(!true);
            jTextFieldTamanho.setEnabled(!true);
            jTextFieldBarras.setEnabled(!true);
            jTextFieldEstoque.setEnabled(!true);
            jButtonNovo.setEnabled(!true);
            jButtonSalvar.setEnabled(!true);
            jButtonEditar.setEnabled(true);
            jButtonEliminar.setEnabled(true);
            jButtonCancel.setEnabled(true);
        }
    }//GEN-LAST:event_jTableCaracteristicaProdutoMouseClicked

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        refreshForm();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseExited
        jButtonCancel.setBackground(new Color(255, 51, 51));
        jButtonCancel.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonCancelMouseExited

    private void jButtonCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseEntered
        jButtonCancel.setBackground(new Color(235, 235, 235));
        jButtonCancel.setForeground(new Color(255, 51, 51));
    }//GEN-LAST:event_jButtonCancelMouseEntered

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int excluir = JOptionPane.showConfirmDialog(null, "Deseja Excluir esse Registo?",
                "Atencao", JOptionPane.YES_NO_OPTION);
        if (excluir == JOptionPane.YES_OPTION) {
            beans.setIdCaracteristicaProduto(Integer.parseInt(jTextFieldID.getText()));
            caracteristicaProduto.excluirCaracteristicaProduto(beans);
            limparTabela();
            listar();
            refreshForm();
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseExited
        jButtonEliminar.setBackground(new Color(241, 116, 33));
        jButtonEliminar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonEliminarMouseExited

    private void jButtonEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseEntered
        jButtonEliminar.setBackground(new Color(235, 235, 235));
        jButtonEliminar.setForeground(new Color(241, 116, 33));
    }//GEN-LAST:event_jButtonEliminarMouseEntered

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        jTextFieldID.setEnabled(true);
        jTextFieldCodProd.setEnabled(true);
        jTextFieldNomeProd.setEnabled(true);
        jTextFieldCodCor.setEnabled(true);
        jTextFieldNomeCor.setEnabled(true);
        jTextFieldTamanho.setEnabled(true);
        jTextFieldBarras.setEnabled(true);
        jTextFieldEstoque.setEnabled(true);
        jButtonNovo.setEnabled(!true);
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(!true);
        jButtonEliminar.setEnabled(!true);
        jButtonCancel.setEnabled(true);
        if (!jTextFieldCodProd.getText().isEmpty() && jTextFieldCodProd != null) {
            buscaProduto();
        }
        if (!jTextFieldCodCor.getText().isEmpty() && jTextFieldCodCor != null) {
            buscaCor();
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarMouseExited
        jButtonEditar.setBackground(new Color(153, 255, 153));
        jButtonEditar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonEditarMouseExited

    private void jButtonEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarMouseEntered
        jButtonEditar.setBackground(new Color(235, 235, 235));
        jButtonEditar.setForeground(new Color(153, 255, 153));
    }//GEN-LAST:event_jButtonEditarMouseEntered

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jTextFieldBarras.getText().isEmpty() || jTextFieldEstoque.getText().isEmpty()
                || jTextFieldTamanho.getText().isEmpty() || jTextFieldCodProd.getText().isEmpty()
                || jTextFieldCodCor.getText().isEmpty() || Objects.isNull(produtoBeans.getIdProduto())
                || Objects.isNull(corBeans.getIdCor())) {
            JOptionPane.showMessageDialog(null, "Preencha os campos Barras/Estoque/Tamanho/Cor/Produto!");
            jTextFieldBarras.requestFocus();
        } else if (flag == 1) {
            beans.setBarraProduto(jTextFieldBarras.getText());
            beans.setQtdEstoqueProduto(Double.parseDouble(jTextFieldEstoque.getText()));
            beans.setTamanhoProduto(jTextFieldTamanho.getText());
            beans.setProduto(produtoBeans);
            beans.setCor(corBeans);
            caracteristicaProduto.inserirCaracteristicaProduto(beans);
            limparTabela();
            listar();
            refreshForm();
        } else {
            beans.setIdCaracteristicaProduto(Integer.parseInt(jTextFieldID.getText()));
            beans.setBarraProduto(jTextFieldBarras.getText());
            beans.setQtdEstoqueProduto(Double.parseDouble(jTextFieldEstoque.getText()));
            beans.setTamanhoProduto(jTextFieldTamanho.getText());
            beans.setProduto(produtoBeans);
            beans.setCor(corBeans);
            caracteristicaProduto.atualizarCaracteristicaProduto(beans);
            limparTabela();
            listar();
            refreshForm();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvarMouseExited
        jButtonSalvar.setBackground(new Color(0, 153, 153));
        jButtonSalvar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonSalvarMouseExited

    private void jButtonSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvarMouseEntered
        jButtonSalvar.setBackground(new Color(235, 235, 235));
        jButtonSalvar.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_jButtonSalvarMouseEntered

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jTextFieldTamanho.setEnabled(true);
        jTextFieldCodProd.setEnabled(true);
        jTextFieldNomeProd.setEnabled(true);
        jTextFieldCodCor.setEnabled(true);
        jTextFieldNomeCor.setEnabled(true);
        jTextFieldTamanho.setEnabled(true);
        jTextFieldBarras.setEnabled(true);
        jTextFieldEstoque.setEnabled(true);
        jButtonNovo.setEnabled(!true);
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(!true);
        jButtonEliminar.setEnabled(!true);
        jButtonCancel.setEnabled(true);
        jTextFieldID.setText("");
        jTextFieldCodProd.setText("");
        jTextFieldNomeProd.setText("");
        jTextFieldCodCor.setText("");
        jTextFieldNomeCor.setText("");
        jTextFieldTamanho.setText("");
        jTextFieldBarras.setText("");
        jTextFieldEstoque.setText("");
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonNovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNovoMouseExited
        jButtonNovo.setBackground(new Color(0, 102, 153));
        jButtonNovo.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonNovoMouseExited

    private void jButtonNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNovoMouseEntered
        jButtonNovo.setBackground(new Color(235, 235, 235));
        jButtonNovo.setForeground(new Color(0, 102, 153));
    }//GEN-LAST:event_jButtonNovoMouseEntered

    private void jTextFieldCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodProdActionPerformed
        buscaProduto();
    }//GEN-LAST:event_jTextFieldCodProdActionPerformed

    private void jButtonBuscaProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscaProdMouseEntered
        jButtonBuscaProd.setBackground(new Color(235, 235, 235));
        jButtonBuscaProd.setForeground(new Color(153, 255, 153));
    }//GEN-LAST:event_jButtonBuscaProdMouseEntered

    private void jButtonBuscaProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscaProdMouseExited
        jButtonBuscaProd.setBackground(new Color(153, 255, 153));
        jButtonBuscaProd.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonBuscaProdMouseExited

    private void jButtonBuscaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaProdActionPerformed
        buscaProduto();
    }//GEN-LAST:event_jButtonBuscaProdActionPerformed

    private void jTextFieldCodCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodCorActionPerformed
        buscaCor();
    }//GEN-LAST:event_jTextFieldCodCorActionPerformed

    private void jButtonBuscaCorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscaCorMouseEntered
        jButtonBuscaCor.setBackground(new Color(235, 235, 235));
        jButtonBuscaCor.setForeground(new Color(153, 255, 153));
    }//GEN-LAST:event_jButtonBuscaCorMouseEntered

    private void jButtonBuscaCorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscaCorMouseExited
        jButtonBuscaCor.setBackground(new Color(153, 255, 153));
        jButtonBuscaCor.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonBuscaCorMouseExited

    private void jButtonBuscaCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaCorActionPerformed
        buscaCor();
    }//GEN-LAST:event_jButtonBuscaCorActionPerformed

    private void buscaProduto() {
        if (jTextFieldCodProd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo para Buscar o Produto");
            jTextFieldCodProd.requestFocus();
        } else {
            produtoBeans = daoProduto.consultaProduto(Integer.parseInt(jTextFieldCodProd.getText()));
            if (produtoBeans != null) {
                jTextFieldNomeProd.setText(produtoBeans.getNomeProduto());
            } else {
                int res = JOptionPane.showConfirmDialog(null, "Cod de Produto nao Existe!"
                        + "\nDeseja adicionar um novo Produto", "Atencao", JOptionPane.YES_NO_OPTION);
                jTextFieldCodProd.setText("");
                jTextFieldCodProd.requestFocus();
                if (res == JOptionPane.YES_OPTION) {
                    ProdutoForm form = new ProdutoForm();
                    MainForm.jDesktopPane.add(form);
                    form.setVisible(true);
                    daoProduto = new DaoProduto();
                }
            }
        }
    }

    private void buscaCor() {
        if (jTextFieldCodCor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo para Buscar a Cor");
            jTextFieldCodCor.requestFocus();
        } else {
            corBeans = daoCor.consultaCor(Integer.parseInt(jTextFieldCodCor.getText()));
            if (corBeans != null) {
                jTextFieldNomeCor.setText(corBeans.getNomeCor());
            } else {
                int res = JOptionPane.showConfirmDialog(null, "Cod de Cor nao Existe!"
                        + "\nDeseja adicionar um novo Cor", "Atencao", JOptionPane.YES_NO_OPTION);
                jTextFieldCodCor.setText("");
                jTextFieldCodCor.requestFocus();
                if (res == JOptionPane.YES_OPTION) {
                    CorForm form = new CorForm();
                    MainForm.jDesktopPane.add(form);
                    form.setVisible(true);
                    daoCor = new DaoCor();
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscaCor;
    private javax.swing.JButton jButtonBuscaProd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCaracteristicaProduto;
    private javax.swing.JTextField jTextFieldBarras;
    public static javax.swing.JTextField jTextFieldCodCor;
    public static javax.swing.JTextField jTextFieldCodProd;
    private javax.swing.JTextField jTextFieldEstoque;
    private javax.swing.JTextField jTextFieldID;
    public static javax.swing.JTextField jTextFieldNomeCor;
    public static javax.swing.JTextField jTextFieldNomeProd;
    private javax.swing.JTextField jTextFieldTamanho;
    // End of variables declaration//GEN-END:variables
}
