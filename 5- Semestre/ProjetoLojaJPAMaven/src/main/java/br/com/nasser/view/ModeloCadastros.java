/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nasser.view;

/**
 *
 * @author house
 */
public class ModeloCadastros extends javax.swing.JFrame {

	/**
	 * Creates new form FormModeloCadastros
	 */
	public ModeloCadastros() {
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
		jPanelBotoes = new javax.swing.JPanel();
		jButtonNovo = new javax.swing.JButton();
		jButtonCancelar = new javax.swing.JButton();
		jButtonGravar = new javax.swing.JButton();
		jButtonBuscar = new javax.swing.JButton();
		jButtonSair = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Formulário de Cadastro de .....");
		setResizable(false);

		jPanelTitulo.setBackground(new java.awt.Color(204, 255, 0));
		jPanelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jPanelTitulo.setPreferredSize(new java.awt.Dimension(533, 75));

		jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
		jLabelTitulo.setForeground(new java.awt.Color(51, 0, 153));
		jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabelTitulo.setText("Título");

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

		javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
		jPanelDados.setLayout(jPanelDadosLayout);
		jPanelDadosLayout.setHorizontalGroup(jPanelDadosLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 551, Short.MAX_VALUE));
		jPanelDadosLayout.setVerticalGroup(jPanelDadosLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 211, Short.MAX_VALUE));

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
			java.util.logging.Logger.getLogger(ModeloCadastros.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ModeloCadastros.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ModeloCadastros.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ModeloCadastros.class.getName()).log(java.util.logging.Level.SEVERE,
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

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ModeloCadastros().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonBuscar;
	private javax.swing.JButton jButtonCancelar;
	private javax.swing.JButton jButtonGravar;
	private javax.swing.JButton jButtonNovo;
	private javax.swing.JButton jButtonSair;
	private javax.swing.JLabel jLabelTitulo;
	private javax.swing.JPanel jPanelBotoes;
	private javax.swing.JPanel jPanelDados;
	private javax.swing.JPanel jPanelTitulo;
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
