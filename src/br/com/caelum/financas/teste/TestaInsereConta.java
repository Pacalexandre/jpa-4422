package br.com.caelum.financas.teste;

import javax.persistence.*;

import br.com.caelum.financas.dao.*;
import br.com.caelum.financas.modelo.*;
import br.com.caelum.financas.util.*;

public class TestaInsereConta {
	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		ContaDao dao = new ContaDao(manager);
		
		Conta conta = new Conta();
		conta.setTitular("XArope de Bulimia");
		conta.setAgencia("1234");
		conta.setBanco("001");
		conta.setNumero("6545675674");
		long inicio=System.currentTimeMillis();

		manager.getTransaction().begin();
		dao.insere(conta);
		manager.getTransaction().commit();
		manager.close();
		long fim=System.currentTimeMillis();
		
		System.out.println("foi em "+ (fim - inicio) +"ms");
		
	}

}
