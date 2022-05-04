package br.com.nasser.model.DAO;

import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nasser.model.bo.Produto;

public class ProdutoDAO implements InterfaceDAO<Produto> {

	private static ProdutoDAO instance;
	protected EntityManager entityManager;

	public ProdutoDAO() {
		entityManager = getEntityManager();
	}

	public static ProdutoDAO getInstance() {
		if (Objects.isNull(instance)) {
			instance = new ProdutoDAO();
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
	public void create(Produto objeto) {
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
	public List<Produto> retrieve() {
		return entityManager.createQuery("FROM Produto", Produto.class).getResultList();
	}

	@Override
	public Produto retrieve(int codigo) {
		return entityManager.find(Produto.class, codigo);
	}

	@Override
	public Produto retrieve(String descricao) {
		return entityManager.createQuery("FROM Produto b WHERE b.descricaoProduto LIKE :descricao", Produto.class)
				.setParameter("descricao", descricao).getSingleResult();
	}

	@Override
	public void update(Produto objeto) {
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
	public void delete(Produto objeto) {
		try {
			entityManager.getTransaction().begin();
			objeto = entityManager.find(Produto.class, objeto.getIdproduto());
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
