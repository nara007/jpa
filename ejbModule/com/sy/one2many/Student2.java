package com.sy.one2many;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student2",catalog="appointment")
public class Student2 {

	private int id;
	private String name;
	private Teacher2 teacher;
	
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
	@ManyToOne
	//此处有没有指定外键都一样  都会为many的一方自动加上one一方的主键作为外键
//	@JoinColumn(name="teacher2_id")
	public Teacher2 getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher2 teacher) {
		this.teacher = teacher;
	}
	
}
