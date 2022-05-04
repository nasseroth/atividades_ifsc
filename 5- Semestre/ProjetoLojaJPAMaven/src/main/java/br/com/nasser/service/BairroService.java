package br.com.nasser.service;

import java.util.List;

import br.com.nasser.controller.InterfaceService;
import br.com.nasser.model.DAO.BairroDAO;
import br.com.nasser.model.bo.Bairro;

public class BairroService implements InterfaceService<Bairro> {

	@Override
	public void salvar(Bairro objeto) {
		BairroDAO.getInstance().create(objeto);
	}

	@Override
	public List<Bairro> buscar() {
		return BairroDAO.getInstance().retrieve();
	}

	@Override
	public Bairro buscar(int codigo) {
		return BairroDAO.getInstance().retrieve(codigo);
	}

	@Override
	public Bairro buscar(String descricao) {
		return BairroDAO.getInstance().retrieve(descricao);
	}

	@Override
	public void atualizar(Bairro objeto) {
		BairroDAO.getInstance().update(objeto);
	}

	@Override
	public void apagar(Bairro objeto) {
		BairroDAO.getInstance().delete(objeto);
	}

}
