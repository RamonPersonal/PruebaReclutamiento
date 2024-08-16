package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.GeneroMusical;
import com.example.service.GeneroMusicalService;

@RestController
@RequestMapping("/generoMusical")
public class GeneroMusicalRest {
	@Autowired
	private GeneroMusicalService generoMusicalService;
	
	@GetMapping("/verTodo")
	private ResponseEntity<List<GeneroMusical>> getAllGeneroMusical(){
		return ResponseEntity.ok(generoMusicalService.findAll());
	}	
	@GetMapping("/createGeneroMusical")
	private ResponseEntity<List<GeneroMusical>> getAllEncuesta(){
		return ResponseEntity.ok(generoMusicalService.findAll());
	}	
}
