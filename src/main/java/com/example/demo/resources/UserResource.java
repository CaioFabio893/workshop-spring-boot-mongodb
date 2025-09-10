package com.example.demo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
import com.example.demo.dto.UserDTO;
import com.example.demo.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	
	// criaçao de uma classe dto para so retornar as infromaçoes necessarias 
	// passa a lista de todos os usuarios
	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() { 
		List<User> list = service.findall();
		List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);  
			
		}
	
	
	// retorna os usuarios pelo id 
	@GetMapping(value = "/{id}")
	public ResponseEntity<UserDTO> findbyId(@PathVariable String id) { 
		User obj = service.findById(id);
		return ResponseEntity.ok().body(new UserDTO(obj));  
		
	}
	
	
	
	
}
