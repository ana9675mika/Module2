package com.cg.springmvc.service;

import java.util.List;

import com.cg.springmvc.bean.Customer;

public interface ICustomerService {

	public Customer addCustomer(Customer customer);
	public Customer findCustomer(int customerid);
	public Customer updateCustomer(Customer customer);
	public List<Customer> getCustomerList();
}
