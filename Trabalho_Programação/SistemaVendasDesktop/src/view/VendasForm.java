package view;

import connection.SingleConnection;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.beans.CaracteristicaProdutoBeans;
import model.beans.ClienteBeans;
import model.beans.DetalheVendaBeans;
import model.beans.ProdutoBeans;
import model.beans.VendaBeans;
import model.beans.VendedorBeans;
import model.dao.DaoCaracteristicaProduto;
import model.dao.DaoCliente;
import model.dao.DaoProduto;
import model.dao.DaoVenda;
import model.dao.DaoVendedor;

/**
 *
 * @author Nasser-Othman
 */
public class VendasForm extends javax.swing.JInternalFrame {

    DaoCliente daoCliente = new DaoCliente();
    DaoVendedor daoVendedor = new DaoVendedor();
    DaoProduto daoProduto = new DaoProduto();
    DaoCaracteristicaProduto daoCaracteristicaProduto = new DaoCaracteristicaProduto();
    DaoVenda daoVenda = new DaoVenda();
    DefaultTableModel model = new DefaultTableModel();
    PagamentoForm form = new PagamentoForm();

    DecimalFormat b = new DecimalFormat("#,###.00 MZN");
    public ClienteBeans clienteBeans = new ClienteBeans();
    ProdutoBeans beans = new ProdutoBeans();
    CaracteristicaProdutoBeans caracteristicaProdutoBeans = new CaracteristicaProdutoBeans();
    VendaBeans venda = new VendaBeans();
    VendedorBeans vendedorBeans = new VendedorBeans();
    DetalheVendaBeans detalhe = new DetalheVendaBeans();

    private int idProd;
    public static double totalPagar;
    private double precoProd;
    private int quant;
    private int cont = 0;

    public VendasForm() {
        initComponents();
        gerarNrSerie();
        data();
        tabela();
        jTextFieldVendedor.setText(LoginForm.nome);
    }

    private void data() {
        Date data = new Date();
        DateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
        String dataFormatada = dateForm.format(data);
        jTextFieldData.setText(dataFormatada);
    }

    private void tabela() {
        jTableVenda.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        jTableVenda.getTableHeader().setOpaque(false);
        jTableVenda.getTableHeader().setBackground(Color.BLUE);
        jTableVenda.getTableHeader().setForeground(Color.BLACK);
        jTableVenda.getRowHeight(20);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCodCliente = new javax.swing.JTextField();
        jButtonBuscaCliente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCodProd = new javax.swing.JTextField();
        jButtonBuscaProd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldNomeProd = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSpinnerQuant = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldStock = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldData = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldVendedor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldCodBarras = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNrSerie = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVenda = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jButtonCancel = new javax.swing.JButton();
        jButtonVender = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Realizar Vendas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(248, 248, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("COD.CLIENTE:");

        jTextFieldCodCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextFieldCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodClienteActionPerformed(evt);
            }
        });

        jButtonBuscaCliente.setBackground(new java.awt.Color(0, 102, 153));
        jButtonBuscaCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonBuscaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search1.png"))); // NOI18N
        jButtonBuscaCliente.setText("Buscar");
        jButtonBuscaCliente.setBorderPainted(false);
        jButtonBuscaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscaCliente.setFocusPainted(false);
        jButtonBuscaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonBuscaClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonBuscaClienteMouseExited(evt);
            }
        });
        jButtonBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaClienteActionPerformed(evt);
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
        jLabel8.setText("CLIENTE:");

        jTextFieldNomeCliente.setEditable(false);
        jTextFieldNomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeCliente.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextFieldNomeCliente.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldNomeCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("PRODUTO:");

        jTextFieldNomeProd.setEditable(false);
        jTextFieldNomeProd.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeProd.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextFieldNomeProd.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldNomeProd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("QUANTIDADE:");

        jSpinnerQuant.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("STOCK:");

        jTextFieldStock.setEditable(false);
        jTextFieldStock.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldStock.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextFieldStock.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldStock.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setText("DATA DE HOJE");

        jTextFieldData.setEditable(false);
        jTextFieldData.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldData.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextFieldData.setForeground(new java.awt.Color(255, 51, 51));
        jTextFieldData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("PRECO:");

        jTextFieldPreco.setEditable(false);
        jTextFieldPreco.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPreco.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextFieldPreco.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldPreco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButtonAdd.setBackground(new java.awt.Color(0, 153, 153));
        jButtonAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-button1.png"))); // NOI18N
        jButtonAdd.setText("Adicionar a lista ");
        jButtonAdd.setBorderPainted(false);
        jButtonAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdd.setFocusPainted(false);
        jButtonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAddMouseExited(evt);
            }
        });
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setText("VENDEDOR:");

        jTextFieldVendedor.setEditable(false);
        jTextFieldVendedor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldVendedor.setFont(new java.awt.Font("Segoe UI", 3, 17)); // NOI18N
        jTextFieldVendedor.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldVendedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setText("COD. BARRAS:");

        jTextFieldCodBarras.setEditable(false);
        jTextFieldCodBarras.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCodBarras.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextFieldCodBarras.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldCodBarras.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeCliente))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldVendedor))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeProd))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldStock)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel12)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodBarras)
                        .addGap(25, 25, 25))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextFieldCodCliente, jTextFieldCodProd});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jTextFieldCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonBuscaProd)
                                .addComponent(jButtonBuscaCliente)
                                .addComponent(jLabel10)
                                .addComponent(jSpinnerQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jTextFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jTextFieldCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAdd)
                        .addComponent(jLabel14)
                        .addComponent(jTextFieldVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldCodCliente, jTextFieldNomeCliente, jTextFieldPreco});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jSpinnerQuant, jTextFieldCodProd, jTextFieldData, jTextFieldNomeProd, jTextFieldStock, jTextFieldVendedor});

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(248, 248, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel1.setText("Super Mercado Líder");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Venda de Diversos Produtos");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setText("Maputo, Matola");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setText("Nro. Serie");

        jTextFieldNrSerie.setEditable(false);
        jTextFieldNrSerie.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNrSerie.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jTextFieldNrSerie.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldNrSerie.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNrSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel3))
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNrSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Lista de Produtos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 2, 12), new java.awt.Color(51, 51, 255))); // NOI18N

        jTableVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro.", "Cod Prod", "Cod Barras", "Nome do Produto", "Quantidade", "Preco Unitario", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVenda.setFocusable(false);
        jTableVenda.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTableVenda.setRowHeight(20);
        jTableVenda.setSelectionBackground(new java.awt.Color(255, 51, 51));
        jScrollPane1.setViewportView(jTableVenda);
        if (jTableVenda.getColumnModel().getColumnCount() > 0) {
            jTableVenda.getColumnModel().getColumn(0).setResizable(false);
            jTableVenda.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTableVenda.getColumnModel().getColumn(1).setResizable(false);
            jTableVenda.getColumnModel().getColumn(1).setPreferredWidth(15);
            jTableVenda.getColumnModel().getColumn(2).setResizable(false);
            jTableVenda.getColumnModel().getColumn(3).setResizable(false);
            jTableVenda.getColumnModel().getColumn(3).setPreferredWidth(350);
            jTableVenda.getColumnModel().getColumn(4).setResizable(false);
            jTableVenda.getColumnModel().getColumn(4).setPreferredWidth(60);
            jTableVenda.getColumnModel().getColumn(5).setResizable(false);
            jTableVenda.getColumnModel().getColumn(5).setPreferredWidth(60);
            jTableVenda.getColumnModel().getColumn(6).setResizable(false);
            jTableVenda.getColumnModel().getColumn(6).setPreferredWidth(60);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(248, 248, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonCancel.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.setBorderPainted(false);
        jButtonCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jButtonVender.setBackground(new java.awt.Color(241, 116, 33));
        jButtonVender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cheque.png"))); // NOI18N
        jButtonVender.setText("Realizar Venda");
        jButtonVender.setBorderPainted(false);
        jButtonVender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVender.setFocusPainted(false);
        jButtonVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonVenderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonVenderMouseExited(evt);
            }
        });
        jButtonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVenderActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dollar.png"))); // NOI18N
        jLabel15.setText("Valor a Pagar:");

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonVender)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1200, 702));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalActionPerformed

    private void jButtonBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaClienteActionPerformed
        buscaCliente();
    }//GEN-LAST:event_jButtonBuscaClienteActionPerformed

    private void jButtonBuscaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaProdActionPerformed
        buscaProdutoCodBarras();
    }//GEN-LAST:event_jButtonBuscaProdActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        if (jTextFieldCodCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira um Cliente");
            jTextFieldCodCliente.requestFocus();
        } else if (jTextFieldCodProd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira um Produto!");
            jTextFieldCodProd.requestFocus();
        } else {
            double total;
            model = (DefaultTableModel) jTableVenda.getModel();
            cont++;
            idProd = beans.getIdProduto();
            String codBarrasProd = jTextFieldCodBarras.getText();
            String nomeProd = jTextFieldNomeProd.getText();
            precoProd = Double.parseDouble(jTextFieldPreco.getText());
            quant = Integer.parseInt(jSpinnerQuant.getValue().toString());
            Double stock = Double.parseDouble(jTextFieldStock.getText());
            total = quant * precoProd;
            ArrayList lista = new ArrayList();
            if (stock > 0) {
                lista.add(cont);
                lista.add(idProd);
                lista.add(codBarrasProd);
                lista.add(nomeProd);
                lista.add(quant);
                lista.add(precoProd);
                lista.add(total);
                Object[] objects = new Object[7];
                objects[0] = lista.get(0);
                objects[1] = lista.get(1);
                objects[2] = lista.get(2);
                objects[3] = lista.get(3);
                objects[4] = lista.get(4);
                objects[5] = lista.get(5);
                objects[6] = lista.get(6);
                model.addRow(objects);
                jTableVenda.setModel(model);
                calculaTotal();
                jTextFieldCodBarras.setText("");
                jTextFieldNomeProd.setText("");
                jTextFieldStock.setText("");
                jTextFieldPreco.setText("");
                jSpinnerQuant.setValue(1);
                jTextFieldCodProd.setText("");
                jTextFieldCodProd.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Stock de Produto Vazio!");
                jTextFieldCodProd.setText("");
                jTextFieldCodProd.requestFocus();
            }
        }

    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVenderActionPerformed
        if (jTextFieldTotal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Adicione Produtos a Lista!!!");
        } else {
            salvarVenda();
            salvarDetalhes();
            atualizarStock();
            gerarNrSerie();
            limparTabela();
            JOptionPane.showMessageDialog(null, "Venda Realizada Com Sucesso");
            jTextFieldCodBarras.setText("");
            jTextFieldNomeProd.setText("");
            jTextFieldStock.setText("");
            jTextFieldPreco.setText("");
            jTextFieldCodProd.setText("");
            jTextFieldCodCliente.setText("");
            jTextFieldNomeCliente.setText("");
            jTextFieldTotal.setText("");
            jSpinnerQuant.setValue(1);
        }

    }//GEN-LAST:event_jButtonVenderActionPerformed

    private void jButtonBuscaClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscaClienteMouseEntered
        jButtonBuscaCliente.setBackground(new Color(235, 235, 235));
        jButtonBuscaCliente.setForeground(new Color(0, 102, 153));
    }//GEN-LAST:event_jButtonBuscaClienteMouseEntered

    private void jButtonBuscaClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscaClienteMouseExited
        jButtonBuscaCliente.setBackground(new Color(0, 102, 153));
        jButtonBuscaCliente.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonBuscaClienteMouseExited

    private void jButtonBuscaProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscaProdMouseEntered
        jButtonBuscaProd.setBackground(new Color(235, 235, 235));
        jButtonBuscaProd.setForeground(new Color(153, 255, 153));
    }//GEN-LAST:event_jButtonBuscaProdMouseEntered

    private void jButtonBuscaProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscaProdMouseExited
        jButtonBuscaProd.setBackground(new Color(153, 255, 153));
        jButtonBuscaProd.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonBuscaProdMouseExited

    private void jButtonAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMouseEntered
        jButtonAdd.setBackground(new Color(235, 235, 235));
        jButtonAdd.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_jButtonAddMouseEntered

    private void jButtonAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMouseExited
        jButtonAdd.setBackground(new Color(0, 153, 153));
        jButtonAdd.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonAddMouseExited

    private void jButtonCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseEntered
        jButtonCancel.setBackground(new Color(235, 235, 235));
        jButtonCancel.setForeground(new Color(255, 51, 51));
    }//GEN-LAST:event_jButtonCancelMouseEntered

    private void jButtonCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseExited
        jButtonCancel.setBackground(new Color(255, 51, 51));
        jButtonCancel.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonCancelMouseExited

    private void jButtonVenderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVenderMouseEntered
        jButtonVender.setBackground(new Color(235, 235, 235));
        jButtonVender.setForeground(new Color(241, 116, 33));
    }//GEN-LAST:event_jButtonVenderMouseEntered

    private void jButtonVenderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVenderMouseExited
        jButtonVender.setBackground(new Color(241, 116, 33));
        jButtonVender.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonVenderMouseExited

    private void jTextFieldCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodClienteActionPerformed
        buscaCliente();
        jTextFieldCodProd.requestFocus();
    }//GEN-LAST:event_jTextFieldCodClienteActionPerformed

    private void jTextFieldCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodProdActionPerformed
        buscaProdutoCodBarras();
    }//GEN-LAST:event_jTextFieldCodProdActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        limparTabela();
        jTextFieldCodBarras.setText("");
        jTextFieldNomeProd.setText("");
        jTextFieldStock.setText("");
        jTextFieldPreco.setText("");
        jTextFieldCodProd.setText("");
        jTextFieldCodCliente.setText("");
        jTextFieldNomeCliente.setText("");
        jTextFieldTotal.setText("");
        jSpinnerQuant.setValue(1);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void buscaCliente() {
        if (jTextFieldCodCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo para Buscar o Cliente");
            jTextFieldCodCliente.requestFocus();
        } else {
            clienteBeans = daoCliente.consultaCliente(jTextFieldCodCliente.getText());
            if (clienteBeans != null) {
                jTextFieldNomeCliente.setText(clienteBeans.getNomeCliente());
            } else {
                int res = JOptionPane.showConfirmDialog(null, "Cod de Cliente nao Existe!"
                        + "\nDeseja adicionar um novo cliente", "Atencao", JOptionPane.YES_NO_OPTION);
                jTextFieldCodCliente.setText("");
                jTextFieldCodCliente.requestFocus();
                if (res == JOptionPane.YES_OPTION) {
                    ClienteForm form = new ClienteForm();
                    MainForm.jDesktopPane.add(form);
                    form.setVisible(true);
                    daoCliente = new DaoCliente();
                }
            }
        }
    }

    private void buscaProdutoCodBarras() {
        if (jTextFieldCodProd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo para Buscar o Produto");
            jTextFieldCodProd.requestFocus();
        } else {
            caracteristicaProdutoBeans = daoCaracteristicaProduto.consultaCaracteristicaProduto(jTextFieldCodProd.getText());
            if (caracteristicaProdutoBeans != null) {
                beans = daoProduto.consultaProduto(caracteristicaProdutoBeans.getProduto().getIdProduto());
                caracteristicaProdutoBeans.setProduto(beans);
                jTextFieldCodBarras.setText(caracteristicaProdutoBeans.getBarraProduto());
                jTextFieldNomeProd.setText(caracteristicaProdutoBeans.getProduto().getNomeProduto());
                jTextFieldCodProd.setText(String.valueOf(caracteristicaProdutoBeans.getProduto().getIdProduto()));
                jTextFieldPreco.setText("" + caracteristicaProdutoBeans.getProduto().getPrecoProduto());
                
                jTextFieldStock.setText("" + caracteristicaProdutoBeans.getQtdEstoqueProduto());
            } else {
                int res = JOptionPane.showConfirmDialog(null, "Cod de Produto nao Existe!"
                        + "\nDeseja adicionar um novo Produto", "Atencao", JOptionPane.YES_NO_OPTION);
                jTextFieldCodProd.setText("");
                jTextFieldCodProd.requestFocus();
                if (res == JOptionPane.YES_OPTION) {
                    CaracteristicaProdutoForm form = new CaracteristicaProdutoForm();
                    MainForm.jDesktopPane.add(form);
                    form.setVisible(true);
                    daoCaracteristicaProduto = new DaoCaracteristicaProduto();
                }
            }
        }
    }

    /*
    private void buscaProduto() {
        if (jTextFieldCodProd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo para Buscar o Produto");
            jTextFieldCodProd.requestFocus();
        } else {
            beans = daoProduto.consultaProduto(Integer.parseInt(jTextFieldCodProd.getText()));
            if (beans != null) {
                jTextFieldNomeProd.setText(beans.getNomeProduto());
                jTextFieldPreco.setText("" + beans.getPrecoProduto());
                jTextFieldStock.setText("" + beans.getQuantProduto());
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
    }*/

    private void calculaTotal() {
        totalPagar = 0;
        for (int i = 0; i < jTableVenda.getRowCount(); i++) {
            quant = Integer.parseInt(jTableVenda.getValueAt(i, 4).toString());
            precoProd = Double.parseDouble(jTableVenda.getValueAt(i, 5).toString());
            totalPagar = (double) totalPagar + (quant * precoProd);
        }
        jTextFieldTotal.setText(b.format(totalPagar));
    }

    public void salvarVenda() {
        int idVend = LoginForm.idVendedor;
        int idCliente = DaoCliente.idCliente;
        venda.setVendedor(new VendedorBeans(idVend));
        venda.setCliente(new ClienteBeans(idCliente));
        venda.setNumeroVendas(jTextFieldNrSerie.getText());
        venda.setDataVenda(jTextFieldData.getText());
        venda.setValorVenda(totalPagar);
        venda.setEstadoVenda("1");
        daoVenda.salvarVenda(venda);

    }

    public void salvarDetalhes() {
        String idVenda = daoVenda.idVendas();
        int idVendas = Integer.parseInt(idVenda);
        for (int i = 0; i < jTableVenda.getRowCount(); i++) {
            String codBarrasProd = jTableVenda.getValueAt(i, 2).toString();
            System.out.println("0: " + jTableVenda.getValueAt(i, 0).toString());
            System.out.println("1: " + codBarrasProd);
            System.out.println("3: " + jTableVenda.getValueAt(i, 2).toString());
            System.out.println("3: " + jTableVenda.getValueAt(i, 3).toString());
            System.out.println("4: " + jTableVenda.getValueAt(i, 4).toString());
            System.out.println("5: " + jTableVenda.getValueAt(i, 5).toString());
            
            System.out.println("Cod barras: " + codBarrasProd);
            int quant = Integer.parseInt(jTableVenda.getValueAt(i, 4).toString());
            double total = Double.parseDouble(jTableVenda.getValueAt(i, 6).toString());
            detalhe.setCaracteristicaProduto(daoCaracteristicaProduto.consultaCaracteristicaProduto(codBarrasProd));
            detalhe.setVenda(new VendaBeans(idVendas));
            detalhe.setQuantidade(quant);
            detalhe.setValorTotal(total);
            daoVenda.salvarDetalheVenda(detalhe);
        }
    }

    public void atualizarStock() {
        for (int i = 0; i < model.getRowCount(); i++) {
            String codBarras = jTableVenda.getValueAt(i, 2).toString();
            quant = Integer.parseInt(jTableVenda.getValueAt(i, 4).toString());
            daoCaracteristicaProduto = new DaoCaracteristicaProduto();
            caracteristicaProdutoBeans = daoCaracteristicaProduto.consultaCaracteristicaProduto(codBarras);
            Double stockActual = caracteristicaProdutoBeans.getQtdEstoqueProduto() - quant;
            daoCaracteristicaProduto.atualizarEstoque(stockActual, codBarras);
        }
    }

    public void gerarNrSerie() {
        String serie = daoVenda.NroSerie();
        if (serie == null) {
            jTextFieldNrSerie.setText("0000001");
        } else {
            int incrementar = Integer.parseInt(serie);
            incrementar = incrementar + 1;
            jTextFieldNrSerie.setText("000000" + incrementar);
        }
    }

    public void limparTabela() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonBuscaCliente;
    private javax.swing.JButton jButtonBuscaProd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerQuant;
    private javax.swing.JTable jTableVenda;
    public static javax.swing.JTextField jTextFieldCodBarras;
    public static javax.swing.JTextField jTextFieldCodCliente;
    public static javax.swing.JTextField jTextFieldCodProd;
    private javax.swing.JTextField jTextFieldData;
    public static javax.swing.JTextField jTextFieldNomeCliente;
    public static javax.swing.JTextField jTextFieldNomeProd;
    public static javax.swing.JTextField jTextFieldNrSerie;
    private javax.swing.JTextField jTextFieldPreco;
    public static javax.swing.JTextField jTextFieldStock;
    private javax.swing.JTextField jTextFieldTotal;
    public static javax.swing.JTextField jTextFieldVendedor;
    // End of variables declaration//GEN-END:variables
}
