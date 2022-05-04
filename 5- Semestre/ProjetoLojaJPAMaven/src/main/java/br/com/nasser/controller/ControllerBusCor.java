package br.com.nasser.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import br.com.nasser.model.bo.Cor;
import br.com.nasser.service.CorService;
import br.com.nasser.view.TelaBusCor;

public class ControllerBusCor implements ActionListener {

	TelaBusCor telaBusCor;

	public ControllerBusCor(TelaBusCor telaBusCor) {

		this.telaBusCor = telaBusCor;

		telaBusCor.getjButtonCarregar().addActionListener(this);
		telaBusCor.getjButtonSair().addActionListener(this);

		DefaultTableModel tabela = (DefaultTableModel) this.telaBusCor.getjTable1().getModel();

		CorService corService = new CorService();
		for (Cor corAtualDaLista : corService.buscar()) {
			tabela.addRow(new Object[] { corAtualDaLista.getIdCor(), corAtualDaLista.getDescricaoCor() });
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.telaBusCor.getjButtonCarregar()) {
			ControllerCadCor.codigo = (int) this.telaBusCor.getjTable1()
					.getValueAt(this.telaBusCor.getjTable1().getSelectedRow(), 0);
			this.telaBusCor.dispose();
		} else if (e.getSource() == this.telaBusCor.getjButtonSair()) {
			this.telaBusCor.dispose();
		}
	}
}