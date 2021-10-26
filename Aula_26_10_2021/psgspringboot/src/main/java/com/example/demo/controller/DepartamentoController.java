package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Departamento;

import com.example.demo.repository.IDepartamentoRepository;


@RestController
@RequestMapping(path = "/api")
public class DepartamentoController{

	@Autowired
	private IDepartamentoRepository repo;
	
	@GetMapping("/departamentos")
	public List<Departamento> getAll() {
		return this.repo.findAll();
	}
	
	@GetMapping("/departamentos/{id}")
	public Departamento getFuncionarioID(@PathVariable int id) {
		return this.repo.findById(id).orElse(null);
	}
	
	@PostMapping("/departamento")
	public Departamento post(@RequestBody Departamento departamento) {
		return this.repo.save(departamento);
	}
	
	@DeleteMapping("/departamentos/{id}")
	public void delete(@PathVariable int id) {
		if(this.repo.findById(id).orElse(null) != null) 
			this.repo.deleteById(id);			
	}
	
	@PutMapping("/departamento"+ "")
	public Departamento put(@RequestBody Departamento departamento) {
		return this.repo.findById(departamento.getDepID())
				.map(dep -> {	
					dep.setDepID(departamento.getDepID());
					dep.setNome(departamento.getNome());
					dep.setDataInsert(departamento.getDataInsert());					
					return this.repo.save(dep);
				})
				.orElse(null);
	}
}
