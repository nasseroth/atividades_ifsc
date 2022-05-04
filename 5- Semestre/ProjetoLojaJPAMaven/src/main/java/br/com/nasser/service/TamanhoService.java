package br.com.nasser.service;

import java.util.List;

import br.com.nasser.controller.InterfaceService;
import br.com.nasser.model.DAO.TamanhoDAO;
import br.com.nasser.model.bo.Tamanho;

public class TamanhoService implements InterfaceService<Tamanho> {

	@Override
	public void salvar(Tamanho objeto) {
		TamanhoDAO tamanhoDAO = new TamanhoDAO();
		tamanhoDAO.create(objeto);
	}

	@Override
	public List<Tamanho> buscar() {
		TamanhoDAO tamanhoDAO = new TamanhoDAO();
		return tamanhoDAO.retrieve();
	}

	@Override
	public Tamanho buscar(int codigo) {
		TamanhoDAO tamanhoDAO = new TamanhoDAO();
		return tamanhoDAO.retrieve(codigo);
	}

	@Override
	public Tamanho buscar(String descricao) {
		TamanhoDAO tamanhoDAO = new TamanhoDAO();
		return tamanhoDAO.retrieve(descricao);
	}

	@Override
	public void atualizar(Tamanho objeto) {
		TamanhoDAO tamanhoDAO = new TamanhoDAO();
		tamanhoDAO.update(objeto);
	}

	@Override
	public void apagar(Tamanho objeto) {
		TamanhoDAO tamanhoDAO = new TamanhoDAO();
		tamanhoDAO.delete(objeto);
	}

}
