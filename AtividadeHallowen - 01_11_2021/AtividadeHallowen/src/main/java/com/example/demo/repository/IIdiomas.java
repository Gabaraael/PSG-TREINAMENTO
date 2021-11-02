package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Idioma;


public interface IIdiomas extends JpaRepository<Idioma, Integer>{	
	
	List<Idioma> findByidiomaIDBetween(Integer ID1, Integer ID2);
}
