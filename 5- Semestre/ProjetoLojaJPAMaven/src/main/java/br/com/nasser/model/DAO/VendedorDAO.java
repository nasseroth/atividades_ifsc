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

import br.com.nasser.model.bo.Vendedor;

/**
 *
 * @author gusta
 */
public class VendedorDAO implements InterfaceDAO<Vendedor> {

	private static VendedorDAO instance;
	protected EntityManager entityManager;

	public VendedorDAO() {
		entityManager = getEntityManager();
	}

	public static VendedorDAO getInstance() {
		if (Objects.isNull(instance)) {
			instance = new VendedorDAO();
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
	public void create(Vendedor objeto) {
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
	public List<Vendedor> retrieve() {
		return entityManager.createQuery("FROM Vendedor", Vendedor.class).getResultList();
	}

	@Override
	public Vendedor retrieve(int codigo) {
		return entityManager.find(Vendedor.class, codigo);
	}

	@Override
	public Vendedor retrieve(String descricao) {
		return entityManager.createQuery("FROM Vendedor b WHERE b.nome LIKE :descricao", Vendedor.class)
				.setParameter("descricao", descricao).getSingleResult();
	}

	@Override
	public void update(Vendedor objeto) {
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
	public void delete(Vendedor objeto) {
		try {
			entityManager.getTransaction().begin();
			objeto = entityManager.find(Vendedor.class, objeto.getIdvendedor());
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
