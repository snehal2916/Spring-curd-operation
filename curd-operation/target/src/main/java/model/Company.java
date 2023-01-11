package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table

public class Company {
@Id
@Column

	private String name;  
	private String designation;  
	private int age;
	private int id;  
	
	public String getNAme()   
	{  
	return name;  
	}  
	public void setName(String name)   
	{  
	this.name = name;  
	}  
	public String getDesignation()  
	{  
	return designation;  
	}  
	public void setDesignation(String designation)   
	{  
	this.designation = designation;  
	}  
	public int getAge()   
	{  
	return age;  
	}  
	public void setAge(int age)   
	{  
	this.age = age;  
	}  
	public int getId()   
	{  
	return id;  
	}  
	public void setPrice(int id)   
	{  
	this.id = id;  
	}
	
	}  

