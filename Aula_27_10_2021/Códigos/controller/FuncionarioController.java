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


import com.example.demo.model.Funcionario;
import com.example.demo.repository.IFuncionarioRepository;

@RestController
@RequestMapping(path = "/api")
public class FuncionarioController {

	@Autowired
	private IFuncionarioRepository repo;

	@GetMapping("/test")
	public Integer maxid() {
		return this.repo.findByFuncionarioIdMax();
	}

	@GetMapping("/funcionarios")
	public List<Funcionario> getAll() {
		return this.repo.findAll();
	}
	
	@GetMapping("/funcionarios/{id}")
	public Funcionario getFuncionarioID(@PathVariable int id) {
		return this.repo.findById(id).orElse(null);
	}
	
	@GetMapping("/funcionarios/chave/{id}")
	public Funcionario getFuncionarioChaveID(@PathVariable long id) {
		return this.repo.findBychaveID(id);
	}
	@GetMapping("/funcionarios/{funcid}/chave/{chaveid}")
	public Funcionario getFuncionarioChaveID(@PathVariable int funcid, @PathVariable long chaveid) {
		return this.repo.findByFuncionarioIDAndChaveID(funcid, chaveid);
	}
	
	
	
	@PostMapping("/funcionarios")
	public Funcionario post(@RequestBody Funcionario funcionario) {
		funcionario.setFuncionarioID(this.repo.findByFuncionarioIdMax()+1);
		return this.repo.save(funcionario);
	}
	
	@DeleteMapping("/funcionarios/{id}")
	public void delete(@PathVariable int id) {
		if(this.repo.findById(id).orElse(null) != null) 
			this.repo.deleteById(id);			
	}
	@PutMapping("/funcionarios"+ "")
	public Funcionario put(@RequestBody Funcionario funcionario) {
		return this.repo.findById(funcionario.getFuncionarioID())
				.map(fun -> {					
					fun.setChaveID(funcionario.getChaveID());
					fun.setNome(funcionario.getNome());
					fun.setSobreNome(funcionario.getSobreNome());
					fun.setSexo(funcionario.getSexo());
					fun.setDataNascimento(funcionario.getDataNascimento());
					fun.setEmail(funcionario.getEmail());
					fun.setPaisID(funcionario.getPaisID());
					fun.setDataDeAdmissao(funcionario.getDataDeAdmissao());
					fun.setCtps(funcionario.getCtps());
					fun.setCtpsNum(funcionario.getCtpsNum());
					fun.setCtpsNum(funcionario.getCtpsSerie());	
					
					return this.repo.save(fun);
				})
				.orElse(null);
	}
	
	
	

}
