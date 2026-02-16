package com.capgemini.hibernate.ManyToMany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="employee_project",joinColumns=@JoinColumn(name="employee_id"),
	inverseJoinColumns = @JoinColumn(name = "project_id"))
	private Set<Project> projects;

	/**
	 * 
	 */
	public Employee() {
		
	}

	/**
	 * @param id
	 * @param name
	 * @param projects
	 */
	public Employee(String name,Set<Project> projects) {
		this.projects=projects;
		this.name = name;
	
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
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
	 * @return the projects
	 */

	
	
	

}
