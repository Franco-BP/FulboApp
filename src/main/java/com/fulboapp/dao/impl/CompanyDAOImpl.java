package com.fulboapp.dao.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fulboapp.dao.ICompanyDAO;
import com.fulboapp.dto.CompanyDTO;
import com.fulboapp.model.Company;

@Repository
public class CompanyDAOImpl implements ICompanyDAO {

	@Override
	public CompanyDTO addCompany(CompanyDTO companyDTO) {
		Company company = new Company();
		company.setCompanyName(companyDTO.getCompanyName());
		company.setEmail(companyDTO.getEmail());
		company.setId(companyDTO.getId());
		company.setPhoneNumber(companyDTO.getPhoneNumber());

		// SE GUARDA LA ENTITY CREADA EN LA BD.
		return companyDTO;
	}

	@Override
	public CompanyDTO deleteCompany(CompanyDTO companyDTO) {
		// SE LLAMA A LA BD Y SE BORRA EL OBJETO COMPANY
		return new CompanyDTO();
	}

	@Override
	public CompanyDTO updateCompany(CompanyDTO companyDTO) {
		// SE LLAMA A LA BD Y SE ACTUALIZA EL OBJETO COMPANY
		return new CompanyDTO();
	}

	@Override
	public List<CompanyDTO> getListAllCompany() {
		// SE LLAMA A LA BD Y SE BUSCA TODAS LAS ENTITY
		List<Company> companyList = Arrays.asList(new Company(), new Company(), new Company());
		// SE SIMULA LA LISTA DEVUELTA POR LA BD

		List<CompanyDTO> companyDTOList = new ArrayList<>();
		if (!companyList.isEmpty()) {
			for (Company element : companyList) {
				CompanyDTO companyDTO = new CompanyDTO();
				companyDTO.setCompanyName(element.getCompanyName());
				companyDTO.setEmail(element.getEmail());
				companyDTO.setId(element.getId());
				companyDTO.setPhoneNumber(element.getPhoneNumber());

				companyDTOList.add(companyDTO);
			}
		}

		return companyDTOList;
	}

	@Override
	public CompanyDTO findCompanyById(Long companyId) {
		// SE LLAMA A LA BD Y SE BUSCA LA COMPANY
		Company company = new Company(); // Simulamos encontrar la entity

		CompanyDTO companyDTO = new CompanyDTO();
		if (company != null) {
			companyDTO.setCompanyName(company.getCompanyName());
			companyDTO.setEmail(company.getEmail());
			companyDTO.setId(company.getId());
			companyDTO.setPhoneNumber(company.getPhoneNumber());
		}

		return companyDTO;
	}

	@Override
	public List<CompanyDTO> findCompanyByName(String name) {
		// SE LLAMA A LA BD Y SE BUSCA LA COMPANY
		List<Company> companyList = Arrays.asList(new Company(), new Company(), new Company());
		// Simulamos los resultados de una busqueda.

		List<CompanyDTO> companyDTOList = new ArrayList<>();
		if (!companyList.isEmpty()) {
			for (Company element : companyList) {
				CompanyDTO companyDTO = new CompanyDTO();
				companyDTO.setCompanyName(element.getCompanyName());
				companyDTO.setEmail(element.getEmail());
				companyDTO.setId(element.getId());
				companyDTO.setPhoneNumber(element.getPhoneNumber());

				companyDTOList.add(companyDTO);
			}
		}

		return companyDTOList;
	}

}
