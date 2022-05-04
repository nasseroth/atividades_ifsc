package br.com.nasser.service;

import java.util.List;

import br.com.nasser.controller.InterfaceService;
import br.com.nasser.model.DAO.CorDAO;
import br.com.nasser.model.bo.Cor;

public class CorService implements InterfaceService<Cor> {

	@Override
	public void salvar(Cor objeto) {
		CorDAO.getInstance().create(objeto);
	}

	@Override
	public List<Cor> buscar() {
		return CorDAO.getInstance().retrieve();
	}

	@Override
	public Cor buscar(int codigo) {
		return CorDAO.getInstance().retrieve(codigo);
	}

	@Override
	public Cor buscar(String descricao) {
		return CorDAO.getInstance().retrieve(descricao);
	}

	@Override
	public void atualizar(Cor objeto) {
		CorDAO.getInstance().update(objeto);
	}

	@Override
	public void apagar(Cor objeto) {
		CorDAO.getInstance().delete(objeto);
	}

}
