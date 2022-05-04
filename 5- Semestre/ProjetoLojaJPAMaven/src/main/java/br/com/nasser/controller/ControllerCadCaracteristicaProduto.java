package br.com.nasser.controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

import br.com.nasser.model.DAO.CorDAO;
import br.com.nasser.model.DAO.ProdutoDAO;
import br.com.nasser.model.DAO.TamanhoDAO;
import br.com.nasser.model.bo.CaracteristicaProduto;
import br.com.nasser.model.bo.Cor;
import br.com.nasser.model.bo.Produto;
import br.com.nasser.model.bo.Tamanho;
import br.com.nasser.service.CaracteristicaProdutoService;
import br.com.nasser.view.TelaBusCaracteristicaProduto;
import br.com.nasser.view.TelaCadCaracteristicaProduto;

public class ControllerCadCaracteristicaProduto implements ActionListener {

	TelaCadCaracteristicaProduto telaCadCaracteristicaProduto;
	public static int codigo;

	public ControllerCadCaracteristicaProduto(TelaCadCaracteristicaProduto telaCadCaracteristicaProduto) {
		this.telaCadCaracteristicaProduto = telaCadCaracteristicaProduto;

		telaCadCaracteristicaProduto.getjButtonBuscar().addActionListener(this);
		telaCadCaracteristicaProduto.getjButtonNovo().addActionListener(this);
		telaCadCaracteristicaProduto.getjButtonCancelar().addActionListener(this);
		telaCadCaracteristicaProduto.getjButtonGravar().addActionListener(this);
		telaCadCaracteristicaProduto.getjButtonSair().addActionListener(this);

		ativa(true);
		ligaDesliga(false);

	}

	// Nesse método controlamos o que fazer quando uma ação acontece
	// Não foram desenvolvidas ainda as funcionalidades de persistência
	@Override
	public void actionPerformed(ActionEvent acao) {
		if (acao.getSource() == telaCadCaracteristicaProduto.getjButtonNovo()) {
			ativa(false);
			ligaDesliga(true);
			this.telaCadCaracteristicaProduto.getjTFIdCidade().setEnabled(false);
		} else if (acao.getSource() == telaCadCaracteristicaProduto.getjButtonCancelar()) {
			ativa(true);
			ligaDesliga(false);
		} else if (acao.getSource() == telaCadCaracteristicaProduto.getjButtonGravar()) {
			CaracteristicaProduto caracteristicaProduto = new CaracteristicaProduto();

			String tempProduto;
			tempProduto = this.telaCadCaracteristicaProduto.getjComboBox1().getSelectedItem().toString();

			Produto produto = new Produto();
			ProdutoDAO produtoDAO = new ProdutoDAO();
			produto = produtoDAO.retrieve(tempProduto);

			String tempCor;
			tempCor = this.telaCadCaracteristicaProduto.getjComboBox2().getSelectedItem().toString();

			Cor cor = new Cor();
			CorDAO corDAO = new CorDAO();
			cor = corDAO.retrieve(tempCor);

			String tempTamanho;
			tempTamanho = this.telaCadCaracteristicaProduto.getjComboBox3().getSelectedItem().toString();

			Tamanho tamanho = new Tamanho();
			TamanhoDAO tamanhoDAO = new TamanhoDAO();
			tamanho = tamanhoDAO.retrieve(tempTamanho);

			caracteristicaProduto.setBarraProduto(this.telaCadCaracteristicaProduto.getjTFCodBarras().getText());
			caracteristicaProduto.setQtdEstoqueProduto(
					Float.parseFloat(this.telaCadCaracteristicaProduto.getjTFQtdEstoque().getText()));
			caracteristicaProduto.setProduto(produto);
			caracteristicaProduto.setCor(cor);
			caracteristicaProduto.setTamanhoProduto(tamanho.getDescricaoTamanho());

			CaracteristicaProdutoService caracteristicaProdutoService = new CaracteristicaProdutoService();
			if (this.telaCadCaracteristicaProduto.getjTFIdCidade().getText().trim().equalsIgnoreCase("")) {
				caracteristicaProdutoService.salvar(caracteristicaProduto);
			} else {
				caracteristicaProduto.setIdCaracteristicaProduto(
						Integer.parseInt(this.telaCadCaracteristicaProduto.getjTFIdCidade().getText()));
				System.out.println("teste");
				caracteristicaProdutoService.atualizar(caracteristicaProduto);
			}

			ativa(true);
			ligaDesliga(false);
		} else if (acao.getSource() == telaCadCaracteristicaProduto.getjButtonBuscar()) {
			codigo = 0;
			// chamada da tela da busca
			TelaBusCaracteristicaProduto telaBusCaracteristicaProduto = new TelaBusCaracteristicaProduto(null, true);
			ControllerBusCaracteristicaProduto controllerBusCaracteristicaProduto = new ControllerBusCaracteristicaProduto(
					telaBusCaracteristicaProduto);
			telaBusCaracteristicaProduto.setVisible(true);

			if (codigo != 0) {
				CaracteristicaProduto caracteristicaProduto;
				CaracteristicaProdutoService caracteristicaProdutoService = new CaracteristicaProdutoService();
				caracteristicaProduto = caracteristicaProdutoService.buscar(codigo);

				ativa(false);
				ligaDesliga(true);

				this.telaCadCaracteristicaProduto.getjTFIdCidade()
						.setText(caracteristicaProduto.getIdCaracteristicaProduto() + "");
				this.telaCadCaracteristicaProduto.getjComboBox1().setSelectedItem(caracteristicaProduto.getProduto());
				this.telaCadCaracteristicaProduto.getjComboBox2().setSelectedItem(caracteristicaProduto.getCor());
				this.telaCadCaracteristicaProduto.getjComboBox3()
						.setSelectedItem(caracteristicaProduto.getTamanhoProduto());
				this.telaCadCaracteristicaProduto.getjTFCodBarras().setText(caracteristicaProduto.getBarraProduto());
				this.telaCadCaracteristicaProduto.getjTFQtdEstoque()
						.setText(caracteristicaProduto.getQtdEstoqueProduto() + "");

				this.telaCadCaracteristicaProduto.getjTFIdCidade().setEnabled(false);
			}
		} else if (acao.getSource() == telaCadCaracteristicaProduto.getjButtonSair()) {
			this.telaCadCaracteristicaProduto.dispose();
		}
	}

	// Método para habilitar/desabilitar botões(controle de estados)
	public void ativa(boolean estado) {
		telaCadCaracteristicaProduto.getjButtonNovo().setEnabled(estado);
		telaCadCaracteristicaProduto.getjButtonCancelar().setEnabled(!estado);
		telaCadCaracteristicaProduto.getjButtonGravar().setEnabled(!estado);
		telaCadCaracteristicaProduto.getjButtonBuscar().setEnabled(estado);
		telaCadCaracteristicaProduto.getjButtonSair().setEnabled(estado);
	}

	// Método para Ativação/Desativação/Limpeza ds
	// Componentes do jPanelDados
	public void ligaDesliga(boolean estado) {
		Component[] componentes = this.telaCadCaracteristicaProduto.getjPanelDados().getComponents();
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
