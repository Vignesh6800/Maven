package edu.qsp.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int p_id;
	private String p_name;
	private String p_email;
	private long p_phone;
	
	@OneToMany(mappedBy = "person")
	private List<Account> accounts;

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_email() {
		return p_email;
	}

	public void setP_email(String p_email) {
		this.p_email = p_email;
	}

	public long getP_phone() {
		return p_phone;
	}

	public void setP_phone(long p_phone) {
		this.p_phone = p_phone;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Person [p_id=" + p_id + ", p_name=" + p_name + ", p_email=" + p_email + ", p_phone=" + p_phone
				+ ", accounts=" + accounts + "]";
	}
	
	
	
	
	
}
