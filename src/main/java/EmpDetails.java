package testDatabase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmpDetails {
	
	@Id
	private long empId;
	
	private String empName;

}
