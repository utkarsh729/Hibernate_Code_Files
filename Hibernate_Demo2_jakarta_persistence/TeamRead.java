package io.valorant;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TeamRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("valo");
		EntityManager em=emf.createEntityManager();
		
		Team t=em.find(Team.class, "alpha");
		System.out.println(t);
		
		
	}

}
