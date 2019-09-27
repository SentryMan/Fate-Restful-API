package com.collabera.fate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fate")
public class FateModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private int id;

	private String name;
	private String country;
	private String NoblePhantasm;

	FateModel(){
		
	}
	public FateModel(String name, String country, String noblePhantasm) {
		super();
		this.name = name;
		this.country = country;
		NoblePhantasm = noblePhantasm;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getNoblePhantasm() {
		return NoblePhantasm;
	}

	public void setNoblePhantasm(String noblePhantasm) {
		NoblePhantasm = noblePhantasm;
	}

}
