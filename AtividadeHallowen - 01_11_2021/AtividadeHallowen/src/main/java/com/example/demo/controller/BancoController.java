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
import com.example.demo.model.Banco;
import com.example.demo.repository.IBancoRepository;


@RestController
@RequestMapping(path = "/api")
public class BancoController{

	@Autowired
	private IBancoRepository repo;
	
	@GetMapping("/bancos")
	public List<Banco> getAll() {
		return this.repo.findAll();
	}	
	
	@GetMapping("/bancos/{id}")
	public Banco getFuncionarioID(@PathVariable int id) {
		return this.repo.findById(id).orElse(null);
	}
	
	@GetMapping(path ="/bancos/paginado")
	public Page<Banco> obterTodos(
			@RequestParam(value = "page", defaultValue ="1") Integer page,
			@RequestParam(value = "size", defaultValue ="5") Integer size	
			){
		PageRequest ban = PageRequest.of(page, size);
		Page<Banco> lista = this.repo.findAll(ban);
		return lista;
	}	
	
	@GetMapping(path ="/bancos/{id1}/{id2}")
	public List<Banco> valoresEntre(@PathVariable int id1, @PathVariable int id2){
		return this.repo.findBybancoIDBetween(id1, id2);
	}
	
	@GetMapping(path ="/bancos/descricao/{descricao}/")
	public List<Banco> getByDescricao(@PathVariable String descricao){
		return this.repo.findBydescricao(descricao);
	}	
	
	@PostMapping("/bancos")
	public Banco post(@RequestBody Banco banco) {		
		return this.repo.save(banco);
	}
			
	@DeleteMapping("/bancos/{id}")
	public void delete(@PathVariable int id) {
		if(this.repo.findById(id).orElse(null) != null) 
			this.repo.deleteById(id);			
	}
	
	@PutMapping("/bancos"+ "")
	public Banco put(@RequestBody Banco banco) {
		return this.repo.findById(banco.getBancoID())
				.map(ban -> {	
					ban.setBancoID(banco.getBancoID());
					ban.setCodigoBanco(banco.getCodigoBanco());
					ban.setDescricao(banco.getDescricao());
					ban.setSite(banco.getSite());
									
					return this.repo.save(ban);
				})
				.orElse(null);
	}
}
