package testDatabase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmpDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long empId;
	
	private String empName;
	
	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public EmpDetails(String empName) {
		super();
		this.empName = empName;
	}



}
