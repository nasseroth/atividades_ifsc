package br.com.nasser.model.DAO;

import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nasser.model.bo.Bairro;

public class BairroDAO implements InterfaceDAO<Bairro> {

	private static BairroDAO instance;
	protected EntityManager entityManager;

	public BairroDAO() {
		entityManager = getEntityManager();
	}

	public static BairroDAO getInstance() {
		if (Objects.isNull(instance)) {
			instance = new BairroDAO();
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
	public void create(Bairro objeto) {
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
	public List<Bairro> retrieve() {
		return entityManager.createQuery("FROM Bairro", Bairro.class).getResultList();
	}

	@Override
	public Bairro retrieve(int codigo) {
		return entityManager.find(Bairro.class, codigo);
	}

	@Override
	public Bairro retrieve(String descricao) {
		return entityManager.createQuery("FROM Bairro b WHERE b.descricaoBairro LIKE :descricao", Bairro.class)
				.setParameter("descricao", descricao).getSingleResult();
	}

	@Override
	public void update(Bairro objeto) {
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
	public void delete(Bairro objeto) {
		try {
			entityManager.getTransaction().begin();
			objeto = entityManager.find(Bairro.class, objeto.getIdBairro());
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
