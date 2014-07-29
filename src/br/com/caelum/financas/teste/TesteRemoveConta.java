package br.com.caelum.financas.teste;

import javax.persistence.*;

import br.com.caelum.financas.dao.*;
import br.com.caelum.financas.modelo.*;
import br.com.caelum.financas.util.*;

public class TesteRemoveConta {
	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getEntityManager();
		ContaDao dao = new ContaDao(manager);

		long inicio = System.currentTimeMillis();
		manager.getTransaction().begin();
		Conta conta = dao.busca(5);
		dao.remove(conta);
		manager.getTransaction().commit();
		manager.close();
		long fim = System.currentTimeMillis();

		System.out.println("foi em " + (fim - inicio) + "ms");
	}
}
