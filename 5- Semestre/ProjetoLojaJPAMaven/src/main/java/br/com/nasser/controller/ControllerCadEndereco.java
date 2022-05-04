package br.com.nasser.controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Objects;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.com.nasser.model.DAO.BairroDAO;
import br.com.nasser.model.DAO.CidadeDAO;
import br.com.nasser.model.bo.Bairro;
import br.com.nasser.model.bo.Cidade;
import br.com.nasser.model.bo.Endereco;
import br.com.nasser.service.EnderecoService;
import br.com.nasser.view.TelaCadEndereco;

public class ControllerCadEndereco implements ActionListener {

	TelaCadEndereco telaCadEndereco;
	public static int codigo;

	public ControllerCadEndereco(TelaCadEndereco telaCadEndereco) {
		this.telaCadEndereco = telaCadEndereco;

		telaCadEndereco.getjButtonBuscar().addActionListener(this);
		telaCadEndereco.getjButtonNovo().addActionListener(this);
		telaCadEndereco.getjButtonCancelar().addActionListener(this);
		telaCadEndereco.getjButtonGravar().addActionListener(this);
		telaCadEndereco.getjButtonSair().addActionListener(this);
		telaCadEndereco.getjComboBoxCidade().addActionListener(this);
		telaCadEndereco.getjComboBoxBairro().addActionListener(this);

		ativa(true);
		ligaDesliga(false);

	}

	// Nesse método controlamos o que fazer quando uma ação acontece
	// Não foram desenvolvidas ainda as funcionalidades de persistência
	@Override
	public void actionPerformed(ActionEvent acao) {
		if (acao.getSource() == telaCadEndereco.getjComboBoxCidade()) {
			BairroDAO bairroDAO = new BairroDAO();
			CidadeDAO cidadeDAO = new CidadeDAO();

			Cidade tempCidade = cidadeDAO.retrieve(telaCadEndereco.getjComboBoxCidade().getSelectedItem().toString());

			if (Objects.nonNull(tempCidade) && tempCidade.getIdCidade() != 0) {
				List<Bairro> list = bairroDAO.retrieve();
				telaCadEndereco.getjComboBoxBairro().removeAllItems();
				for (Bairro item : list) {
					telaCadEndereco.getjComboBoxBairro().addItem(item.getDescricaoBairro());
				}
			}

//	    System.out.println(telaCadCliente.getjComboBoxCidade().getSelectedItem().toString());
		}
		if (acao.getSource() == telaCadEndereco.getjButtonNovo()) {
			ativa(false);
			ligaDesliga(true);
			this.telaCadEndereco.getjTFIdEndereco().setEnabled(false);
		} else if (acao.getSource() == telaCadEndereco.getjButtonCancelar()) {
			ativa(true);
			ligaDesliga(false);
		} else if (acao.getSource() == telaCadEndereco.getjButtonGravar()) {
			Endereco endereco = new Endereco();

//            cidade.setUfCidade(this.telaCadCidade.getjTFUF().getText());
			endereco.setCepCep(this.telaCadEndereco.getjTFCEP().getText());
			endereco.setLogradouroCep(this.telaCadEndereco.getjTFLogradouro().getText());

			Bairro bairro = new Bairro();

			String tempString, tempString2;

			tempString = this.telaCadEndereco.getjComboBoxBairro().getSelectedItem().toString();
			BairroDAO bairroDAO = new BairroDAO();
			endereco.setBairro(bairroDAO.retrieve(tempString));

			tempString2 = this.telaCadEndereco.getjComboBoxCidade().getSelectedItem().toString();
			CidadeDAO cidadeDAO = new CidadeDAO();
			endereco.setCidade(cidadeDAO.retrieve(tempString2));

			EnderecoService enderecoService = new EnderecoService();

			if (this.telaCadEndereco.getjTFIdEndereco().getText().trim().equalsIgnoreCase("")) {
				enderecoService.salvar(endereco);
			} else {
				endereco.setIdCep(Integer.parseInt(this.telaCadEndereco.getjTFIdEndereco().getText()));
				enderecoService.atualizar(endereco);
			}

			ativa(true);
			ligaDesliga(false);
		} else if (acao.getSource() == telaCadEndereco.getjButtonBuscar()) {
			// ainda não implementado pq precisa do TelaBusEndereco
			/*
			 * codigo = 0; //chamada da tela da busca TelaBusEndereco telaBusEndereco = new
			 * TelaBusEndereco(null, true); ControllerBusEndereco controllerBusEndereco =
			 * new ControllerBusEndereco(telaBusEndereco); telaBusEndereco.setVisible(true);
			 * 
			 * if (codigo != 0) { Endereco Endereco; EnderecoService EnderecoService = new
			 * EnderecoService(); Endereco = EnderecoService.buscar(codigo);
			 * 
			 * ativa(false); ligaDesliga(true);
			 * 
			 * this.telaCadEndereco.getjTFIdEndereco().setText(Endereco.getIdCep() + "");
			 * this.telaCadEndereco.getjTFCEP().setText(Endereco.getCepCep()); //
			 * this.telaCadBairro.getjTFUF().setText(cidade.getUfCidade());
			 * 
			 * this.telaCadEndereco.getjTFCEP().setEnabled(false); }
			 */
			JOptionPane.showMessageDialog(null, "Busca não implementada");
		} else if (acao.getSource() == telaCadEndereco.getjButtonSair()) {
			this.telaCadEndereco.dispose();
		}
	}

	// Método para habilitar/desabilitar botões(controle de estados)
	public void ativa(boolean estado) {
		telaCadEndereco.getjButtonNovo().setEnabled(estado);
		telaCadEndereco.getjButtonCancelar().setEnabled(!estado);
		telaCadEndereco.getjButtonGravar().setEnabled(!estado);
		telaCadEndereco.getjButtonBuscar().setEnabled(estado);
		telaCadEndereco.getjButtonSair().setEnabled(estado);
	}

	// Método para Ativação/Desativação/Limpeza ds
	// Componentes do jPanelDados
	public void ligaDesliga(boolean estado) {
		Component[] componentes = this.telaCadEndereco.getjPanelDados().getComponents();
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
