package com.fulboapp.dao;

import java.util.List;

import com.fulboapp.dto.CompanyDTO;

public interface ICompanyDAO {

	CompanyDTO addCompany(CompanyDTO companyDTO);

	void deleteCompany(CompanyDTO companyDTO);

	CompanyDTO updateCompany(CompanyDTO companyDTO);

	List<CompanyDTO> findAll();

	CompanyDTO findCompany(Integer companyId);

	List<CompanyDTO> findByName(String name);

}
