package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Company;

@RestController

public class CompanyController {
	@Autowired  
	CompanyDetails companyservice;  
	@GetMapping("/company")  
	
	private List<Company> getAllCompany()   
	{  
	return companyservice.getAllCompany();  
	}  
	//creating a get mapping that retrieves the detail of a specific name  
	@GetMapping("/company/{name}")  
	private Company getCompany(@PathVariable("name") String name)   
	{  
	return companyservice.getname(name);  
	}  
	
	//creating a delete mapping that deletes a specified name  
	@DeleteMapping("/company/{name}")  
	private void deleteCompany(@PathVariable("name")String name )   
	{  
		companyservice.delete(name);  
	}  
	
	//creating post mapping that post the name detail in the database  
	@PostMapping("/company")  
	private int saveCompany(@RequestBody Company name)   
	{  
		companyservice.saveOrUpdate(name);  
	return companyservice.getName();  
	}  
	//creating put mapping that updates the name detail   
	@PutMapping("/company")  
	private Company update(@RequestBody Company name)   
	{  
		companyservice.saveOrUpdate(name);  
	return name;  
	}  
	}  


