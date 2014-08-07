package br.com.caelum.financas.teste;

import javax.persistence.*;

import br.com.caelum.financas.modelo.*;
import br.com.caelum.financas.util.*;

public class TesteCacheSegundoNivel {

	public static void main(String[] args) {
		EntityManager primeiraEM = new JPAUtil().getEntityManager();
		EntityManager segundaEM = new JPAUtil().getEntityManager();
		
		primeiraEM.getTransaction().begin();
		Conta primeiraConta = primeiraEM.find(Conta.class, 2);
		primeiraEM.getTransaction().commit();
		
		primeiraEM.close();
		
		segundaEM.getTransaction().begin();
		Conta segundaConta = segundaEM.find(Conta.class, 2);
		segundaEM.getTransaction().commit();
		
		segundaEM.close();
		
		System.out.println("1 Nome: " + primeiraConta.getTitular());
		System.out.println("2 Nome: " + segundaConta.getTitular());

	}

}
