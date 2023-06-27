package com.fulboapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fulboapp.dao.ICompanyDAO;
import com.fulboapp.dto.CompanyDTO;
import com.fulboapp.service.ICompanyService;

@Service
public class CompanyServiceImpl implements ICompanyService {

	@Autowired
	ICompanyDAO iCompanyDAO;

	@Override
	public CompanyDTO addCompany(CompanyDTO companyDTO) {
		return iCompanyDAO.addCompany(companyDTO);
	}

	@Override
	public CompanyDTO updateCompany(CompanyDTO companyDTO) {
		return iCompanyDAO.updateCompany(companyDTO);
	}

	@Override
	public CompanyDTO deleteCompany(CompanyDTO companyDTO) {
		return iCompanyDAO.deleteCompany(companyDTO);
	}

	@Override
	public List<CompanyDTO> getListAllCompany() {
		return iCompanyDAO.getListAllCompany();
	}

	@Override
	public CompanyDTO findCompanyById(Long id) {
		return iCompanyDAO.findCompanyById(id);
	}

	@Override
	public List<CompanyDTO> findCompanyByName(String name) {
		return iCompanyDAO.findCompanyByName(name);
	}

}
