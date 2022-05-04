package br.com.nasser.model.DAO;

import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nasser.model.bo.Venda;

public class VendaDAO {

	private static VendaDAO instance;
	protected EntityManager entityManager;

	public VendaDAO() {
		entityManager = getEntityManager();
	}

	public static VendaDAO getInstance() {
		if (Objects.isNull(instance)) {
			instance = new VendaDAO();
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

	public void create(Venda objeto) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(objeto);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

}
