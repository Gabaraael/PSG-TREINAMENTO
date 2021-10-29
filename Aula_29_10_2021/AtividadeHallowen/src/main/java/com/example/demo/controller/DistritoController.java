package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Distrito;
import com.example.demo.repository.IDistritoRepository;

@RestController
@RequestMapping(path = "/api")
public class DistritoController {

	@Autowired
	private IDistritoRepository repo;

	@GetMapping("distritos")
	public List<Distrito> getAll() {
		return this.repo.findAll();
	}
	
	@GetMapping("/distritos/{id}")
	public Distrito getFuncionarioID(@PathVariable int id) {
		return this.repo.findById(id).orElse(null);
	}
	
	@GetMapping(path ="/distritos/paginado")
	public Page<Distrito> obterTodos(
			@RequestParam(value = "page", defaultValue ="0") Integer page,
			@RequestParam(value = "size", defaultValue ="100") Integer size	
			){
		PageRequest pr = PageRequest.of(page, size);
		Page<Distrito> lista = this.repo.findAll(pr);
		return lista;
	}
	
	@PostMapping("/distritos")
	public Distrito post(@RequestBody Distrito distrito) {
		return this.repo.save(distrito);
	}
	
	@DeleteMapping("/distrito/{id}")
	public void delete(@PathVariable int id) {
		if(this.repo.findById(id).orElse(null) != null) 
			this.repo.deleteById(id);			
	}
	@PutMapping("/funcionarios"+ "")
	public Distrito put(@RequestBody Distrito distrito) {
		return this.repo.findById(distrito.getDistritoID())
				.map(dis -> {					
					dis.setDistritoID(distrito.getDistritoID());
					dis.setDescricao(dis.getDescricao());
					dis.setSiglaUF(dis.getSiglaUF());					
					return this.repo.save(dis);
				})
				.orElse(null);
	}

}
