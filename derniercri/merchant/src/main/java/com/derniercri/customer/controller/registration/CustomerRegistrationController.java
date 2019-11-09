package com.derniercri.customer.controller.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.derniercri.customer.form.registration.CustomerRegistrationForm;
import com.derniercri.service.serviceimpl.accountmanagement.UserMangementServiceImpl;

@Controller
@RequestMapping("/register")
public class CustomerRegistrationController {
	
	  @Autowired 
	  private UserMangementServiceImpl userMangementServiceImpl;
	 
	
	@GetMapping
	public String showCustomerRegistrationForm(Model model) {
		CustomerRegistrationForm customerRegistrationForm=null;
		customerRegistrationForm=new CustomerRegistrationForm();
		model.addAttribute("customerRegistrationForm", customerRegistrationForm);
		return "customer-registration";
	}

}
