/**
 * 
 */
package com.jikexueyuan.entity;

import java.io.Serializable;

/**
 * @author slw
 *
 */
public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1530127413381718585L;
	private int id;
	private String name;
	private int age;
	
	public Student(){
		
	}

	public int getId() {
		return id;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
