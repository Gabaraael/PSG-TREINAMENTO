package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Funcionario;

public interface IFuncionarioRepository extends JpaRepository<Funcionario, Integer> {
	
	@Query(value = "SELECT MAX(FuncionarioID) AS MAXID FROM Funcionario", nativeQuery = true)
	Integer findByFuncionarioIdMax();

	Funcionario findBychaveID(Long id);
	
	Funcionario findByFuncionarioIDAndChaveID(int id, long chaveid);
}
