package br.com.nasser.model.DAO;

import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nasser.model.bo.Cidade;

public class CidadeDAO implements InterfaceDAO<Cidade> {

	private static CidadeDAO instance;
	protected EntityManager entityManager;

	public CidadeDAO() {
		entityManager = getEntityManager();
	}

	public static CidadeDAO getInstance() {
		if (Objects.isNull(instance)) {
			instance = new CidadeDAO();
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
	public void create(Cidade objeto) {
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
	public List<Cidade> retrieve() {
		return entityManager.createQuery("FROM Cidade", Cidade.class).getResultList();
	}

	@Override
	public Cidade retrieve(int codigo) {
		return entityManager.find(Cidade.class, codigo);
	}

	@Override
	public Cidade retrieve(String descricao) {
		return entityManager.createQuery("FROM Cidade b WHERE b.descricaoCidade LIKE :descricao", Cidade.class)
				.setParameter("descricao", descricao).getSingleResult();
	}

	@Override
	public void update(Cidade objeto) {
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
	public void delete(Cidade objeto) {
		try {
			entityManager.getTransaction().begin();
			objeto = entityManager.find(Cidade.class, objeto.getIdCidade());
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
