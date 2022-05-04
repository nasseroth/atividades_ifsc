package br.com.nasser.model.DAO;

import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nasser.model.bo.CondicaoPagamento;

public class CondicaoPagamentoDAO implements InterfaceDAO<CondicaoPagamento> {

	private static CondicaoPagamentoDAO instance;
	protected EntityManager entityManager;

	public CondicaoPagamentoDAO() {
		entityManager = getEntityManager();
	}

	public static CondicaoPagamentoDAO getInstance() {
		if (Objects.isNull(instance)) {
			instance = new CondicaoPagamentoDAO();
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
	public void create(CondicaoPagamento objeto) {
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
	public List<CondicaoPagamento> retrieve() {
		return entityManager.createQuery("FROM CondicaoPagamento", CondicaoPagamento.class).getResultList();
	}

	@Override
	public CondicaoPagamento retrieve(int codigo) {
		return entityManager.find(CondicaoPagamento.class, codigo);
	}

	@Override
	public CondicaoPagamento retrieve(String descricao) {
		return entityManager.createQuery("FROM CondicaoPagamento b WHERE b.descricaoCondicaoPagamento LIKE :descricao",
				CondicaoPagamento.class).setParameter("descricao", descricao).getSingleResult();
	}

	@Override
	public void update(CondicaoPagamento objeto) {
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
	public void delete(CondicaoPagamento objeto) {
		try {
			entityManager.getTransaction().begin();
			objeto = entityManager.find(CondicaoPagamento.class, objeto.getIdcondicaoPagamento());
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
