package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.OrderRepository;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class OrderService {

	@Autowired	
	private OrderRepository repository;
		
		
	public List<Order> findAll() {
	    return repository.findAll();
	    
	}
	
	public Order findById (Long Id) {
		 Optional<Order> obj = repository.findById(Id);
		 return obj.get();
		
	}
}
