package br.com.caelum.financas.teste;

import javax.persistence.*;

import br.com.caelum.financas.dao.*;
import br.com.caelum.financas.modelo.*;
import br.com.caelum.financas.util.*;

public class testePesquisaIdConta {
	 public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getEntityManager();
		ContaDao dao = new ContaDao(manager);
		long inicio = System.currentTimeMillis();
		Conta encontrado = dao.busca(1);
		long fim = System.currentTimeMillis();
		System.out.println(encontrado.getTitular());
		System.out.println("foi em " + (fim - inicio) + "ms");
		
	}

}
