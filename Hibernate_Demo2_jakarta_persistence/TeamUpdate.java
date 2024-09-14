package io.valorant;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TeamUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("valo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Team t=em.find(Team.class, "Faad");
		System.out.println(t);
		if(t!=null) {
			t.setCountry("China");
			
			et.begin();
			em.persist(t);
			et.commit();
		}
		else {
			System.out.println("Not exit");
		}
		System.out.println(t);
		
	}

}
