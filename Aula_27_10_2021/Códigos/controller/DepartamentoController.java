package com.example.demo.controller;

import java.util.Date;
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
		
	@PostMapping("/departamentos")
	public Departamento post(@RequestBody Departamento departamento) {
		departamento.setDepartamentoID(this.repo.findByFuncionarioIdMax()+1);
		return this.repo.save(departamento);
	}
	@DeleteMapping("/departamentos")
	public void delete() {	
		
			this.repo.deleteById(this.repo.findByFuncionarioIdMax());			
	}
	
	@DeleteMapping("/departamentos/{id}")
	public void delete(@PathVariable int id) {
		if(this.repo.findById(id).orElse(null) != null) 
			this.repo.deleteById(id);			
	}
	
	@PutMapping("/departamentos"+ "")
	public Departamento put(@RequestBody Departamento departamento) {
		return this.repo.findById(departamento.getDepartamentoID())
				.map(dep -> {	
					dep.setDepartamentoID(departamento.getDepartamentoID());
					dep.setNome(departamento.getNome());
					dep.setDataInsert(new Date());					
					return this.repo.save(dep);
				})
				.orElse(null);
	}
}
