package com.adid6.Filmes.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adid6.Filmes.Model.Filme;
import com.adid6.Filmes.repository.FilmeRepository;

@RestController
public class FilmesController {
	private FilmeRepository filmes;
	
	@GetMapping("/filmes")
	private ResponseEntity<List<Filme>> listarFilmes(){
		return ResponseEntity.ok(filmes.findAll());
	}
}
