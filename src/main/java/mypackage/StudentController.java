package mypackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE}, allowedHeaders = "*")
public class StudentController {

	@Autowired
	StudentRepository repo;
	
	@GetMapping("students")
	public List<Student>GetAll(){
		List<Student>lst=repo.findAll();
		return lst;
	}
	
	@GetMapping("students/{id}")
	public Student GetAll(@PathVariable("id")int id){

		Student st= repo.findById(id).get();
		return st;
	}
	
	@PostMapping("student")
	public String AddStudent(@RequestBody Student st)
	{
		repo.save(st);
		return "Student Added Successfully";
	}
	
	@PutMapping("student")
	public String UpdateStudent(@RequestBody Student st)
	{
		repo.save(st);
		return "Student Updated Successfully";
	}
	
	@DeleteMapping("student/{id}")
	public String DeleteStudent(@PathVariable("id") int id)
	{
		Student st= repo.findById(id).get();
		repo.delete(st);
		return "Student Deleted Successfully";
	}



}

