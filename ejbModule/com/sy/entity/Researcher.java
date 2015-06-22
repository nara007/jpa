//package com.sy.entity;
//
//import java.io.Serializable;
//import java.util.Set;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="researcher", catalog="appointment")
//public class Researcher implements Serializable {
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name = "id", length = 20)  
//	private int id;
//	@Column(name = "name", length = 50)  
//	private String name;
//	@Column(name = "email", length = 50)  
//	private String email;
//	@Column(name = "password", length = 50)  
//	private String password;
////	@Column(name = "group", length = 50)  
////	private String group;
//	
//	
//    private Set<Project> projects;
//	
//	public Set<Project> getProjects() {
//		return projects;
//	}
//	public void setProjects(Set<Project> projects) {
//		this.projects = projects;
//	}
//	public int getId() {
//		return id;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	
//}
