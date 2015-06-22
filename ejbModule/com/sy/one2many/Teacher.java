package com.sy.one2many;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//@OneToMany在默认情况下,Hibernate会把一对多当成多对多的一种特殊情况!
//结果就是会帮我们生成一张中间表,所以注意要写@JoinColumn(name="")注解
//因为在数据库中,不管是一对多还是多对一,都是在多的一方添加一的一个外键
//所以这个jioncolumn的name值一般写成一的外键字段名

@Entity
@Table(name="teacher", catalog="appointment")
public class Teacher {
	private int id;
	private String name;
	private Set<Student> students =new HashSet<Student>();

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
	@OneToMany(cascade=CascadeType.ALL)
	//指定外键和不指定外键是不一样的，会导致数据库自动生成的表结构发生变化
	//如果不指定外键  会生成一张中间表teracher_student
//	@JoinColumn(name="teacher_id")  
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
}
