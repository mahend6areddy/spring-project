package com.ashwin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashwin.accessingdatamysql.Person;
import com.ashwin.accessingdatamysql.PersonRepository;

@Controller
public class DemoController {

	@Autowired
	PersonRepository personRepository;
	
	@PostMapping("/agedemo")
	public String demo(@RequestParam(name = "name", required = true) String name, @RequestParam(name = "age", required = true) int age,  Model model) {


		// putting the name and email in the database spring_db
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		personRepository.save(person);
//		userDetails.setName(name);
//		userDetails.setEmail(email);
//		userRepository.save(userDetails);
		
		// setting the name and email to the Model greeting.html
		model.addAttribute("name", name);
		model.addAttribute("age", age);
//		System.out.println("Calling the /greeting get method.");
		// add name and email to database spring_db
		return "redirect";
	
}
}
