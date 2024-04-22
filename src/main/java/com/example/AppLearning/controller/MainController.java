package com.example.AppLearning.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AppLearning.entity.UserEntity;
import com.example.AppLearning.repo.RepoClass;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class MainController {
	
	@Autowired
	private RepoClass rp;
	
	
	@GetMapping("/hello")
	public String user() {
		return "Helooeeeee";
	}
	
	
	@GetMapping("/{id}")
	public UserEntity GetUserById(@PathVariable int id) {
		return rp.findById(id).orElseThrow();
	}
	
	
	
	
	@PostMapping
	public UserEntity post(@RequestBody UserEntity us) {
		
		rp.save(us);
		return us;
		
	}
	
	@GetMapping
	public List<UserEntity> GetAllUser(){
		return rp.findAll();
	}
	
	@PutMapping("/{id}")
	public UserEntity updateTask(@PathVariable int id,@RequestBody UserEntity us) {
		//us.setId(id);
		us.setId(id);
		return rp.save(us);
		
	}

}
