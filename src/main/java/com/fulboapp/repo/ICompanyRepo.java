package com.fulboapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fulboapp.model.Company;

public interface ICompanyRepo extends JpaRepository<Company, Integer> {
	
	List<Company> findByName(String name);

}
