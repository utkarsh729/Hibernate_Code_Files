package io.utkarsh;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class pokedexInitiaterRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("golu");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		// agar persistence.xml mai create use kr rahe hai toh ...jo phele se table present hogi vo drop ho jayegi..aur new table will created
		// with no values in it..and we get null as output on reading
		
		pokemon p= entityManager.find(pokemon.class, "pikachu");
		// EntityManager has function named find(a1, a2).. it takes two argument one entity class and other primary key
		// it return the object of entity class
		System.out.println(p);
		
		// for strict tight checking we use validate...No data loss
		
		
		
		
		

	}

}
