package testDatabase;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import testDatabase.EmpDetails;



public interface EmpRepository extends CrudRepository<EmpDetails, Integer> {}
