package br.com.nasser.model.DAO;

import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nasser.model.bo.Marca;

public class MarcaDAO implements InterfaceDAO<Marca> {

	private static MarcaDAO instance;
	protected EntityManager entityManager;

	public MarcaDAO() {
		entityManager = getEntityManager();
	}

	public static MarcaDAO getInstance() {
		if (Objects.isNull(instance)) {
			instance = new MarcaDAO();
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
	public void create(Marca objeto) {
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
	public List<Marca> retrieve() {
		return entityManager.createQuery("FROM Marca", Marca.class).getResultList();
	}

	@Override
	public Marca retrieve(int codigo) {
		return entityManager.find(Marca.class, codigo);
	}

	@Override
	public Marca retrieve(String descricao) {
		return entityManager.createQuery("FROM Marca b WHERE b.descricaoMarca LIKE :descricao", Marca.class)
				.setParameter("descricao", descricao).getSingleResult();
	}

	@Override
	public void update(Marca objeto) {
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
	public void delete(Marca objeto) {
		try {
			entityManager.getTransaction().begin();
			objeto = entityManager.find(Marca.class, objeto.getIdMarca());
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
