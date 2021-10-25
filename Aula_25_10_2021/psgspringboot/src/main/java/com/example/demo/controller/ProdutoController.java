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

import com.example.demo.model.Produto;

import com.example.demo.repository.IProdutoRepository;

@RestController
@RequestMapping(path = "/api")
public class ProdutoController {

	@Autowired
	private IProdutoRepository repo;

	@GetMapping("/produtos")
	public List<Produto> getAll() {

		return this.repo.findAll();
	}
	@GetMapping("/produtos/{id}")
	public Produto getbyId(@PathVariable int id) {
		return this.repo.findById(id).orElse((null));
	}

	@GetMapping("/produtos/categorias/{id}")
	public List<Produto> getIDByCat(@PathVariable int id) {
		return this.repo.findByCategoriaID(id);
	}
	@GetMapping("/produtos/subcategorias/{id}")
	public List<Produto> getIDbySubCat(@PathVariable int id) {
		return this.repo.findBySubCategoriaID(id);
	}	

	@GetMapping("/produtos/{id}/categorias/{catid}")
	public List<Produto> getIDByCat(@PathVariable int id, @PathVariable int catid) {
		return this.repo.findByProdutoIDAndCategoriaID(id, catid);
	}
	
	@GetMapping("/produtos/{id}/subcategorias/{SubcatID}")
	public List<Produto> getIDByProdutoIDAndSubCategoriaID(@PathVariable int id, @PathVariable int SubcatID) {
		return this.repo.findByProdutoIDAndSubCategoriaID(id, SubcatID);
	}

	@PostMapping("/produtos")
	public Produto post(@RequestBody Produto produtos) {
		return this.repo.save(produtos);
	}

	@DeleteMapping("/produtos/{id}")
	public void delete(@PathVariable int id) {
		if (this.repo.findById(id).orElse(null) != null)
			this.repo.deleteById(id);
	}

	@PutMapping("/produtos" + "")
	public Produto put(@RequestBody Produto novaCategoria) {
		return this.repo.findById(novaCategoria.getProdutoID()).map(pro -> {

			pro.setCategoriaID(novaCategoria.getCategoriaID());
			pro.setSubCategoriaID(novaCategoria.getSubCategoriaID());
			pro.setDescricao(novaCategoria.getDescricao());
			pro.setDataInsert((novaCategoria.getDataInsert()));
			return this.repo.save(pro);
		}).orElse(null);
	}

	
}
