package com.sy.many2many;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student3",catalog="appointment")
public class Student3 {

	private int id;
	private String name;
	private Set<Teacher3> teachers=new HashSet<Teacher3>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="name",nullable=false,length=30)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Teacher3> getTeachers() {
		return teachers;
	}
	@ManyToMany(mappedBy = "students")
	public void setTeachers(Set<Teacher3> teachers) {
		this.teachers = teachers;
	}
	
	
}
