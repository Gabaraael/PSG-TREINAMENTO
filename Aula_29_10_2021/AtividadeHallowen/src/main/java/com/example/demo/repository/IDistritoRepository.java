package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Distrito;

public interface IDistritoRepository extends JpaRepository<Distrito, Integer> {
	
}
