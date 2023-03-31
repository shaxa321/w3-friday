package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;


import javax.persistence.Persistence;
import classi.Utente;

public class main {

	public static EntityManagerFactory emf=	Persistence.createEntityManagerFactory("w2 jpa exam");
	public static EntityManager em= emf.createEntityManager();
	static EntityTransaction transaction=em.getTransaction();
	
	public static void SaveUser(Utente utente) {
		transaction.begin();
		em.persist(utente);
		transaction.commit();
		
		System.out.println("OK OK");
	}
	public static void showUsers() {
		
	}
	
	public static void main(String[] args) {
		

		Utente ciccio= new Utente("porco","cinghiale");
		System.out.println("OK");
		SaveUser(ciccio);
	}

}
