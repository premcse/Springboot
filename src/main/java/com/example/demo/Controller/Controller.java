package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Custom;
import com.example.demo.Service.StudentServiceinterface;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	StudentServiceinterface studentserviceinterface;
	
	@GetMapping("/demo")
	public String demo() {
		return "demo";
	}
	
	@PostMapping("/addstudent")
    public Custom saveStudent(@RequestBody Custom custom) {
        return studentserviceinterface.saveStudent(custom);
    }

}
