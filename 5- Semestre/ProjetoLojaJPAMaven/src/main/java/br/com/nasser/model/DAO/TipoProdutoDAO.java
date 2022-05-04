package br.com.nasser.model.DAO;

import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nasser.model.bo.TipoProduto;

public class TipoProdutoDAO implements InterfaceDAO<TipoProduto> {

	private static TipoProdutoDAO instance;
	protected EntityManager entityManager;

	public TipoProdutoDAO() {
		entityManager = getEntityManager();
	}

	public static TipoProdutoDAO getInstance() {
		if (Objects.isNull(instance)) {
			instance = new TipoProdutoDAO();
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
	public void create(TipoProduto objeto) {
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
	public List<TipoProduto> retrieve() {
		return entityManager.createQuery("FROM TipoProduto", TipoProduto.class).getResultList();
	}

	@Override
	public TipoProduto retrieve(int codigo) {
		return entityManager.find(TipoProduto.class, codigo);
	}

	@Override
	public TipoProduto retrieve(String descricao) {
		return entityManager
				.createQuery("FROM TipoProduto b WHERE b.descricaoTipoProduto LIKE :descricao", TipoProduto.class)
				.setParameter("descricao", descricao).getSingleResult();
	}

	@Override
	public void update(TipoProduto objeto) {
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
	public void delete(TipoProduto objeto) {
		try {
			entityManager.getTransaction().begin();
			objeto = entityManager.find(TipoProduto.class, objeto.getIdTipoProduto());
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
