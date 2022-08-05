package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.CustomerDTO;
import com.example.model.Customer;
import com.example.service.CustomerService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
	@Autowired
	private CustomerService service;

	public CustomerController(CustomerService service) {
		super();
		this.service = service;
	}

	@PostMapping("/create")
	public CustomerDTO create(@RequestBody Customer cust) {
		return this.service.addCustomer(cust);
	}

	@GetMapping("/read")
	public List<CustomerDTO> getList() {
		return this.service.getAllCustomer();
	}
	@PutMapping("/update/{id}")
	public CustomerDTO update(@PathVariable int id, @RequestBody Customer cust)
	{
		return this.service.updateCustomer(id, cust);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id)
	{
		this.service.deleteCustomer(id);
	}
	@GetMapping("/login/{userName}/{password}")
	public int login(@PathVariable String userName,@PathVariable String password)
	{
		return this.service.checkCredentials(userName, password);
	}
}
