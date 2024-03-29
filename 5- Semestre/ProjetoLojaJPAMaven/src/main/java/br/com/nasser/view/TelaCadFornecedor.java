/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nasser.view;

import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.nasser.model.DAO.CidadeDAO;
import br.com.nasser.model.bo.Cidade;

/**
 *
 * @author house
 */
public class TelaCadFornecedor extends javax.swing.JFrame {

	/**
	 * Creates new form FormModeloCadastros
	 */
	public TelaCadFornecedor() {
		initComponents();
		carregarComboCidade();
	}

	public void carregarComboCidade() {

		CidadeDAO cidadeDAO = new CidadeDAO();
		List<Cidade> list = cidadeDAO.retrieve();
		for (Cidade item : list) {
			jComboBoxCidade.addItem(item.getDescricaoCidade());
		}

	}

	public JPanel getjPanelDados() {
		return jPanelDados;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanelTitulo = new javax.swing.JPanel();
		jLabelTitulo = new javax.swing.JLabel();
		jPanelDados = new javax.swing.JPanel();
		nomeFantasia = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		cnpj = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		razaoSocial = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		inscEstadual = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		email = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		compleEndereco = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jComboBoxCEP = new javax.swing.JComboBox<>();
		jComboBoxCidade = new javax.swing.JComboBox<>();
		jTFIdFornecedor = new javax.swing.JTextField();
		jLId = new javax.swing.JLabel();
		jPanelBotoes = new javax.swing.JPanel();
		jButtonNovo = new javax.swing.JButton();
		jButtonCancelar = new javax.swing.JButton();
		jButtonGravar = new javax.swing.JButton();
		jButtonBuscar = new javax.swing.JButton();
		jButtonSair = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Cadastro de Fornecedor");
		setResizable(false);

		jPanelTitulo.setBackground(new java.awt.Color(204, 255, 0));
		jPanelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jPanelTitulo.setPreferredSize(new java.awt.Dimension(533, 75));

		jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
		jLabelTitulo.setForeground(new java.awt.Color(51, 0, 153));
		jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabelTitulo.setText("Fornecedor");

		javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
		jPanelTitulo.setLayout(jPanelTituloLayout);
		jPanelTituloLayout
				.setHorizontalGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE));
		jPanelTituloLayout
				.setVerticalGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE));

		getContentPane().add(jPanelTitulo, java.awt.BorderLayout.NORTH);

		jPanelDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

		nomeFantasia.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				nomeFantasiaActionPerformed(evt);
			}
		});

		jLabel1.setText("Nome Fantasia:");

		jLabel2.setText("CNPJ:");

		jLabel3.setText("Razão Social:");

		jLabel4.setText("E-mail:");

		jLabel5.setText("Insc. Estadual:");

		jLabel6.setText("Comp. Endereço:");

		jLabel7.setText("Cidade:");

		jLabel8.setText("CEP:");

		jComboBoxCEP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "dsa" }));
		jComboBoxCEP.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBoxCEPActionPerformed(evt);
			}
		});

		jComboBoxCidade.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBoxCidadeActionPerformed(evt);
			}
		});

		jTFIdFornecedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);

		jLId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		jLId.setText("ID:");

		javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
		jPanelDados.setLayout(jPanelDadosLayout);
		jPanelDadosLayout.setHorizontalGroup(jPanelDadosLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanelDadosLayout.createSequentialGroup().addContainerGap().addGroup(jPanelDadosLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanelDadosLayout.createSequentialGroup().addComponent(jLabel6)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(compleEndereco))
						.addGroup(jPanelDadosLayout.createSequentialGroup().addGroup(jPanelDadosLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanelDadosLayout.createSequentialGroup().addComponent(jLabel3)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(razaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 428,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanelDadosLayout.createSequentialGroup().addComponent(jLabel1)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(nomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 409,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanelDadosLayout.createSequentialGroup().addComponent(jLabel2)
										.addGap(18, 18, 18)
										.addComponent(cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 118,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(10, 10, 10).addComponent(jLabel5)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(inscEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 278,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanelDadosLayout.createSequentialGroup().addGroup(
										jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel7).addComponent(jLabel4))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanelDadosLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 512,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(jPanelDadosLayout.createSequentialGroup()
														.addComponent(jComboBoxCidade, 0,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addGap(18, 18, 18).addComponent(jLabel8)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jComboBoxCEP, 0,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))))
								.addGroup(jPanelDadosLayout.createSequentialGroup().addComponent(jLId)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTFIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));
		jPanelDadosLayout.setVerticalGroup(jPanelDadosLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTFIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLId))
						.addGap(18, 18, 18)
						.addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1)
								.addComponent(nomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(9, 9, 9)
						.addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(razaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2)
								.addComponent(cnpj, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(inscEstadual, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel5))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel4))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel7).addComponent(jLabel8)
								.addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jComboBoxCEP, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(48, 48, 48)
						.addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6).addComponent(compleEndereco,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(62, 62, 62)));

		getContentPane().add(jPanelDados, java.awt.BorderLayout.CENTER);

		jPanelBotoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jPanelBotoes.setPreferredSize(new java.awt.Dimension(533, 50));

		jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/New document.png"))); // NOI18N
		jButtonNovo.setText("Novo");
		jButtonNovo.setPreferredSize(new java.awt.Dimension(100, 30));
		jPanelBotoes.add(jButtonNovo);

		jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancel.png"))); // NOI18N
		jButtonCancelar.setText("Cancelar");
		jButtonCancelar.setEnabled(false);
		jButtonCancelar.setPreferredSize(new java.awt.Dimension(100, 30));
		jPanelBotoes.add(jButtonCancelar);

		jButtonGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/OK.png"))); // NOI18N
		jButtonGravar.setText("Gravar");
		jButtonGravar.setEnabled(false);
		jButtonGravar.setPreferredSize(new java.awt.Dimension(100, 30));
		jPanelBotoes.add(jButtonGravar);

		jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find.png"))); // NOI18N
		jButtonBuscar.setText("Buscar");
		jButtonBuscar.setPreferredSize(new java.awt.Dimension(100, 30));
		jPanelBotoes.add(jButtonBuscar);

		jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Exit.png"))); // NOI18N
		jButtonSair.setText("Sair");
		jButtonSair.setPreferredSize(new java.awt.Dimension(100, 30));
		jPanelBotoes.add(jButtonSair);

		getContentPane().add(jPanelBotoes, java.awt.BorderLayout.SOUTH);

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void nomeFantasiaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nomeFantasiaActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_nomeFantasiaActionPerformed

	private void jComboBoxCidadeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBoxCidadeActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jComboBoxCidadeActionPerformed

	private void jComboBoxCEPActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBoxCEPActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jComboBoxCEPActionPerformed

	public JComboBox<String> getjComboBoxCEP() {
		return jComboBoxCEP;
	}

	public void setjComboBoxCEP(JComboBox<String> jComboBoxCEP) {
		this.jComboBoxCEP = jComboBoxCEP;
	}

	public JComboBox<String> getjComboBoxCidade() {
		return jComboBoxCidade;
	}

	public void setjComboBoxCidade(JComboBox<String> jComboBoxCidade) {
		this.jComboBoxCidade = jComboBoxCidade;
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(TelaCadFornecedor.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaCadFornecedor.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaCadFornecedor.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaCadFornecedor.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaCadFornecedor().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JTextField cnpj;
	private javax.swing.JTextField compleEndereco;
	private javax.swing.JTextField email;
	private javax.swing.JTextField inscEstadual;
	private javax.swing.JButton jButtonBuscar;
	private javax.swing.JButton jButtonCancelar;
	private javax.swing.JButton jButtonGravar;
	private javax.swing.JButton jButtonNovo;
	private javax.swing.JButton jButtonSair;
	private javax.swing.JComboBox<String> jComboBoxCEP;
	private javax.swing.JComboBox<String> jComboBoxCidade;
	private javax.swing.JLabel jLId;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabelTitulo;
	private javax.swing.JPanel jPanelBotoes;
	private javax.swing.JPanel jPanelDados;
	private javax.swing.JPanel jPanelTitulo;
	private javax.swing.JTextField jTFIdFornecedor;
	private javax.swing.JTextField nomeFantasia;
	private javax.swing.JTextField razaoSocial;
	// End of variables declaration//GEN-END:variables

	public javax.swing.JButton getjButtonBuscar() {
		return jButtonBuscar;
	}

	public javax.swing.JButton getjButtonCancelar() {
		return jButtonCancelar;
	}

	public javax.swing.JButton getjButtonGravar() {
		return jButtonGravar;
	}

	public javax.swing.JButton getjButtonNovo() {
		return jButtonNovo;
	}

	public javax.swing.JButton getjButtonSair() {
		return jButtonSair;
	}

	public JTextField getjTFIdFornecedor() {
		return jTFIdFornecedor;
	}

	public void setjTFIdFornecedor(JTextField jTFIdFornecedor) {
		this.jTFIdFornecedor = jTFIdFornecedor;
	}

	public JTextField getCnpj() {
		return cnpj;
	}

	public void setCnpj(JTextField cnpj) {
		this.cnpj = cnpj;
	}

	public JTextField getCompleEndereco() {
		return compleEndereco;
	}

	public void setCompleEndereco(JTextField compleEndereco) {
		this.compleEndereco = compleEndereco;
	}

	public JTextField getEmail() {
		return email;
	}

	public void setEmail(JTextField email) {
		this.email = email;
	}

	public JTextField getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(JTextField inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	public JTextField getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(JTextField nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public JTextField getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(JTextField razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
}
