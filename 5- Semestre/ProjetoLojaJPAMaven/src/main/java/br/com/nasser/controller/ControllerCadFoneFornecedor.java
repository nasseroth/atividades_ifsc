package br.com.nasser.controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

import br.com.nasser.model.DAO.FornecedorDAO;
import br.com.nasser.model.bo.FoneFornecedor;
import br.com.nasser.model.bo.Fornecedor;
import br.com.nasser.service.FoneFornecedorService;
import br.com.nasser.view.TelaBusFoneFornecedor;
import br.com.nasser.view.TelaCadFoneFornecedor;

public class ControllerCadFoneFornecedor implements ActionListener {

	TelaCadFoneFornecedor telaCadFoneFornecedor;
	public static int codigo;

	public ControllerCadFoneFornecedor(TelaCadFoneFornecedor telaCadFoneFornecedor) {
		this.telaCadFoneFornecedor = telaCadFoneFornecedor;

		telaCadFoneFornecedor.getjButtonBuscar().addActionListener(this);
		telaCadFoneFornecedor.getjButtonNovo().addActionListener(this);
		telaCadFoneFornecedor.getjButtonCancelar().addActionListener(this);
		telaCadFoneFornecedor.getjButtonGravar().addActionListener(this);
		telaCadFoneFornecedor.getjButtonSair().addActionListener(this);

		ativa(true);
		ligaDesliga(false);

	}

	// Nesse método controlamos o que fazer quando uma ação acontece
	// Não foram desenvolvidas ainda as funcionalidades de persistência
	@Override
	public void actionPerformed(ActionEvent acao) {
		if (acao.getSource() == telaCadFoneFornecedor.getjButtonNovo()) {
			ativa(false);
			ligaDesliga(true);
		} else if (acao.getSource() == telaCadFoneFornecedor.getjButtonCancelar()) {
			ativa(true);
			ligaDesliga(false);
		} else if (acao.getSource() == telaCadFoneFornecedor.getjButtonGravar()) {
			FoneFornecedor foneFornecedor = new FoneFornecedor();
			Fornecedor fornecedor = new Fornecedor();
			FornecedorDAO fornecedorDAO = new FornecedorDAO();

			String tempString = this.telaCadFoneFornecedor.getjComboBoxFornecedor().getSelectedItem().toString();

			fornecedor = fornecedorDAO.retrieveCNPJ(tempString);

			foneFornecedor.setFoneFornecedor(this.telaCadFoneFornecedor.getjFormattedTextFieldFone().getText());
			foneFornecedor.setFornecedor(fornecedor);

			FoneFornecedorService foneFornecedorService = new FoneFornecedorService();
			foneFornecedorService.salvar(foneFornecedor);

			ativa(true);
			ligaDesliga(false);
			ativa(true);
			ligaDesliga(false);
		} else if (acao.getSource() == telaCadFoneFornecedor.getjButtonBuscar()) {
			codigo = 0;
			// chamada da tela da busca
			TelaBusFoneFornecedor telaBusFoneFornecedor = new TelaBusFoneFornecedor(null, true);
			ControllerBusFoneFornecedor controllerBusFoneFornecedor = new ControllerBusFoneFornecedor(
					telaBusFoneFornecedor);
			telaBusFoneFornecedor.setVisible(true);

			if (codigo != 0) {
				FoneFornecedor foneFornecedor;
				FoneFornecedorService foneFornecedorService = new FoneFornecedorService();
				foneFornecedor = foneFornecedorService.buscar(codigo);

				ativa(false);
				ligaDesliga(true);

				this.telaCadFoneFornecedor.getjFormattedTextFieldFone()
						.setText(foneFornecedor.getFoneFornecedor() + "");

				this.telaCadFoneFornecedor.getjFormattedTextFieldFone().setEnabled(false);
			}
		} else if (acao.getSource() == telaCadFoneFornecedor.getjButtonSair()) {
			this.telaCadFoneFornecedor.dispose();
		}
	}

	// Método para habilitar/desabilitar botões(controle de estados)
	public void ativa(boolean estado) {
		telaCadFoneFornecedor.getjButtonNovo().setEnabled(estado);
		telaCadFoneFornecedor.getjButtonCancelar().setEnabled(!estado);
		telaCadFoneFornecedor.getjButtonGravar().setEnabled(!estado);
		telaCadFoneFornecedor.getjButtonBuscar().setEnabled(estado);
		telaCadFoneFornecedor.getjButtonSair().setEnabled(estado);
	}

	// Método para Ativação/Desativação/Limpeza ds
	// Componentes do jPanelDados
	public void ligaDesliga(boolean estado) {
		Component[] componentes = this.telaCadFoneFornecedor.getjPanelDados().getComponents();
		for (Component componenteAtual : componentes) {
			if (componenteAtual instanceof JTextField) {
				((JTextField) componenteAtual).setText("");
				componenteAtual.setEnabled(estado);
			} else if (componenteAtual instanceof JFormattedTextField) {
				((JFormattedTextField) componenteAtual).setText("");
				componenteAtual.setEnabled(estado);
			} else if (componenteAtual instanceof JComboBox) {
				((JComboBox) componenteAtual).setSelectedIndex(0);
				componenteAtual.setEnabled(estado);
			}
		}
	}
}
