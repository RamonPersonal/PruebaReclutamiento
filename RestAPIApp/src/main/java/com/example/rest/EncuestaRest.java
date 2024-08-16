package com.example.rest;

import java.net.URI;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Encuesta;
import com.example.model.GeneroMusical;
import com.example.model.Grafica;
import com.example.service.EncuestaService;

@RestController
@RequestMapping("/encuesta")
public class EncuestaRest {

	@Autowired
	private EncuestaService encuestaService;
	
	@GetMapping("/verTodo")
	@CrossOrigin(origins = "http://localhost:4200")
	private ResponseEntity<List<Encuesta>> getAllEncuesta(){
		return ResponseEntity.ok(encuestaService.findAll());
	}	
	
	@GetMapping("/paraGrafica")
	@CrossOrigin(origins = "http://localhost:4200")
	private ResponseEntity<List<Grafica>> countByGenero(){
		return ResponseEntity.ok(encuestaService.countByGenero());
	}

    @GetMapping("/existe")
    public boolean checkEmail(@RequestParam String email) {
        return encuestaService.existsByEmail(email);
    }
	
	@PostMapping("/crear")
	@CrossOrigin(origins = "http://localhost:4200")
	private ResponseEntity<Encuesta> saveEncuesta(@RequestBody Encuesta encuesta){
		
		try {
			Encuesta registroEncuesta = encuestaService.save(encuesta);
			return ResponseEntity.created(new URI("/Encuesta/crear"+registroEncuesta.getId())).body(registroEncuesta);
		}catch(Exception e){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
 
	}	
}
