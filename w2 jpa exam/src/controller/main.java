package controller;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import java.text.SimpleDateFormat;

import javax.persistence.Persistence;
import java.util.Date;

import classi.Rivista;
import classi.Utente;
import classi.libro;

public class main {

	public static EntityManagerFactory emf=	Persistence.createEntityManagerFactory("w2 jpa exam");
	public static EntityManager em= emf.createEntityManager();
    static  EntityTransaction transaction=em.getTransaction();
	
	public static void SaveData(Utente utente) {
		try {
			transaction.begin();
			em.persist(utente);
			transaction.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
			transaction.rollback();
		}
		finally{
			((EntityManager) transaction).close();
		}
		
		
		System.out.println(" salvato ");
	}
	public static void SaveData(libro libro) {
		transaction.begin();
		em.persist(libro);
		transaction.commit();
		
		
		
		System.out.println(" salvato ");
	}
	public static void SaveData(Rivista rivista) {
		transaction.begin();
		em.persist(rivista);
		transaction.commit();
		
		
		
		System.out.println(" salvato ");
	}
	
	private static void findUser(long numero_tessera) {
		
	}
	
	public static void main(String[] args)  {
		
		Utente ciccio=new Utente("banana","cavolfiore",new Date(2000-12-12));
		//SaveData(ciccio);
		libro libro1=new libro("Mario rossi","HORROR","50 sfumature di grigio",new Date(2000-20-15),50);
		SaveData(libro1);
		}
		Rivista rivista1=new Rivista("SETTIMANALE","FORBES",new Date(2000-12-12),49);

}
