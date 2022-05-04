/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nasser.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author house
 */
public class TelaCadTipoProduto extends javax.swing.JFrame {

	/**
	 * Creates new form FormModeloCadastros
	 */
	public TelaCadTipoProduto() {
		initComponents();
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
		jLId = new javax.swing.JLabel();
		jTFIdTipoProduto = new javax.swing.JTextField();
		jLabelDescricao = new javax.swing.JLabel();
		jTFDescricaoTipoProduto = new javax.swing.JTextField();
		jPanelBotoes = new javax.swing.JPanel();
		jButtonNovo = new javax.swing.JButton();
		jButtonCancelar = new javax.swing.JButton();
		jButtonGravar = new javax.swing.JButton();
		jButtonBuscar = new javax.swing.JButton();
		jButtonSair = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Formulário de Cadastro de Tipo Produto");
		setResizable(false);

		jPanelTitulo.setBackground(new java.awt.Color(204, 255, 0));
		jPanelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jPanelTitulo.setPreferredSize(new java.awt.Dimension(533, 75));

		jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
		jLabelTitulo.setForeground(new java.awt.Color(51, 0, 153));
		jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabelTitulo.setText("Tipo Produto");

		javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
		jPanelTitulo.setLayout(jPanelTituloLayout);
		jPanelTituloLayout
				.setHorizontalGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE));
		jPanelTituloLayout
				.setVerticalGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE));

		getContentPane().add(jPanelTitulo, java.awt.BorderLayout.NORTH);

		jPanelDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		jLId.setText("ID:");

		jTFIdTipoProduto.setHorizontalAlignment(javax.swing.JTextField.LEFT);

		jLabelDescricao.setText("Descrição:");

		jTFDescricaoTipoProduto.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTFDescricaoTipoProdutoActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
		jPanelDados.setLayout(jPanelDadosLayout);
		jPanelDadosLayout
				.setHorizontalGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanelDadosLayout.createSequentialGroup().addContainerGap().addComponent(jLId)
								.addGap(18, 18, 18)
								.addComponent(jTFIdTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(460, Short.MAX_VALUE))
						.addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanelDadosLayout.createSequentialGroup().addContainerGap()
										.addGroup(jPanelDadosLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jTFDescricaoTipoProduto,
														javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
												.addGroup(jPanelDadosLayout.createSequentialGroup()
														.addComponent(jLabelDescricao,
																javax.swing.GroupLayout.PREFERRED_SIZE, 55,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0, Short.MAX_VALUE)))
										.addContainerGap())));
		jPanelDadosLayout.setVerticalGroup(jPanelDadosLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanelDadosLayout.createSequentialGroup().addGap(35, 35, 35)
						.addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTFIdTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLId))
						.addContainerGap(156, Short.MAX_VALUE))
				.addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanelDadosLayout.createSequentialGroup().addGap(85, 85, 85)
								.addComponent(jLabelDescricao)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jTFDescricaoTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(86, Short.MAX_VALUE))));

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

	private void jTFDescricaoTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTFDescricaoTipoProdutoActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTFDescricaoTipoProdutoActionPerformed

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
			java.util.logging.Logger.getLogger(TelaCadTipoProduto.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaCadTipoProduto.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaCadTipoProduto.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaCadTipoProduto.class.getName()).log(java.util.logging.Level.SEVERE,
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
				new TelaCadTipoProduto().setVisible(true);
			}
		});
	}

	public JLabel getjLId() {
		return jLId;
	}

	public void setjLId(JLabel jLId) {
		this.jLId = jLId;
	}

	public JLabel getjLabelDescricao() {
		return jLabelDescricao;
	}

	public void setjLabelDescricao(JLabel jLabelDescricao) {
		this.jLabelDescricao = jLabelDescricao;
	}

	public JLabel getjLabelTitulo() {
		return jLabelTitulo;
	}

	public void setjLabelTitulo(JLabel jLabelTitulo) {
		this.jLabelTitulo = jLabelTitulo;
	}

	public JPanel getjPanelBotoes() {
		return jPanelBotoes;
	}

	public void setjPanelBotoes(JPanel jPanelBotoes) {
		this.jPanelBotoes = jPanelBotoes;
	}

	public JPanel getjPanelDados() {
		return jPanelDados;
	}

	public void setjPanelDados(JPanel jPanelDados) {
		this.jPanelDados = jPanelDados;
	}

	public JPanel getjPanelTitulo() {
		return jPanelTitulo;
	}

	public void setjPanelTitulo(JPanel jPanelTitulo) {
		this.jPanelTitulo = jPanelTitulo;
	}

	public JTextField getjTFDescricaoTipoProduto() {
		return jTFDescricaoTipoProduto;
	}

	public void setjTFDescricaoTipoProduto(JTextField jTFDescricaoTipoProduto) {
		this.jTFDescricaoTipoProduto = jTFDescricaoTipoProduto;
	}

	public JTextField getjTFIdTipoProduto() {
		return jTFIdTipoProduto;
	}

	public void setjTFIdTipoProduto(JTextField jTFIdTipoProduto) {
		this.jTFIdTipoProduto = jTFIdTipoProduto;
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonBuscar;
	private javax.swing.JButton jButtonCancelar;
	private javax.swing.JButton jButtonGravar;
	private javax.swing.JButton jButtonNovo;
	private javax.swing.JButton jButtonSair;
	private javax.swing.JLabel jLId;
	private javax.swing.JLabel jLabelDescricao;
	private javax.swing.JLabel jLabelTitulo;
	private javax.swing.JPanel jPanelBotoes;
	private javax.swing.JPanel jPanelDados;
	private javax.swing.JPanel jPanelTitulo;
	private javax.swing.JTextField jTFDescricaoTipoProduto;
	private javax.swing.JTextField jTFIdTipoProduto;
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
}
