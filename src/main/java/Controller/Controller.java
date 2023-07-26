package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Service.Studentservice;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	Studentservice studentservice;
	
	@GetMapping("/demo")
	public String demofun() {
		return "Working fine";
	}

}
