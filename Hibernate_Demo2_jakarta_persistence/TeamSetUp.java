package io.valorant;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TeamSetUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Team t1=new Team();
		t1.setName("Sen");
		t1.setLeader("TenZ");
		t1.setRank(2);
		
		Team t2=new Team();
		t2.setLeader("Golu");
		t2.setName("Faad");
		t2.setRank(1);
		t2.setAgent(Agent.VYSE);
		
		Team t3=new Team();
		t3.setLeader("utka");
		t3.setName("alpha");
		t3.setCountry("India");
		t3.setAgent(Agent.NEON);
		t3.setRank(5);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("valo");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		
		entityTransaction.begin();
		entityManager.persist(t1);
		entityManager.persist(t2);
		entityManager.persist(t3);
		entityTransaction.commit();
		
		
	}

}
