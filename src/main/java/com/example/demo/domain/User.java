package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instructor")
public class User {	




   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)   
	private int insId;
   
   @Column(name="insName")
	private String insName;
	private String lastName;
	@Column(name="field")
	private String field;
	@Column(name="campus")
	private String campus;
	@Column(name="gender")
	private String gender;
	
	
	
	
	public User() {
		
	}
	



	public User( String insName, String field, String campus, String gender) {
		super();
		this.insId = insId;
		this.insName = insName;
		
		this.field = field;
		this.campus = campus;
		this.gender = gender;
		
		
		
	}



	public String getCampus() {
		return campus;
	}



	public void setCampus(String campus) {
		this.campus = campus;
	}



	public String getField() {
		return field;
	}



	public void setField(String field) {
		this.field = field;
	}
	
	
	
	public String getInsName () {
		return insName ;
	}



	public void setInsName(String insName) {
		this.insName  = insName ;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public int getInsId() {
		return insId;
	}



	public void setInsId(int insId) {
		this.insId = insId;
	}

	
	
	
	

}
