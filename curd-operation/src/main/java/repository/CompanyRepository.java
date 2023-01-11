package repository;
import org.springframework.data.repository.CrudRepository;

import model.Company;  
  
//repository that extends CrudRepository  
public interface CompanyRepository extends CrudRepository<Company, Integer>  
{

	service.Company findByName(String name);

	void save(service.Company company);

	void deletBy(int id);  
}  



