package br.com.nasser.service;

import java.util.List;

import br.com.nasser.controller.InterfaceService;
import br.com.nasser.model.DAO.TipoProdutoDAO;
import br.com.nasser.model.bo.TipoProduto;

public class TipoProdutoService implements InterfaceService<TipoProduto> {

	@Override
	public void salvar(TipoProduto objeto) {
		TipoProdutoDAO tipoProdutoDAO = new TipoProdutoDAO();
		tipoProdutoDAO.create(objeto);
	}

	@Override
	public List<TipoProduto> buscar() {
		TipoProdutoDAO tipoProdutoDAO = new TipoProdutoDAO();
		return tipoProdutoDAO.retrieve();
	}

	@Override
	public TipoProduto buscar(int codigo) {
		TipoProdutoDAO tipoProdutoDAO = new TipoProdutoDAO();
		return tipoProdutoDAO.retrieve(codigo);
	}

	@Override
	public TipoProduto buscar(String descricao) {
		TipoProdutoDAO tipoProdutoDAO = new TipoProdutoDAO();
		return tipoProdutoDAO.retrieve(descricao);
	}

	@Override
	public void atualizar(TipoProduto objeto) {
		TipoProdutoDAO tipoProdutoDAO = new TipoProdutoDAO();
		tipoProdutoDAO.update(objeto);
	}

	@Override
	public void apagar(TipoProduto objeto) {
		TipoProdutoDAO tipoProdutoDAO = new TipoProdutoDAO();
		tipoProdutoDAO.delete(objeto);
	}

}
