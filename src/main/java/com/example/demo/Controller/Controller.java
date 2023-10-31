package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Custom;
import com.example.demo.Service.StudentServiceinterface;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	StudentServiceinterface studentserviceinterface;
	
	@GetMapping("/demo")
	public String demo(@RequestParam("ll") String ll, String names) {
		return "My name is "+ll+names;
	}
	
	@GetMapping("/demo2")
	public String demo2(@RequestBody String name) {
		return "My name is "+name;
	}
	
	@PostMapping("/addstudent")
    public ResponseEntity<Custom> saveStudent(@RequestBody Custom custom) {
		Custom student = studentserviceinterface.saveStudent(custom);
        return new ResponseEntity<Custom>(student, HttpStatus.OK);
    }
	
	@GetMapping("/list")
	public ResponseEntity<List<Custom>> ViewStudents(){
		List<Custom> students = studentserviceinterface.ViewStudents();
		return new ResponseEntity<List<Custom>>(students, HttpStatus.OK); 
	}
	
	@GetMapping("/list/{id}")
	public ResponseEntity<Custom> showStudent(@PathVariable("id") Integer id){
		Custom student = studentserviceinterface.showStudent(id);
		return new ResponseEntity<Custom>(student, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Custom> updateStudent(@RequestBody Custom custom){
		Custom student = studentserviceinterface.updateStudent(custom);
		return new ResponseEntity<Custom>(student, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Custom> deleteStudent(@PathVariable("id") Integer id){
		boolean student = studentserviceinterface.deleteStudent(id);
		return new ResponseEntity<Custom>(HttpStatus.OK);
	}

}
