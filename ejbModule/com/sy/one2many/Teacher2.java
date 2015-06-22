package com.sy.one2many;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="teacher2",catalog="appointment")
public class Teacher2 {

	private int id;
	private String name;
	private Set<Student2> students=new HashSet<Student2>();
	
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
	@OneToMany(cascade = CascadeType.ALL,mappedBy="teacher")	
	public Set<Student2> getStudents() {
		return students;
	}
	public void setStudents(Set<Student2> students) {
		this.students = students;
	}
	
	
}
