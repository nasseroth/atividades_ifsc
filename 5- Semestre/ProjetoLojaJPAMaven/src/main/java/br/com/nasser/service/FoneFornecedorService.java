package br.com.nasser.service;

import java.util.List;

import br.com.nasser.controller.InterfaceService;
import br.com.nasser.model.DAO.FoneFornecedorDAO;
import br.com.nasser.model.bo.FoneFornecedor;

public class FoneFornecedorService implements InterfaceService<FoneFornecedor> {

	@Override
	public void salvar(FoneFornecedor objeto) {
		FoneFornecedorDAO foneFornecedorDAO = new FoneFornecedorDAO();
		foneFornecedorDAO.create(objeto);
	}

	@Override
	public List<FoneFornecedor> buscar() {
		FoneFornecedorDAO foneFornecedorDAO = new FoneFornecedorDAO();
		return foneFornecedorDAO.retrieve();
	}

	@Override
	public FoneFornecedor buscar(int codigo) {
		FoneFornecedorDAO foneFornecedorDAO = new FoneFornecedorDAO();
		return foneFornecedorDAO.retrieve(codigo);
	}

	@Override
	public FoneFornecedor buscar(String descricao) {
		FoneFornecedorDAO foneFornecedorDAO = new FoneFornecedorDAO();
		return foneFornecedorDAO.retrieve(descricao);
	}

	@Override
	public void atualizar(FoneFornecedor objeto) {
		FoneFornecedorDAO foneFornecedorDAO = new FoneFornecedorDAO();
		foneFornecedorDAO.update(objeto);
	}

	@Override
	public void apagar(FoneFornecedor objeto) {
		FoneFornecedorDAO foneFornecedorDAO = new FoneFornecedorDAO();
		foneFornecedorDAO.delete(objeto);
	}

}
