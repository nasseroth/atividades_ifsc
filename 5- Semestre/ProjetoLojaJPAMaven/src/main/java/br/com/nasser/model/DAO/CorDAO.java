package br.com.nasser.model.DAO;

import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nasser.model.bo.Cor;

public class CorDAO implements InterfaceDAO<Cor> {

	private static CorDAO instance;
	protected EntityManager entityManager;

	public CorDAO() {
		entityManager = getEntityManager();
	}

	public static CorDAO getInstance() {
		if (Objects.isNull(instance)) {
			instance = new CorDAO();
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
	public void create(Cor objeto) {
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
	public List<Cor> retrieve() {
		return entityManager.createQuery("FROM Cor", Cor.class).getResultList();
	}

	@Override
	public Cor retrieve(int codigo) {
		return entityManager.find(Cor.class, codigo);
	}

	@Override
	public Cor retrieve(String descricao) {
		return entityManager.createQuery("FROM Cor b WHERE b.descricaoCor LIKE :descricao", Cor.class)
				.setParameter("descricao", descricao).getSingleResult();
	}

	@Override
	public void update(Cor objeto) {
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
	public void delete(Cor objeto) {
		try {
			entityManager.getTransaction().begin();
			objeto = entityManager.find(Cor.class, objeto.getIdCor());
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
