package br.com.caelum.financas.util;

import javax.persistence.*;

public class JPAUtil {

	private static EntityManagerFactory factory = Persistence
			.createEntityManagerFactory("controlefinancas");

	public EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

}
