package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	// retorna todos os usuarios 
	public List<User> findall(){
		return repo.findAll();
	}
	
	// retorna so pelo id 
	public User findById(String id) { 
		 Optional<User> obj = repo.findById(id); 
		 return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado")); 
	} 

}
