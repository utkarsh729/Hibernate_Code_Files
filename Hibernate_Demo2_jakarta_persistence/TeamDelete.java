package io.valorant;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TeamDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("valo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Team t=em.find(Team.class, "Faad");
		
		if(t!=null) {
			et.begin();
			t.setCountry(null);
//			em.remove(t.getCountry());
			em.merge(t);	
			et.commit();
		}
		
	}

}
