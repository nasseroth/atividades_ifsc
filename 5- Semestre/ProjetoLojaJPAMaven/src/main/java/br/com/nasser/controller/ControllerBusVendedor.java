package br.com.nasser.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import br.com.nasser.model.bo.Vendedor;
import br.com.nasser.service.VendedorService;
import br.com.nasser.view.TelaBusVendedor;

public class ControllerBusVendedor implements ActionListener {

	TelaBusVendedor telaBusVendedor;

	public ControllerBusVendedor(TelaBusVendedor telaBusVendedor) {

		this.telaBusVendedor = telaBusVendedor;

		telaBusVendedor.getjButtonCarregar().addActionListener(this);
		telaBusVendedor.getjButtonSair().addActionListener(this);

		DefaultTableModel tabela = (DefaultTableModel) this.telaBusVendedor.getjTable1().getModel();

		VendedorService vendedorService = new VendedorService();
		for (Vendedor vendedorAtualDaLista : vendedorService.buscar()) {
			tabela.addRow(new Object[] { vendedorAtualDaLista.getIdvendedor(), vendedorAtualDaLista.getNome(),
					vendedorAtualDaLista.getCpfVendedor() });
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.telaBusVendedor.getjButtonCarregar()) {
			ControllerCadVendedor.codigo = (int) this.telaBusVendedor.getjTable1()
					.getValueAt(this.telaBusVendedor.getjTable1().getSelectedRow(), 0);
			ControllerCadVendas.codigoVendedor = (int) this.telaBusVendedor.getjTable1()
					.getValueAt(this.telaBusVendedor.getjTable1().getSelectedRow(), 0);

			this.telaBusVendedor.dispose();
		} else if (e.getSource() == this.telaBusVendedor.getjButtonSair()) {
			this.telaBusVendedor.dispose();
		}
	}
}