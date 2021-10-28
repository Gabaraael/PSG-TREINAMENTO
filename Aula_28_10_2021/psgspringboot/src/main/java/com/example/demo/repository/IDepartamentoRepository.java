package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Departamento;

public interface IDepartamentoRepository extends JpaRepository<Departamento, Integer>{		
	@Query(value = "SELECT MAX(DepartamentoID) AS MAXID FROM Departamento", nativeQuery = true)
	Integer findByFuncionarioIdMax();
	
	
}
