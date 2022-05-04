package br.com.nasser.service;

import java.util.List;

import br.com.nasser.controller.InterfaceService;
import br.com.nasser.model.DAO.CaracteristicaProdutoDAO;
import br.com.nasser.model.bo.CaracteristicaProduto;

public class CaracteristicaProdutoService implements InterfaceService<CaracteristicaProduto> {

	@Override
	public void salvar(CaracteristicaProduto objeto) {
		CaracteristicaProdutoDAO.getInstance().create(objeto);
	}

	@Override
	public List<CaracteristicaProduto> buscar() {
		return CaracteristicaProdutoDAO.getInstance().retrieve();
	}

	@Override
	public CaracteristicaProduto buscar(int codigo) {
		return CaracteristicaProdutoDAO.getInstance().retrieve(codigo);
	}

	@Override
	public CaracteristicaProduto buscar(String codBarra) {
		return CaracteristicaProdutoDAO.getInstance().retrieve(codBarra);
	}

	@Override
	public void atualizar(CaracteristicaProduto objeto) {
		CaracteristicaProdutoDAO.getInstance().update(objeto);
	}

	@Override
	public void apagar(CaracteristicaProduto objeto) {
		CaracteristicaProdutoDAO.getInstance().delete(objeto);
	}

}
