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
	public void deleteCompany(CompanyDTO companyDTO) {
		iCompanyDAO.deleteCompany(companyDTO);
	}

	@Override
	public List<CompanyDTO> getListAllCompany() {
		return iCompanyDAO.findAll();
	}

	@Override
	public CompanyDTO findCompany(Integer id) {
		return iCompanyDAO.findCompany(id);
	}

	@Override
	public List<CompanyDTO> findByName(String name) {
		return iCompanyDAO.findByName(name);
	}

}
