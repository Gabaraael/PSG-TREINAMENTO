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
	
	@GetMapping(path ="/idiomas/paginado")
	public Page<Idioma> obterTodos(
			@RequestParam(value = "page", defaultValue ="0") Integer page,
			@RequestParam(value = "size", defaultValue ="100") Integer size	
			){
		PageRequest idi = PageRequest.of(page, size);
		Page<Idioma> lista = this.repo.findAll(idi);
		return lista;
	}	

	@PostMapping("/produtos")
	public Idioma post(@RequestBody Idioma produtos) {
		return this.repo.save(produtos);
	}

	@DeleteMapping("/produtos/{id}")
	public void delete(@PathVariable int id) {
		if (this.repo.findById(id).orElse(null) != null)
			this.repo.deleteById(id);
	}

	@PutMapping("/produtos" + "")
	public Idioma put(@RequestBody Idioma novaCategoria) {
		return this.repo.findById(novaCategoria.getProdutoID()).map(pro -> {

			pro.setCategoriaID(novaCategoria.getCategoriaID());
			pro.setSubCategoriaID(novaCategoria.getSubCategoriaID());
			pro.setDescricao(novaCategoria.getDescricao());
			pro.setDataInsert((novaCategoria.getDataInsert()));
			return this.repo.save(pro);
		}).orElse(null);
	}
	
}
