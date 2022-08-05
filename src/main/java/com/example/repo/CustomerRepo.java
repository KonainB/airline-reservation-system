package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer>{
	@Query("SELECT c from Customer c WHERE c.userName = ?1 and c.password = ?2")
	List<Customer>login(String userName,String password);
}

