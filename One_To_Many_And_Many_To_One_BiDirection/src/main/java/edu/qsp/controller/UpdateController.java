package edu.qsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.qsp.dto.Account;
import edu.qsp.dto.Person;

public class UpdateController {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		Account account=em.find(Account.class, 1);
//		
//		account.setIfsc_code("ICICI0001234");
//		
//		
//		et.begin();
//		em.merge(account);
//		et.commit();
		
		Person person=em.find(Person.class, 1);
		person.setP_name("Diwan");
		
		et.begin();
		em.merge(person);
		et.commit();
		
		
	}
}
