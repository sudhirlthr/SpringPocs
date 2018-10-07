package com.sudhir.app;

public class User {
	/**
	 * @param id
	 * @param name
	 * @param email
	 */
	public User(Integer id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	private Integer id;
	private String name;
	private String email;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
}
