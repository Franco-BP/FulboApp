package com.fulboapp.service;

import com.fulboapp.dto.CompanyDTO;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICompanyService {
	
	public CompanyDTO addCompany(CompanyDTO companyDTO);
	
	public CompanyDTO updateCompany(CompanyDTO companyDTO);
	
	public void deleteCompany(CompanyDTO companyDTO);
	
	public List<CompanyDTO> getListAllCompany();
	
	public CompanyDTO findCompany(Integer id);
	
	@Query("select p from Compania p where p.nombre = :nombre")
	public List<CompanyDTO> findByName(@Param("nombre") String name);
}
