package com.zwayamLite.ZwayamLite.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

@Entity
@Table(name = "users")
//@EntityScan("users")
public class Users {
	
	@Id
	@GeneratedValue
	int id;
	
	@Column(nullable = false)
	String name;
	
	@Column(nullable = false, unique = true)
	String email;
	
	@Column(nullable = false)
	String password;
	
	
	@Column(nullable = false)
	String ph_no;
	
	@Column(nullable = false)
	char role;

	public int getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPh_no() {
		return ph_no;
	}

	public void setPh_no(String ph_no) {
		this.ph_no = ph_no;
	}

	public char getRole() {
		return role;
	}

	public void setRole(char role) {
		this.role = role;
	}

	public Users(int id, String name, String email, String ph_no, char role) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.ph_no = ph_no;
		this.role = role;
	}
	
}
