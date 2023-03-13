package mypackage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class EmployeeController {

	
	@GetMapping("first")
	public String GetApi() {
		return"Welcome to Get Api";
	}
	
	
	
}
