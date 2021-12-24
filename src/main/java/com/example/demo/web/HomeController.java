package com.example.demo.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;



@Controller 
public class HomeController {
	
	@Autowired 
	private UserRepository repo;
	
	@RequestMapping("/")	
	public String home(Model model) {
		
		model.addAttribute("formData", new User());
		
		
		// interests list
		List<String> interestList = Arrays.asList("Male",  "Female", "Other");
			
		model.addAttribute("interestList", interestList);
		
		// work time list
		List<String> workTimeList = Arrays.asList("Progress", "Ashtonbee", "Morningside");
		model.addAttribute("workTimeList", workTimeList);
		
		// talent list
		List<String> talentList = Arrays.asList("Layout/Graphic Designer", "Artist", "Comp.Tech", "Stage Performer", "Electrician", "Others");
		model.addAttribute("talentList", talentList);
		
	
		
		return "index";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String processFormData(User user, RedirectAttributes attr) {
		// insert data submitted in the form to the database.
		
		attr.addFlashAttribute("osman", user);
		

		
		return "redirect:/display";
		
	}
	

	

	
	
	@RequestMapping(value="/display", method=RequestMethod.GET)
	public String displayFormData(User user) {
		
		
		
		return "result";
		
		
	}
	
	

}
