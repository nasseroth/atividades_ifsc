package br.com.nasser.model.DAO;

import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nasser.model.bo.Cliente;

public class ClienteDAO implements InterfaceDAO<Cliente> {

	private static ClienteDAO instance;
	protected EntityManager entityManager;

	public ClienteDAO() {
		entityManager = getEntityManager();
	}

	public static ClienteDAO getInstance() {
		if (Objects.isNull(instance)) {
			instance = new ClienteDAO();
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
	public void create(Cliente objeto) {
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
	public List<Cliente> retrieve() {
		return entityManager.createQuery("FROM Cliente", Cliente.class).getResultList();
	}

	@Override
	public Cliente retrieve(int codigo) {
		return entityManager.find(Cliente.class, codigo);
	}

	@Override
	public Cliente retrieve(String nome) {
		return entityManager.createQuery("FROM Cliente c WHERE c.nome LIKE :nome", Cliente.class)
				.setParameter("nome", nome).getSingleResult();
	}

	@Override
	public void update(Cliente objeto) {
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
	public void delete(Cliente objeto) {
		try {
			entityManager.getTransaction().begin();
			objeto = entityManager.find(Cliente.class, objeto.getIdcliente());
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
