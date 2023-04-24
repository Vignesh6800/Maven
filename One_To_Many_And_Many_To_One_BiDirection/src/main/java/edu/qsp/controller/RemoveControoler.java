package edu.qsp.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.qsp.dto.Account;
import edu.qsp.dto.Person;

public class RemoveControoler {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		Account account=em.find(Account.class, 3);
//		et.begin();
//		em.remove(account);
//		et.commit();
		
		
		Person person=em.find(Person.class, 1);
		List<Account> acc= person.getAccounts();
		
		et.begin();
		for (Account account2 : acc) {
			em.remove(account2);
		}
		em.remove(person);
		et.commit();
		
	}
}
