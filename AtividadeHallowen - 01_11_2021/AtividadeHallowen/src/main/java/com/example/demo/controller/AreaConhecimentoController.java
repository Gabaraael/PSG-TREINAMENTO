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
import com.example.demo.model.AreaConhecimento;
import com.example.demo.repository.IAreaConhecimentoRepository;

@RestController
@RequestMapping(path = "/api")
public class AreaConhecimentoController{
	
	@Autowired
	private IAreaConhecimentoRepository repo;
	
	@GetMapping(path ="/areaConhecimento/paginado")
	public Page<AreaConhecimento> obterTodos(
			@RequestParam(value = "page", defaultValue ="1") Integer page,
			@RequestParam(value = "size", defaultValue ="5") Integer size	
			){
		PageRequest pr = PageRequest.of(page, size);
		Page<AreaConhecimento> lista = this.repo.findAll(pr);
		return lista;
	}
	
	@GetMapping(path ="/areaConhecimento/descricao/{descricao}")
	List<AreaConhecimento> getAreaConhecimentoByDesc(@PathVariable String descricao) {
		return this.repo.findByDescricao(descricao);
	}
	
	@GetMapping("/areaConhecimento")
	public List<AreaConhecimento> getAll(){		
		return this.repo.findAll();	
	}
	
	@GetMapping("/areaConhecimento/{id}")
	public AreaConhecimento getbyId(@PathVariable int id) {
		return this.repo.findById(id).orElse((null));		
	}	
	@PostMapping("/areaConhecimento")
	public AreaConhecimento post(@RequestBody AreaConhecimento areaconhecimento) {
		return this.repo.save(areaconhecimento);
	}
	
	@DeleteMapping("/areaConhecimento/{id}")
	public void delete(@PathVariable int id) {
		if(this.repo.findById(id).orElse(null) != null) 
			this.repo.deleteById(id);			
	}

	@PutMapping("/areaConhecimento"	+ "")
	public AreaConhecimento put(@RequestBody AreaConhecimento areaConhecimento) {
		return this.repo.findById(areaConhecimento.getAreaConhecimentoID())
				.map(AreaCon -> {
					AreaCon.setAreaConhecimentoID(areaConhecimento.getAreaConhecimentoID());
					AreaCon.setDescricao(areaConhecimento.getDescricao());									
					return this.repo.save(AreaCon);
				})
				.orElse(null);
	}
}

