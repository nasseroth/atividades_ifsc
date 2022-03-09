package view;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.beans.ClienteBeans;
import model.beans.EnderecoBeans;
import model.dao.DaoCliente;
import model.dao.DaoEndereco;

/**
 *
 * @author Nasser-Othman
 */
public class ClienteForm extends javax.swing.JInternalFrame {

    ClienteBeans beans = new ClienteBeans();
    DaoCliente cliente = new DaoCliente();
    DefaultTableModel model = new DefaultTableModel();

    EnderecoBeans enderecoBeans = new EnderecoBeans();
    DaoEndereco endereco = new DaoEndereco();

    int flag = 0;

    public ClienteForm() {
        initComponents();
        listar();
    }

    //Metodo responsavel por listar os dados na tabela
    private void listar() {
        List<ClienteBeans> lista = cliente.listarCliente();
        model = (DefaultTableModel) jTableCliente.getModel();
        Object[] objects = new Object[10];
        for (int i = 0; i < lista.size(); i++) {
            objects[0] = lista.get(i).getIdCliente();
            objects[1] = lista.get(i).getNomeCliente();
            objects[2] = lista.get(i).getDtNasCliente();
            objects[3] = lista.get(i).getCpfCliente();
            objects[4] = lista.get(i).getRgCliente();
            objects[5] = lista.get(i).getFoneCliente();
            objects[6] = lista.get(i).getFone2Cliente();
            objects[7] = lista.get(i).getEmailCliente();
            objects[8] = lista.get(i).getCompleEnderecoCliente();
            objects[9] = lista.get(i).getCep().getIdCep();

            model.addRow(objects);
        }
        jTableCliente.setModel(model);
    }

    //Limpa a tabela quando ha uma actualizacao 
    private void limparTabela() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonEditar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCpf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldRg = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldFone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldFone2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldComplementoEndereco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldCodEndereco = new javax.swing.JTextField();
        jButtonBuscaEndereco = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldNomeEndereco = new javax.swing.JTextField();
        jTextFieldNascimento = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Cliente");
        setPreferredSize(new java.awt.Dimension(700, 525));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(248, 248, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("ID:");

        jTextFieldId.setEditable(false);
        jTextFieldId.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldId.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jTextFieldId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jTextFieldId.setEnabled(false);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nome: ");

        jTextFieldNome.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jTextFieldNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jTextFieldNome.setEnabled(false);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Email:");

        jTextFieldEmail.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jTextFieldEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jTextFieldEmail.setEnabled(false);

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

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Nascimento:");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("CPF:");

        jTextFieldCpf.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jTextFieldCpf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jTextFieldCpf.setEnabled(false);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("RG:");

        jTextFieldRg.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jTextFieldRg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jTextFieldRg.setEnabled(false);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("TELEFONE:");

        jTextFieldFone.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jTextFieldFone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jTextFieldFone.setEnabled(false);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("TEL. ALT:");

        jTextFieldFone2.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jTextFieldFone2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jTextFieldFone2.setEnabled(false);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Complemento End.:");

        jTextFieldComplementoEndereco.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jTextFieldComplementoEndereco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jTextFieldComplementoEndereco.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setText("COD. END.");

        jTextFieldCodEndereco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextFieldCodEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodEnderecoActionPerformed(evt);
            }
        });

        jButtonBuscaEndereco.setBackground(new java.awt.Color(153, 255, 153));
        jButtonBuscaEndereco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonBuscaEndereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jButtonBuscaEndereco.setText("Buscar");
        jButtonBuscaEndereco.setBorderPainted(false);
        jButtonBuscaEndereco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscaEndereco.setFocusPainted(false);
        jButtonBuscaEndereco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonBuscaEnderecoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonBuscaEnderecoMouseExited(evt);
            }
        });
        jButtonBuscaEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaEnderecoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("ENDEREÇO:");

        jTextFieldNomeEndereco.setEditable(false);
        jTextFieldNomeEndereco.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeEndereco.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextFieldNomeEndereco.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldNomeEndereco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTextFieldNascimento.setText("00/00/0000");
        jTextFieldNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNascimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldComplementoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldNomeEndereco))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldCodEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonBuscaEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldFone2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addComponent(jButtonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldFone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldComplementoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextFieldCodEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscaEndereco))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jTextFieldNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(jTextFieldNomeEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFone2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonNovo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(240, 240, 245));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Nascimento", "CPF", "RG", "Fone", "Fone Alt.", "Email", "Complemento", "Endereco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCliente);
        if (jTableCliente.getColumnModel().getColumnCount() > 0) {
            jTableCliente.getColumnModel().getColumn(0).setResizable(false);
            jTableCliente.getColumnModel().getColumn(0).setPreferredWidth(2);
            jTableCliente.getColumnModel().getColumn(1).setResizable(false);
            jTableCliente.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTableCliente.getColumnModel().getColumn(2).setResizable(false);
            jTableCliente.getColumnModel().getColumn(3).setResizable(false);
            jTableCliente.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTableCliente.getColumnModel().getColumn(4).setResizable(false);
            jTableCliente.getColumnModel().getColumn(4).setPreferredWidth(30);
            jTableCliente.getColumnModel().getColumn(5).setResizable(false);
            jTableCliente.getColumnModel().getColumn(5).setPreferredWidth(10);
            jTableCliente.getColumnModel().getColumn(6).setResizable(false);
            jTableCliente.getColumnModel().getColumn(7).setResizable(false);
            jTableCliente.getColumnModel().getColumn(8).setResizable(false);
            jTableCliente.getColumnModel().getColumn(9).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(139, 139, 139))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNascimentoActionPerformed

    private void jButtonBuscaEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaEnderecoActionPerformed
        buscaEndereco();
    }//GEN-LAST:event_jButtonBuscaEnderecoActionPerformed

    private void jButtonBuscaEnderecoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscaEnderecoMouseExited
        jButtonBuscaEndereco.setBackground(new Color(153, 255, 153));
        jButtonBuscaEndereco.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonBuscaEnderecoMouseExited

    private void jButtonBuscaEnderecoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscaEnderecoMouseEntered
        jButtonBuscaEndereco.setBackground(new Color(235, 235, 235));
        jButtonBuscaEndereco.setForeground(new Color(153, 255, 153));
    }//GEN-LAST:event_jButtonBuscaEnderecoMouseEntered

    private void jTextFieldCodEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodEnderecoActionPerformed
        buscaEndereco();
    }//GEN-LAST:event_jTextFieldCodEnderecoActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int excluir = JOptionPane.showConfirmDialog(null, "Deseja excluir esse Registo?",
                "Atencao", JOptionPane.YES_NO_OPTION);
        if (excluir == JOptionPane.YES_OPTION) {
            beans.setIdCliente(Integer.parseInt(jTextFieldId.getText()));
            cliente.excluirCliente(beans);
            limparTabela();
            listar();
            jTextFieldNome.setEnabled(true);
            jTextFieldNascimento.setEnabled(true);
            jTextFieldCpf.setEnabled(true);
            jTextFieldRg.setEnabled(true);
            jTextFieldFone.setEnabled(true);
            jTextFieldFone2.setEnabled(true);
            jTextFieldEmail.setEnabled(true);
            jTextFieldComplementoEndereco.setEnabled(true);
            jTextFieldCodEndereco.setEnabled(true);
            jButtonSalvar.setEnabled(!true);
            jButtonCancelar.setEnabled(!true);
            jButtonEliminar.setEnabled(!true);
            jButtonEditar.setEnabled(!true);
            jButtonNovo.setEnabled(true);
            jTextFieldNome.setText("");
            jTextFieldNascimento.setText("");
            jTextFieldCpf.setText("");
            jTextFieldRg.setText("");
            jTextFieldFone.setText("");
            jTextFieldFone2.setText("");
            jTextFieldEmail.setText("");
            jTextFieldComplementoEndereco.setText("");
            jTextFieldCodEndereco.setText("");
            jTextFieldId.setText("");
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

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jTextFieldNome.setEnabled(true);
        jTextFieldNascimento.setEnabled(true);
        jTextFieldCpf.setEnabled(true);
        jTextFieldRg.setEnabled(true);
        jTextFieldFone.setEnabled(true);
        jTextFieldFone2.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jTextFieldComplementoEndereco.setEnabled(true);
        jTextFieldCodEndereco.setEnabled(true);

        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(!true);
        jTextFieldNome.setText("");
        jTextFieldNascimento.setText("");
        jTextFieldCpf.setText("");
        jTextFieldRg.setText("");
        jTextFieldFone.setText("");
        jTextFieldFone2.setText("");
        jTextFieldEmail.setText("");
        jTextFieldComplementoEndereco.setText("");
        jTextFieldId.setText("");
        jTextFieldCodEndereco.setText("");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonNovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNovoMouseExited
        jButtonNovo.setBackground(new Color(0, 102, 153));
        jButtonNovo.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonNovoMouseExited

    private void jButtonNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNovoMouseEntered
        jButtonNovo.setBackground(new Color(235, 235, 235));
        jButtonNovo.setForeground(new Color(0, 102, 153));
    }//GEN-LAST:event_jButtonNovoMouseEntered

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNome.setEnabled(true);
        jTextFieldNascimento.setEnabled(true);
        jTextFieldCpf.setEnabled(true);
        jTextFieldRg.setEnabled(true);
        jTextFieldFone.setEnabled(true);
        jTextFieldFone2.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jTextFieldComplementoEndereco.setEnabled(true);
        jTextFieldCodEndereco.setEnabled(true);
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonEliminar.setEnabled(!true);
        jButtonEditar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jTextFieldNome.setText("");
        jTextFieldNascimento.setText("");
        jTextFieldCpf.setText("");
        jTextFieldRg.setText("");
        jTextFieldFone.setText("");
        jTextFieldFone2.setText("");
        jTextFieldEmail.setText("");
        jTextFieldComplementoEndereco.setText("");
        jTextFieldCodEndereco.setText("");
        jTextFieldId.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseExited
        jButtonCancelar.setBackground(new Color(255, 51, 51));
        jButtonCancelar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonCancelarMouseExited

    private void jButtonCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseEntered
        jButtonCancelar.setBackground(new Color(235, 235, 235));
        jButtonCancelar.setForeground(new Color(255, 51, 51));
    }//GEN-LAST:event_jButtonCancelarMouseEntered

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome!!!");
            jTextFieldNome.requestFocus();
        } else if (jTextFieldNascimento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Data de Nascimento!!!");
            jTextFieldNascimento.requestFocus();
        } else if (jTextFieldCpf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CPF!!!");
            jTextFieldCpf.requestFocus();
        } else if (jTextFieldRg.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo RG!!!");
            jTextFieldRg.requestFocus();
        } else if (jTextFieldFone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Fone!!!");
            jTextFieldFone.requestFocus();
        } else if (jTextFieldComplementoEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Complemento!!!");
            jTextFieldComplementoEndereco.requestFocus();
        } else if (jTextFieldCodEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Endereco!!!");
            jTextFieldCodEndereco.requestFocus();
        } else if (flag == 1) {
            beans.setNomeCliente(jTextFieldNome.getText());
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            try {
                beans.setDtNasCliente(formatter.parse((jTextFieldNascimento.getText())));
            } catch (ParseException ex) {
                Logger.getLogger(ClienteForm.class.getName()).log(Level.SEVERE, null, ex);
                beans.setDtNasCliente(new Date());
            }
            beans.setCpfCliente(jTextFieldCpf.getText());
            beans.setRgCliente(jTextFieldRg.getText());
            beans.setFoneCliente(jTextFieldFone.getText());
            beans.setFone2Cliente(jTextFieldFone2.getText());
            beans.setEmailCliente(jTextFieldEmail.getText());
            beans.setCompleEnderecoCliente(jTextFieldComplementoEndereco.getText());
            beans.setCep(enderecoBeans);

            cliente.salvarCliente(beans);
            limparTabela();
            listar();
            jTextFieldNome.setEnabled(true);
            jTextFieldNascimento.setEnabled(true);
            jTextFieldCpf.setEnabled(true);
            jTextFieldRg.setEnabled(true);
            jTextFieldFone.setEnabled(true);
            jTextFieldFone2.setEnabled(true);
            jTextFieldEmail.setEnabled(true);
            jTextFieldComplementoEndereco.setEnabled(true);
            jTextFieldCodEndereco.setEnabled(true);
            jButtonSalvar.setEnabled(!true);
            jButtonCancelar.setEnabled(!true);
            jButtonEliminar.setEnabled(!true);
            jButtonEditar.setEnabled(!true);
            jButtonNovo.setEnabled(true);
            jTextFieldNome.setText("");
            jTextFieldNascimento.setText("");
            jTextFieldCpf.setText("");
            jTextFieldRg.setText("");
            jTextFieldFone.setText("");
            jTextFieldFone2.setText("");
            jTextFieldEmail.setText("");
            jTextFieldComplementoEndereco.setText("");
            jTextFieldCodEndereco.setText("");
            jTextFieldId.setText("");
        } else {
            beans.setNomeCliente(jTextFieldNome.getText());
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            try {
                beans.setDtNasCliente(formatter.parse((jTextFieldNascimento.getText())));
            } catch (ParseException ex) {
                Logger.getLogger(ClienteForm.class.getName()).log(Level.SEVERE, null, ex);
                beans.setDtNasCliente(new Date());
            }
            beans.setCpfCliente(jTextFieldCpf.getText());
            beans.setRgCliente(jTextFieldRg.getText());
            beans.setFoneCliente(jTextFieldFone.getText());
            beans.setFone2Cliente(jTextFieldFone2.getText());
            beans.setEmailCliente(jTextFieldEmail.getText());
            beans.setCompleEnderecoCliente(jTextFieldComplementoEndereco.getText());
            beans.setCep(enderecoBeans);
            beans.setIdCliente(Integer.parseInt(jTextFieldId.getText()));
            cliente.atualizarCliente(beans);
            limparTabela();
            listar();
            jTextFieldNome.setEnabled(true);
            jTextFieldNascimento.setEnabled(true);
            jTextFieldCpf.setEnabled(true);
            jTextFieldRg.setEnabled(true);
            jTextFieldFone.setEnabled(true);
            jTextFieldFone2.setEnabled(true);
            jTextFieldEmail.setEnabled(true);
            jTextFieldComplementoEndereco.setEnabled(true);
            jTextFieldCodEndereco.setEnabled(true);
            jButtonSalvar.setEnabled(!true);
            jButtonCancelar.setEnabled(!true);
            jButtonEliminar.setEnabled(!true);
            jButtonEditar.setEnabled(!true);
            jButtonNovo.setEnabled(true);
            jTextFieldNome.setText("");
            jTextFieldNascimento.setText("");
            jTextFieldCpf.setText("");
            jTextFieldRg.setText("");
            jTextFieldFone.setText("");
            jTextFieldFone2.setText("");
            jTextFieldEmail.setText("");
            jTextFieldComplementoEndereco.setText("");
            jTextFieldId.setText("");
            jTextFieldCodEndereco.setText("");
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

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        jTextFieldNome.setEnabled(true);
        jTextFieldNascimento.setEnabled(true);
        jTextFieldCpf.setEnabled(true);
        jTextFieldRg.setEnabled(true);
        jTextFieldFone.setEnabled(true);
        jTextFieldFone2.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jTextFieldComplementoEndereco.setEnabled(true);
        jTextFieldCodEndereco.setEnabled(true);
        if (jTextFieldCodEndereco.getText() != null) {
            buscaEndereco();
        }
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(!true);
        jButtonEliminar.setEnabled(!true);
        jButtonEditar.setEnabled(!true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarMouseExited
        jButtonEditar.setBackground(new Color(153, 255, 153));
        jButtonEditar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonEditarMouseExited

    private void jButtonEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarMouseEntered
        jButtonEditar.setBackground(new Color(235, 235, 235));
        jButtonEditar.setForeground(new Color(153, 255, 153));
    }//GEN-LAST:event_jButtonEditarMouseEntered

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
        int row = jTableCliente.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma Fila");
        } else {
            jTextFieldId.setText(jTableCliente.getValueAt(row, 0).toString());
            jTextFieldNome.setText(jTableCliente.getValueAt(row, 1).toString());
            jTextFieldNascimento.setText(jTableCliente.getValueAt(row, 2).toString());
            jTextFieldCpf.setText(jTableCliente.getValueAt(row, 3).toString());
            jTextFieldRg.setText(jTableCliente.getValueAt(row, 4).toString());
            jTextFieldFone.setText(jTableCliente.getValueAt(row, 5).toString());
            jTextFieldFone2.setText(jTableCliente.getValueAt(row, 6).toString());
            jTextFieldEmail.setText(jTableCliente.getValueAt(row, 7).toString());
            jTextFieldComplementoEndereco.setText(jTableCliente.getValueAt(row, 8).toString());
            jTextFieldCodEndereco.setText(jTableCliente.getValueAt(row, 9).toString());

            jTextFieldNome.setEnabled(!true);
            jTextFieldNascimento.setEnabled(!true);
            jTextFieldCpf.setEnabled(!true);
            jTextFieldRg.setEnabled(!true);
            jTextFieldFone.setEnabled(!true);
            jTextFieldFone2.setEnabled(!true);
            jTextFieldEmail.setEnabled(!true);
            jTextFieldComplementoEndereco.setEnabled(!true);
            jTextFieldCodEndereco.setEnabled(!true);

            jButtonNovo.setEnabled(!true);
            jButtonSalvar.setEnabled(!true);
            jButtonEditar.setEnabled(true);
            jButtonEliminar.setEnabled(true);
            jButtonCancelar.setEnabled(true);
        }
    }//GEN-LAST:event_jTableClienteMouseClicked

    private void buscaEndereco() {
        if (jTextFieldCodEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo para Buscar o Endereco");
            jTextFieldCodEndereco.requestFocus();
        } else {
            enderecoBeans = endereco.consultaEndereco(Integer.parseInt(jTextFieldCodEndereco.getText()));
            if (enderecoBeans != null) {
                jTextFieldNomeEndereco.setText(enderecoBeans.getCep());
            } else {
                int res = JOptionPane.showConfirmDialog(null, "Cod de Endereco nao Existe!"
                        + "\nDeseja adicionar um novo Endereco", "Atencao", JOptionPane.YES_NO_OPTION);
                jTextFieldCodEndereco.setText("");
                jTextFieldCodEndereco.requestFocus();
                if (res == JOptionPane.YES_OPTION) {
                    EnderecoForm form = new EnderecoForm();
                    MainForm.jDesktopPane.add(form);
                    form.setVisible(true);
                    endereco = new DaoEndereco();
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscaEndereco;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliente;
    public static javax.swing.JTextField jTextFieldCodEndereco;
    private javax.swing.JTextField jTextFieldComplementoEndereco;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFone;
    private javax.swing.JTextField jTextFieldFone2;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JFormattedTextField jTextFieldNascimento;
    private javax.swing.JTextField jTextFieldNome;
    public static javax.swing.JTextField jTextFieldNomeEndereco;
    private javax.swing.JTextField jTextFieldRg;
    // End of variables declaration//GEN-END:variables
}
