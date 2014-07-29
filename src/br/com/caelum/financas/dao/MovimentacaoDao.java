package br.com.caelum.financas.dao;

import java.util.*;

import javax.persistence.*;

import br.com.caelum.financas.modelo.*;

public class MovimentacaoDao {

	private EntityManager manager;

	public MovimentacaoDao(EntityManager manager) {
		this.manager = manager;
	}

	public Movimentacao busca(Integer id) {
		return this.manager.find(Movimentacao.class, id);

	}

	public void remove(Movimentacao mov) {
		this.manager.remove(mov);

	}

	public void insere(Movimentacao mov) {
		this.manager.persist(mov);
	}

	public List<Movimentacao> lista() {
		String jpql = "select m from Movimentacao m";
		return this.manager.createQuery(jpql, Movimentacao.class).getResultList();
	}

}
