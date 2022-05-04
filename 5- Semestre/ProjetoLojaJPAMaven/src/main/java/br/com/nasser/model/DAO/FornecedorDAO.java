/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nasser.model.DAO;

import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nasser.model.bo.Fornecedor;

/**
 *
 * @author gusta
 */
public class FornecedorDAO implements InterfaceDAO<Fornecedor> {

	private static FornecedorDAO instance;
	protected EntityManager entityManager;

	public FornecedorDAO() {
		entityManager = getEntityManager();
	}

	public static FornecedorDAO getInstance() {
		if (Objects.isNull(instance)) {
			instance = new FornecedorDAO();
		}
		return instance;
	}

	public EntityManager getEntityManager() {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("LojaMaven");
		if (Objects.isNull(entityManager)) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}

	@Override
	public void create(Fornecedor objeto) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(objeto);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	@Override
	public List<Fornecedor> retrieve() {
		return entityManager.createQuery("FROM Fornecedor", Fornecedor.class).getResultList();
	}

	@Override
	public Fornecedor retrieve(int codigo) {
		return entityManager.find(Fornecedor.class, codigo);
	}

	public Fornecedor retrieveCNPJ(String CNPJ) {
		return entityManager.createQuery("FROM Fornecedor b WHERE b.cnpjFornecedor LIKE :CNPJ", Fornecedor.class)
				.setParameter("CNPJ", CNPJ).getSingleResult();
	}

	@Override
	public Fornecedor retrieve(String nomeFantasiaFornecedor) {
		return entityManager.createQuery("FROM Fornecedor b WHERE b.razaoSocialFornecedor LIKE :CNPJ", Fornecedor.class)
				.setParameter("nomeFantasiaFornecedor", nomeFantasiaFornecedor).getSingleResult();
	}

	@Override
	public void update(Fornecedor objeto) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(objeto);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	@Override
	public void delete(Fornecedor objeto) {
		try {
			entityManager.getTransaction().begin();
			objeto = entityManager.find(Fornecedor.class, objeto.getIdfornecedor());
			if (Objects.nonNull(objeto)) {
				entityManager.remove(objeto);
			}
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
}
