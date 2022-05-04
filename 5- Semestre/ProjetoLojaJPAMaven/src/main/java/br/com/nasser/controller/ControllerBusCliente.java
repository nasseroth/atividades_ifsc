package br.com.nasser.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import br.com.nasser.model.bo.Cliente;
import br.com.nasser.service.ClienteService;
import br.com.nasser.view.TelaBusCliente;

public class ControllerBusCliente implements ActionListener {

	TelaBusCliente telaBusCliente;

	public ControllerBusCliente(TelaBusCliente telaBusCliente) {

		this.telaBusCliente = telaBusCliente;

		telaBusCliente.getjButtonCarregar().addActionListener(this);
		telaBusCliente.getjButtonSair().addActionListener(this);

		DefaultTableModel tabela = (DefaultTableModel) this.telaBusCliente.getjTable1().getModel();

		ClienteService clienteService = new ClienteService();
		for (Cliente clienteAtualDaLista : clienteService.buscar()) {
			System.out.println("AQUI" + clienteAtualDaLista.getEndereco().getIdCep());
			tabela.addRow(new Object[] { clienteAtualDaLista.getIdcliente(), clienteAtualDaLista.getNome(),
					clienteAtualDaLista.getCpfCliente(), clienteAtualDaLista.getRgCliente(),
					clienteAtualDaLista.getDtNascCliente(), clienteAtualDaLista.getEmail(),
					clienteAtualDaLista.getEndereco().getIdCep(), clienteAtualDaLista.getFoneCliente(),

			});
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.telaBusCliente.getjButtonCarregar()) {
			ControllerCadCliente.codigo = (int) this.telaBusCliente.getjTable1()
					.getValueAt(this.telaBusCliente.getjTable1().getSelectedRow(), 0);

			ControllerCadVendas.codigoCliente = (int) this.telaBusCliente.getjTable1()
					.getValueAt(this.telaBusCliente.getjTable1().getSelectedRow(), 0);

			this.telaBusCliente.dispose();
		} else if (e.getSource() == this.telaBusCliente.getjButtonSair()) {
			this.telaBusCliente.dispose();
		}
	}
}