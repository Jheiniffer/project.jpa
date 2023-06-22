package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Client;

public class Program {

	public static void main(String[] args) {
		Client c1=new Client(null,"Maria Clara","maria@gmail.com");
		Client c2=new Client(null,"Alex Silva","alex@gmail.com");
		Client c3=new Client(null,"Sergio Oliveira","sergio@gmail.com");
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em= emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.getTransaction().commit();
		System.out.println("Pronto!");
	}

}