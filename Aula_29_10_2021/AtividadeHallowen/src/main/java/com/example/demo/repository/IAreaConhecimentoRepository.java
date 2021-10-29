package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AreaConhecimento;



public interface IAreaConhecimentoRepository extends JpaRepository<AreaConhecimento, Integer>{
	
	List<AreaConhecimento> findByDescricao(String desc);
	
}
