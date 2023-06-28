package com.fulboapp.dao;

import java.util.List;

import com.fulboapp.dto.CompanyDTO;

public interface ICompanyDAO {

	CompanyDTO addCompany(CompanyDTO companyDTO);

	CompanyDTO deleteCompany(CompanyDTO companyDTO);

	CompanyDTO updateCompany(CompanyDTO companyDTO);

	List<CompanyDTO> getListAllCompany();

	CompanyDTO findCompanyById(Long companyId);

	List<CompanyDTO> findCompanyByName(String name);

}
