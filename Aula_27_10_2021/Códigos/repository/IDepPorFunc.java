package com.example.demo.repository;





import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.DepPorFunc;


public interface IDepPorFunc extends JpaRepository<DepPorFunc, Integer>{
		
		List<DepPorFunc> findByDepID(int depID);
		List<DepPorFunc> findByFuncID(int funcID);
		List<DepPorFunc> findByFuncIDAndDepID(int funcID, int DepID);
}
