package br.com.caelum.financas.dao;

import java.util.*;

import javax.persistence.*;

import br.com.caelum.financas.modelo.*;

@PersistenceContext
public class ContaDao {

	private EntityManager manager;

	public ContaDao(EntityManager manager) {
		this.manager = manager;
	}

	public Conta busca(Integer id) {
		return this.manager.find(Conta.class, id);

	}

	public void remove(Conta conta) {
		this.manager.remove(conta);

	}

	public void insere(Conta conta) {
		this.manager.persist(conta);
	}

	public List<Conta> lista() {
		String jpql = "select c from Conta c";
		return this.manager.createQuery(jpql, Conta.class).getResultList();
	}

	public void altera(Conta conta) {
		this.manager.merge(conta);
	}
}
