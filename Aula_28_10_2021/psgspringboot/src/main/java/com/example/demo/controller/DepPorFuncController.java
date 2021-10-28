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
import com.example.demo.model.DepPorFunc;
import com.example.demo.repository.IDepPorFunc;

@RestController
@RequestMapping(path = "/api")
public class DepPorFuncController{

	@Autowired
	private IDepPorFunc repo;
	
	@GetMapping("/DepPorFunc")
	public List<DepPorFunc> getAll() {
		return this.repo.findAll();
	}
	
	@GetMapping("/DepPorFunc/{depPorFuncIDid}")
	public DepPorFunc getDepPorFuncID(@PathVariable int depPorFuncIDid) {
		return this.repo.findById(depPorFuncIDid).orElse(null);
	}	
	
	@GetMapping("/DepPorFunc/funcionario/{funcID}")
	public List<DepPorFunc> getFuncID(@PathVariable int funcID) {
		return this.repo.findByFuncID(funcID);
	}	
	
	@GetMapping("/DepPorFunc/departamento/{depID}")
	public List<DepPorFunc> getDepID(@PathVariable int depID) {
		return this.repo.findByDepID(depID);
	}	
	
	@GetMapping("/DepPorFunc/departamento/{depID}/funcionario/{funcID}")
	public List<DepPorFunc> getDepID(@PathVariable int depID, @PathVariable int funcID) {
		return this.repo.findByFuncIDAndDepID(funcID, depID);
	}	

	@PostMapping("/DepPorFunc")
	public DepPorFunc post(@RequestBody DepPorFunc depPorFunc) {
		return this.repo.save(depPorFunc);
	}
	
	@DeleteMapping("/DepPorFunc/{id}")
	public void delete(@PathVariable int id) {
		if(this.repo.findById(id).orElse(null) != null) 
			this.repo.deleteById(id);			
	}
	
	@PutMapping("/DepPorFunc"+ "")
	public DepPorFunc put(@RequestBody DepPorFunc depPorFunc) {
		return this.repo.findById(depPorFunc.getDeptoPorFuncID())
				.map(dep -> {					
					dep.setDeptoPorFuncID(depPorFunc.getDeptoPorFuncID());
					dep.setFuncID(depPorFunc.getFuncID());
					dep.setDepID(depPorFunc.getDepID());
					dep.setDataInicial(depPorFunc.getDataInicial());
					dep.setDataFinal(depPorFunc.getDataFinal());					
					return this.repo.save(dep);
				})
				.orElse(null);
	}
}
