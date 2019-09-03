package testDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/employees")
public class DataController {
	  
	@Autowired
	    private EmpRepository repository;
    
	
	@RequestMapping(value = "/add", produces = "application/json", consumes = "application/json")
    public String createPaymentCart(String res) {
    	System.out.println("inside");
    	repository.save(new EmpDetails("Yogesh Sharma"));
    	
        
        
    	return "Done" ;
    }
}
