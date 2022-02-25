package view;

import controller.BairroController;
import controller.CidadeController;
import controller.ClienteController;
import controller.EnderecoController;
import controller.ProdutoController;
import controller.VendasController;
import controller.VendedorController;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

/**
 *
 * @author Nasser-Othman
 */
public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        fotoFundo();
    }

    private void fotoFundo() {
        Icon imagem = new ImageIcon("/img/fundoBrancoPainel.png");
        JLabel lab = new JLabel();
        lab.setIcon(imagem);
        double alt = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        double larg = Toolkit.getDefaultToolkit().getScreenSize().getWidth();

        int altura = (int) alt;
        int largura = (int) larg;

        lab.setBounds(0, 0, largura, altura);
        jDesktopPane.add(lab);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/img/fundoLoja.jpg"));
        Image image = icon.getImage();
        jDesktopPane = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuVendas = new javax.swing.JMenu();
        jMenuItemVendass = new javax.swing.JMenuItem();
        jMenuRegistos = new javax.swing.JMenu();
        jMenuItemVendedor = new javax.swing.JMenuItem();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemProduto = new javax.swing.JMenuItem();
        jMenuItemBairro = new javax.swing.JMenuItem();
        jMenuItemCidade = new javax.swing.JMenuItem();
        jMenuItemEndereco = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuItemRel = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();
        jMenuOpcoes = new javax.swing.JMenu();
        jMenuItemOutra = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 741));

        jDesktopPane.setMinimumSize(new java.awt.Dimension(1200, 702));

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );

        jMenuVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vendas02.png"))); // NOI18N
        jMenuVendas.setText("Vendas");

        jMenuItemVendass.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemVendass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sales.png"))); // NOI18N
        jMenuItemVendass.setText("Realizar Venda");
        jMenuItemVendass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendassActionPerformed(evt);
            }
        });
        jMenuVendas.add(jMenuItemVendass);

        jMenuBar1.add(jMenuVendas);

        jMenuRegistos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/register.png"))); // NOI18N
        jMenuRegistos.setText("Cadastros");

        jMenuItemVendedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salesman.png"))); // NOI18N
        jMenuItemVendedor.setText("Vendedor");
        jMenuItemVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendedorActionPerformed(evt);
            }
        });
        jMenuRegistos.add(jMenuItemVendedor);

        jMenuItemCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/customer.png"))); // NOI18N
        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuRegistos.add(jMenuItemCliente);

        jMenuItemProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/product.png"))); // NOI18N
        jMenuItemProduto.setText("Produto");
        jMenuItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutoActionPerformed(evt);
            }
        });
        jMenuRegistos.add(jMenuItemProduto);

        jMenuItemBairro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemBairro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bairro.png"))); // NOI18N
        jMenuItemBairro.setText("Bairro");
        jMenuItemBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBairroActionPerformed(evt);
            }
        });
        jMenuRegistos.add(jMenuItemBairro);

        jMenuItemCidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cidade.png"))); // NOI18N
        jMenuItemCidade.setText("Cidade");
        jMenuItemCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCidadeActionPerformed(evt);
            }
        });
        jMenuRegistos.add(jMenuItemCidade);

        jMenuItemEndereco.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemEndereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bairro.png"))); // NOI18N
        jMenuItemEndereco.setText("Endereço");
        jMenuItemEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEnderecoActionPerformed(evt);
            }
        });
        jMenuRegistos.add(jMenuItemEndereco);

        jMenuBar1.add(jMenuRegistos);

        jMenuRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/analytics.png"))); // NOI18N
        jMenuRelatorio.setText("Relatórios");

        jMenuItemRel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemRel.setText("Gerar Relatório");
        jMenuItemRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemRel);

        jMenuBar1.add(jMenuRelatorio);

        jMenuAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/question.png"))); // NOI18N
        jMenuAjuda.setText("Ajuda");

        jMenuItemSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/about.png"))); // NOI18N
        jMenuItemSobre.setText("Sobre");
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemSobre);

        jMenuBar1.add(jMenuAjuda);

        jMenuOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/technical-support.png"))); // NOI18N
        jMenuOpcoes.setText("Opcoes");

        jMenuItemOutra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemOutra.setText("Usar outra Conta");
        jMenuItemOutra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOutraActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemOutra);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemSair);

        jMenuBar1.add(jMenuOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
        InfoForm form = new InfoForm();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    private void jMenuItemVendassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendassActionPerformed
        VendasForm vendasForm = new VendasForm();
        VendasController vendasController = new VendasController(vendasForm);
        vendasForm.setVisible(true);
    }//GEN-LAST:event_jMenuItemVendassActionPerformed

    private void jMenuItemVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendedorActionPerformed
        VendedorForm vendedorForm = new VendedorForm();
        VendedorController vendedorController = new VendedorController(vendedorForm);
        vendedorForm.setVisible(true);
    }//GEN-LAST:event_jMenuItemVendedorActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        ClienteForm clienteForm = new ClienteForm();
        ClienteController clienteController = new ClienteController(clienteForm);
        clienteForm.setVisible(true);
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutoActionPerformed
        ProdutoForm produtoForm = new ProdutoForm();
        ProdutoController produtoController = new ProdutoController(produtoForm);
        produtoForm.setVisible(true);
    }//GEN-LAST:event_jMenuItemProdutoActionPerformed

    private void jMenuItemRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemRelActionPerformed

    private void jMenuItemOutraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOutraActionPerformed
        LoginForm form = new LoginForm();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemOutraActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBairroActionPerformed
        BairroForm bairroForm = new BairroForm();
        BairroController bairroController = new BairroController(bairroForm);
        bairroForm.setVisible(true);
    }//GEN-LAST:event_jMenuItemBairroActionPerformed

    private void jMenuItemCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCidadeActionPerformed
        CidadeForm cidadeForm = new CidadeForm();
        CidadeController cidadeController = new CidadeController(cidadeForm);
        cidadeForm.setVisible(true);
    }//GEN-LAST:event_jMenuItemCidadeActionPerformed

    private void jMenuItemEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEnderecoActionPerformed
        EnderecoForm enderecoForm = new EnderecoForm();
        EnderecoController enderecoController = new EnderecoController(enderecoForm);
        enderecoForm.setVisible(true);
    }//GEN-LAST:event_jMenuItemEnderecoActionPerformed

    void centralizarForm(JInternalFrame frame) {
        jDesktopPane.add(frame);
        Dimension dimension = jDesktopPane.getSize();
        Dimension dimensionFrame = frame.getSize();
        frame.setLocation((dimension.width - dimensionFrame.width) / 2,
                (dimension.height - dimensionFrame.height) / 2);
        frame.show();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemBairro;
    private javax.swing.JMenuItem jMenuItemCidade;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemEndereco;
    private javax.swing.JMenuItem jMenuItemOutra;
    private javax.swing.JMenuItem jMenuItemProduto;
    private javax.swing.JMenuItem jMenuItemRel;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenuItem jMenuItemVendass;
    private javax.swing.JMenuItem jMenuItemVendedor;
    private javax.swing.JMenu jMenuOpcoes;
    private javax.swing.JMenu jMenuRegistos;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuVendas;
    // End of variables declaration//GEN-END:variables
}
