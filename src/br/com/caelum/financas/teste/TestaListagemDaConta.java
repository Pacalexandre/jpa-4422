package br.com.caelum.financas.teste;

import java.util.*;

import javax.persistence.*;

import br.com.caelum.financas.dao.*;
import br.com.caelum.financas.modelo.*;
import br.com.caelum.financas.util.*;

public class TestaListagemDaConta {
	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		ContaDao dao = new ContaDao(manager);

		long inicio = System.currentTimeMillis();
		List<Conta> lista = dao.lista();
		long fim = System.currentTimeMillis();

		for (Conta conta : lista) {
			System.out.println(conta.getId().toString() + " - "
					+ conta.getTitular());
		}
		System.out.println("foi em " + (fim - inicio) + "ms");
		
	}
}
