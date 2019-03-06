package com.cg.springmvc.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvc.bean.Customer;
import com.cg.springmvc.service.ICustomerService;

import sun.util.locale.provider.LocaleProviderAdapter;

@Controller
public class HomeController {
	
	@Autowired
	ICustomerService service;
	
	//@RequestMapping("/homePage")
	/*public String displayHomePage(Model model) {
		LocalDate date= LocalDate.now();
		model.addAttribute("today", date);
		return "Home";
	}
	*/
	
	public ICustomerService getService() {
		return service;
	}
	public void setService(ICustomerService service) {
		this.service = service;
	}
	@RequestMapping(method=RequestMethod.GET,value="homePage")
public ModelAndView displayHomePage() {
		LocalDate date= LocalDate.now();
		ModelAndView mv= new ModelAndView();
		mv.addObject("today", date); 
		mv.setViewName("Home");// logical view name 
		//or ModelAndView mv= new ModelAndView("Home","today",date);
		return mv;
	}	
	@RequestMapping("showRegistrationForm")
	public String showRegistrationForm(Model model) {
		Customer  customer = new Customer();
		model.addAttribute("customer", customer);
		return "CustomerRegistration";
	}
	@RequestMapping("registerUserAction")
	public String RegisterCustomerDetails(
			@Valid @ModelAttribute("customer")Customer customer,
			BindingResult result,Model model) {
		//code to process on customer details 
		if(result.hasErrors()) {
			return "CustomerRegistration";
		}
		customer=service.addCustomer(customer);
		model.addAttribute("customer", customer);
		return "Success";
	}	

	@RequestMapping("customerListAction")
	public String showCustomerList(Model model) {
			List<Customer> list= service.getCustomerList();
			model.addAttribute("list", list);
		return "CustomerList";
	}

	@RequestMapping("showUpdatePage")
	public String showUpdatePage() {
		return "GetCustomerId";
	}
	@RequestMapping("findCustomerAction")
	public String getCustomerDetails(
			@RequestParam("custId") int id ,Model model) {
		
		Customer customer= service.findCustomer(id);
		if(customer==null) {
		model.addAttribute("error", "Customer ID not Found");
		return "GetCustomerId";
		}
		model.addAttribute("customer", customer);
		return "UpdateCustomer";
	}
	@RequestMapping("updateCustomerAction")
	public String updateCustomer(@ModelAttribute("customer")
	Customer customer,Model model) {
		customer= service.updateCustomer(customer);
		model.addAttribute("customer", customer);
		return "Success";
	}
}

