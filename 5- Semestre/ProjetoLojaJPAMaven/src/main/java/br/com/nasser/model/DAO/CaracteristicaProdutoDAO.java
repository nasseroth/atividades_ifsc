package br.com.nasser.model.DAO;

import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nasser.model.bo.CaracteristicaProduto;

public class CaracteristicaProdutoDAO implements InterfaceDAO<CaracteristicaProduto> {

	private static CaracteristicaProdutoDAO instance;
	protected EntityManager entityManager;

	public CaracteristicaProdutoDAO() {
		entityManager = getEntityManager();
	}

	public static CaracteristicaProdutoDAO getInstance() {
		if (Objects.isNull(instance)) {
			instance = new CaracteristicaProdutoDAO();
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
	public void create(CaracteristicaProduto objeto) {
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
	public List<CaracteristicaProduto> retrieve() {
		return entityManager.createQuery("FROM CaracteristicaProduto", CaracteristicaProduto.class).getResultList();
	}

	@Override
	public CaracteristicaProduto retrieve(int codigo) {
		return entityManager.find(CaracteristicaProduto.class, codigo);
	}

	@Override
	public CaracteristicaProduto retrieve(String codBarra) {
		return entityManager.createQuery("FROM CaracteristicaProduto c WHERE c.codBarra LIKE :codBarra",
				CaracteristicaProduto.class).setParameter("codBarra", codBarra).getSingleResult();
	}

	@Override
	public void update(CaracteristicaProduto objeto) {
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
	public void delete(CaracteristicaProduto objeto) {
		try {
			entityManager.getTransaction().begin();
			objeto = entityManager.find(CaracteristicaProduto.class, objeto.getIdCaracteristicaProduto());
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
