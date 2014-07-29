package br.com.caelum.financas.teste;

import java.util.*;

import javax.persistence.*;

import br.com.caelum.financas.dao.*;
import br.com.caelum.financas.modelo.*;
import br.com.caelum.financas.util.*;

public class testeBuscaContaMovimentacao {

	public static void main(String[] args) {

		

		EntityManager manager = new JPAUtil().getEntityManager();
		MovimentacaoDao dao = new MovimentacaoDao(manager);	

		long inicio = System.currentTimeMillis();
		Movimentacao movi = dao.busca(3);
		long fim = System.currentTimeMillis();
		System.out.println("---");
		System.out.println(movi.getConta().getTitular());
		System.out.println(movi.getData().getTime());

	}

}
