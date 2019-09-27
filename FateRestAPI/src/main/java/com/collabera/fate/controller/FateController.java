package com.collabera.fate.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.fate.dto.FateDTO;
import com.collabera.fate.service.FateService;


@RestController
public class FateController {

	private final FateService service;

	public FateController(FateService service) {
		super();
		this.service = service;
	}

	@GetMapping("/api/fate")
	public List<FateDTO> getAll() {

		return service.findAll();
	}

	@GetMapping("/api/fate/{id}")
	public ResponseEntity<FateDTO> getByID(@PathVariable int id) {
		FateDTO hero = service.findById(id);

		return ResponseEntity.ok(hero);
	}

	@PostMapping("/api/fate")
	public ResponseEntity<FateDTO> post(@RequestBody @Valid FateDTO fate) throws URISyntaxException {

		FateDTO result = service.save(fate);

		return ResponseEntity.created(new URI("/api/fate/" + result.getId())).body(result);
	}

	@PutMapping("/api/fate")
	public ResponseEntity<FateDTO> updateJob(@RequestBody @Valid FateDTO hero) {
		FateDTO result = service.update(hero);
		return ResponseEntity.ok().body(result);
	}

	@DeleteMapping("/api/fate/{id}")
	public ResponseEntity<Void> deleteByID(@PathVariable int id) {

		service.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
