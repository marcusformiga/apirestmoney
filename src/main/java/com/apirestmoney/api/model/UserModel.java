package com.apirestmoney.api.model;

import java.io.Serializable;
import java.util.UUID;
import org.hibernate.id.UUIDGenerator;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "users")
public class UserModel implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name= "id", updatable = false, nullable = false)
	private UUID id;
	private String name;
	private String email;
	private String password;
	@Column(name = "is_active")
	private Boolean isActive;
	
	public UserModel() {}

	public UserModel(String name, String email, String password, Boolean isActive) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.isActive = isActive;
		
		
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	
	
	

	
	
	
	
}
