package edu.qsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.qsp.dto.Account;
import edu.qsp.dto.Person;

public class FetchController {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
//		Account account=em.find(Account.class, 1);
//		System.out.println(account);
		
		
		Person person=em.find(Person.class, 1);
		System.out.println(person);
		
	}
}
