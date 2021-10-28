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

import com.example.demo.model.SubCategoria;

import com.example.demo.repository.ISubCategoriaRepository;

@RestController
@RequestMapping(path = "/api")
public class SubCategoriaController {

	@Autowired
	private ISubCategoriaRepository repo;

	@GetMapping(path = "/subcategorias")
	public List<SubCategoria> getAll() {
		return this.repo.findAll();		
	}

	@GetMapping("/subcategorias/{id}")
	public SubCategoria getbyId(@PathVariable int id) {
		return this.repo.findById(id).orElse((null));
	}	
	@GetMapping("/categorias/{id}/subcategorias")
	public List<SubCategoria> getbyIdCat(@PathVariable int id) {
		return this.repo.findByCategoriaID(id);
	}
	
	@GetMapping("/categorias/{catid}/subcategorias/{subid}")
	public List<SubCategoria> getbyIdCatAndSubCatID(@PathVariable int catid, @PathVariable int subid ) {
		return this.repo.findByCategoriaIDAndSubCategoriaID(catid, subid);
	}

	@PostMapping("/subcategorias")
	public SubCategoria post(@RequestBody SubCategoria subcategoria) {
		return this.repo.save(subcategoria);
	}

	@DeleteMapping("/subcategorias/{id}")
	public void delete(@PathVariable int id) {
		if (this.repo.findById(id).orElse(null) != null)
			this.repo.deleteById(id);
	}

	@PutMapping("/subcategorias" + "")
	public SubCategoria put(@RequestBody SubCategoria novaCategoria) {
		return this.repo.findById(novaCategoria.getCategoriaID()).map(subcat -> {
			subcat.setCategoriaID(novaCategoria.getCategoriaID());
			subcat.setDescricao(novaCategoria.getDescricao());
			subcat.setDataInsert((novaCategoria.getDataInsert()));
			return this.repo.save(subcat);
		}).orElse(null);
	}
	
	
}
