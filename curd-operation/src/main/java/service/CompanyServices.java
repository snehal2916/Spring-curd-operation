package service;

import java.util.ArrayList;

import javax.management.loading.ClassLoaderRepository;

import org.hibernate.mapping.List;
import org.springframework.stereotype.Service;

import repository.CompanyRepository;

@Service

public class CompanyServices {
	@Autowired
	 CompanyRepository companyRepository ;
	
	public ArrayList<Company> getAllCompany()   
	{  
	ArrayList<Company> company = new ArrayList<Company>();  
	companyRepository.findAll();  
	return company;  
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public Company getCompanyByName(String name)   
	{  
	return companyRepository.findByName(name);
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Company company)   
	{  
		companyRepository.save(company);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		companyRepository.deletBy(id);  
	}  
	//updating a record  
	public void update(Company company, String name )   
	{  
		companyRepository.save(company);  
	}  
	}


