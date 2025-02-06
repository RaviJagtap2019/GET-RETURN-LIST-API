package org.dnyanyog.controller;

import java.sql.SQLException;
import java.util.List;

import org.dnyanyog.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	
	@GetMapping("/getStudent" )
	public List<String> getStudent() throws SQLException {
		return new StudentService().getStudentName();
		
	}

}
