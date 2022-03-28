package com.codejava.cm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codejava.cm.model.Customer;
import com.codejava.cm.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepo;
	
	public void save(Customer customer) {
		customerRepo.save(customer);
	}
	
	public List<Customer> listAll(){
		return (List<Customer>)customerRepo.findAll();
	}
	
	public Customer get(Long id) {
		return customerRepo.findById(id).get();
	}
	
	public void delete(long id) {
		customerRepo.deleteById(id);
	}
	
	public List<Customer> search(String keyword) {
	    return customerRepo.search(keyword);
	}
}
