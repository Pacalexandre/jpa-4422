package br.com.caelum.financas.teste;

import javax.persistence.*;

import br.com.caelum.financas.util.*;

public class TesteAberturaConexao {
	
	public static void main(String[] args) throws InterruptedException {

		for(int i=0 ; i<30 ; i++){
			EntityManager manager = new JPAUtil().getEntityManager();
			manager.getTransaction().begin();
			System.out.println("Manager con = "+ i);
		}
		
		Thread.sleep(30*1000);
		
	}

}
