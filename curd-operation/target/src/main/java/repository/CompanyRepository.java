package repository;
import org.springframework.data.repository.CrudRepository;

import model.Company;  
  
//repository that extends CrudRepository  
public interface CompanyRepository extends CrudRepository<Company, Integer>  
{  
}  



