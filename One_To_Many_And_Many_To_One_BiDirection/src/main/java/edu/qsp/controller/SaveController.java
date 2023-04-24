package edu.qsp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.qsp.dto.Account;
import edu.qsp.dto.Person;

public class SaveController {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person person=new Person();
		person.setP_name("Hanifa");
		person.setP_email("abc@gmail.com");
		person.setP_phone(9876543210l);
		
		
		Account account1=new Account();
		account1.setAcc_no(12345678901l);
		account1.setIfsc_code("sbin0001234");
		
		
		Account account2=new Account();
		account2.setAcc_no(23456789012l);
		account2.setIfsc_code("IOBA0001234");
		
		Account account3=new Account();
		account3.setAcc_no(34567890123l);
		account3.setIfsc_code("IDBI0001234");
		
		
		
		List<Account> accounts=new ArrayList<Account>();
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		
		
		person.setAccounts(accounts);
		account1.setPerson(person);
		account2.setPerson(person);
		account3.setPerson(person);
		
		
		et.begin();
		em.persist(person);
		em.persist(account1);
		em.persist(account2);
		em.persist(account3);
		et.commit();
		
	}
}
