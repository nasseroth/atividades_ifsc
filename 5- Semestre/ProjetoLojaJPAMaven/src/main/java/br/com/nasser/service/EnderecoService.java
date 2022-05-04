package br.com.nasser.service;

import java.util.List;

import br.com.nasser.controller.InterfaceService;
import br.com.nasser.model.DAO.EnderecoDAO;
import br.com.nasser.model.bo.Endereco;

public class EnderecoService implements InterfaceService<Endereco> {

	@Override
	public void salvar(Endereco objeto) {
		EnderecoDAO.getInstance().create(objeto);
	}

	@Override
	public List<Endereco> buscar() {
		return EnderecoDAO.getInstance().retrieve();
	}

	@Override
	public Endereco buscar(int codigo) {
		return EnderecoDAO.getInstance().retrieve(codigo);
	}

	@Override
	public Endereco buscar(String descricao) {
		return EnderecoDAO.getInstance().retrieve(descricao);
	}

	@Override
	public void atualizar(Endereco objeto) {
		EnderecoDAO.getInstance().update(objeto);
	}

	@Override
	public void apagar(Endereco objeto) {
		EnderecoDAO.getInstance().delete(objeto);
	}

}
