package com.collabera.fate.dto;

public class FateDTO {
	

	private int id;
	private String name;
	private String country;
	private String noblePhantasm;
	

	
	
	public FateDTO(int id, String name, String country, String noblePhantasm) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.noblePhantasm = noblePhantasm;
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
		return noblePhantasm;
	}
	public void setNoblePhantasm(String noblePhantasm) {
		this.noblePhantasm = noblePhantasm;
	}


}
