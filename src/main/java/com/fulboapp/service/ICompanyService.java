package com.fulboapp.service;

import com.fulboapp.dto.CompanyDTO;
import java.util.List;

public interface ICompanyService {
	
	public CompanyDTO addCompany(CompanyDTO companyDTO);
	
	public CompanyDTO updateCompany(CompanyDTO companyDTO);
	
	public CompanyDTO deleteCompany(CompanyDTO companyDTO);
	
	public List<CompanyDTO> getListAllCompany();
	
	public CompanyDTO findCompanyById(Long id);
	
	public List<CompanyDTO> findCompanyByName(String name);
}
