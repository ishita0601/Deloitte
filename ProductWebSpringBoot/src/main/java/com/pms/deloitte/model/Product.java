package com.pms.deloitte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="hr" , name="PRODUCT")
public class Product {

	@Id
	@Column(name="id")
	private int id;
	
	private String name;
	
	private String company;

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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString(){
		return "id="+id+", name="+name+", company="+company;
	}
}
