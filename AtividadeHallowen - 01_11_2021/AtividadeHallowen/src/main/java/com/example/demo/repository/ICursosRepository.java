package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Curso;

public interface ICursosRepository extends JpaRepository<Curso, Integer>{
	
	List<Curso> findByCursoIDBetween(Integer id1, Integer id2);
	List<Curso> findByDescricao(Integer descricao);
	}
