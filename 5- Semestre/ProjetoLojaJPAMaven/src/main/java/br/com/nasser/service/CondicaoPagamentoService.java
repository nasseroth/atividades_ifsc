package br.com.nasser.service;

import java.util.List;

import br.com.nasser.controller.InterfaceService;
import br.com.nasser.model.DAO.CondicaoPagamentoDAO;
import br.com.nasser.model.bo.CondicaoPagamento;

public class CondicaoPagamentoService implements InterfaceService<CondicaoPagamento> {

	@Override
	public void salvar(CondicaoPagamento objeto) {
		CondicaoPagamentoDAO.getInstance().create(objeto);
	}

	@Override
	public List<CondicaoPagamento> buscar() {
		return CondicaoPagamentoDAO.getInstance().retrieve();
	}

	@Override
	public CondicaoPagamento buscar(int codigo) {
		return CondicaoPagamentoDAO.getInstance().retrieve(codigo);
	}

	@Override
	public CondicaoPagamento buscar(String descricao) {
		return CondicaoPagamentoDAO.getInstance().retrieve(descricao);
	}

	@Override
	public void atualizar(CondicaoPagamento objeto) {
		CondicaoPagamentoDAO.getInstance().update(objeto);
	}

	@Override
	public void apagar(CondicaoPagamento objeto) {
		CondicaoPagamentoDAO.getInstance().delete(objeto);
	}

}
