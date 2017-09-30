package com.jikexueyuan.entity;

import com.google.common.base.MoreObjects;

public class User {
	private Long id;
	private String name;
	private String password;
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("name", name)
				.add("password", password).add("email", email).toString();

	}

}
