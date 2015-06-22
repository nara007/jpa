package com.sy.one2one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address2",catalog="appointment")
public class Address2 {
	private int id;
	private String street;
	private String city;
	private Person2 person;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="street",nullable=false)
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Column(name="city",nullable=false)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@OneToOne(optional = false, cascade = CascadeType.ALL, mappedBy = "address")
	public Person2 getPerson() {
		return person;
	}
	public void setPerson(Person2 person) {
		this.person = person;
	}
}
