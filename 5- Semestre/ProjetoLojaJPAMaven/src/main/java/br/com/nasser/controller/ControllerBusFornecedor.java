package br.com.nasser.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import br.com.nasser.model.bo.Fornecedor;
import br.com.nasser.service.FornecedorService;
import br.com.nasser.view.TelaBusFornecedor;

public class ControllerBusFornecedor implements ActionListener {

	TelaBusFornecedor telaBusFornecedor;

	public ControllerBusFornecedor(TelaBusFornecedor telaBusFornecedor) {

		this.telaBusFornecedor = telaBusFornecedor;

		telaBusFornecedor.getjButtonCarregar().addActionListener(this);
		telaBusFornecedor.getjButtonSair().addActionListener(this);

		DefaultTableModel tabela = (DefaultTableModel) this.telaBusFornecedor.getjTable1().getModel();

		FornecedorService fornecedorService = new FornecedorService();
		for (Fornecedor fornecedorAtualDaLista : fornecedorService.buscar()) {
			tabela.addRow(new Object[] { fornecedorAtualDaLista.getIdfornecedor(), fornecedorAtualDaLista.getNome(),
					fornecedorAtualDaLista.getCnpjFornecedor() });
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.telaBusFornecedor.getjButtonCarregar()) {
			ControllerCadFornecedor.codigo = (int) this.telaBusFornecedor.getjTable1()
					.getValueAt(this.telaBusFornecedor.getjTable1().getSelectedRow(), 0);
			this.telaBusFornecedor.dispose();
		} else if (e.getSource() == this.telaBusFornecedor.getjButtonSair()) {
			this.telaBusFornecedor.dispose();
		}
	}
}