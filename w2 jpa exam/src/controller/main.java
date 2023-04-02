package controller;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import java.text.SimpleDateFormat;

import javax.persistence.Persistence;
import java.util.Date;
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
	
	private static void findUser(long numero_tessera) {
		
	}
	
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String strDate= formatter.format(date);
		System.out.println(strDate);
		
		
		Utente ciccio= new Utente("porco","cinghiale",date);
		System.out.println("OK");
		SaveUser(ciccio);
	}

}
