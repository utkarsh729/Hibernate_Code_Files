package io.utkarsh;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class pokedexInitiaterDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("golu");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		pokemon p =entityManager.find(pokemon.class, "pikachu");
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		if(p!=null) {
			entityTransaction.begin();
			entityManager.remove(p);
			entityTransaction.commit();
		}
		else {
			System.out.println("entity not found");
		}
		
		
		

	}

}
