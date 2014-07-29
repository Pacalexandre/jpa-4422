package br.com.caelum.financas.teste;

import java.math.*;
import java.util.*;

import javax.persistence.*;

import br.com.caelum.financas.dao.*;
import br.com.caelum.financas.modelo.*;
import br.com.caelum.financas.util.*;

public class TestaMovimentacao {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();
		ContaDao daoConta = new ContaDao(manager);
		MovimentacaoDao daoMov = new MovimentacaoDao(manager);
		
		Conta conta = new Conta();
		conta.setTitular("Criando Nova movimentacao");
		conta.setAgencia("1234");
		conta.setBanco("001");
		conta.setNumero("6545675674");
		
		Movimentacao mov = new Movimentacao();
		mov.setConta(conta);
		mov.setData(Calendar.getInstance());
		mov.setDescricao("conta de luz");
		mov.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		mov.setValor(new BigDecimal("130"));
		
		
		long inicio=System.currentTimeMillis();
		manager.getTransaction().begin();

		daoConta.insere(conta);
		daoMov.insere(mov);


		manager.getTransaction().commit();
		manager.close();
		long fim=System.currentTimeMillis();
		
		System.out.println("foi em "+ (fim - inicio) +"ms");
		
	}

}
