package testDatabase;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/employee")
public class DataController {

	
	@RequestMapping(value = "/add", produces = "application/json", consumes = "application/json")
    public String createPaymentCart(@RequestBody EmpDetails request) {
    	System.out.println("inside");
    	return "Done" ;
    }
}
