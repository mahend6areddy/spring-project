package com.ashwin.controller;

import java.util.List;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;

import com.ashwin.accessingdatamysql.student;
import com.ashwin.accessingdatamysql.studentRepository;





@Controller
public class studentController {

	@Autowired
	private studentRepository studentRepository;
	
//	@Controller
//	public class CustomErrorController implements ErrorController {
//
//
//	  @RequestMapping("/error")
//	  @ResponseBody
//	  String error(HttpServletRequest request) {
//	    return "<h1>Error occurred</h1>";
//	  }
//	  @override
//	  public String getErrorPath() {
//	    return "/error";
//	  }
//	}
	@PostMapping("/studentdetails")
	public String stddetails(@RequestParam(name = "stdid", required = true) int stdid,  Model model) {

        List<student> studentlist= studentRepository.findAllBystdid(stdid);
        System.out.println("print the name:"+ studentlist.size());
		model.addAttribute("studentDetails", studentRepository.findAllBystdid(stdid));

		return "list-students";
		
	
}
	
}