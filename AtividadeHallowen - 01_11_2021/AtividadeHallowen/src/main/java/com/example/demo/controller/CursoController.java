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
import com.example.demo.repository.ICursosRepository;

@RestController
@RequestMapping(path = "/api")
public class CursoController{

	@Autowired
	private ICursosRepository repo;
	
	@GetMapping("/cursos")
	public List<Curso> getAll() {
		return this.repo.findAll();
	}
	
	@GetMapping("/curso/{id}")
	public Curso getCursoID(@PathVariable int id) {
		return this.repo.findById(id).orElse(null);
	}
	
	@GetMapping(path ="/curso/paginado")
	public Page<Curso> obterTodos(
			@RequestParam(value = "page", defaultValue ="1") Integer page,
			@RequestParam(value = "size", defaultValue ="5") Integer size	
			){
		PageRequest cur = PageRequest.of(page, size);
		Page<Curso> lista = this.repo.findAll(cur);
		return lista;
	}
	
	@GetMapping(path ="/curso/{id1}/{id2}")
	public List<Curso> valoresEntre(@PathVariable int id1, @PathVariable int id2){
		return this.repo.findByCursoIDBetween(id1, id2);
	}
	
	@GetMapping(path ="/curso/paginado/orderByDesc")
	public Page<Curso> getAllOrderByDesc(
			@RequestParam(value = "page", defaultValue ="1") Integer page,
			@RequestParam(value = "size", defaultValue ="5") Integer size	
			){
		PageRequest cur = PageRequest.of(page, size, Sort.by("descricao"));
		Page<Curso> lista = this.repo.findAll(cur);
		return lista;
	}
	
	
	@PostMapping("/cursos")
	public Curso post(@RequestBody Curso curso) {
		return this.repo.save(curso);
	}
	
	@DeleteMapping("/cursos/{id}")
	public void delete(@PathVariable int id) {
		if(this.repo.findById(id).orElse(null) != null) 
			this.repo.deleteById(id);			
	}
	
	@PutMapping("/cursos"+ "")
	public Curso put(@RequestBody Curso curso) {
		return this.repo.findById(curso.getCursoID())
				.map(cur -> {					
					cur.setCursoID(curso.getCursoID());
					cur.setDescricao(curso.getDescricao());										
					return this.repo.save(cur);
				})
				.orElse(null);
	}
}
