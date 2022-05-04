package br.com.nasser.model.DAO;

import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nasser.model.bo.FoneFornecedor;

public class FoneFornecedorDAO implements InterfaceDAO<FoneFornecedor> {

	private static FoneFornecedorDAO instance;
	protected EntityManager entityManager;

	public FoneFornecedorDAO() {
		entityManager = getEntityManager();
	}

	public static FoneFornecedorDAO getInstance() {
		if (Objects.isNull(instance)) {
			instance = new FoneFornecedorDAO();
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
	public void create(FoneFornecedor objeto) {
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
	public List<FoneFornecedor> retrieve() {
		return entityManager.createQuery("FROM FoneFornecedor", FoneFornecedor.class).getResultList();
	}

	@Override
	public FoneFornecedor retrieve(int codigo) {
		return entityManager.find(FoneFornecedor.class, codigo);
	}

	@Override
	public FoneFornecedor retrieve(String descricao) {
		return entityManager
				.createQuery("FROM FoneFornecedor b WHERE b.foneFornecedor LIKE :descricao", FoneFornecedor.class)
				.setParameter("descricao", descricao).getSingleResult();
	}

	@Override
	public void update(FoneFornecedor objeto) {
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
	public void delete(FoneFornecedor objeto) {
		try {
			entityManager.getTransaction().begin();
			objeto = entityManager.find(FoneFornecedor.class, objeto.getFornecedor().getIdfornecedor());
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
