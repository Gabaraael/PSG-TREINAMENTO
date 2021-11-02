package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Banco;


public interface IBancoRepository extends JpaRepository<Banco, Integer>{		
	
	List<Banco> findBybancoIDBetween(int id1, int id2);	
	List<Banco> findBydescricao(String descricao);
	
	
}
