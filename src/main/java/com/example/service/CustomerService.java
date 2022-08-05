package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.CustomerDTO;
import com.example.model.Customer;
import com.example.repo.CustomerRepo;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepo repo;
	private ModelMapper mapper;
	public CustomerService(CustomerRepo repo, ModelMapper mapper) {
		super();
		this.repo = repo;
		this.mapper = mapper;
	}
	private CustomerDTO mapToDTO(Customer cust) {
		return this.mapper.map(cust, CustomerDTO.class);
	}
	public CustomerDTO addCustomer(Customer cust) {
		Customer saved = this.repo.save(cust);
		return this.mapToDTO(saved);
	}
	public List<CustomerDTO>getAllCustomer() {
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	public CustomerDTO updateCustomer(int id, Customer newCustomer) {
		Optional<Customer> existingOptional = this.repo.findById(id);
		Customer existing=existingOptional.get();
		
		existing.setfName(newCustomer.getfName());
		existing.setlName(newCustomer.getlName());
		existing.setUserName(newCustomer.getUserName());
		existing.setPassword(newCustomer.getPassword());
		existing.setPhone(newCustomer.getPhone());
		existing.setEmail(newCustomer.getEmail());
		existing.setAddress(newCustomer.getAddress());
		existing.setGender(newCustomer.getGender());
		
		Customer updated=this.repo.save(existing);
		return this.mapToDTO(updated);
	}
	public boolean deleteCustomer(int id) {
		this.repo.deleteById(id);
		boolean exists=this.repo.existsById(id);
		return !exists;
	}
	public int checkCredentials (String userName,String password)
	{
		int flag=0;
		if(!repo.login(userName, password).isEmpty())
		{
			flag=1;
			System.out.println("Inside "+flag);
			return flag;
		}
		System.out.println("Out..."+flag);
		return flag;

	}

}
