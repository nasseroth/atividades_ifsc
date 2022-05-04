package br.com.nasser.model.DAO;

import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nasser.model.bo.Tamanho;

public class TamanhoDAO implements InterfaceDAO<Tamanho> {

	private static TamanhoDAO instance;
	protected EntityManager entityManager;

	public TamanhoDAO() {
		entityManager = getEntityManager();
	}

	public static TamanhoDAO getInstance() {
		if (Objects.isNull(instance)) {
			instance = new TamanhoDAO();
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
	public void create(Tamanho objeto) {
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
	public List<Tamanho> retrieve() {
		return entityManager.createQuery("FROM Tamanho", Tamanho.class).getResultList();
	}

	@Override
	public Tamanho retrieve(int codigo) {
		return entityManager.find(Tamanho.class, codigo);
	}

	@Override
	public Tamanho retrieve(String descricao) {
		return entityManager.createQuery("FROM Tamanho b WHERE b.descricaoTamanho LIKE :descricao", Tamanho.class)
				.setParameter("descricao", descricao).getSingleResult();
	}

	@Override
	public void update(Tamanho objeto) {
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
	public void delete(Tamanho objeto) {
		try {
			entityManager.getTransaction().begin();
			objeto = entityManager.find(Tamanho.class, objeto.getIdTamanho());
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
