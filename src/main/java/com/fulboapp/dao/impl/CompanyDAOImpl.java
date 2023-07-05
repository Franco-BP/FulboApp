package com.fulboapp.dao.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.fulboapp.util.DozerUtil;

import com.fulboapp.dao.ICompanyDAO;
import com.fulboapp.dto.CompanyDTO;
import com.fulboapp.model.Company;
import com.fulboapp.repo.ICompanyRepo;

@Repository
public class CompanyDAOImpl implements ICompanyDAO {

	@Autowired ICompanyRepo repo;
	
	@Override
	public CompanyDTO addCompany(CompanyDTO companyDTO) {
		Company company = repo.save(DozerUtil.getINSTANCE().getMapper().map(companyDTO, Company.class));
		return DozerUtil.getINSTANCE().getMapper().map(company, CompanyDTO.class);
		// Se retorna la entity guardada en la BD.
	}

	@Override
	public void deleteCompany(CompanyDTO companyDTO) {
		repo.delete(DozerUtil.getINSTANCE().getMapper().map(companyDTO, Company.class));
	}

	@Override
	public CompanyDTO updateCompany(CompanyDTO companyDTO) {
		Company company = repo.save(DozerUtil.getINSTANCE().getMapper().map(companyDTO, Company.class));
		return DozerUtil.getINSTANCE().getMapper().map(company, CompanyDTO.class);
		// Se retorna la entity actualizada en la BD.
	}

	@Override
	public List<CompanyDTO> findAll() {
		// SE LLAMA A LA BD Y SE BUSCA TODAS LAS ENTITIES
		
		return repo.findAll().stream()
				.map(p -> DozerUtil.getINSTANCE().getMapper().map(p, CompanyDTO.class))
				.collect(Collectors.toList());
	}

	@Override
	public CompanyDTO findCompany(Integer companyId) {
		return DozerUtil.getINSTANCE().getMapper().map(repo.findById(companyId), CompanyDTO.class);
	}

	@Override
	public List<CompanyDTO> findByName(String name) {
		// SE LLAMA A LA BD Y SE BUSCA LA COMPANY
		return repo.findByName(name).stream()
				.map(p -> DozerUtil.getINSTANCE().getMapper().map(p, CompanyDTO.class))
				.collect(Collectors.toList());
	}

}
