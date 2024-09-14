	package io.utkarsh;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class pokedexInitiaterCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pokemon p1=new pokemon();
		p1.setName("pikachu");
		p1.setType("Electric");
		p1.setPower(200);
		p1.setColor(Color.YELLOW);
		
		pokemon p2=new pokemon();
		p2.setName("Mudkip");
		p2.setType("Water");
		p2.setPower(75);
		p2.setColor(Color.BLUE);
		
		pokemon p3=new pokemon();
		p3.setName("Charizard");
		p3.setType("Fire");
		p3.setPower(250);
		
		
		
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("golu");
		
//EMF is interface in JPA and Persistence is static class that implement the EMF
// Persistence class ke andar ke function hai createEMF jo persistence unit ka naam (golu) leta hai hai aur EMF create krke de deta hai
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(p1);
		entityTransaction.commit();;
		
		entityTransaction.begin();
		entityManager.persist(p2);   // we can put more then one inside one transaction
		entityManager.persist(p3);
		entityTransaction.commit();
		
		pokemon p4=new pokemon();
		p4.setName("meowth");
		p4.setPower(30);
//		p4.setType("cat");
		 
		entityTransaction.begin();
//		entityManager.persist(p4);  // will give error as we have not set the value of column "type" which not not nullable
		entityTransaction.commit(); 
		
	}

}
