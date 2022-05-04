package br.com.nasser.model.DAO;

import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nasser.model.bo.Endereco;

public class EnderecoDAO implements InterfaceDAO<Endereco> {

	private static EnderecoDAO instance;
	protected EntityManager entityManager;

	public EnderecoDAO() {
		entityManager = getEntityManager();
	}

	public static EnderecoDAO getInstance() {
		if (Objects.isNull(instance)) {
			instance = new EnderecoDAO();
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
	public void create(Endereco objeto) {
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
	public List<Endereco> retrieve() {
		return entityManager.createQuery("FROM Endereco", Endereco.class).getResultList();
	}

	@Override
	public Endereco retrieve(int codigo) {
		return entityManager.find(Endereco.class, codigo);
	}

	@Override
	public Endereco retrieve(String descricao) {
		return entityManager.createQuery("FROM Endereco b WHERE b.logradouroCep LIKE :descricao", Endereco.class)
				.setParameter("descricao", descricao).getSingleResult();
	}

	@Override
	public void update(Endereco objeto) {
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
	public void delete(Endereco objeto) {
		try {
			entityManager.getTransaction().begin();
			objeto = entityManager.find(Endereco.class, objeto.getIdCep());
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
