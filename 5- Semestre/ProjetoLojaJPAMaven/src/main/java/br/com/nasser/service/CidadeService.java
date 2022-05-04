package br.com.nasser.service;

import java.util.List;

import br.com.nasser.controller.InterfaceService;
import br.com.nasser.model.DAO.CidadeDAO;
import br.com.nasser.model.bo.Cidade;

public class CidadeService implements InterfaceService<Cidade> {

	@Override
	public void salvar(Cidade objeto) {
		CidadeDAO.getInstance().create(objeto);
	}

	@Override
	public List<Cidade> buscar() {
		return CidadeDAO.getInstance().retrieve();
	}

	@Override
	public Cidade buscar(int codigo) {
		return CidadeDAO.getInstance().retrieve(codigo);
	}

	@Override
	public Cidade buscar(String descricao) {
		return CidadeDAO.getInstance().retrieve(descricao);
	}

	@Override
	public void atualizar(Cidade objeto) {
		CidadeDAO.getInstance().update(objeto);
	}

	@Override
	public void apagar(Cidade objeto) {
		CidadeDAO.getInstance().delete(objeto);
	}

}
