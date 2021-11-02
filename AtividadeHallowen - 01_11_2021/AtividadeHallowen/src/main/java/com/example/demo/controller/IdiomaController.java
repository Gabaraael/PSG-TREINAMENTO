package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Curso;
import com.example.demo.model.Distrito;
import com.example.demo.model.Idioma;
import com.example.demo.repository.IIdiomas;

@RestController
@RequestMapping(path = "/api")
public class IdiomaController {

	@Autowired
	private IIdiomas repo;

	@GetMapping("/idiomas")
	public List<Idioma> getAll() {

		return this.repo.findAll();
	}
	@GetMapping("/idiomas/{id}")
	public Idioma getbyId(@PathVariable int id) {
		return this.repo.findById(id).orElse((null));
	}
	
	@GetMapping(path ="/idiomas/{id1}/{id2}")
	public List<Idioma> valoresEntre(@PathVariable int id1, @PathVariable int id2){
		return this.repo.findByidiomaIDBetween(id1, id2);
	}
	
	@GetMapping(path ="/idiomas/paginado")
	public Page<Idioma> obterTodos(
			@RequestParam(value = "page", defaultValue ="0") Integer page,
			@RequestParam(value = "size", defaultValue ="100") Integer size	
			){
		PageRequest idi = PageRequest.of(page, size);
		Page<Idioma> lista = this.repo.findAll(idi);
		return lista;
	}	
	
	@GetMapping(path ="/idiomas/paginado/descricao")
	public Page<Idioma> getAllOrderByDesc(
			@RequestParam(value = "page", defaultValue ="0") Integer page,
			@RequestParam(value = "size", defaultValue ="100") Integer size	
			){
		PageRequest idi = PageRequest.of(page, size, Sort.by("descricao"));
		Page<Idioma> lista = this.repo.findAll(idi);
		return lista;
	}

	@PostMapping("/idiomas")
	public Idioma post(@RequestBody Idioma idioma) {
		return this.repo.save(idioma);
	}

	@DeleteMapping("/idiomas/{id}")
	public void delete(@PathVariable int id) {
		if (this.repo.findById(id).orElse(null) != null)
			this.repo.deleteById(id);
	}

	@PutMapping("/idiomas"+ "")
	public Idioma put(@RequestBody Idioma idioma) {
		return this.repo.findById(idioma.getIdiomaID())
				.map(idi -> {					
					idi.setIdiomaID(idioma.getIdiomaID());
					idi.setDescricao(idioma.getDescricao());
					idi.setSigla(idioma.getSigla());				
					return this.repo.save(idi);
				})
				.orElse(null);
	}
	
}
