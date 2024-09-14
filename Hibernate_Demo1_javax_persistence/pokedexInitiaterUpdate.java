package io.utkarsh;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class pokedexInitiaterUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("golu");
		EntityManager  em = emf.createEntityManager();
		
		pokemon p=em.find(pokemon.class, "pikachu");
		
		System.out.println(p);
		if(p!=null) {
//			p.setColour("Yellow");
			p.setPower(130);
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(p);
			et.commit();
		}else {
			System.out.println("entry does not exists");
		}
		
		System.out.println(p);
		
		
	}

}
